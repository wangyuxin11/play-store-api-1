// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

public interface ListResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ListResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>repeated .Bucket bucket = 1;</code>
   */
  java.util.List<com.github.yeriomin.playstore.message.Bucket> 
      getBucketList();
  /**
   * <code>repeated .Bucket bucket = 1;</code>
   */
  com.github.yeriomin.playstore.message.Bucket getBucket(int index);
  /**
   * <code>repeated .Bucket bucket = 1;</code>
   */
  int getBucketCount();

  /**
   * <code>repeated .DocV2 doc = 2;</code>
   */
  java.util.List<com.github.yeriomin.playstore.message.DocV2> 
      getDocList();
  /**
   * <code>repeated .DocV2 doc = 2;</code>
   */
  com.github.yeriomin.playstore.message.DocV2 getDoc(int index);
  /**
   * <code>repeated .DocV2 doc = 2;</code>
   */
  int getDocCount();
}
