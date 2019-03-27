package com.github.yeriomin.playstore;

import com.github.yeriomin.playstore.message.AndroidCheckinRequest;
import com.github.yeriomin.playstore.message.DeviceConfigurationProto;

public interface DeviceInfoProvider {

    AndroidCheckinRequest generateAndroidCheckinRequest();
    DeviceConfigurationProto getDeviceConfigurationProto();
    String getUserAgentString();
    String getAuthUserAgentString();
    int getSdkVersion();
    int getPlayServicesVersion();
    String getMccmnc();
}
