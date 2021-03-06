// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

public interface CreditCardInstrumentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:CreditCardInstrument)
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
   * <code>optional string escrowHandle = 2;</code>
   */
  boolean hasEscrowHandle();
  /**
   * <code>optional string escrowHandle = 2;</code>
   */
  java.lang.String getEscrowHandle();
  /**
   * <code>optional string escrowHandle = 2;</code>
   */
  com.google.protobuf.ByteString
      getEscrowHandleBytes();

  /**
   * <code>optional string lastDigits = 3;</code>
   */
  boolean hasLastDigits();
  /**
   * <code>optional string lastDigits = 3;</code>
   */
  java.lang.String getLastDigits();
  /**
   * <code>optional string lastDigits = 3;</code>
   */
  com.google.protobuf.ByteString
      getLastDigitsBytes();

  /**
   * <code>optional int32 expirationMonth = 4;</code>
   */
  boolean hasExpirationMonth();
  /**
   * <code>optional int32 expirationMonth = 4;</code>
   */
  int getExpirationMonth();

  /**
   * <code>optional int32 expirationYear = 5;</code>
   */
  boolean hasExpirationYear();
  /**
   * <code>optional int32 expirationYear = 5;</code>
   */
  int getExpirationYear();

  /**
   * <code>repeated .EfeParam escrowEfeParam = 6;</code>
   */
  java.util.List<com.github.yeriomin.playstore.message.EfeParam> 
      getEscrowEfeParamList();
  /**
   * <code>repeated .EfeParam escrowEfeParam = 6;</code>
   */
  com.github.yeriomin.playstore.message.EfeParam getEscrowEfeParam(int index);
  /**
   * <code>repeated .EfeParam escrowEfeParam = 6;</code>
   */
  int getEscrowEfeParamCount();
}
