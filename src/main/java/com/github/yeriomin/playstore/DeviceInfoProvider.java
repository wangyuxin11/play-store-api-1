package com.github.yeriomin.playstore;

import com.github.yeriomin.playstoreapi.AndroidCheckinRequest;
import com.github.yeriomin.playstoreapi.DeviceConfigurationProto;

public interface DeviceInfoProvider {

    AndroidCheckinRequest generateAndroidCheckinRequest();
    DeviceConfigurationProto getDeviceConfigurationProto();
    String getUserAgentString();
    String getAuthUserAgentString();
    int getSdkVersion();
    int getPlayServicesVersion();
    String getMccmnc();
}
