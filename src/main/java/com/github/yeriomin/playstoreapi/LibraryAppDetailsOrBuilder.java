// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstoreapi;

public interface LibraryAppDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:LibraryAppDetails)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional string certificateHash = 2;</code>
   */
  boolean hasCertificateHash();
  /**
   * <code>optional string certificateHash = 2;</code>
   */
  java.lang.String getCertificateHash();
  /**
   * <code>optional string certificateHash = 2;</code>
   */
  com.google.protobuf.ByteString
      getCertificateHashBytes();

  /**
   * <code>optional int64 refundTimeoutTimestampMsec = 3;</code>
   */
  boolean hasRefundTimeoutTimestampMsec();
  /**
   * <code>optional int64 refundTimeoutTimestampMsec = 3;</code>
   */
  long getRefundTimeoutTimestampMsec();

  /**
   * <code>optional int64 postDeliveryRefundWindowMsec = 4;</code>
   */
  boolean hasPostDeliveryRefundWindowMsec();
  /**
   * <code>optional int64 postDeliveryRefundWindowMsec = 4;</code>
   */
  long getPostDeliveryRefundWindowMsec();
}
