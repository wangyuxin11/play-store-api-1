// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

public interface RelatedLinksOrBuilder extends
    // @@protoc_insertion_point(interface_extends:RelatedLinks)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional .RelatedLinksUnknown1 unknown1 = 10;</code>
   */
  boolean hasUnknown1();
  /**
   * <code>optional .RelatedLinksUnknown1 unknown1 = 10;</code>
   */
  com.github.yeriomin.playstore.message.RelatedLinksUnknown1 getUnknown1();

  /**
   * <code>optional string privacyPolicyUrl = 18;</code>
   */
  boolean hasPrivacyPolicyUrl();
  /**
   * <code>optional string privacyPolicyUrl = 18;</code>
   */
  java.lang.String getPrivacyPolicyUrl();
  /**
   * <code>optional string privacyPolicyUrl = 18;</code>
   */
  com.google.protobuf.ByteString
      getPrivacyPolicyUrlBytes();

  /**
   * <code>optional .RelatedLink youMightAlsoLike = 24;</code>
   */
  boolean hasYouMightAlsoLike();
  /**
   * <code>optional .RelatedLink youMightAlsoLike = 24;</code>
   */
  com.github.yeriomin.playstore.message.RelatedLink getYouMightAlsoLike();

  /**
   * <code>optional .Rated rated = 29;</code>
   */
  boolean hasRated();
  /**
   * <code>optional .Rated rated = 29;</code>
   */
  com.github.yeriomin.playstore.message.Rated getRated();

  /**
   * <code>repeated .RelatedLink relatedLinks = 34;</code>
   */
  java.util.List<com.github.yeriomin.playstore.message.RelatedLink> 
      getRelatedLinksList();
  /**
   * <code>repeated .RelatedLink relatedLinks = 34;</code>
   */
  com.github.yeriomin.playstore.message.RelatedLink getRelatedLinks(int index);
  /**
   * <code>repeated .RelatedLink relatedLinks = 34;</code>
   */
  int getRelatedLinksCount();

  /**
   * <code>optional .CategoryInfo categoryInfo = 53;</code>
   */
  boolean hasCategoryInfo();
  /**
   * <code>optional .CategoryInfo categoryInfo = 53;</code>
   */
  com.github.yeriomin.playstore.message.CategoryInfo getCategoryInfo();
}
