// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

public interface ModifyLibraryRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ModifyLibraryRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional string libraryId = 1;</code>
   */
  boolean hasLibraryId();
  /**
   * <code>optional string libraryId = 1;</code>
   */
  java.lang.String getLibraryId();
  /**
   * <code>optional string libraryId = 1;</code>
   */
  com.google.protobuf.ByteString
      getLibraryIdBytes();

  /**
   * <code>repeated string addPackageName = 2;</code>
   */
  java.util.List<String>
      getAddPackageNameList();
  /**
   * <code>repeated string addPackageName = 2;</code>
   */
  int getAddPackageNameCount();
  /**
   * <code>repeated string addPackageName = 2;</code>
   */
  java.lang.String getAddPackageName(int index);
  /**
   * <code>repeated string addPackageName = 2;</code>
   */
  com.google.protobuf.ByteString
      getAddPackageNameBytes(int index);

  /**
   * <code>repeated string removePackageName = 3;</code>
   */
  java.util.List<String>
      getRemovePackageNameList();
  /**
   * <code>repeated string removePackageName = 3;</code>
   */
  int getRemovePackageNameCount();
  /**
   * <code>repeated string removePackageName = 3;</code>
   */
  java.lang.String getRemovePackageName(int index);
  /**
   * <code>repeated string removePackageName = 3;</code>
   */
  com.google.protobuf.ByteString
      getRemovePackageNameBytes(int index);
}
