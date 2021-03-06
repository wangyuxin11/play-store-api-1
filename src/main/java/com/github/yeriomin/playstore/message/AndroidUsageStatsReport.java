// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

/**
 * Protobuf type {@code AndroidUsageStatsReport}
 */
public  final class AndroidUsageStatsReport extends
    com.google.protobuf.GeneratedMessageLite<
        AndroidUsageStatsReport, AndroidUsageStatsReport.Builder> implements
    // @@protoc_insertion_point(message_implements:AndroidUsageStatsReport)
    AndroidUsageStatsReportOrBuilder {
  private AndroidUsageStatsReport() {
  }
  private int bitField0_;
  public static final int ANDROIDID_FIELD_NUMBER = 1;
  private long androidId_;
  /**
   * <code>optional int64 androidId = 1;</code>
   */
  public boolean hasAndroidId() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional int64 androidId = 1;</code>
   */
  public long getAndroidId() {
    return androidId_;
  }
  /**
   * <code>optional int64 androidId = 1;</code>
   */
  private void setAndroidId(long value) {
    bitField0_ |= 0x00000001;
    androidId_ = value;
  }
  /**
   * <code>optional int64 androidId = 1;</code>
   */
  private void clearAndroidId() {
    bitField0_ = (bitField0_ & ~0x00000001);
    androidId_ = 0L;
  }

  public static final int LOGGINGID_FIELD_NUMBER = 2;
  private long loggingId_;
  /**
   * <code>optional int64 loggingId = 2;</code>
   */
  public boolean hasLoggingId() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int64 loggingId = 2;</code>
   */
  public long getLoggingId() {
    return loggingId_;
  }
  /**
   * <code>optional int64 loggingId = 2;</code>
   */
  private void setLoggingId(long value) {
    bitField0_ |= 0x00000002;
    loggingId_ = value;
  }
  /**
   * <code>optional int64 loggingId = 2;</code>
   */
  private void clearLoggingId() {
    bitField0_ = (bitField0_ & ~0x00000002);
    loggingId_ = 0L;
  }

  public static final int USAGESTATS_FIELD_NUMBER = 3;
  private com.github.yeriomin.playstore.message.UsageStatsExtensionProto usageStats_;
  /**
   * <code>optional .UsageStatsExtensionProto usageStats = 3;</code>
   */
  public boolean hasUsageStats() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional .UsageStatsExtensionProto usageStats = 3;</code>
   */
  public com.github.yeriomin.playstore.message.UsageStatsExtensionProto getUsageStats() {
    return usageStats_ == null ? com.github.yeriomin.playstore.message.UsageStatsExtensionProto.getDefaultInstance() : usageStats_;
  }
  /**
   * <code>optional .UsageStatsExtensionProto usageStats = 3;</code>
   */
  private void setUsageStats(com.github.yeriomin.playstore.message.UsageStatsExtensionProto value) {
    if (value == null) {
      throw new NullPointerException();
    }
    usageStats_ = value;
    bitField0_ |= 0x00000004;
    }
  /**
   * <code>optional .UsageStatsExtensionProto usageStats = 3;</code>
   */
  private void setUsageStats(
      com.github.yeriomin.playstore.message.UsageStatsExtensionProto.Builder builderForValue) {
    usageStats_ = builderForValue.build();
    bitField0_ |= 0x00000004;
  }
  /**
   * <code>optional .UsageStatsExtensionProto usageStats = 3;</code>
   */
  private void mergeUsageStats(com.github.yeriomin.playstore.message.UsageStatsExtensionProto value) {
    if (usageStats_ != null &&
        usageStats_ != com.github.yeriomin.playstore.message.UsageStatsExtensionProto.getDefaultInstance()) {
      usageStats_ =
        com.github.yeriomin.playstore.message.UsageStatsExtensionProto.newBuilder(usageStats_).mergeFrom(value).buildPartial();
    } else {
      usageStats_ = value;
    }
    bitField0_ |= 0x00000004;
  }
  /**
   * <code>optional .UsageStatsExtensionProto usageStats = 3;</code>
   */
  private void clearUsageStats() {  usageStats_ = null;
    bitField0_ = (bitField0_ & ~0x00000004);
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeInt64(1, androidId_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt64(2, loggingId_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeMessage(3, getUsageStats());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, androidId_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, loggingId_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getUsageStats());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstore.message.AndroidUsageStatsReport parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.AndroidUsageStatsReport parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.AndroidUsageStatsReport parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.AndroidUsageStatsReport parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.AndroidUsageStatsReport parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.AndroidUsageStatsReport parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.AndroidUsageStatsReport parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.AndroidUsageStatsReport parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.AndroidUsageStatsReport parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.AndroidUsageStatsReport parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstore.message.AndroidUsageStatsReport prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code AndroidUsageStatsReport}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstore.message.AndroidUsageStatsReport, Builder> implements
      // @@protoc_insertion_point(builder_implements:AndroidUsageStatsReport)
      com.github.yeriomin.playstore.message.AndroidUsageStatsReportOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.AndroidUsageStatsReport.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional int64 androidId = 1;</code>
     */
    public boolean hasAndroidId() {
      return instance.hasAndroidId();
    }
    /**
     * <code>optional int64 androidId = 1;</code>
     */
    public long getAndroidId() {
      return instance.getAndroidId();
    }
    /**
     * <code>optional int64 androidId = 1;</code>
     */
    public Builder setAndroidId(long value) {
      copyOnWrite();
      instance.setAndroidId(value);
      return this;
    }
    /**
     * <code>optional int64 androidId = 1;</code>
     */
    public Builder clearAndroidId() {
      copyOnWrite();
      instance.clearAndroidId();
      return this;
    }

    /**
     * <code>optional int64 loggingId = 2;</code>
     */
    public boolean hasLoggingId() {
      return instance.hasLoggingId();
    }
    /**
     * <code>optional int64 loggingId = 2;</code>
     */
    public long getLoggingId() {
      return instance.getLoggingId();
    }
    /**
     * <code>optional int64 loggingId = 2;</code>
     */
    public Builder setLoggingId(long value) {
      copyOnWrite();
      instance.setLoggingId(value);
      return this;
    }
    /**
     * <code>optional int64 loggingId = 2;</code>
     */
    public Builder clearLoggingId() {
      copyOnWrite();
      instance.clearLoggingId();
      return this;
    }

    /**
     * <code>optional .UsageStatsExtensionProto usageStats = 3;</code>
     */
    public boolean hasUsageStats() {
      return instance.hasUsageStats();
    }
    /**
     * <code>optional .UsageStatsExtensionProto usageStats = 3;</code>
     */
    public com.github.yeriomin.playstore.message.UsageStatsExtensionProto getUsageStats() {
      return instance.getUsageStats();
    }
    /**
     * <code>optional .UsageStatsExtensionProto usageStats = 3;</code>
     */
    public Builder setUsageStats(com.github.yeriomin.playstore.message.UsageStatsExtensionProto value) {
      copyOnWrite();
      instance.setUsageStats(value);
      return this;
      }
    /**
     * <code>optional .UsageStatsExtensionProto usageStats = 3;</code>
     */
    public Builder setUsageStats(
        com.github.yeriomin.playstore.message.UsageStatsExtensionProto.Builder builderForValue) {
      copyOnWrite();
      instance.setUsageStats(builderForValue);
      return this;
    }
    /**
     * <code>optional .UsageStatsExtensionProto usageStats = 3;</code>
     */
    public Builder mergeUsageStats(com.github.yeriomin.playstore.message.UsageStatsExtensionProto value) {
      copyOnWrite();
      instance.mergeUsageStats(value);
      return this;
    }
    /**
     * <code>optional .UsageStatsExtensionProto usageStats = 3;</code>
     */
    public Builder clearUsageStats() {  copyOnWrite();
      instance.clearUsageStats();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:AndroidUsageStatsReport)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstore.message.AndroidUsageStatsReport();
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
        com.github.yeriomin.playstore.message.AndroidUsageStatsReport other = (com.github.yeriomin.playstore.message.AndroidUsageStatsReport) arg1;
        androidId_ = visitor.visitLong(
            hasAndroidId(), androidId_,
            other.hasAndroidId(), other.androidId_);
        loggingId_ = visitor.visitLong(
            hasLoggingId(), loggingId_,
            other.hasLoggingId(), other.loggingId_);
        usageStats_ = visitor.visitMessage(usageStats_, other.usageStats_);
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
                androidId_ = input.readInt64();
                break;
              }
              case 16: {
                bitField0_ |= 0x00000002;
                loggingId_ = input.readInt64();
                break;
              }
              case 26: {
                com.github.yeriomin.playstore.message.UsageStatsExtensionProto.Builder subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = usageStats_.toBuilder();
                }
                usageStats_ = input.readMessage(com.github.yeriomin.playstore.message.UsageStatsExtensionProto.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(usageStats_);
                  usageStats_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstore.message.AndroidUsageStatsReport.class) {
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


  // @@protoc_insertion_point(class_scope:AndroidUsageStatsReport)
  private static final com.github.yeriomin.playstore.message.AndroidUsageStatsReport DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AndroidUsageStatsReport();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstore.message.AndroidUsageStatsReport getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<AndroidUsageStatsReport> PARSER;

  public static com.google.protobuf.Parser<AndroidUsageStatsReport> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

