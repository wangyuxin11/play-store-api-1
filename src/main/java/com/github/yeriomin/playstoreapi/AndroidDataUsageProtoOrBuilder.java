// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstoreapi;

public interface AndroidDataUsageProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AndroidDataUsageProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional int32 version = 1;</code>
   */
  boolean hasVersion();
  /**
   * <code>optional int32 version = 1;</code>
   */
  int getVersion();

  /**
   * <code>optional int64 currentReportMsec = 2;</code>
   */
  boolean hasCurrentReportMsec();
  /**
   * <code>optional int64 currentReportMsec = 2;</code>
   */
  long getCurrentReportMsec();

  /**
   * <code>repeated .KeyToPackageNameMapping keyToPackageNameMapping = 3;</code>
   */
  java.util.List<com.github.yeriomin.playstoreapi.KeyToPackageNameMapping> 
      getKeyToPackageNameMappingList();
  /**
   * <code>repeated .KeyToPackageNameMapping keyToPackageNameMapping = 3;</code>
   */
  com.github.yeriomin.playstoreapi.KeyToPackageNameMapping getKeyToPackageNameMapping(int index);
  /**
   * <code>repeated .KeyToPackageNameMapping keyToPackageNameMapping = 3;</code>
   */
  int getKeyToPackageNameMappingCount();

  /**
   * <code>repeated .PayloadLevelAppStat payloadLevelAppStat = 4;</code>
   */
  java.util.List<com.github.yeriomin.playstoreapi.PayloadLevelAppStat> 
      getPayloadLevelAppStatList();
  /**
   * <code>repeated .PayloadLevelAppStat payloadLevelAppStat = 4;</code>
   */
  com.github.yeriomin.playstoreapi.PayloadLevelAppStat getPayloadLevelAppStat(int index);
  /**
   * <code>repeated .PayloadLevelAppStat payloadLevelAppStat = 4;</code>
   */
  int getPayloadLevelAppStatCount();

  /**
   * <code>repeated .IpLayerNetworkStat ipLayerNetworkStat = 5;</code>
   */
  java.util.List<com.github.yeriomin.playstoreapi.IpLayerNetworkStat> 
      getIpLayerNetworkStatList();
  /**
   * <code>repeated .IpLayerNetworkStat ipLayerNetworkStat = 5;</code>
   */
  com.github.yeriomin.playstoreapi.IpLayerNetworkStat getIpLayerNetworkStat(int index);
  /**
   * <code>repeated .IpLayerNetworkStat ipLayerNetworkStat = 5;</code>
   */
  int getIpLayerNetworkStatCount();
}
