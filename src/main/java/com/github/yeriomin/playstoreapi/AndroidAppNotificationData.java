// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstoreapi;

/**
 * Protobuf type {@code AndroidAppNotificationData}
 */
public  final class AndroidAppNotificationData extends
    com.google.protobuf.GeneratedMessageLite<
        AndroidAppNotificationData, AndroidAppNotificationData.Builder> implements
    // @@protoc_insertion_point(message_implements:AndroidAppNotificationData)
    AndroidAppNotificationDataOrBuilder {
  private AndroidAppNotificationData() {
    assetId_ = "";
  }
  private int bitField0_;
  public static final int VERSIONCODE_FIELD_NUMBER = 1;
  private int versionCode_;
  /**
   * <code>optional int32 versionCode = 1;</code>
   */
  public boolean hasVersionCode() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional int32 versionCode = 1;</code>
   */
  public int getVersionCode() {
    return versionCode_;
  }
  /**
   * <code>optional int32 versionCode = 1;</code>
   */
  private void setVersionCode(int value) {
    bitField0_ |= 0x00000001;
    versionCode_ = value;
  }
  /**
   * <code>optional int32 versionCode = 1;</code>
   */
  private void clearVersionCode() {
    bitField0_ = (bitField0_ & ~0x00000001);
    versionCode_ = 0;
  }

  public static final int ASSETID_FIELD_NUMBER = 2;
  private java.lang.String assetId_;
  /**
   * <code>optional string assetId = 2;</code>
   */
  public boolean hasAssetId() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional string assetId = 2;</code>
   */
  public java.lang.String getAssetId() {
    return assetId_;
  }
  /**
   * <code>optional string assetId = 2;</code>
   */
  public com.google.protobuf.ByteString
      getAssetIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(assetId_);
  }
  /**
   * <code>optional string assetId = 2;</code>
   */
  private void setAssetId(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
    assetId_ = value;
  }
  /**
   * <code>optional string assetId = 2;</code>
   */
  private void clearAssetId() {
    bitField0_ = (bitField0_ & ~0x00000002);
    assetId_ = getDefaultInstance().getAssetId();
  }
  /**
   * <code>optional string assetId = 2;</code>
   */
  private void setAssetIdBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
    assetId_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeInt32(1, versionCode_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeString(2, getAssetId());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, versionCode_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getAssetId());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstoreapi.AndroidAppNotificationData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstoreapi.AndroidAppNotificationData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.AndroidAppNotificationData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstoreapi.AndroidAppNotificationData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.AndroidAppNotificationData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.AndroidAppNotificationData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.AndroidAppNotificationData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.AndroidAppNotificationData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.AndroidAppNotificationData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.AndroidAppNotificationData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstoreapi.AndroidAppNotificationData prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code AndroidAppNotificationData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstoreapi.AndroidAppNotificationData, Builder> implements
      // @@protoc_insertion_point(builder_implements:AndroidAppNotificationData)
      com.github.yeriomin.playstoreapi.AndroidAppNotificationDataOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.AndroidAppNotificationData.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional int32 versionCode = 1;</code>
     */
    public boolean hasVersionCode() {
      return instance.hasVersionCode();
    }
    /**
     * <code>optional int32 versionCode = 1;</code>
     */
    public int getVersionCode() {
      return instance.getVersionCode();
    }
    /**
     * <code>optional int32 versionCode = 1;</code>
     */
    public Builder setVersionCode(int value) {
      copyOnWrite();
      instance.setVersionCode(value);
      return this;
    }
    /**
     * <code>optional int32 versionCode = 1;</code>
     */
    public Builder clearVersionCode() {
      copyOnWrite();
      instance.clearVersionCode();
      return this;
    }

    /**
     * <code>optional string assetId = 2;</code>
     */
    public boolean hasAssetId() {
      return instance.hasAssetId();
    }
    /**
     * <code>optional string assetId = 2;</code>
     */
    public java.lang.String getAssetId() {
      return instance.getAssetId();
    }
    /**
     * <code>optional string assetId = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAssetIdBytes() {
      return instance.getAssetIdBytes();
    }
    /**
     * <code>optional string assetId = 2;</code>
     */
    public Builder setAssetId(
        java.lang.String value) {
      copyOnWrite();
      instance.setAssetId(value);
      return this;
    }
    /**
     * <code>optional string assetId = 2;</code>
     */
    public Builder clearAssetId() {
      copyOnWrite();
      instance.clearAssetId();
      return this;
    }
    /**
     * <code>optional string assetId = 2;</code>
     */
    public Builder setAssetIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setAssetIdBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:AndroidAppNotificationData)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstoreapi.AndroidAppNotificationData();
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
        com.github.yeriomin.playstoreapi.AndroidAppNotificationData other = (com.github.yeriomin.playstoreapi.AndroidAppNotificationData) arg1;
        versionCode_ = visitor.visitInt(
            hasVersionCode(), versionCode_,
            other.hasVersionCode(), other.versionCode_);
        assetId_ = visitor.visitString(
            hasAssetId(), assetId_,
            other.hasAssetId(), other.assetId_);
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
                versionCode_ = input.readInt32();
                break;
              }
              case 18: {
                String s = input.readString();
                bitField0_ |= 0x00000002;
                assetId_ = s;
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstoreapi.AndroidAppNotificationData.class) {
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


  // @@protoc_insertion_point(class_scope:AndroidAppNotificationData)
  private static final com.github.yeriomin.playstoreapi.AndroidAppNotificationData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AndroidAppNotificationData();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstoreapi.AndroidAppNotificationData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<AndroidAppNotificationData> PARSER;

  public static com.google.protobuf.Parser<AndroidAppNotificationData> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

