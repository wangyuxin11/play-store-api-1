// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

public interface ReviewAuthorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ReviewAuthor)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional string name = 2;</code>
   */
  boolean hasName();
  /**
   * <code>optional string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional .Image avatar = 5;</code>
   */
  boolean hasAvatar();
  /**
   * <code>optional .Image avatar = 5;</code>
   */
  com.github.yeriomin.playstore.message.Image getAvatar();
}