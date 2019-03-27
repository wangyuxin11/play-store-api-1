// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstoreapi;

/**
 * Protobuf type {@code TvShowDetails}
 */
public  final class TvShowDetails extends
    com.google.protobuf.GeneratedMessageLite<
        TvShowDetails, TvShowDetails.Builder> implements
    // @@protoc_insertion_point(message_implements:TvShowDetails)
    TvShowDetailsOrBuilder {
  private TvShowDetails() {
    broadcaster_ = "";
  }
  private int bitField0_;
  public static final int SEASONCOUNT_FIELD_NUMBER = 1;
  private int seasonCount_;
  /**
   * <code>optional int32 seasonCount = 1;</code>
   */
  public boolean hasSeasonCount() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional int32 seasonCount = 1;</code>
   */
  public int getSeasonCount() {
    return seasonCount_;
  }
  /**
   * <code>optional int32 seasonCount = 1;</code>
   */
  private void setSeasonCount(int value) {
    bitField0_ |= 0x00000001;
    seasonCount_ = value;
  }
  /**
   * <code>optional int32 seasonCount = 1;</code>
   */
  private void clearSeasonCount() {
    bitField0_ = (bitField0_ & ~0x00000001);
    seasonCount_ = 0;
  }

  public static final int STARTYEAR_FIELD_NUMBER = 2;
  private int startYear_;
  /**
   * <code>optional int32 startYear = 2;</code>
   */
  public boolean hasStartYear() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int32 startYear = 2;</code>
   */
  public int getStartYear() {
    return startYear_;
  }
  /**
   * <code>optional int32 startYear = 2;</code>
   */
  private void setStartYear(int value) {
    bitField0_ |= 0x00000002;
    startYear_ = value;
  }
  /**
   * <code>optional int32 startYear = 2;</code>
   */
  private void clearStartYear() {
    bitField0_ = (bitField0_ & ~0x00000002);
    startYear_ = 0;
  }

  public static final int ENDYEAR_FIELD_NUMBER = 3;
  private int endYear_;
  /**
   * <code>optional int32 endYear = 3;</code>
   */
  public boolean hasEndYear() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional int32 endYear = 3;</code>
   */
  public int getEndYear() {
    return endYear_;
  }
  /**
   * <code>optional int32 endYear = 3;</code>
   */
  private void setEndYear(int value) {
    bitField0_ |= 0x00000004;
    endYear_ = value;
  }
  /**
   * <code>optional int32 endYear = 3;</code>
   */
  private void clearEndYear() {
    bitField0_ = (bitField0_ & ~0x00000004);
    endYear_ = 0;
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
      output.writeInt32(1, seasonCount_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt32(2, startYear_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeInt32(3, endYear_);
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
        .computeInt32Size(1, seasonCount_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, startYear_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, endYear_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(4, getBroadcaster());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstoreapi.TvShowDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstoreapi.TvShowDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.TvShowDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstoreapi.TvShowDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.TvShowDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.TvShowDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.TvShowDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.TvShowDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.TvShowDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.TvShowDetails parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstoreapi.TvShowDetails prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code TvShowDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstoreapi.TvShowDetails, Builder> implements
      // @@protoc_insertion_point(builder_implements:TvShowDetails)
      com.github.yeriomin.playstoreapi.TvShowDetailsOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.TvShowDetails.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional int32 seasonCount = 1;</code>
     */
    public boolean hasSeasonCount() {
      return instance.hasSeasonCount();
    }
    /**
     * <code>optional int32 seasonCount = 1;</code>
     */
    public int getSeasonCount() {
      return instance.getSeasonCount();
    }
    /**
     * <code>optional int32 seasonCount = 1;</code>
     */
    public Builder setSeasonCount(int value) {
      copyOnWrite();
      instance.setSeasonCount(value);
      return this;
    }
    /**
     * <code>optional int32 seasonCount = 1;</code>
     */
    public Builder clearSeasonCount() {
      copyOnWrite();
      instance.clearSeasonCount();
      return this;
    }

    /**
     * <code>optional int32 startYear = 2;</code>
     */
    public boolean hasStartYear() {
      return instance.hasStartYear();
    }
    /**
     * <code>optional int32 startYear = 2;</code>
     */
    public int getStartYear() {
      return instance.getStartYear();
    }
    /**
     * <code>optional int32 startYear = 2;</code>
     */
    public Builder setStartYear(int value) {
      copyOnWrite();
      instance.setStartYear(value);
      return this;
    }
    /**
     * <code>optional int32 startYear = 2;</code>
     */
    public Builder clearStartYear() {
      copyOnWrite();
      instance.clearStartYear();
      return this;
    }

    /**
     * <code>optional int32 endYear = 3;</code>
     */
    public boolean hasEndYear() {
      return instance.hasEndYear();
    }
    /**
     * <code>optional int32 endYear = 3;</code>
     */
    public int getEndYear() {
      return instance.getEndYear();
    }
    /**
     * <code>optional int32 endYear = 3;</code>
     */
    public Builder setEndYear(int value) {
      copyOnWrite();
      instance.setEndYear(value);
      return this;
    }
    /**
     * <code>optional int32 endYear = 3;</code>
     */
    public Builder clearEndYear() {
      copyOnWrite();
      instance.clearEndYear();
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

    // @@protoc_insertion_point(builder_scope:TvShowDetails)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstoreapi.TvShowDetails();
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
        com.github.yeriomin.playstoreapi.TvShowDetails other = (com.github.yeriomin.playstoreapi.TvShowDetails) arg1;
        seasonCount_ = visitor.visitInt(
            hasSeasonCount(), seasonCount_,
            other.hasSeasonCount(), other.seasonCount_);
        startYear_ = visitor.visitInt(
            hasStartYear(), startYear_,
            other.hasStartYear(), other.startYear_);
        endYear_ = visitor.visitInt(
            hasEndYear(), endYear_,
            other.hasEndYear(), other.endYear_);
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
              case 8: {
                bitField0_ |= 0x00000001;
                seasonCount_ = input.readInt32();
                break;
              }
              case 16: {
                bitField0_ |= 0x00000002;
                startYear_ = input.readInt32();
                break;
              }
              case 24: {
                bitField0_ |= 0x00000004;
                endYear_ = input.readInt32();
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstoreapi.TvShowDetails.class) {
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


  // @@protoc_insertion_point(class_scope:TvShowDetails)
  private static final com.github.yeriomin.playstoreapi.TvShowDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new TvShowDetails();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstoreapi.TvShowDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<TvShowDetails> PARSER;

  public static com.google.protobuf.Parser<TvShowDetails> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

