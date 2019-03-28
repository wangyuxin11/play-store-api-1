// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

/**
 * Protobuf type {@code CarrierTosEntry}
 */
public  final class CarrierTosEntry extends
    com.google.protobuf.GeneratedMessageLite<
        CarrierTosEntry, CarrierTosEntry.Builder> implements
    // @@protoc_insertion_point(message_implements:CarrierTosEntry)
    CarrierTosEntryOrBuilder {
  private CarrierTosEntry() {
    url_ = "";
    version_ = "";
  }
  private int bitField0_;
  public static final int URL_FIELD_NUMBER = 1;
  private java.lang.String url_;
  /**
   * <code>optional string url = 1;</code>
   */
  public boolean hasUrl() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string url = 1;</code>
   */
  public java.lang.String getUrl() {
    return url_;
  }
  /**
   * <code>optional string url = 1;</code>
   */
  public com.google.protobuf.ByteString
      getUrlBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(url_);
  }
  /**
   * <code>optional string url = 1;</code>
   */
  private void setUrl(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    url_ = value;
  }
  /**
   * <code>optional string url = 1;</code>
   */
  private void clearUrl() {
    bitField0_ = (bitField0_ & ~0x00000001);
    url_ = getDefaultInstance().getUrl();
  }
  /**
   * <code>optional string url = 1;</code>
   */
  private void setUrlBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    url_ = value.toStringUtf8();
  }

  public static final int VERSION_FIELD_NUMBER = 2;
  private java.lang.String version_;
  /**
   * <code>optional string version = 2;</code>
   */
  public boolean hasVersion() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional string version = 2;</code>
   */
  public java.lang.String getVersion() {
    return version_;
  }
  /**
   * <code>optional string version = 2;</code>
   */
  public com.google.protobuf.ByteString
      getVersionBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(version_);
  }
  /**
   * <code>optional string version = 2;</code>
   */
  private void setVersion(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
    version_ = value;
  }
  /**
   * <code>optional string version = 2;</code>
   */
  private void clearVersion() {
    bitField0_ = (bitField0_ & ~0x00000002);
    version_ = getDefaultInstance().getVersion();
  }
  /**
   * <code>optional string version = 2;</code>
   */
  private void setVersionBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
    version_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeString(1, getUrl());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeString(2, getVersion());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getUrl());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getVersion());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstore.message.CarrierTosEntry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.CarrierTosEntry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.CarrierTosEntry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.CarrierTosEntry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.CarrierTosEntry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.CarrierTosEntry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.CarrierTosEntry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.CarrierTosEntry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.CarrierTosEntry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.CarrierTosEntry parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstore.message.CarrierTosEntry prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code CarrierTosEntry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstore.message.CarrierTosEntry, Builder> implements
      // @@protoc_insertion_point(builder_implements:CarrierTosEntry)
      com.github.yeriomin.playstore.message.CarrierTosEntryOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.CarrierTosEntry.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional string url = 1;</code>
     */
    public boolean hasUrl() {
      return instance.hasUrl();
    }
    /**
     * <code>optional string url = 1;</code>
     */
    public java.lang.String getUrl() {
      return instance.getUrl();
    }
    /**
     * <code>optional string url = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      return instance.getUrlBytes();
    }
    /**
     * <code>optional string url = 1;</code>
     */
    public Builder setUrl(
        java.lang.String value) {
      copyOnWrite();
      instance.setUrl(value);
      return this;
    }
    /**
     * <code>optional string url = 1;</code>
     */
    public Builder clearUrl() {
      copyOnWrite();
      instance.clearUrl();
      return this;
    }
    /**
     * <code>optional string url = 1;</code>
     */
    public Builder setUrlBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setUrlBytes(value);
      return this;
    }

    /**
     * <code>optional string version = 2;</code>
     */
    public boolean hasVersion() {
      return instance.hasVersion();
    }
    /**
     * <code>optional string version = 2;</code>
     */
    public java.lang.String getVersion() {
      return instance.getVersion();
    }
    /**
     * <code>optional string version = 2;</code>
     */
    public com.google.protobuf.ByteString
        getVersionBytes() {
      return instance.getVersionBytes();
    }
    /**
     * <code>optional string version = 2;</code>
     */
    public Builder setVersion(
        java.lang.String value) {
      copyOnWrite();
      instance.setVersion(value);
      return this;
    }
    /**
     * <code>optional string version = 2;</code>
     */
    public Builder clearVersion() {
      copyOnWrite();
      instance.clearVersion();
      return this;
    }
    /**
     * <code>optional string version = 2;</code>
     */
    public Builder setVersionBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setVersionBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:CarrierTosEntry)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstore.message.CarrierTosEntry();
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
        com.github.yeriomin.playstore.message.CarrierTosEntry other = (com.github.yeriomin.playstore.message.CarrierTosEntry) arg1;
        url_ = visitor.visitString(
            hasUrl(), url_,
            other.hasUrl(), other.url_);
        version_ = visitor.visitString(
            hasVersion(), version_,
            other.hasVersion(), other.version_);
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
                url_ = s;
                break;
              }
              case 18: {
                String s = input.readString();
                bitField0_ |= 0x00000002;
                version_ = s;
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstore.message.CarrierTosEntry.class) {
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


  // @@protoc_insertion_point(class_scope:CarrierTosEntry)
  private static final com.github.yeriomin.playstore.message.CarrierTosEntry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new CarrierTosEntry();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstore.message.CarrierTosEntry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<CarrierTosEntry> PARSER;

  public static com.google.protobuf.Parser<CarrierTosEntry> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
