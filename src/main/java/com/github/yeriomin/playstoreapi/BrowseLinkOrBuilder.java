// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstoreapi;

public interface BrowseLinkOrBuilder extends
    // @@protoc_insertion_point(interface_extends:BrowseLink)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional string name = 1;</code>
   */
  boolean hasName();
  /**
   * <code>optional string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional string dataUrl = 3;</code>
   */
  boolean hasDataUrl();
  /**
   * <code>optional string dataUrl = 3;</code>
   */
  java.lang.String getDataUrl();
  /**
   * <code>optional string dataUrl = 3;</code>
   */
  com.google.protobuf.ByteString
      getDataUrlBytes();

  /**
   * <code>optional .Image icon = 5;</code>
   */
  boolean hasIcon();
  /**
   * <code>optional .Image icon = 5;</code>
   */
  com.github.yeriomin.playstoreapi.Image getIcon();

  /**
   * <code>optional .UnknownCategoryContainer unknownCategoryContainer = 4;</code>
   */
  boolean hasUnknownCategoryContainer();
  /**
   * <code>optional .UnknownCategoryContainer unknownCategoryContainer = 4;</code>
   */
  com.github.yeriomin.playstoreapi.UnknownCategoryContainer getUnknownCategoryContainer();
}
