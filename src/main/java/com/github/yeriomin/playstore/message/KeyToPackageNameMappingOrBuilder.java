// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

public interface KeyToPackageNameMappingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:KeyToPackageNameMapping)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional int32 packageKey = 1;</code>
   */
  boolean hasPackageKey();
  /**
   * <code>optional int32 packageKey = 1;</code>
   */
  int getPackageKey();

  /**
   * <code>optional string uidName = 2;</code>
   */
  boolean hasUidName();
  /**
   * <code>optional string uidName = 2;</code>
   */
  java.lang.String getUidName();
  /**
   * <code>optional string uidName = 2;</code>
   */
  com.google.protobuf.ByteString
      getUidNameBytes();

  /**
   * <code>repeated .PackageInfo sharedPackageList = 3;</code>
   */
  java.util.List<com.github.yeriomin.playstore.message.PackageInfo> 
      getSharedPackageListList();
  /**
   * <code>repeated .PackageInfo sharedPackageList = 3;</code>
   */
  com.github.yeriomin.playstore.message.PackageInfo getSharedPackageList(int index);
  /**
   * <code>repeated .PackageInfo sharedPackageList = 3;</code>
   */
  int getSharedPackageListCount();
}
