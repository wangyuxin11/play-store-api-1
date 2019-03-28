// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

/**
 * Protobuf type {@code PurchaseNotificationResponse}
 */
public  final class PurchaseNotificationResponse extends
    com.google.protobuf.GeneratedMessageLite<
        PurchaseNotificationResponse, PurchaseNotificationResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:PurchaseNotificationResponse)
    PurchaseNotificationResponseOrBuilder {
  private PurchaseNotificationResponse() {
    localizedErrorMessage_ = "";
    purchaseId_ = "";
  }
  private int bitField0_;
  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>optional int32 status = 1;</code>
   */
  public boolean hasStatus() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional int32 status = 1;</code>
   */
  public int getStatus() {
    return status_;
  }
  /**
   * <code>optional int32 status = 1;</code>
   */
  private void setStatus(int value) {
    bitField0_ |= 0x00000001;
    status_ = value;
  }
  /**
   * <code>optional int32 status = 1;</code>
   */
  private void clearStatus() {
    bitField0_ = (bitField0_ & ~0x00000001);
    status_ = 0;
  }

  public static final int DEBUGINFO_FIELD_NUMBER = 2;
  private com.github.yeriomin.playstore.message.DebugInfo debugInfo_;
  /**
   * <code>optional .DebugInfo debugInfo = 2;</code>
   */
  public boolean hasDebugInfo() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional .DebugInfo debugInfo = 2;</code>
   */
  public com.github.yeriomin.playstore.message.DebugInfo getDebugInfo() {
    return debugInfo_ == null ? com.github.yeriomin.playstore.message.DebugInfo.getDefaultInstance() : debugInfo_;
  }
  /**
   * <code>optional .DebugInfo debugInfo = 2;</code>
   */
  private void setDebugInfo(com.github.yeriomin.playstore.message.DebugInfo value) {
    if (value == null) {
      throw new NullPointerException();
    }
    debugInfo_ = value;
    bitField0_ |= 0x00000002;
    }
  /**
   * <code>optional .DebugInfo debugInfo = 2;</code>
   */
  private void setDebugInfo(
      com.github.yeriomin.playstore.message.DebugInfo.Builder builderForValue) {
    debugInfo_ = builderForValue.build();
    bitField0_ |= 0x00000002;
  }
  /**
   * <code>optional .DebugInfo debugInfo = 2;</code>
   */
  private void mergeDebugInfo(com.github.yeriomin.playstore.message.DebugInfo value) {
    if (debugInfo_ != null &&
        debugInfo_ != com.github.yeriomin.playstore.message.DebugInfo.getDefaultInstance()) {
      debugInfo_ =
        com.github.yeriomin.playstore.message.DebugInfo.newBuilder(debugInfo_).mergeFrom(value).buildPartial();
    } else {
      debugInfo_ = value;
    }
    bitField0_ |= 0x00000002;
  }
  /**
   * <code>optional .DebugInfo debugInfo = 2;</code>
   */
  private void clearDebugInfo() {  debugInfo_ = null;
    bitField0_ = (bitField0_ & ~0x00000002);
  }

  public static final int LOCALIZEDERRORMESSAGE_FIELD_NUMBER = 3;
  private java.lang.String localizedErrorMessage_;
  /**
   * <code>optional string localizedErrorMessage = 3;</code>
   */
  public boolean hasLocalizedErrorMessage() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional string localizedErrorMessage = 3;</code>
   */
  public java.lang.String getLocalizedErrorMessage() {
    return localizedErrorMessage_;
  }
  /**
   * <code>optional string localizedErrorMessage = 3;</code>
   */
  public com.google.protobuf.ByteString
      getLocalizedErrorMessageBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(localizedErrorMessage_);
  }
  /**
   * <code>optional string localizedErrorMessage = 3;</code>
   */
  private void setLocalizedErrorMessage(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
    localizedErrorMessage_ = value;
  }
  /**
   * <code>optional string localizedErrorMessage = 3;</code>
   */
  private void clearLocalizedErrorMessage() {
    bitField0_ = (bitField0_ & ~0x00000004);
    localizedErrorMessage_ = getDefaultInstance().getLocalizedErrorMessage();
  }
  /**
   * <code>optional string localizedErrorMessage = 3;</code>
   */
  private void setLocalizedErrorMessageBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
    localizedErrorMessage_ = value.toStringUtf8();
  }

  public static final int PURCHASEID_FIELD_NUMBER = 4;
  private java.lang.String purchaseId_;
  /**
   * <code>optional string purchaseId = 4;</code>
   */
  public boolean hasPurchaseId() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>optional string purchaseId = 4;</code>
   */
  public java.lang.String getPurchaseId() {
    return purchaseId_;
  }
  /**
   * <code>optional string purchaseId = 4;</code>
   */
  public com.google.protobuf.ByteString
      getPurchaseIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(purchaseId_);
  }
  /**
   * <code>optional string purchaseId = 4;</code>
   */
  private void setPurchaseId(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
    purchaseId_ = value;
  }
  /**
   * <code>optional string purchaseId = 4;</code>
   */
  private void clearPurchaseId() {
    bitField0_ = (bitField0_ & ~0x00000008);
    purchaseId_ = getDefaultInstance().getPurchaseId();
  }
  /**
   * <code>optional string purchaseId = 4;</code>
   */
  private void setPurchaseIdBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
    purchaseId_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeInt32(1, status_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeMessage(2, getDebugInfo());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeString(3, getLocalizedErrorMessage());
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeString(4, getPurchaseId());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, status_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDebugInfo());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(3, getLocalizedErrorMessage());
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(4, getPurchaseId());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstore.message.PurchaseNotificationResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.PurchaseNotificationResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.PurchaseNotificationResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.PurchaseNotificationResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.PurchaseNotificationResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.PurchaseNotificationResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.PurchaseNotificationResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.PurchaseNotificationResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.PurchaseNotificationResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.PurchaseNotificationResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstore.message.PurchaseNotificationResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code PurchaseNotificationResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstore.message.PurchaseNotificationResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:PurchaseNotificationResponse)
      com.github.yeriomin.playstore.message.PurchaseNotificationResponseOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.PurchaseNotificationResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional int32 status = 1;</code>
     */
    public boolean hasStatus() {
      return instance.hasStatus();
    }
    /**
     * <code>optional int32 status = 1;</code>
     */
    public int getStatus() {
      return instance.getStatus();
    }
    /**
     * <code>optional int32 status = 1;</code>
     */
    public Builder setStatus(int value) {
      copyOnWrite();
      instance.setStatus(value);
      return this;
    }
    /**
     * <code>optional int32 status = 1;</code>
     */
    public Builder clearStatus() {
      copyOnWrite();
      instance.clearStatus();
      return this;
    }

    /**
     * <code>optional .DebugInfo debugInfo = 2;</code>
     */
    public boolean hasDebugInfo() {
      return instance.hasDebugInfo();
    }
    /**
     * <code>optional .DebugInfo debugInfo = 2;</code>
     */
    public com.github.yeriomin.playstore.message.DebugInfo getDebugInfo() {
      return instance.getDebugInfo();
    }
    /**
     * <code>optional .DebugInfo debugInfo = 2;</code>
     */
    public Builder setDebugInfo(com.github.yeriomin.playstore.message.DebugInfo value) {
      copyOnWrite();
      instance.setDebugInfo(value);
      return this;
      }
    /**
     * <code>optional .DebugInfo debugInfo = 2;</code>
     */
    public Builder setDebugInfo(
        com.github.yeriomin.playstore.message.DebugInfo.Builder builderForValue) {
      copyOnWrite();
      instance.setDebugInfo(builderForValue);
      return this;
    }
    /**
     * <code>optional .DebugInfo debugInfo = 2;</code>
     */
    public Builder mergeDebugInfo(com.github.yeriomin.playstore.message.DebugInfo value) {
      copyOnWrite();
      instance.mergeDebugInfo(value);
      return this;
    }
    /**
     * <code>optional .DebugInfo debugInfo = 2;</code>
     */
    public Builder clearDebugInfo() {  copyOnWrite();
      instance.clearDebugInfo();
      return this;
    }

    /**
     * <code>optional string localizedErrorMessage = 3;</code>
     */
    public boolean hasLocalizedErrorMessage() {
      return instance.hasLocalizedErrorMessage();
    }
    /**
     * <code>optional string localizedErrorMessage = 3;</code>
     */
    public java.lang.String getLocalizedErrorMessage() {
      return instance.getLocalizedErrorMessage();
    }
    /**
     * <code>optional string localizedErrorMessage = 3;</code>
     */
    public com.google.protobuf.ByteString
        getLocalizedErrorMessageBytes() {
      return instance.getLocalizedErrorMessageBytes();
    }
    /**
     * <code>optional string localizedErrorMessage = 3;</code>
     */
    public Builder setLocalizedErrorMessage(
        java.lang.String value) {
      copyOnWrite();
      instance.setLocalizedErrorMessage(value);
      return this;
    }
    /**
     * <code>optional string localizedErrorMessage = 3;</code>
     */
    public Builder clearLocalizedErrorMessage() {
      copyOnWrite();
      instance.clearLocalizedErrorMessage();
      return this;
    }
    /**
     * <code>optional string localizedErrorMessage = 3;</code>
     */
    public Builder setLocalizedErrorMessageBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setLocalizedErrorMessageBytes(value);
      return this;
    }

    /**
     * <code>optional string purchaseId = 4;</code>
     */
    public boolean hasPurchaseId() {
      return instance.hasPurchaseId();
    }
    /**
     * <code>optional string purchaseId = 4;</code>
     */
    public java.lang.String getPurchaseId() {
      return instance.getPurchaseId();
    }
    /**
     * <code>optional string purchaseId = 4;</code>
     */
    public com.google.protobuf.ByteString
        getPurchaseIdBytes() {
      return instance.getPurchaseIdBytes();
    }
    /**
     * <code>optional string purchaseId = 4;</code>
     */
    public Builder setPurchaseId(
        java.lang.String value) {
      copyOnWrite();
      instance.setPurchaseId(value);
      return this;
    }
    /**
     * <code>optional string purchaseId = 4;</code>
     */
    public Builder clearPurchaseId() {
      copyOnWrite();
      instance.clearPurchaseId();
      return this;
    }
    /**
     * <code>optional string purchaseId = 4;</code>
     */
    public Builder setPurchaseIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setPurchaseIdBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:PurchaseNotificationResponse)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstore.message.PurchaseNotificationResponse();
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
        com.github.yeriomin.playstore.message.PurchaseNotificationResponse other = (com.github.yeriomin.playstore.message.PurchaseNotificationResponse) arg1;
        status_ = visitor.visitInt(
            hasStatus(), status_,
            other.hasStatus(), other.status_);
        debugInfo_ = visitor.visitMessage(debugInfo_, other.debugInfo_);
        localizedErrorMessage_ = visitor.visitString(
            hasLocalizedErrorMessage(), localizedErrorMessage_,
            other.hasLocalizedErrorMessage(), other.localizedErrorMessage_);
        purchaseId_ = visitor.visitString(
            hasPurchaseId(), purchaseId_,
            other.hasPurchaseId(), other.purchaseId_);
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
              case 8: {
                bitField0_ |= 0x00000001;
                status_ = input.readInt32();
                break;
              }
              case 18: {
                com.github.yeriomin.playstore.message.DebugInfo.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = debugInfo_.toBuilder();
                }
                debugInfo_ = input.readMessage(com.github.yeriomin.playstore.message.DebugInfo.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(debugInfo_);
                  debugInfo_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
              case 26: {
                String s = input.readString();
                bitField0_ |= 0x00000004;
                localizedErrorMessage_ = s;
                break;
              }
              case 34: {
                String s = input.readString();
                bitField0_ |= 0x00000008;
                purchaseId_ = s;
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstore.message.PurchaseNotificationResponse.class) {
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


  // @@protoc_insertion_point(class_scope:PurchaseNotificationResponse)
  private static final com.github.yeriomin.playstore.message.PurchaseNotificationResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new PurchaseNotificationResponse();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstore.message.PurchaseNotificationResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<PurchaseNotificationResponse> PARSER;

  public static com.google.protobuf.Parser<PurchaseNotificationResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
