// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

public interface OfferOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Offer)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional int64 micros = 1;</code>
   */
  boolean hasMicros();
  /**
   * <code>optional int64 micros = 1;</code>
   */
  long getMicros();

  /**
   * <code>optional string currencyCode = 2;</code>
   */
  boolean hasCurrencyCode();
  /**
   * <code>optional string currencyCode = 2;</code>
   */
  java.lang.String getCurrencyCode();
  /**
   * <code>optional string currencyCode = 2;</code>
   */
  com.google.protobuf.ByteString
      getCurrencyCodeBytes();

  /**
   * <code>optional string formattedAmount = 3;</code>
   */
  boolean hasFormattedAmount();
  /**
   * <code>optional string formattedAmount = 3;</code>
   */
  java.lang.String getFormattedAmount();
  /**
   * <code>optional string formattedAmount = 3;</code>
   */
  com.google.protobuf.ByteString
      getFormattedAmountBytes();

  /**
   * <code>repeated .Offer convertedPrice = 4;</code>
   */
  java.util.List<com.github.yeriomin.playstore.message.Offer> 
      getConvertedPriceList();
  /**
   * <code>repeated .Offer convertedPrice = 4;</code>
   */
  com.github.yeriomin.playstore.message.Offer getConvertedPrice(int index);
  /**
   * <code>repeated .Offer convertedPrice = 4;</code>
   */
  int getConvertedPriceCount();

  /**
   * <code>optional bool checkoutFlowRequired = 5;</code>
   */
  boolean hasCheckoutFlowRequired();
  /**
   * <code>optional bool checkoutFlowRequired = 5;</code>
   */
  boolean getCheckoutFlowRequired();

  /**
   * <code>optional int64 fullPriceMicros = 6;</code>
   */
  boolean hasFullPriceMicros();
  /**
   * <code>optional int64 fullPriceMicros = 6;</code>
   */
  long getFullPriceMicros();

  /**
   * <code>optional string formattedFullAmount = 7;</code>
   */
  boolean hasFormattedFullAmount();
  /**
   * <code>optional string formattedFullAmount = 7;</code>
   */
  java.lang.String getFormattedFullAmount();
  /**
   * <code>optional string formattedFullAmount = 7;</code>
   */
  com.google.protobuf.ByteString
      getFormattedFullAmountBytes();

  /**
   * <code>optional int32 offerType = 8;</code>
   */
  boolean hasOfferType();
  /**
   * <code>optional int32 offerType = 8;</code>
   */
  int getOfferType();

  /**
   * <code>optional .RentalTerms rentalTerms = 9;</code>
   */
  boolean hasRentalTerms();
  /**
   * <code>optional .RentalTerms rentalTerms = 9;</code>
   */
  com.github.yeriomin.playstore.message.RentalTerms getRentalTerms();

  /**
   * <code>optional int64 onSaleDate = 10;</code>
   */
  boolean hasOnSaleDate();
  /**
   * <code>optional int64 onSaleDate = 10;</code>
   */
  long getOnSaleDate();

  /**
   * <code>repeated string promotionLabel = 11;</code>
   */
  java.util.List<String>
      getPromotionLabelList();
  /**
   * <code>repeated string promotionLabel = 11;</code>
   */
  int getPromotionLabelCount();
  /**
   * <code>repeated string promotionLabel = 11;</code>
   */
  java.lang.String getPromotionLabel(int index);
  /**
   * <code>repeated string promotionLabel = 11;</code>
   */
  com.google.protobuf.ByteString
      getPromotionLabelBytes(int index);

  /**
   * <code>optional .SubscriptionTerms subscriptionTerms = 12;</code>
   */
  boolean hasSubscriptionTerms();
  /**
   * <code>optional .SubscriptionTerms subscriptionTerms = 12;</code>
   */
  com.github.yeriomin.playstore.message.SubscriptionTerms getSubscriptionTerms();

  /**
   * <code>optional string formattedName = 13;</code>
   */
  boolean hasFormattedName();
  /**
   * <code>optional string formattedName = 13;</code>
   */
  java.lang.String getFormattedName();
  /**
   * <code>optional string formattedName = 13;</code>
   */
  com.google.protobuf.ByteString
      getFormattedNameBytes();

  /**
   * <code>optional string formattedDescription = 14;</code>
   */
  boolean hasFormattedDescription();
  /**
   * <code>optional string formattedDescription = 14;</code>
   */
  java.lang.String getFormattedDescription();
  /**
   * <code>optional string formattedDescription = 14;</code>
   */
  com.google.protobuf.ByteString
      getFormattedDescriptionBytes();

  /**
   * <code>optional bool sale = 22;</code>
   */
  boolean hasSale();
  /**
   * <code>optional bool sale = 22;</code>
   */
  boolean getSale();

  /**
   * <code>optional string message = 26;</code>
   */
  boolean hasMessage();
  /**
   * <code>optional string message = 26;</code>
   */
  java.lang.String getMessage();
  /**
   * <code>optional string message = 26;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>optional int64 saleEndTimestamp = 30;</code>
   */
  boolean hasSaleEndTimestamp();
  /**
   * <code>optional int64 saleEndTimestamp = 30;</code>
   */
  long getSaleEndTimestamp();

  /**
   * <code>optional string saleMessage = 31;</code>
   */
  boolean hasSaleMessage();
  /**
   * <code>optional string saleMessage = 31;</code>
   */
  java.lang.String getSaleMessage();
  /**
   * <code>optional string saleMessage = 31;</code>
   */
  com.google.protobuf.ByteString
      getSaleMessageBytes();
}