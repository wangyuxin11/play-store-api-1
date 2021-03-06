// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

/**
 * Protobuf type {@code TvSeasonDetails}
 */
public  final class TvSeasonDetails extends
    com.google.protobuf.GeneratedMessageLite<
        TvSeasonDetails, TvSeasonDetails.Builder> implements
    // @@protoc_insertion_point(message_implements:TvSeasonDetails)
    TvSeasonDetailsOrBuilder {
  private TvSeasonDetails() {
    parentDetailsUrl_ = "";
    releaseDate_ = "";
    broadcaster_ = "";
  }
  private int bitField0_;
  public static final int PARENTDETAILSURL_FIELD_NUMBER = 1;
  private java.lang.String parentDetailsUrl_;
  /**
   * <code>optional string parentDetailsUrl = 1;</code>
   */
  public boolean hasParentDetailsUrl() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string parentDetailsUrl = 1;</code>
   */
  public java.lang.String getParentDetailsUrl() {
    return parentDetailsUrl_;
  }
  /**
   * <code>optional string parentDetailsUrl = 1;</code>
   */
  public com.google.protobuf.ByteString
      getParentDetailsUrlBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(parentDetailsUrl_);
  }
  /**
   * <code>optional string parentDetailsUrl = 1;</code>
   */
  private void setParentDetailsUrl(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    parentDetailsUrl_ = value;
  }
  /**
   * <code>optional string parentDetailsUrl = 1;</code>
   */
  private void clearParentDetailsUrl() {
    bitField0_ = (bitField0_ & ~0x00000001);
    parentDetailsUrl_ = getDefaultInstance().getParentDetailsUrl();
  }
  /**
   * <code>optional string parentDetailsUrl = 1;</code>
   */
  private void setParentDetailsUrlBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    parentDetailsUrl_ = value.toStringUtf8();
  }

  public static final int SEASONINDEX_FIELD_NUMBER = 2;
  private int seasonIndex_;
  /**
   * <code>optional int32 seasonIndex = 2;</code>
   */
  public boolean hasSeasonIndex() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int32 seasonIndex = 2;</code>
   */
  public int getSeasonIndex() {
    return seasonIndex_;
  }
  /**
   * <code>optional int32 seasonIndex = 2;</code>
   */
  private void setSeasonIndex(int value) {
    bitField0_ |= 0x00000002;
    seasonIndex_ = value;
  }
  /**
   * <code>optional int32 seasonIndex = 2;</code>
   */
  private void clearSeasonIndex() {
    bitField0_ = (bitField0_ & ~0x00000002);
    seasonIndex_ = 0;
  }

  public static final int RELEASEDATE_FIELD_NUMBER = 3;
  private java.lang.String releaseDate_;
  /**
   * <code>optional string releaseDate = 3;</code>
   */
  public boolean hasReleaseDate() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional string releaseDate = 3;</code>
   */
  public java.lang.String getReleaseDate() {
    return releaseDate_;
  }
  /**
   * <code>optional string releaseDate = 3;</code>
   */
  public com.google.protobuf.ByteString
      getReleaseDateBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(releaseDate_);
  }
  /**
   * <code>optional string releaseDate = 3;</code>
   */
  private void setReleaseDate(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
    releaseDate_ = value;
  }
  /**
   * <code>optional string releaseDate = 3;</code>
   */
  private void clearReleaseDate() {
    bitField0_ = (bitField0_ & ~0x00000004);
    releaseDate_ = getDefaultInstance().getReleaseDate();
  }
  /**
   * <code>optional string releaseDate = 3;</code>
   */
  private void setReleaseDateBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
    releaseDate_ = value.toStringUtf8();
  }

  public static final int BROADCASTER_FIELD_NUMBER = 4;
  private java.lang.String broadcaster_;
  /**
   * <code>optional string broadcaster = 4;</code>
   */
  public boolean hasBroadcaster() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>optional string broadcaster = 4;</code>
   */
  public java.lang.String getBroadcaster() {
    return broadcaster_;
  }
  /**
   * <code>optional string broadcaster = 4;</code>
   */
  public com.google.protobuf.ByteString
      getBroadcasterBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(broadcaster_);
  }
  /**
   * <code>optional string broadcaster = 4;</code>
   */
  private void setBroadcaster(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
    broadcaster_ = value;
  }
  /**
   * <code>optional string broadcaster = 4;</code>
   */
  private void clearBroadcaster() {
    bitField0_ = (bitField0_ & ~0x00000008);
    broadcaster_ = getDefaultInstance().getBroadcaster();
  }
  /**
   * <code>optional string broadcaster = 4;</code>
   */
  private void setBroadcasterBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
    broadcaster_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeString(1, getParentDetailsUrl());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt32(2, seasonIndex_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeString(3, getReleaseDate());
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeString(4, getBroadcaster());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getParentDetailsUrl());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, seasonIndex_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(3, getReleaseDate());
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(4, getBroadcaster());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstore.message.TvSeasonDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.TvSeasonDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.TvSeasonDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.TvSeasonDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.TvSeasonDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.TvSeasonDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.TvSeasonDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.TvSeasonDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.TvSeasonDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.TvSeasonDetails parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstore.message.TvSeasonDetails prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code TvSeasonDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstore.message.TvSeasonDetails, Builder> implements
      // @@protoc_insertion_point(builder_implements:TvSeasonDetails)
      com.github.yeriomin.playstore.message.TvSeasonDetailsOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.TvSeasonDetails.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional string parentDetailsUrl = 1;</code>
     */
    public boolean hasParentDetailsUrl() {
      return instance.hasParentDetailsUrl();
    }
    /**
     * <code>optional string parentDetailsUrl = 1;</code>
     */
    public java.lang.String getParentDetailsUrl() {
      return instance.getParentDetailsUrl();
    }
    /**
     * <code>optional string parentDetailsUrl = 1;</code>
     */
    public com.google.protobuf.ByteString
        getParentDetailsUrlBytes() {
      return instance.getParentDetailsUrlBytes();
    }
    /**
     * <code>optional string parentDetailsUrl = 1;</code>
     */
    public Builder setParentDetailsUrl(
        java.lang.String value) {
      copyOnWrite();
      instance.setParentDetailsUrl(value);
      return this;
    }
    /**
     * <code>optional string parentDetailsUrl = 1;</code>
     */
    public Builder clearParentDetailsUrl() {
      copyOnWrite();
      instance.clearParentDetailsUrl();
      return this;
    }
    /**
     * <code>optional string parentDetailsUrl = 1;</code>
     */
    public Builder setParentDetailsUrlBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setParentDetailsUrlBytes(value);
      return this;
    }

    /**
     * <code>optional int32 seasonIndex = 2;</code>
     */
    public boolean hasSeasonIndex() {
      return instance.hasSeasonIndex();
    }
    /**
     * <code>optional int32 seasonIndex = 2;</code>
     */
    public int getSeasonIndex() {
      return instance.getSeasonIndex();
    }
    /**
     * <code>optional int32 seasonIndex = 2;</code>
     */
    public Builder setSeasonIndex(int value) {
      copyOnWrite();
      instance.setSeasonIndex(value);
      return this;
    }
    /**
     * <code>optional int32 seasonIndex = 2;</code>
     */
    public Builder clearSeasonIndex() {
      copyOnWrite();
      instance.clearSeasonIndex();
      return this;
    }

    /**
     * <code>optional string releaseDate = 3;</code>
     */
    public boolean hasReleaseDate() {
      return instance.hasReleaseDate();
    }
    /**
     * <code>optional string releaseDate = 3;</code>
     */
    public java.lang.String getReleaseDate() {
      return instance.getReleaseDate();
    }
    /**
     * <code>optional string releaseDate = 3;</code>
     */
    public com.google.protobuf.ByteString
        getReleaseDateBytes() {
      return instance.getReleaseDateBytes();
    }
    /**
     * <code>optional string releaseDate = 3;</code>
     */
    public Builder setReleaseDate(
        java.lang.String value) {
      copyOnWrite();
      instance.setReleaseDate(value);
      return this;
    }
    /**
     * <code>optional string releaseDate = 3;</code>
     */
    public Builder clearReleaseDate() {
      copyOnWrite();
      instance.clearReleaseDate();
      return this;
    }
    /**
     * <code>optional string releaseDate = 3;</code>
     */
    public Builder setReleaseDateBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setReleaseDateBytes(value);
      return this;
    }

    /**
     * <code>optional string broadcaster = 4;</code>
     */
    public boolean hasBroadcaster() {
      return instance.hasBroadcaster();
    }
    /**
     * <code>optional string broadcaster = 4;</code>
     */
    public java.lang.String getBroadcaster() {
      return instance.getBroadcaster();
    }
    /**
     * <code>optional string broadcaster = 4;</code>
     */
    public com.google.protobuf.ByteString
        getBroadcasterBytes() {
      return instance.getBroadcasterBytes();
    }
    /**
     * <code>optional string broadcaster = 4;</code>
     */
    public Builder setBroadcaster(
        java.lang.String value) {
      copyOnWrite();
      instance.setBroadcaster(value);
      return this;
    }
    /**
     * <code>optional string broadcaster = 4;</code>
     */
    public Builder clearBroadcaster() {
      copyOnWrite();
      instance.clearBroadcaster();
      return this;
    }
    /**
     * <code>optional string broadcaster = 4;</code>
     */
    public Builder setBroadcasterBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setBroadcasterBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:TvSeasonDetails)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstore.message.TvSeasonDetails();
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
        com.github.yeriomin.playstore.message.TvSeasonDetails other = (com.github.yeriomin.playstore.message.TvSeasonDetails) arg1;
        parentDetailsUrl_ = visitor.visitString(
            hasParentDetailsUrl(), parentDetailsUrl_,
            other.hasParentDetailsUrl(), other.parentDetailsUrl_);
        seasonIndex_ = visitor.visitInt(
            hasSeasonIndex(), seasonIndex_,
            other.hasSeasonIndex(), other.seasonIndex_);
        releaseDate_ = visitor.visitString(
            hasReleaseDate(), releaseDate_,
            other.hasReleaseDate(), other.releaseDate_);
        broadcaster_ = visitor.visitString(
            hasBroadcaster(), broadcaster_,
            other.hasBroadcaster(), other.broadcaster_);
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
                parentDetailsUrl_ = s;
                break;
              }
              case 16: {
                bitField0_ |= 0x00000002;
                seasonIndex_ = input.readInt32();
                break;
              }
              case 26: {
                String s = input.readString();
                bitField0_ |= 0x00000004;
                releaseDate_ = s;
                break;
              }
              case 34: {
                String s = input.readString();
                bitField0_ |= 0x00000008;
                broadcaster_ = s;
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstore.message.TvSeasonDetails.class) {
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


  // @@protoc_insertion_point(class_scope:TvSeasonDetails)
  private static final com.github.yeriomin.playstore.message.TvSeasonDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new TvSeasonDetails();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstore.message.TvSeasonDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<TvSeasonDetails> PARSER;

  public static com.google.protobuf.Parser<TvSeasonDetails> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

