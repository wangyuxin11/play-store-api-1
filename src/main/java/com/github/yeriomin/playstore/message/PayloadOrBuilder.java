// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

public interface PayloadOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Payload)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional .ListResponse listResponse = 1;</code>
   */
  boolean hasListResponse();
  /**
   * <code>optional .ListResponse listResponse = 1;</code>
   */
  com.github.yeriomin.playstore.message.ListResponse getListResponse();

  /**
   * <code>optional .DetailsResponse detailsResponse = 2;</code>
   */
  boolean hasDetailsResponse();
  /**
   * <code>optional .DetailsResponse detailsResponse = 2;</code>
   */
  com.github.yeriomin.playstore.message.DetailsResponse getDetailsResponse();

  /**
   * <code>optional .ReviewResponse reviewResponse = 3;</code>
   */
  boolean hasReviewResponse();
  /**
   * <code>optional .ReviewResponse reviewResponse = 3;</code>
   */
  com.github.yeriomin.playstore.message.ReviewResponse getReviewResponse();

  /**
   * <code>optional .BuyResponse buyResponse = 4;</code>
   */
  boolean hasBuyResponse();
  /**
   * <code>optional .BuyResponse buyResponse = 4;</code>
   */
  com.github.yeriomin.playstore.message.BuyResponse getBuyResponse();

  /**
   * <code>optional .SearchResponse searchResponse = 5;</code>
   */
  boolean hasSearchResponse();
  /**
   * <code>optional .SearchResponse searchResponse = 5;</code>
   */
  com.github.yeriomin.playstore.message.SearchResponse getSearchResponse();

  /**
   * <code>optional .TocResponse tocResponse = 6;</code>
   */
  boolean hasTocResponse();
  /**
   * <code>optional .TocResponse tocResponse = 6;</code>
   */
  com.github.yeriomin.playstore.message.TocResponse getTocResponse();

  /**
   * <code>optional .BrowseResponse browseResponse = 7;</code>
   */
  boolean hasBrowseResponse();
  /**
   * <code>optional .BrowseResponse browseResponse = 7;</code>
   */
  com.github.yeriomin.playstore.message.BrowseResponse getBrowseResponse();

  /**
   * <code>optional .PurchaseStatusResponse purchaseStatusResponse = 8;</code>
   */
  boolean hasPurchaseStatusResponse();
  /**
   * <code>optional .PurchaseStatusResponse purchaseStatusResponse = 8;</code>
   */
  com.github.yeriomin.playstore.message.PurchaseStatusResponse getPurchaseStatusResponse();

  /**
   * <code>optional string logResponse = 10;</code>
   */
  boolean hasLogResponse();
  /**
   * <code>optional string logResponse = 10;</code>
   */
  java.lang.String getLogResponse();
  /**
   * <code>optional string logResponse = 10;</code>
   */
  com.google.protobuf.ByteString
      getLogResponseBytes();

  /**
   * <code>optional string flagContentResponse = 13;</code>
   */
  boolean hasFlagContentResponse();
  /**
   * <code>optional string flagContentResponse = 13;</code>
   */
  java.lang.String getFlagContentResponse();
  /**
   * <code>optional string flagContentResponse = 13;</code>
   */
  com.google.protobuf.ByteString
      getFlagContentResponseBytes();

  /**
   * <code>optional .BulkDetailsResponse bulkDetailsResponse = 19;</code>
   */
  boolean hasBulkDetailsResponse();
  /**
   * <code>optional .BulkDetailsResponse bulkDetailsResponse = 19;</code>
   */
  com.github.yeriomin.playstore.message.BulkDetailsResponse getBulkDetailsResponse();

  /**
   * <code>optional .DeliveryResponse deliveryResponse = 21;</code>
   */
  boolean hasDeliveryResponse();
  /**
   * <code>optional .DeliveryResponse deliveryResponse = 21;</code>
   */
  com.github.yeriomin.playstore.message.DeliveryResponse getDeliveryResponse();

  /**
   * <code>optional .AcceptTosResponse acceptTosResponse = 22;</code>
   */
  boolean hasAcceptTosResponse();
  /**
   * <code>optional .AcceptTosResponse acceptTosResponse = 22;</code>
   */
  com.github.yeriomin.playstore.message.AcceptTosResponse getAcceptTosResponse();

  /**
   * <code>optional .AndroidCheckinResponse androidCheckinResponse = 26;</code>
   */
  boolean hasAndroidCheckinResponse();
  /**
   * <code>optional .AndroidCheckinResponse androidCheckinResponse = 26;</code>
   */
  com.github.yeriomin.playstore.message.AndroidCheckinResponse getAndroidCheckinResponse();

  /**
   * <code>optional .UploadDeviceConfigResponse uploadDeviceConfigResponse = 28;</code>
   */
  boolean hasUploadDeviceConfigResponse();
  /**
   * <code>optional .UploadDeviceConfigResponse uploadDeviceConfigResponse = 28;</code>
   */
  com.github.yeriomin.playstore.message.UploadDeviceConfigResponse getUploadDeviceConfigResponse();

  /**
   * <code>optional .SearchSuggestResponse searchSuggestResponse = 40;</code>
   */
  boolean hasSearchSuggestResponse();
  /**
   * <code>optional .SearchSuggestResponse searchSuggestResponse = 40;</code>
   */
  com.github.yeriomin.playstore.message.SearchSuggestResponse getSearchSuggestResponse();

  /**
   * <code>optional .TestingProgramResponse testingProgramResponse = 80;</code>
   */
  boolean hasTestingProgramResponse();
  /**
   * <code>optional .TestingProgramResponse testingProgramResponse = 80;</code>
   */
  com.github.yeriomin.playstore.message.TestingProgramResponse getTestingProgramResponse();
}
