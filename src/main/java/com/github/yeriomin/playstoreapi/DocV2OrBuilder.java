// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstoreapi;

public interface DocV2OrBuilder extends
    // @@protoc_insertion_point(interface_extends:DocV2)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional string docid = 1;</code>
   */
  boolean hasDocid();
  /**
   * <code>optional string docid = 1;</code>
   */
  java.lang.String getDocid();
  /**
   * <code>optional string docid = 1;</code>
   */
  com.google.protobuf.ByteString
      getDocidBytes();

  /**
   * <code>optional string backendDocid = 2;</code>
   */
  boolean hasBackendDocid();
  /**
   * <code>optional string backendDocid = 2;</code>
   */
  java.lang.String getBackendDocid();
  /**
   * <code>optional string backendDocid = 2;</code>
   */
  com.google.protobuf.ByteString
      getBackendDocidBytes();

  /**
   * <code>optional int32 docType = 3;</code>
   */
  boolean hasDocType();
  /**
   * <code>optional int32 docType = 3;</code>
   */
  int getDocType();

  /**
   * <code>optional int32 backendId = 4;</code>
   */
  boolean hasBackendId();
  /**
   * <code>optional int32 backendId = 4;</code>
   */
  int getBackendId();

  /**
   * <code>optional string title = 5;</code>
   */
  boolean hasTitle();
  /**
   * <code>optional string title = 5;</code>
   */
  java.lang.String getTitle();
  /**
   * <code>optional string title = 5;</code>
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>optional string creator = 6;</code>
   */
  boolean hasCreator();
  /**
   * <code>optional string creator = 6;</code>
   */
  java.lang.String getCreator();
  /**
   * <code>optional string creator = 6;</code>
   */
  com.google.protobuf.ByteString
      getCreatorBytes();

  /**
   * <code>optional string descriptionHtml = 7;</code>
   */
  boolean hasDescriptionHtml();
  /**
   * <code>optional string descriptionHtml = 7;</code>
   */
  java.lang.String getDescriptionHtml();
  /**
   * <code>optional string descriptionHtml = 7;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionHtmlBytes();

  /**
   * <code>repeated .Offer offer = 8;</code>
   */
  java.util.List<com.github.yeriomin.playstoreapi.Offer> 
      getOfferList();
  /**
   * <code>repeated .Offer offer = 8;</code>
   */
  com.github.yeriomin.playstoreapi.Offer getOffer(int index);
  /**
   * <code>repeated .Offer offer = 8;</code>
   */
  int getOfferCount();

  /**
   * <code>optional .Availability availability = 9;</code>
   */
  boolean hasAvailability();
  /**
   * <code>optional .Availability availability = 9;</code>
   */
  com.github.yeriomin.playstoreapi.Availability getAvailability();

  /**
   * <code>repeated .Image image = 10;</code>
   */
  java.util.List<com.github.yeriomin.playstoreapi.Image> 
      getImageList();
  /**
   * <code>repeated .Image image = 10;</code>
   */
  com.github.yeriomin.playstoreapi.Image getImage(int index);
  /**
   * <code>repeated .Image image = 10;</code>
   */
  int getImageCount();

  /**
   * <code>repeated .DocV2 child = 11;</code>
   */
  java.util.List<com.github.yeriomin.playstoreapi.DocV2> 
      getChildList();
  /**
   * <code>repeated .DocV2 child = 11;</code>
   */
  com.github.yeriomin.playstoreapi.DocV2 getChild(int index);
  /**
   * <code>repeated .DocV2 child = 11;</code>
   */
  int getChildCount();

  /**
   * <code>optional .ContainerMetadata containerMetadata = 12;</code>
   */
  boolean hasContainerMetadata();
  /**
   * <code>optional .ContainerMetadata containerMetadata = 12;</code>
   */
  com.github.yeriomin.playstoreapi.ContainerMetadata getContainerMetadata();

  /**
   * <code>optional .DocumentDetails details = 13;</code>
   */
  boolean hasDetails();
  /**
   * <code>optional .DocumentDetails details = 13;</code>
   */
  com.github.yeriomin.playstoreapi.DocumentDetails getDetails();

  /**
   * <code>optional .AggregateRating aggregateRating = 14;</code>
   */
  boolean hasAggregateRating();
  /**
   * <code>optional .AggregateRating aggregateRating = 14;</code>
   */
  com.github.yeriomin.playstoreapi.AggregateRating getAggregateRating();

  /**
   * <code>optional .RelatedLinks relatedLinks = 15;</code>
   */
  boolean hasRelatedLinks();
  /**
   * <code>optional .RelatedLinks relatedLinks = 15;</code>
   */
  com.github.yeriomin.playstoreapi.RelatedLinks getRelatedLinks();

  /**
   * <code>optional string detailsUrl = 16;</code>
   */
  boolean hasDetailsUrl();
  /**
   * <code>optional string detailsUrl = 16;</code>
   */
  java.lang.String getDetailsUrl();
  /**
   * <code>optional string detailsUrl = 16;</code>
   */
  com.google.protobuf.ByteString
      getDetailsUrlBytes();

  /**
   * <code>optional string shareUrl = 17;</code>
   */
  boolean hasShareUrl();
  /**
   * <code>optional string shareUrl = 17;</code>
   */
  java.lang.String getShareUrl();
  /**
   * <code>optional string shareUrl = 17;</code>
   */
  com.google.protobuf.ByteString
      getShareUrlBytes();

  /**
   * <code>optional string reviewsUrl = 18;</code>
   */
  boolean hasReviewsUrl();
  /**
   * <code>optional string reviewsUrl = 18;</code>
   */
  java.lang.String getReviewsUrl();
  /**
   * <code>optional string reviewsUrl = 18;</code>
   */
  com.google.protobuf.ByteString
      getReviewsUrlBytes();

  /**
   * <code>optional string backendUrl = 19;</code>
   */
  boolean hasBackendUrl();
  /**
   * <code>optional string backendUrl = 19;</code>
   */
  java.lang.String getBackendUrl();
  /**
   * <code>optional string backendUrl = 19;</code>
   */
  com.google.protobuf.ByteString
      getBackendUrlBytes();

  /**
   * <code>optional string purchaseDetailsUrl = 20;</code>
   */
  boolean hasPurchaseDetailsUrl();
  /**
   * <code>optional string purchaseDetailsUrl = 20;</code>
   */
  java.lang.String getPurchaseDetailsUrl();
  /**
   * <code>optional string purchaseDetailsUrl = 20;</code>
   */
  com.google.protobuf.ByteString
      getPurchaseDetailsUrlBytes();

  /**
   * <code>optional bool detailsReusable = 21;</code>
   */
  boolean hasDetailsReusable();
  /**
   * <code>optional bool detailsReusable = 21;</code>
   */
  boolean getDetailsReusable();

  /**
   * <code>optional string subtitle = 22;</code>
   */
  boolean hasSubtitle();
  /**
   * <code>optional string subtitle = 22;</code>
   */
  java.lang.String getSubtitle();
  /**
   * <code>optional string subtitle = 22;</code>
   */
  com.google.protobuf.ByteString
      getSubtitleBytes();

  /**
   * <code>optional .UnknownCategoryContainer unknownCategoryContainer = 24;</code>
   */
  boolean hasUnknownCategoryContainer();
  /**
   * <code>optional .UnknownCategoryContainer unknownCategoryContainer = 24;</code>
   */
  com.github.yeriomin.playstoreapi.UnknownCategoryContainer getUnknownCategoryContainer();

  /**
   * <code>optional .Unknown25 unknown25 = 25;</code>
   */
  boolean hasUnknown25();
  /**
   * <code>optional .Unknown25 unknown25 = 25;</code>
   */
  com.github.yeriomin.playstoreapi.Unknown25 getUnknown25();

  /**
   * <code>optional string descriptionShort = 27;</code>
   */
  boolean hasDescriptionShort();
  /**
   * <code>optional string descriptionShort = 27;</code>
   */
  java.lang.String getDescriptionShort();
  /**
   * <code>optional string descriptionShort = 27;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionShortBytes();

  /**
   * <code>optional string reviewSnippetsUrl = 31;</code>
   */
  boolean hasReviewSnippetsUrl();
  /**
   * <code>optional string reviewSnippetsUrl = 31;</code>
   */
  java.lang.String getReviewSnippetsUrl();
  /**
   * <code>optional string reviewSnippetsUrl = 31;</code>
   */
  com.google.protobuf.ByteString
      getReviewSnippetsUrlBytes();

  /**
   * <code>optional string reviewQuestionsUrl = 34;</code>
   */
  boolean hasReviewQuestionsUrl();
  /**
   * <code>optional string reviewQuestionsUrl = 34;</code>
   */
  java.lang.String getReviewQuestionsUrl();
  /**
   * <code>optional string reviewQuestionsUrl = 34;</code>
   */
  com.google.protobuf.ByteString
      getReviewQuestionsUrlBytes();
}
