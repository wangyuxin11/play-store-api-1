// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

/**
 * Protobuf type {@code RelatedLinksUnknown2}
 */
public  final class RelatedLinksUnknown2 extends
    com.google.protobuf.GeneratedMessageLite<
        RelatedLinksUnknown2, RelatedLinksUnknown2.Builder> implements
    // @@protoc_insertion_point(message_implements:RelatedLinksUnknown2)
    RelatedLinksUnknown2OrBuilder {
  private RelatedLinksUnknown2() {
    homeUrl_ = "";
    nextPageUrl_ = "";
  }
  private int bitField0_;
  public static final int HOMEURL_FIELD_NUMBER = 2;
  private java.lang.String homeUrl_;
  /**
   * <code>optional string homeUrl = 2;</code>
   */
  public boolean hasHomeUrl() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string homeUrl = 2;</code>
   */
  public java.lang.String getHomeUrl() {
    return homeUrl_;
  }
  /**
   * <code>optional string homeUrl = 2;</code>
   */
  public com.google.protobuf.ByteString
      getHomeUrlBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(homeUrl_);
  }
  /**
   * <code>optional string homeUrl = 2;</code>
   */
  private void setHomeUrl(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    homeUrl_ = value;
  }
  /**
   * <code>optional string homeUrl = 2;</code>
   */
  private void clearHomeUrl() {
    bitField0_ = (bitField0_ & ~0x00000001);
    homeUrl_ = getDefaultInstance().getHomeUrl();
  }
  /**
   * <code>optional string homeUrl = 2;</code>
   */
  private void setHomeUrlBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    homeUrl_ = value.toStringUtf8();
  }

  public static final int NEXTPAGEURL_FIELD_NUMBER = 3;
  private java.lang.String nextPageUrl_;
  /**
   * <code>optional string nextPageUrl = 3;</code>
   */
  public boolean hasNextPageUrl() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional string nextPageUrl = 3;</code>
   */
  public java.lang.String getNextPageUrl() {
    return nextPageUrl_;
  }
  /**
   * <code>optional string nextPageUrl = 3;</code>
   */
  public com.google.protobuf.ByteString
      getNextPageUrlBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(nextPageUrl_);
  }
  /**
   * <code>optional string nextPageUrl = 3;</code>
   */
  private void setNextPageUrl(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
    nextPageUrl_ = value;
  }
  /**
   * <code>optional string nextPageUrl = 3;</code>
   */
  private void clearNextPageUrl() {
    bitField0_ = (bitField0_ & ~0x00000002);
    nextPageUrl_ = getDefaultInstance().getNextPageUrl();
  }
  /**
   * <code>optional string nextPageUrl = 3;</code>
   */
  private void setNextPageUrlBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
    nextPageUrl_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeString(2, getHomeUrl());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeString(3, getNextPageUrl());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getHomeUrl());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(3, getNextPageUrl());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstore.message.RelatedLinksUnknown2 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.RelatedLinksUnknown2 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.RelatedLinksUnknown2 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.RelatedLinksUnknown2 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.RelatedLinksUnknown2 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.RelatedLinksUnknown2 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.RelatedLinksUnknown2 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.RelatedLinksUnknown2 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.RelatedLinksUnknown2 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.RelatedLinksUnknown2 parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstore.message.RelatedLinksUnknown2 prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code RelatedLinksUnknown2}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstore.message.RelatedLinksUnknown2, Builder> implements
      // @@protoc_insertion_point(builder_implements:RelatedLinksUnknown2)
      com.github.yeriomin.playstore.message.RelatedLinksUnknown2OrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.RelatedLinksUnknown2.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional string homeUrl = 2;</code>
     */
    public boolean hasHomeUrl() {
      return instance.hasHomeUrl();
    }
    /**
     * <code>optional string homeUrl = 2;</code>
     */
    public java.lang.String getHomeUrl() {
      return instance.getHomeUrl();
    }
    /**
     * <code>optional string homeUrl = 2;</code>
     */
    public com.google.protobuf.ByteString
        getHomeUrlBytes() {
      return instance.getHomeUrlBytes();
    }
    /**
     * <code>optional string homeUrl = 2;</code>
     */
    public Builder setHomeUrl(
        java.lang.String value) {
      copyOnWrite();
      instance.setHomeUrl(value);
      return this;
    }
    /**
     * <code>optional string homeUrl = 2;</code>
     */
    public Builder clearHomeUrl() {
      copyOnWrite();
      instance.clearHomeUrl();
      return this;
    }
    /**
     * <code>optional string homeUrl = 2;</code>
     */
    public Builder setHomeUrlBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setHomeUrlBytes(value);
      return this;
    }

    /**
     * <code>optional string nextPageUrl = 3;</code>
     */
    public boolean hasNextPageUrl() {
      return instance.hasNextPageUrl();
    }
    /**
     * <code>optional string nextPageUrl = 3;</code>
     */
    public java.lang.String getNextPageUrl() {
      return instance.getNextPageUrl();
    }
    /**
     * <code>optional string nextPageUrl = 3;</code>
     */
    public com.google.protobuf.ByteString
        getNextPageUrlBytes() {
      return instance.getNextPageUrlBytes();
    }
    /**
     * <code>optional string nextPageUrl = 3;</code>
     */
    public Builder setNextPageUrl(
        java.lang.String value) {
      copyOnWrite();
      instance.setNextPageUrl(value);
      return this;
    }
    /**
     * <code>optional string nextPageUrl = 3;</code>
     */
    public Builder clearNextPageUrl() {
      copyOnWrite();
      instance.clearNextPageUrl();
      return this;
    }
    /**
     * <code>optional string nextPageUrl = 3;</code>
     */
    public Builder setNextPageUrlBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setNextPageUrlBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:RelatedLinksUnknown2)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstore.message.RelatedLinksUnknown2();
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
        com.github.yeriomin.playstore.message.RelatedLinksUnknown2 other = (com.github.yeriomin.playstore.message.RelatedLinksUnknown2) arg1;
        homeUrl_ = visitor.visitString(
            hasHomeUrl(), homeUrl_,
            other.hasHomeUrl(), other.homeUrl_);
        nextPageUrl_ = visitor.visitString(
            hasNextPageUrl(), nextPageUrl_,
            other.hasNextPageUrl(), other.nextPageUrl_);
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
              case 18: {
                String s = input.readString();
                bitField0_ |= 0x00000001;
                homeUrl_ = s;
                break;
              }
              case 26: {
                String s = input.readString();
                bitField0_ |= 0x00000002;
                nextPageUrl_ = s;
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstore.message.RelatedLinksUnknown2.class) {
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


  // @@protoc_insertion_point(class_scope:RelatedLinksUnknown2)
  private static final com.github.yeriomin.playstore.message.RelatedLinksUnknown2 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new RelatedLinksUnknown2();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstore.message.RelatedLinksUnknown2 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<RelatedLinksUnknown2> PARSER;

  public static com.google.protobuf.Parser<RelatedLinksUnknown2> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

