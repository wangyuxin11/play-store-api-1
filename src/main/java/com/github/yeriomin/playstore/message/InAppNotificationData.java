// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

/**
 * Protobuf type {@code InAppNotificationData}
 */
public  final class InAppNotificationData extends
    com.google.protobuf.GeneratedMessageLite<
        InAppNotificationData, InAppNotificationData.Builder> implements
    // @@protoc_insertion_point(message_implements:InAppNotificationData)
    InAppNotificationDataOrBuilder {
  private InAppNotificationData() {
    checkoutOrderId_ = "";
    inAppNotificationId_ = "";
  }
  private int bitField0_;
  public static final int CHECKOUTORDERID_FIELD_NUMBER = 1;
  private java.lang.String checkoutOrderId_;
  /**
   * <code>optional string checkoutOrderId = 1;</code>
   */
  public boolean hasCheckoutOrderId() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string checkoutOrderId = 1;</code>
   */
  public java.lang.String getCheckoutOrderId() {
    return checkoutOrderId_;
  }
  /**
   * <code>optional string checkoutOrderId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getCheckoutOrderIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(checkoutOrderId_);
  }
  /**
   * <code>optional string checkoutOrderId = 1;</code>
   */
  private void setCheckoutOrderId(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    checkoutOrderId_ = value;
  }
  /**
   * <code>optional string checkoutOrderId = 1;</code>
   */
  private void clearCheckoutOrderId() {
    bitField0_ = (bitField0_ & ~0x00000001);
    checkoutOrderId_ = getDefaultInstance().getCheckoutOrderId();
  }
  /**
   * <code>optional string checkoutOrderId = 1;</code>
   */
  private void setCheckoutOrderIdBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    checkoutOrderId_ = value.toStringUtf8();
  }

  public static final int INAPPNOTIFICATIONID_FIELD_NUMBER = 2;
  private java.lang.String inAppNotificationId_;
  /**
   * <code>optional string inAppNotificationId = 2;</code>
   */
  public boolean hasInAppNotificationId() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional string inAppNotificationId = 2;</code>
   */
  public java.lang.String getInAppNotificationId() {
    return inAppNotificationId_;
  }
  /**
   * <code>optional string inAppNotificationId = 2;</code>
   */
  public com.google.protobuf.ByteString
      getInAppNotificationIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(inAppNotificationId_);
  }
  /**
   * <code>optional string inAppNotificationId = 2;</code>
   */
  private void setInAppNotificationId(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
    inAppNotificationId_ = value;
  }
  /**
   * <code>optional string inAppNotificationId = 2;</code>
   */
  private void clearInAppNotificationId() {
    bitField0_ = (bitField0_ & ~0x00000002);
    inAppNotificationId_ = getDefaultInstance().getInAppNotificationId();
  }
  /**
   * <code>optional string inAppNotificationId = 2;</code>
   */
  private void setInAppNotificationIdBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
    inAppNotificationId_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeString(1, getCheckoutOrderId());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeString(2, getInAppNotificationId());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getCheckoutOrderId());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getInAppNotificationId());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstore.message.InAppNotificationData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.InAppNotificationData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.InAppNotificationData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.InAppNotificationData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.InAppNotificationData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.InAppNotificationData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.InAppNotificationData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.InAppNotificationData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.InAppNotificationData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.InAppNotificationData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstore.message.InAppNotificationData prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code InAppNotificationData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstore.message.InAppNotificationData, Builder> implements
      // @@protoc_insertion_point(builder_implements:InAppNotificationData)
      com.github.yeriomin.playstore.message.InAppNotificationDataOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.InAppNotificationData.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional string checkoutOrderId = 1;</code>
     */
    public boolean hasCheckoutOrderId() {
      return instance.hasCheckoutOrderId();
    }
    /**
     * <code>optional string checkoutOrderId = 1;</code>
     */
    public java.lang.String getCheckoutOrderId() {
      return instance.getCheckoutOrderId();
    }
    /**
     * <code>optional string checkoutOrderId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getCheckoutOrderIdBytes() {
      return instance.getCheckoutOrderIdBytes();
    }
    /**
     * <code>optional string checkoutOrderId = 1;</code>
     */
    public Builder setCheckoutOrderId(
        java.lang.String value) {
      copyOnWrite();
      instance.setCheckoutOrderId(value);
      return this;
    }
    /**
     * <code>optional string checkoutOrderId = 1;</code>
     */
    public Builder clearCheckoutOrderId() {
      copyOnWrite();
      instance.clearCheckoutOrderId();
      return this;
    }
    /**
     * <code>optional string checkoutOrderId = 1;</code>
     */
    public Builder setCheckoutOrderIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setCheckoutOrderIdBytes(value);
      return this;
    }

    /**
     * <code>optional string inAppNotificationId = 2;</code>
     */
    public boolean hasInAppNotificationId() {
      return instance.hasInAppNotificationId();
    }
    /**
     * <code>optional string inAppNotificationId = 2;</code>
     */
    public java.lang.String getInAppNotificationId() {
      return instance.getInAppNotificationId();
    }
    /**
     * <code>optional string inAppNotificationId = 2;</code>
     */
    public com.google.protobuf.ByteString
        getInAppNotificationIdBytes() {
      return instance.getInAppNotificationIdBytes();
    }
    /**
     * <code>optional string inAppNotificationId = 2;</code>
     */
    public Builder setInAppNotificationId(
        java.lang.String value) {
      copyOnWrite();
      instance.setInAppNotificationId(value);
      return this;
    }
    /**
     * <code>optional string inAppNotificationId = 2;</code>
     */
    public Builder clearInAppNotificationId() {
      copyOnWrite();
      instance.clearInAppNotificationId();
      return this;
    }
    /**
     * <code>optional string inAppNotificationId = 2;</code>
     */
    public Builder setInAppNotificationIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setInAppNotificationIdBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:InAppNotificationData)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstore.message.InAppNotificationData();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.github.yeriomin.playstore.message.InAppNotificationData other = (com.github.yeriomin.playstore.message.InAppNotificationData) arg1;
        checkoutOrderId_ = visitor.visitString(
            hasCheckoutOrderId(), checkoutOrderId_,
            other.hasCheckoutOrderId(), other.checkoutOrderId_);
        inAppNotificationId_ = visitor.visitString(
            hasInAppNotificationId(), inAppNotificationId_,
            other.hasInAppNotificationId(), other.inAppNotificationId_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
          bitField0_ |= other.bitField0_;
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!parseUnknownField(tag, input)) {
                  done = true;
                }
                break;
              }
              case 10: {
                String s = input.readString();
                bitField0_ |= 0x00000001;
                checkoutOrderId_ = s;
                break;
              }
              case 18: {
                String s = input.readString();
                bitField0_ |= 0x00000002;
                inAppNotificationId_ = s;
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstore.message.InAppNotificationData.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:InAppNotificationData)
  private static final com.github.yeriomin.playstore.message.InAppNotificationData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new InAppNotificationData();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstore.message.InAppNotificationData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<InAppNotificationData> PARSER;

  public static com.google.protobuf.Parser<InAppNotificationData> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

