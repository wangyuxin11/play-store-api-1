// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstoreapi;

public interface RatedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Rated)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional string label = 1;</code>
   */
  boolean hasLabel();
  /**
   * <code>optional string label = 1;</code>
   */
  java.lang.String getLabel();
  /**
   * <code>optional string label = 1;</code>
   */
  com.google.protobuf.ByteString
      getLabelBytes();

  /**
   * <code>optional .Image image = 2;</code>
   */
  boolean hasImage();
  /**
   * <code>optional .Image image = 2;</code>
   */
  com.github.yeriomin.playstoreapi.Image getImage();

  /**
   * <code>optional string learnMoreHtmlLink = 4;</code>
   */
  boolean hasLearnMoreHtmlLink();
  /**
   * <code>optional string learnMoreHtmlLink = 4;</code>
   */
  java.lang.String getLearnMoreHtmlLink();
  /**
   * <code>optional string learnMoreHtmlLink = 4;</code>
   */
  com.google.protobuf.ByteString
      getLearnMoreHtmlLinkBytes();
}
