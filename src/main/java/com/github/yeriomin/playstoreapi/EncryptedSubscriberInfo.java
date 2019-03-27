// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstoreapi;

/**
 * Protobuf type {@code EncryptedSubscriberInfo}
 */
public  final class EncryptedSubscriberInfo extends
    com.google.protobuf.GeneratedMessageLite<
        EncryptedSubscriberInfo, EncryptedSubscriberInfo.Builder> implements
    // @@protoc_insertion_point(message_implements:EncryptedSubscriberInfo)
    EncryptedSubscriberInfoOrBuilder {
  private EncryptedSubscriberInfo() {
    data_ = "";
    encryptedKey_ = "";
    signature_ = "";
    initVector_ = "";
  }
  private int bitField0_;
  public static final int DATA_FIELD_NUMBER = 1;
  private java.lang.String data_;
  /**
   * <code>optional string data = 1;</code>
   */
  public boolean hasData() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string data = 1;</code>
   */
  public java.lang.String getData() {
    return data_;
  }
  /**
   * <code>optional string data = 1;</code>
   */
  public com.google.protobuf.ByteString
      getDataBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(data_);
  }
  /**
   * <code>optional string data = 1;</code>
   */
  private void setData(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    data_ = value;
  }
  /**
   * <code>optional string data = 1;</code>
   */
  private void clearData() {
    bitField0_ = (bitField0_ & ~0x00000001);
    data_ = getDefaultInstance().getData();
  }
  /**
   * <code>optional string data = 1;</code>
   */
  private void setDataBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    data_ = value.toStringUtf8();
  }

  public static final int ENCRYPTEDKEY_FIELD_NUMBER = 2;
  private java.lang.String encryptedKey_;
  /**
   * <code>optional string encryptedKey = 2;</code>
   */
  public boolean hasEncryptedKey() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional string encryptedKey = 2;</code>
   */
  public java.lang.String getEncryptedKey() {
    return encryptedKey_;
  }
  /**
   * <code>optional string encryptedKey = 2;</code>
   */
  public com.google.protobuf.ByteString
      getEncryptedKeyBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(encryptedKey_);
  }
  /**
   * <code>optional string encryptedKey = 2;</code>
   */
  private void setEncryptedKey(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
    encryptedKey_ = value;
  }
  /**
   * <code>optional string encryptedKey = 2;</code>
   */
  private void clearEncryptedKey() {
    bitField0_ = (bitField0_ & ~0x00000002);
    encryptedKey_ = getDefaultInstance().getEncryptedKey();
  }
  /**
   * <code>optional string encryptedKey = 2;</code>
   */
  private void setEncryptedKeyBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
    encryptedKey_ = value.toStringUtf8();
  }

  public static final int SIGNATURE_FIELD_NUMBER = 3;
  private java.lang.String signature_;
  /**
   * <code>optional string signature = 3;</code>
   */
  public boolean hasSignature() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional string signature = 3;</code>
   */
  public java.lang.String getSignature() {
    return signature_;
  }
  /**
   * <code>optional string signature = 3;</code>
   */
  public com.google.protobuf.ByteString
      getSignatureBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(signature_);
  }
  /**
   * <code>optional string signature = 3;</code>
   */
  private void setSignature(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
    signature_ = value;
  }
  /**
   * <code>optional string signature = 3;</code>
   */
  private void clearSignature() {
    bitField0_ = (bitField0_ & ~0x00000004);
    signature_ = getDefaultInstance().getSignature();
  }
  /**
   * <code>optional string signature = 3;</code>
   */
  private void setSignatureBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
    signature_ = value.toStringUtf8();
  }

  public static final int INITVECTOR_FIELD_NUMBER = 4;
  private java.lang.String initVector_;
  /**
   * <code>optional string initVector = 4;</code>
   */
  public boolean hasInitVector() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>optional string initVector = 4;</code>
   */
  public java.lang.String getInitVector() {
    return initVector_;
  }
  /**
   * <code>optional string initVector = 4;</code>
   */
  public com.google.protobuf.ByteString
      getInitVectorBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(initVector_);
  }
  /**
   * <code>optional string initVector = 4;</code>
   */
  private void setInitVector(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
    initVector_ = value;
  }
  /**
   * <code>optional string initVector = 4;</code>
   */
  private void clearInitVector() {
    bitField0_ = (bitField0_ & ~0x00000008);
    initVector_ = getDefaultInstance().getInitVector();
  }
  /**
   * <code>optional string initVector = 4;</code>
   */
  private void setInitVectorBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
    initVector_ = value.toStringUtf8();
  }

  public static final int GOOGLEKEYVERSION_FIELD_NUMBER = 5;
  private int googleKeyVersion_;
  /**
   * <code>optional int32 googleKeyVersion = 5;</code>
   */
  public boolean hasGoogleKeyVersion() {
    return ((bitField0_ & 0x00000010) == 0x00000010);
  }
  /**
   * <code>optional int32 googleKeyVersion = 5;</code>
   */
  public int getGoogleKeyVersion() {
    return googleKeyVersion_;
  }
  /**
   * <code>optional int32 googleKeyVersion = 5;</code>
   */
  private void setGoogleKeyVersion(int value) {
    bitField0_ |= 0x00000010;
    googleKeyVersion_ = value;
  }
  /**
   * <code>optional int32 googleKeyVersion = 5;</code>
   */
  private void clearGoogleKeyVersion() {
    bitField0_ = (bitField0_ & ~0x00000010);
    googleKeyVersion_ = 0;
  }

  public static final int CARRIERKEYVERSION_FIELD_NUMBER = 6;
  private int carrierKeyVersion_;
  /**
   * <code>optional int32 carrierKeyVersion = 6;</code>
   */
  public boolean hasCarrierKeyVersion() {
    return ((bitField0_ & 0x00000020) == 0x00000020);
  }
  /**
   * <code>optional int32 carrierKeyVersion = 6;</code>
   */
  public int getCarrierKeyVersion() {
    return carrierKeyVersion_;
  }
  /**
   * <code>optional int32 carrierKeyVersion = 6;</code>
   */
  private void setCarrierKeyVersion(int value) {
    bitField0_ |= 0x00000020;
    carrierKeyVersion_ = value;
  }
  /**
   * <code>optional int32 carrierKeyVersion = 6;</code>
   */
  private void clearCarrierKeyVersion() {
    bitField0_ = (bitField0_ & ~0x00000020);
    carrierKeyVersion_ = 0;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeString(1, getData());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeString(2, getEncryptedKey());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeString(3, getSignature());
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeString(4, getInitVector());
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      output.writeInt32(5, googleKeyVersion_);
    }
    if (((bitField0_ & 0x00000020) == 0x00000020)) {
      output.writeInt32(6, carrierKeyVersion_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getData());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getEncryptedKey());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(3, getSignature());
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(4, getInitVector());
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, googleKeyVersion_);
    }
    if (((bitField0_ & 0x00000020) == 0x00000020)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, carrierKeyVersion_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstoreapi.EncryptedSubscriberInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstoreapi.EncryptedSubscriberInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.EncryptedSubscriberInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstoreapi.EncryptedSubscriberInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.EncryptedSubscriberInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.EncryptedSubscriberInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.EncryptedSubscriberInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.EncryptedSubscriberInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.EncryptedSubscriberInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.EncryptedSubscriberInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstoreapi.EncryptedSubscriberInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code EncryptedSubscriberInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstoreapi.EncryptedSubscriberInfo, Builder> implements
      // @@protoc_insertion_point(builder_implements:EncryptedSubscriberInfo)
      com.github.yeriomin.playstoreapi.EncryptedSubscriberInfoOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.EncryptedSubscriberInfo.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional string data = 1;</code>
     */
    public boolean hasData() {
      return instance.hasData();
    }
    /**
     * <code>optional string data = 1;</code>
     */
    public java.lang.String getData() {
      return instance.getData();
    }
    /**
     * <code>optional string data = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDataBytes() {
      return instance.getDataBytes();
    }
    /**
     * <code>optional string data = 1;</code>
     */
    public Builder setData(
        java.lang.String value) {
      copyOnWrite();
      instance.setData(value);
      return this;
    }
    /**
     * <code>optional string data = 1;</code>
     */
    public Builder clearData() {
      copyOnWrite();
      instance.clearData();
      return this;
    }
    /**
     * <code>optional string data = 1;</code>
     */
    public Builder setDataBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setDataBytes(value);
      return this;
    }

    /**
     * <code>optional string encryptedKey = 2;</code>
     */
    public boolean hasEncryptedKey() {
      return instance.hasEncryptedKey();
    }
    /**
     * <code>optional string encryptedKey = 2;</code>
     */
    public java.lang.String getEncryptedKey() {
      return instance.getEncryptedKey();
    }
    /**
     * <code>optional string encryptedKey = 2;</code>
     */
    public com.google.protobuf.ByteString
        getEncryptedKeyBytes() {
      return instance.getEncryptedKeyBytes();
    }
    /**
     * <code>optional string encryptedKey = 2;</code>
     */
    public Builder setEncryptedKey(
        java.lang.String value) {
      copyOnWrite();
      instance.setEncryptedKey(value);
      return this;
    }
    /**
     * <code>optional string encryptedKey = 2;</code>
     */
    public Builder clearEncryptedKey() {
      copyOnWrite();
      instance.clearEncryptedKey();
      return this;
    }
    /**
     * <code>optional string encryptedKey = 2;</code>
     */
    public Builder setEncryptedKeyBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setEncryptedKeyBytes(value);
      return this;
    }

    /**
     * <code>optional string signature = 3;</code>
     */
    public boolean hasSignature() {
      return instance.hasSignature();
    }
    /**
     * <code>optional string signature = 3;</code>
     */
    public java.lang.String getSignature() {
      return instance.getSignature();
    }
    /**
     * <code>optional string signature = 3;</code>
     */
    public com.google.protobuf.ByteString
        getSignatureBytes() {
      return instance.getSignatureBytes();
    }
    /**
     * <code>optional string signature = 3;</code>
     */
    public Builder setSignature(
        java.lang.String value) {
      copyOnWrite();
      instance.setSignature(value);
      return this;
    }
    /**
     * <code>optional string signature = 3;</code>
     */
    public Builder clearSignature() {
      copyOnWrite();
      instance.clearSignature();
      return this;
    }
    /**
     * <code>optional string signature = 3;</code>
     */
    public Builder setSignatureBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setSignatureBytes(value);
      return this;
    }

    /**
     * <code>optional string initVector = 4;</code>
     */
    public boolean hasInitVector() {
      return instance.hasInitVector();
    }
    /**
     * <code>optional string initVector = 4;</code>
     */
    public java.lang.String getInitVector() {
      return instance.getInitVector();
    }
    /**
     * <code>optional string initVector = 4;</code>
     */
    public com.google.protobuf.ByteString
        getInitVectorBytes() {
      return instance.getInitVectorBytes();
    }
    /**
     * <code>optional string initVector = 4;</code>
     */
    public Builder setInitVector(
        java.lang.String value) {
      copyOnWrite();
      instance.setInitVector(value);
      return this;
    }
    /**
     * <code>optional string initVector = 4;</code>
     */
    public Builder clearInitVector() {
      copyOnWrite();
      instance.clearInitVector();
      return this;
    }
    /**
     * <code>optional string initVector = 4;</code>
     */
    public Builder setInitVectorBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setInitVectorBytes(value);
      return this;
    }

    /**
     * <code>optional int32 googleKeyVersion = 5;</code>
     */
    public boolean hasGoogleKeyVersion() {
      return instance.hasGoogleKeyVersion();
    }
    /**
     * <code>optional int32 googleKeyVersion = 5;</code>
     */
    public int getGoogleKeyVersion() {
      return instance.getGoogleKeyVersion();
    }
    /**
     * <code>optional int32 googleKeyVersion = 5;</code>
     */
    public Builder setGoogleKeyVersion(int value) {
      copyOnWrite();
      instance.setGoogleKeyVersion(value);
      return this;
    }
    /**
     * <code>optional int32 googleKeyVersion = 5;</code>
     */
    public Builder clearGoogleKeyVersion() {
      copyOnWrite();
      instance.clearGoogleKeyVersion();
      return this;
    }

    /**
     * <code>optional int32 carrierKeyVersion = 6;</code>
     */
    public boolean hasCarrierKeyVersion() {
      return instance.hasCarrierKeyVersion();
    }
    /**
     * <code>optional int32 carrierKeyVersion = 6;</code>
     */
    public int getCarrierKeyVersion() {
      return instance.getCarrierKeyVersion();
    }
    /**
     * <code>optional int32 carrierKeyVersion = 6;</code>
     */
    public Builder setCarrierKeyVersion(int value) {
      copyOnWrite();
      instance.setCarrierKeyVersion(value);
      return this;
    }
    /**
     * <code>optional int32 carrierKeyVersion = 6;</code>
     */
    public Builder clearCarrierKeyVersion() {
      copyOnWrite();
      instance.clearCarrierKeyVersion();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:EncryptedSubscriberInfo)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstoreapi.EncryptedSubscriberInfo();
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
        com.github.yeriomin.playstoreapi.EncryptedSubscriberInfo other = (com.github.yeriomin.playstoreapi.EncryptedSubscriberInfo) arg1;
        data_ = visitor.visitString(
            hasData(), data_,
            other.hasData(), other.data_);
        encryptedKey_ = visitor.visitString(
            hasEncryptedKey(), encryptedKey_,
            other.hasEncryptedKey(), other.encryptedKey_);
        signature_ = visitor.visitString(
            hasSignature(), signature_,
            other.hasSignature(), other.signature_);
        initVector_ = visitor.visitString(
            hasInitVector(), initVector_,
            other.hasInitVector(), other.initVector_);
        googleKeyVersion_ = visitor.visitInt(
            hasGoogleKeyVersion(), googleKeyVersion_,
            other.hasGoogleKeyVersion(), other.googleKeyVersion_);
        carrierKeyVersion_ = visitor.visitInt(
            hasCarrierKeyVersion(), carrierKeyVersion_,
            other.hasCarrierKeyVersion(), other.carrierKeyVersion_);
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
                data_ = s;
                break;
              }
              case 18: {
                String s = input.readString();
                bitField0_ |= 0x00000002;
                encryptedKey_ = s;
                break;
              }
              case 26: {
                String s = input.readString();
                bitField0_ |= 0x00000004;
                signature_ = s;
                break;
              }
              case 34: {
                String s = input.readString();
                bitField0_ |= 0x00000008;
                initVector_ = s;
                break;
              }
              case 40: {
                bitField0_ |= 0x00000010;
                googleKeyVersion_ = input.readInt32();
                break;
              }
              case 48: {
                bitField0_ |= 0x00000020;
                carrierKeyVersion_ = input.readInt32();
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstoreapi.EncryptedSubscriberInfo.class) {
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


  // @@protoc_insertion_point(class_scope:EncryptedSubscriberInfo)
  private static final com.github.yeriomin.playstoreapi.EncryptedSubscriberInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new EncryptedSubscriberInfo();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstoreapi.EncryptedSubscriberInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<EncryptedSubscriberInfo> PARSER;

  public static com.google.protobuf.Parser<EncryptedSubscriberInfo> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

