// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstoreapi;

public interface UploadDeviceConfigRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:UploadDeviceConfigRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional .DeviceConfigurationProto deviceConfiguration = 1;</code>
   */
  boolean hasDeviceConfiguration();
  /**
   * <code>optional .DeviceConfigurationProto deviceConfiguration = 1;</code>
   */
  com.github.yeriomin.playstoreapi.DeviceConfigurationProto getDeviceConfiguration();

  /**
   * <code>optional string manufacturer = 2;</code>
   */
  boolean hasManufacturer();
  /**
   * <code>optional string manufacturer = 2;</code>
   */
  java.lang.String getManufacturer();
  /**
   * <code>optional string manufacturer = 2;</code>
   */
  com.google.protobuf.ByteString
      getManufacturerBytes();

  /**
   * <code>optional string gcmRegistrationId = 3;</code>
   */
  boolean hasGcmRegistrationId();
  /**
   * <code>optional string gcmRegistrationId = 3;</code>
   */
  java.lang.String getGcmRegistrationId();
  /**
   * <code>optional string gcmRegistrationId = 3;</code>
   */
  com.google.protobuf.ByteString
      getGcmRegistrationIdBytes();
}
