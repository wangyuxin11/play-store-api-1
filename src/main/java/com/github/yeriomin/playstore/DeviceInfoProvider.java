package com.github.yeriomin.playstore;

import com.github.yeriomin.playstore.api.AndroidCheckinRequest;
import com.github.yeriomin.playstore.api.DeviceConfigurationProto;

public interface DeviceInfoProvider {

    AndroidCheckinRequest generateAndroidCheckinRequest();
    DeviceConfigurationProto getDeviceConfigurationProto();
    String getUserAgentString();
    String getAuthUserAgentString();
    int getSdkVersion();
    int getPlayServicesVersion();
    String getMccmnc();
}
