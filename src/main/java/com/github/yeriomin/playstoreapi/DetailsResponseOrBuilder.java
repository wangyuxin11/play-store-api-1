// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstoreapi;

public interface DetailsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:DetailsResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional .DocV1 docV1 = 1;</code>
   */
  boolean hasDocV1();
  /**
   * <code>optional .DocV1 docV1 = 1;</code>
   */
  com.github.yeriomin.playstoreapi.DocV1 getDocV1();

  /**
   * <code>optional string analyticsCookie = 2;</code>
   */
  boolean hasAnalyticsCookie();
  /**
   * <code>optional string analyticsCookie = 2;</code>
   */
  java.lang.String getAnalyticsCookie();
  /**
   * <code>optional string analyticsCookie = 2;</code>
   */
  com.google.protobuf.ByteString
      getAnalyticsCookieBytes();

  /**
   * <code>optional .Review userReview = 3;</code>
   */
  boolean hasUserReview();
  /**
   * <code>optional .Review userReview = 3;</code>
   */
  com.github.yeriomin.playstoreapi.Review getUserReview();

  /**
   * <code>optional .DocV2 docV2 = 4;</code>
   */
  boolean hasDocV2();
  /**
   * <code>optional .DocV2 docV2 = 4;</code>
   */
  com.github.yeriomin.playstoreapi.DocV2 getDocV2();

  /**
   * <code>optional string footerHtml = 5;</code>
   */
  boolean hasFooterHtml();
  /**
   * <code>optional string footerHtml = 5;</code>
   */
  java.lang.String getFooterHtml();
  /**
   * <code>optional string footerHtml = 5;</code>
   */
  com.google.protobuf.ByteString
      getFooterHtmlBytes();

  /**
   * <code>repeated .Badge badge = 7;</code>
   */
  java.util.List<com.github.yeriomin.playstoreapi.Badge> 
      getBadgeList();
  /**
   * <code>repeated .Badge badge = 7;</code>
   */
  com.github.yeriomin.playstoreapi.Badge getBadge(int index);
  /**
   * <code>repeated .Badge badge = 7;</code>
   */
  int getBadgeCount();

  /**
   * <code>optional .Features features = 12;</code>
   */
  boolean hasFeatures();
  /**
   * <code>optional .Features features = 12;</code>
   */
  com.github.yeriomin.playstoreapi.Features getFeatures();

  /**
   * <code>optional string detailsStreamUrl = 13;</code>
   */
  boolean hasDetailsStreamUrl();
  /**
   * <code>optional string detailsStreamUrl = 13;</code>
   */
  java.lang.String getDetailsStreamUrl();
  /**
   * <code>optional string detailsStreamUrl = 13;</code>
   */
  com.google.protobuf.ByteString
      getDetailsStreamUrlBytes();

  /**
   * <code>optional string userReviewUrl = 14;</code>
   */
  boolean hasUserReviewUrl();
  /**
   * <code>optional string userReviewUrl = 14;</code>
   */
  java.lang.String getUserReviewUrl();
  /**
   * <code>optional string userReviewUrl = 14;</code>
   */
  com.google.protobuf.ByteString
      getUserReviewUrlBytes();

  /**
   * <code>optional string postAcquireDetailsStreamUrl = 17;</code>
   */
  boolean hasPostAcquireDetailsStreamUrl();
  /**
   * <code>optional string postAcquireDetailsStreamUrl = 17;</code>
   */
  java.lang.String getPostAcquireDetailsStreamUrl();
  /**
   * <code>optional string postAcquireDetailsStreamUrl = 17;</code>
   */
  com.google.protobuf.ByteString
      getPostAcquireDetailsStreamUrlBytes();
}
