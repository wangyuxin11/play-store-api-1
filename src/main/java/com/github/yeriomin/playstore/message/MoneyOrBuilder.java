// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

public interface MoneyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Money)
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
}
