// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

public interface DocumentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Document)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional .Docid docid = 1;</code>
   */
  boolean hasDocid();
  /**
   * <code>optional .Docid docid = 1;</code>
   */
  com.github.yeriomin.playstore.message.Docid getDocid();

  /**
   * <code>optional .Docid fetchDocid = 2;</code>
   */
  boolean hasFetchDocid();
  /**
   * <code>optional .Docid fetchDocid = 2;</code>
   */
  com.github.yeriomin.playstore.message.Docid getFetchDocid();

  /**
   * <code>optional .Docid sampleDocid = 3;</code>
   */
  boolean hasSampleDocid();
  /**
   * <code>optional .Docid sampleDocid = 3;</code>
   */
  com.github.yeriomin.playstore.message.Docid getSampleDocid();

  /**
   * <code>optional string title = 4;</code>
   */
  boolean hasTitle();
  /**
   * <code>optional string title = 4;</code>
   */
  java.lang.String getTitle();
  /**
   * <code>optional string title = 4;</code>
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>optional string url = 5;</code>
   */
  boolean hasUrl();
  /**
   * <code>optional string url = 5;</code>
   */
  java.lang.String getUrl();
  /**
   * <code>optional string url = 5;</code>
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <code>repeated string snippet = 6;</code>
   */
  java.util.List<String>
      getSnippetList();
  /**
   * <code>repeated string snippet = 6;</code>
   */
  int getSnippetCount();
  /**
   * <code>repeated string snippet = 6;</code>
   */
  java.lang.String getSnippet(int index);
  /**
   * <code>repeated string snippet = 6;</code>
   */
  com.google.protobuf.ByteString
      getSnippetBytes(int index);

  /**
   * <code>optional .Offer priceDeprecated = 7;</code>
   */
  boolean hasPriceDeprecated();
  /**
   * <code>optional .Offer priceDeprecated = 7;</code>
   */
  com.github.yeriomin.playstore.message.Offer getPriceDeprecated();

  /**
   * <code>optional .Availability availability = 9;</code>
   */
  boolean hasAvailability();
  /**
   * <code>optional .Availability availability = 9;</code>
   */
  com.github.yeriomin.playstore.message.Availability getAvailability();

  /**
   * <code>repeated .Image image = 10;</code>
   */
  java.util.List<com.github.yeriomin.playstore.message.Image> 
      getImageList();
  /**
   * <code>repeated .Image image = 10;</code>
   */
  com.github.yeriomin.playstore.message.Image getImage(int index);
  /**
   * <code>repeated .Image image = 10;</code>
   */
  int getImageCount();

  /**
   * <code>repeated .Document child = 11;</code>
   */
  java.util.List<com.github.yeriomin.playstore.message.Document> 
      getChildList();
  /**
   * <code>repeated .Document child = 11;</code>
   */
  com.github.yeriomin.playstore.message.Document getChild(int index);
  /**
   * <code>repeated .Document child = 11;</code>
   */
  int getChildCount();

  /**
   * <code>optional .AggregateRating aggregateRating = 13;</code>
   */
  boolean hasAggregateRating();
  /**
   * <code>optional .AggregateRating aggregateRating = 13;</code>
   */
  com.github.yeriomin.playstore.message.AggregateRating getAggregateRating();

  /**
   * <code>repeated .Offer offer = 14;</code>
   */
  java.util.List<com.github.yeriomin.playstore.message.Offer> 
      getOfferList();
  /**
   * <code>repeated .Offer offer = 14;</code>
   */
  com.github.yeriomin.playstore.message.Offer getOffer(int index);
  /**
   * <code>repeated .Offer offer = 14;</code>
   */
  int getOfferCount();

  /**
   * <code>repeated .TranslatedText translatedSnippet = 15;</code>
   */
  java.util.List<com.github.yeriomin.playstore.message.TranslatedText> 
      getTranslatedSnippetList();
  /**
   * <code>repeated .TranslatedText translatedSnippet = 15;</code>
   */
  com.github.yeriomin.playstore.message.TranslatedText getTranslatedSnippet(int index);
  /**
   * <code>repeated .TranslatedText translatedSnippet = 15;</code>
   */
  int getTranslatedSnippetCount();

  /**
   * <code>repeated .DocumentVariant documentVariant = 16;</code>
   */
  java.util.List<com.github.yeriomin.playstore.message.DocumentVariant> 
      getDocumentVariantList();
  /**
   * <code>repeated .DocumentVariant documentVariant = 16;</code>
   */
  com.github.yeriomin.playstore.message.DocumentVariant getDocumentVariant(int index);
  /**
   * <code>repeated .DocumentVariant documentVariant = 16;</code>
   */
  int getDocumentVariantCount();

  /**
   * <code>repeated string categoryId = 17;</code>
   */
  java.util.List<String>
      getCategoryIdList();
  /**
   * <code>repeated string categoryId = 17;</code>
   */
  int getCategoryIdCount();
  /**
   * <code>repeated string categoryId = 17;</code>
   */
  java.lang.String getCategoryId(int index);
  /**
   * <code>repeated string categoryId = 17;</code>
   */
  com.google.protobuf.ByteString
      getCategoryIdBytes(int index);

  /**
   * <code>repeated .Document decoration = 18;</code>
   */
  java.util.List<com.github.yeriomin.playstore.message.Document> 
      getDecorationList();
  /**
   * <code>repeated .Document decoration = 18;</code>
   */
  com.github.yeriomin.playstore.message.Document getDecoration(int index);
  /**
   * <code>repeated .Document decoration = 18;</code>
   */
  int getDecorationCount();

  /**
   * <code>repeated .Document parent = 19;</code>
   */
  java.util.List<com.github.yeriomin.playstore.message.Document> 
      getParentList();
  /**
   * <code>repeated .Document parent = 19;</code>
   */
  com.github.yeriomin.playstore.message.Document getParent(int index);
  /**
   * <code>repeated .Document parent = 19;</code>
   */
  int getParentCount();

  /**
   * <code>optional string privacyPolicyUrl = 20;</code>
   */
  boolean hasPrivacyPolicyUrl();
  /**
   * <code>optional string privacyPolicyUrl = 20;</code>
   */
  java.lang.String getPrivacyPolicyUrl();
  /**
   * <code>optional string privacyPolicyUrl = 20;</code>
   */
  com.google.protobuf.ByteString
      getPrivacyPolicyUrlBytes();
}