// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

public interface BillingConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:BillingConfig)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional .CarrierBillingConfig carrierBillingConfig = 1;</code>
   */
  boolean hasCarrierBillingConfig();
  /**
   * <code>optional .CarrierBillingConfig carrierBillingConfig = 1;</code>
   */
  com.github.yeriomin.playstore.message.CarrierBillingConfig getCarrierBillingConfig();

  /**
   * <code>optional int32 maxIabApiVersion = 2;</code>
   */
  boolean hasMaxIabApiVersion();
  /**
   * <code>optional int32 maxIabApiVersion = 2;</code>
   */
  int getMaxIabApiVersion();
}
