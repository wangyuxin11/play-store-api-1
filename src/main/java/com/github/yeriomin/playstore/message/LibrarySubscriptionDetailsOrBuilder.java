// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

public interface LibrarySubscriptionDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:LibrarySubscriptionDetails)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional int64 initiationTimestampMsec = 1;</code>
   */
  boolean hasInitiationTimestampMsec();
  /**
   * <code>optional int64 initiationTimestampMsec = 1;</code>
   */
  long getInitiationTimestampMsec();

  /**
   * <code>optional int64 validUntilTimestampMsec = 2;</code>
   */
  boolean hasValidUntilTimestampMsec();
  /**
   * <code>optional int64 validUntilTimestampMsec = 2;</code>
   */
  long getValidUntilTimestampMsec();

  /**
   * <code>optional bool autoRenewing = 3;</code>
   */
  boolean hasAutoRenewing();
  /**
   * <code>optional bool autoRenewing = 3;</code>
   */
  boolean getAutoRenewing();

  /**
   * <code>optional int64 trialUntilTimestampMsec = 4;</code>
   */
  boolean hasTrialUntilTimestampMsec();
  /**
   * <code>optional int64 trialUntilTimestampMsec = 4;</code>
   */
  long getTrialUntilTimestampMsec();
}
