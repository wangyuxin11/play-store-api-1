// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

/**
 * Protobuf type {@code EncryptionParams}
 */
public  final class EncryptionParams extends
    com.google.protobuf.GeneratedMessageLite<
        EncryptionParams, EncryptionParams.Builder> implements
    // @@protoc_insertion_point(message_implements:EncryptionParams)
    EncryptionParamsOrBuilder {
  private EncryptionParams() {
    encryptionKey_ = "";
    hmacKey_ = "";
  }
  private int bitField0_;
  public static final int VERSION_FIELD_NUMBER = 1;
  private int version_;
  /**
   * <code>optional int32 version = 1;</code>
   */
  public boolean hasVersion() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional int32 version = 1;</code>
   */
  public int getVersion() {
    return version_;
  }
  /**
   * <code>optional int32 version = 1;</code>
   */
  private void setVersion(int value) {
    bitField0_ |= 0x00000001;
    version_ = value;
  }
  /**
   * <code>optional int32 version = 1;</code>
   */
  private void clearVersion() {
    bitField0_ = (bitField0_ & ~0x00000001);
    version_ = 0;
  }

  public static final int ENCRYPTIONKEY_FIELD_NUMBER = 2;
  private java.lang.String encryptionKey_;
  /**
   * <code>optional string encryptionKey = 2;</code>
   */
  public boolean hasEncryptionKey() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional string encryptionKey = 2;</code>
   */
  public java.lang.String getEncryptionKey() {
    return encryptionKey_;
  }
  /**
   * <code>optional string encryptionKey = 2;</code>
   */
  public com.google.protobuf.ByteString
      getEncryptionKeyBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(encryptionKey_);
  }
  /**
   * <code>optional string encryptionKey = 2;</code>
   */
  private void setEncryptionKey(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
    encryptionKey_ = value;
  }
  /**
   * <code>optional string encryptionKey = 2;</code>
   */
  private void clearEncryptionKey() {
    bitField0_ = (bitField0_ & ~0x00000002);
    encryptionKey_ = getDefaultInstance().getEncryptionKey();
  }
  /**
   * <code>optional string encryptionKey = 2;</code>
   */
  private void setEncryptionKeyBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
    encryptionKey_ = value.toStringUtf8();
  }

  public static final int HMACKEY_FIELD_NUMBER = 3;
  private java.lang.String hmacKey_;
  /**
   * <code>optional string hmacKey = 3;</code>
   */
  public boolean hasHmacKey() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional string hmacKey = 3;</code>
   */
  public java.lang.String getHmacKey() {
    return hmacKey_;
  }
  /**
   * <code>optional string hmacKey = 3;</code>
   */
  public com.google.protobuf.ByteString
      getHmacKeyBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(hmacKey_);
  }
  /**
   * <code>optional string hmacKey = 3;</code>
   */
  private void setHmacKey(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
    hmacKey_ = value;
  }
  /**
   * <code>optional string hmacKey = 3;</code>
   */
  private void clearHmacKey() {
    bitField0_ = (bitField0_ & ~0x00000004);
    hmacKey_ = getDefaultInstance().getHmacKey();
  }
  /**
   * <code>optional string hmacKey = 3;</code>
   */
  private void setHmacKeyBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
    hmacKey_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeInt32(1, version_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeString(2, getEncryptionKey());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeString(3, getHmacKey());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, version_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getEncryptionKey());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(3, getHmacKey());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstore.message.EncryptionParams parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.EncryptionParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.EncryptionParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.EncryptionParams parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.EncryptionParams parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.EncryptionParams parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.EncryptionParams parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.EncryptionParams parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.EncryptionParams parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.EncryptionParams parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstore.message.EncryptionParams prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code EncryptionParams}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstore.message.EncryptionParams, Builder> implements
      // @@protoc_insertion_point(builder_implements:EncryptionParams)
      com.github.yeriomin.playstore.message.EncryptionParamsOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.EncryptionParams.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional int32 version = 1;</code>
     */
    public boolean hasVersion() {
      return instance.hasVersion();
    }
    /**
     * <code>optional int32 version = 1;</code>
     */
    public int getVersion() {
      return instance.getVersion();
    }
    /**
     * <code>optional int32 version = 1;</code>
     */
    public Builder setVersion(int value) {
      copyOnWrite();
      instance.setVersion(value);
      return this;
    }
    /**
     * <code>optional int32 version = 1;</code>
     */
    public Builder clearVersion() {
      copyOnWrite();
      instance.clearVersion();
      return this;
    }

    /**
     * <code>optional string encryptionKey = 2;</code>
     */
    public boolean hasEncryptionKey() {
      return instance.hasEncryptionKey();
    }
    /**
     * <code>optional string encryptionKey = 2;</code>
     */
    public java.lang.String getEncryptionKey() {
      return instance.getEncryptionKey();
    }
    /**
     * <code>optional string encryptionKey = 2;</code>
     */
    public com.google.protobuf.ByteString
        getEncryptionKeyBytes() {
      return instance.getEncryptionKeyBytes();
    }
    /**
     * <code>optional string encryptionKey = 2;</code>
     */
    public Builder setEncryptionKey(
        java.lang.String value) {
      copyOnWrite();
      instance.setEncryptionKey(value);
      return this;
    }
    /**
     * <code>optional string encryptionKey = 2;</code>
     */
    public Builder clearEncryptionKey() {
      copyOnWrite();
      instance.clearEncryptionKey();
      return this;
    }
    /**
     * <code>optional string encryptionKey = 2;</code>
     */
    public Builder setEncryptionKeyBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setEncryptionKeyBytes(value);
      return this;
    }

    /**
     * <code>optional string hmacKey = 3;</code>
     */
    public boolean hasHmacKey() {
      return instance.hasHmacKey();
    }
    /**
     * <code>optional string hmacKey = 3;</code>
     */
    public java.lang.String getHmacKey() {
      return instance.getHmacKey();
    }
    /**
     * <code>optional string hmacKey = 3;</code>
     */
    public com.google.protobuf.ByteString
        getHmacKeyBytes() {
      return instance.getHmacKeyBytes();
    }
    /**
     * <code>optional string hmacKey = 3;</code>
     */
    public Builder setHmacKey(
        java.lang.String value) {
      copyOnWrite();
      instance.setHmacKey(value);
      return this;
    }
    /**
     * <code>optional string hmacKey = 3;</code>
     */
    public Builder clearHmacKey() {
      copyOnWrite();
      instance.clearHmacKey();
      return this;
    }
    /**
     * <code>optional string hmacKey = 3;</code>
     */
    public Builder setHmacKeyBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setHmacKeyBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:EncryptionParams)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstore.message.EncryptionParams();
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
        com.github.yeriomin.playstore.message.EncryptionParams other = (com.github.yeriomin.playstore.message.EncryptionParams) arg1;
        version_ = visitor.visitInt(
            hasVersion(), version_,
            other.hasVersion(), other.version_);
        encryptionKey_ = visitor.visitString(
            hasEncryptionKey(), encryptionKey_,
            other.hasEncryptionKey(), other.encryptionKey_);
        hmacKey_ = visitor.visitString(
            hasHmacKey(), hmacKey_,
            other.hasHmacKey(), other.hmacKey_);
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
                version_ = input.readInt32();
                break;
              }
              case 18: {
                String s = input.readString();
                bitField0_ |= 0x00000002;
                encryptionKey_ = s;
                break;
              }
              case 26: {
                String s = input.readString();
                bitField0_ |= 0x00000004;
                hmacKey_ = s;
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstore.message.EncryptionParams.class) {
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


  // @@protoc_insertion_point(class_scope:EncryptionParams)
  private static final com.github.yeriomin.playstore.message.EncryptionParams DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new EncryptionParams();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstore.message.EncryptionParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<EncryptionParams> PARSER;

  public static com.google.protobuf.Parser<EncryptionParams> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

