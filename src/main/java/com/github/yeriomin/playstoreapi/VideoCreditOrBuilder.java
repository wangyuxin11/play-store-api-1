// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstoreapi;

public interface VideoCreditOrBuilder extends
    // @@protoc_insertion_point(interface_extends:VideoCredit)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional int32 creditType = 1;</code>
   */
  boolean hasCreditType();
  /**
   * <code>optional int32 creditType = 1;</code>
   */
  int getCreditType();

  /**
   * <code>optional string credit = 2;</code>
   */
  boolean hasCredit();
  /**
   * <code>optional string credit = 2;</code>
   */
  java.lang.String getCredit();
  /**
   * <code>optional string credit = 2;</code>
   */
  com.google.protobuf.ByteString
      getCreditBytes();

  /**
   * <code>repeated string name = 3;</code>
   */
  java.util.List<String>
      getNameList();
  /**
   * <code>repeated string name = 3;</code>
   */
  int getNameCount();
  /**
   * <code>repeated string name = 3;</code>
   */
  java.lang.String getName(int index);
  /**
   * <code>repeated string name = 3;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes(int index);
}
