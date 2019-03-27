// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstoreapi;

public interface AppFileMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AppFileMetadata)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional int32 fileType = 1;</code>
   */
  boolean hasFileType();
  /**
   * <code>optional int32 fileType = 1;</code>
   */
  int getFileType();

  /**
   * <code>optional int32 versionCode = 2;</code>
   */
  boolean hasVersionCode();
  /**
   * <code>optional int32 versionCode = 2;</code>
   */
  int getVersionCode();

  /**
   * <code>optional int64 size = 3;</code>
   */
  boolean hasSize();
  /**
   * <code>optional int64 size = 3;</code>
   */
  long getSize();

  /**
   * <code>optional string downloadUrl = 4;</code>
   */
  boolean hasDownloadUrl();
  /**
   * <code>optional string downloadUrl = 4;</code>
   */
  java.lang.String getDownloadUrl();
  /**
   * <code>optional string downloadUrl = 4;</code>
   */
  com.google.protobuf.ByteString
      getDownloadUrlBytes();

  /**
   * <code>optional int64 sizeGzipped = 6;</code>
   */
  boolean hasSizeGzipped();
  /**
   * <code>optional int64 sizeGzipped = 6;</code>
   */
  long getSizeGzipped();

  /**
   * <code>optional string downloadUrlGzipped = 7;</code>
   */
  boolean hasDownloadUrlGzipped();
  /**
   * <code>optional string downloadUrlGzipped = 7;</code>
   */
  java.lang.String getDownloadUrlGzipped();
  /**
   * <code>optional string downloadUrlGzipped = 7;</code>
   */
  com.google.protobuf.ByteString
      getDownloadUrlGzippedBytes();

  /**
   * <code>optional string sha1 = 8;</code>
   */
  boolean hasSha1();
  /**
   * <code>optional string sha1 = 8;</code>
   */
  java.lang.String getSha1();
  /**
   * <code>optional string sha1 = 8;</code>
   */
  com.google.protobuf.ByteString
      getSha1Bytes();
}
