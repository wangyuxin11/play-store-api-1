// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

public interface SearchSuggestEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SearchSuggestEntry)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional int32 type = 1;</code>
   */
  boolean hasType();
  /**
   * <code>optional int32 type = 1;</code>
   */
  int getType();

  /**
   * <code>optional string suggestedQuery = 2;</code>
   */
  boolean hasSuggestedQuery();
  /**
   * <code>optional string suggestedQuery = 2;</code>
   */
  java.lang.String getSuggestedQuery();
  /**
   * <code>optional string suggestedQuery = 2;</code>
   */
  com.google.protobuf.ByteString
      getSuggestedQueryBytes();

  /**
   * <code>optional .SearchSuggestEntry.ImageContainer imageContainer = 5;</code>
   */
  boolean hasImageContainer();
  /**
   * <code>optional .SearchSuggestEntry.ImageContainer imageContainer = 5;</code>
   */
  com.github.yeriomin.playstore.message.SearchSuggestEntry.ImageContainer getImageContainer();

  /**
   * <code>optional string title = 6;</code>
   */
  boolean hasTitle();
  /**
   * <code>optional string title = 6;</code>
   */
  java.lang.String getTitle();
  /**
   * <code>optional string title = 6;</code>
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>optional .SearchSuggestEntry.PackageNameContainer packageNameContainer = 8;</code>
   */
  boolean hasPackageNameContainer();
  /**
   * <code>optional .SearchSuggestEntry.PackageNameContainer packageNameContainer = 8;</code>
   */
  com.github.yeriomin.playstore.message.SearchSuggestEntry.PackageNameContainer getPackageNameContainer();
}
