// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

public interface BulkDetailsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:BulkDetailsRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>repeated string docid = 1;</code>
   */
  java.util.List<String>
      getDocidList();
  /**
   * <code>repeated string docid = 1;</code>
   */
  int getDocidCount();
  /**
   * <code>repeated string docid = 1;</code>
   */
  java.lang.String getDocid(int index);
  /**
   * <code>repeated string docid = 1;</code>
   */
  com.google.protobuf.ByteString
      getDocidBytes(int index);

  /**
   * <code>optional bool includeChildDocs = 2;</code>
   */
  boolean hasIncludeChildDocs();
  /**
   * <code>optional bool includeChildDocs = 2;</code>
   */
  boolean getIncludeChildDocs();
}
