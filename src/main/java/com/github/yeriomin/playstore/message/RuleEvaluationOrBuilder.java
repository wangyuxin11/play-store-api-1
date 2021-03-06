// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

public interface RuleEvaluationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:RuleEvaluation)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional .Rule rule = 1;</code>
   */
  boolean hasRule();
  /**
   * <code>optional .Rule rule = 1;</code>
   */
  com.github.yeriomin.playstore.message.Rule getRule();

  /**
   * <code>repeated string actualStringValue = 2;</code>
   */
  java.util.List<String>
      getActualStringValueList();
  /**
   * <code>repeated string actualStringValue = 2;</code>
   */
  int getActualStringValueCount();
  /**
   * <code>repeated string actualStringValue = 2;</code>
   */
  java.lang.String getActualStringValue(int index);
  /**
   * <code>repeated string actualStringValue = 2;</code>
   */
  com.google.protobuf.ByteString
      getActualStringValueBytes(int index);

  /**
   * <code>repeated int64 actualLongValue = 3;</code>
   */
  java.util.List<java.lang.Long> getActualLongValueList();
  /**
   * <code>repeated int64 actualLongValue = 3;</code>
   */
  int getActualLongValueCount();
  /**
   * <code>repeated int64 actualLongValue = 3;</code>
   */
  long getActualLongValue(int index);

  /**
   * <code>repeated bool actualBoolValue = 4;</code>
   */
  java.util.List<java.lang.Boolean> getActualBoolValueList();
  /**
   * <code>repeated bool actualBoolValue = 4;</code>
   */
  int getActualBoolValueCount();
  /**
   * <code>repeated bool actualBoolValue = 4;</code>
   */
  boolean getActualBoolValue(int index);

  /**
   * <code>repeated double actualDoubleValue = 5;</code>
   */
  java.util.List<java.lang.Double> getActualDoubleValueList();
  /**
   * <code>repeated double actualDoubleValue = 5;</code>
   */
  int getActualDoubleValueCount();
  /**
   * <code>repeated double actualDoubleValue = 5;</code>
   */
  double getActualDoubleValue(int index);
}
