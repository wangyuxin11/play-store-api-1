// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstoreapi;

/**
 * Protobuf type {@code PayloadLevelAppStat}
 */
public  final class PayloadLevelAppStat extends
    com.google.protobuf.GeneratedMessageLite<
        PayloadLevelAppStat, PayloadLevelAppStat.Builder> implements
    // @@protoc_insertion_point(message_implements:PayloadLevelAppStat)
    PayloadLevelAppStatOrBuilder {
  private PayloadLevelAppStat() {
    payloadLevelAppBucket_ = emptyProtobufList();
  }
  private int bitField0_;
  public static final int PACKAGEKEY_FIELD_NUMBER = 1;
  private int packageKey_;
  /**
   * <code>optional int32 packageKey = 1;</code>
   */
  public boolean hasPackageKey() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional int32 packageKey = 1;</code>
   */
  public int getPackageKey() {
    return packageKey_;
  }
  /**
   * <code>optional int32 packageKey = 1;</code>
   */
  private void setPackageKey(int value) {
    bitField0_ |= 0x00000001;
    packageKey_ = value;
  }
  /**
   * <code>optional int32 packageKey = 1;</code>
   */
  private void clearPackageKey() {
    bitField0_ = (bitField0_ & ~0x00000001);
    packageKey_ = 0;
  }

  public static final int APPLICATIONTAG_FIELD_NUMBER = 2;
  private int applicationTag_;
  /**
   * <code>optional int32 applicationTag = 2;</code>
   */
  public boolean hasApplicationTag() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int32 applicationTag = 2;</code>
   */
  public int getApplicationTag() {
    return applicationTag_;
  }
  /**
   * <code>optional int32 applicationTag = 2;</code>
   */
  private void setApplicationTag(int value) {
    bitField0_ |= 0x00000002;
    applicationTag_ = value;
  }
  /**
   * <code>optional int32 applicationTag = 2;</code>
   */
  private void clearApplicationTag() {
    bitField0_ = (bitField0_ & ~0x00000002);
    applicationTag_ = 0;
  }

  public static final int PAYLOADLEVELAPPBUCKET_FIELD_NUMBER = 3;
  private com.google.protobuf.Internal.ProtobufList<com.github.yeriomin.playstoreapi.AppBucket> payloadLevelAppBucket_;
  /**
   * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
   */
  public java.util.List<com.github.yeriomin.playstoreapi.AppBucket> getPayloadLevelAppBucketList() {
    return payloadLevelAppBucket_;
  }
  /**
   * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
   */
  public java.util.List<? extends com.github.yeriomin.playstoreapi.AppBucketOrBuilder> 
      getPayloadLevelAppBucketOrBuilderList() {
    return payloadLevelAppBucket_;
  }
  /**
   * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
   */
  public int getPayloadLevelAppBucketCount() {
    return payloadLevelAppBucket_.size();
  }
  /**
   * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
   */
  public com.github.yeriomin.playstoreapi.AppBucket getPayloadLevelAppBucket(int index) {
    return payloadLevelAppBucket_.get(index);
  }
  /**
   * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
   */
  public com.github.yeriomin.playstoreapi.AppBucketOrBuilder getPayloadLevelAppBucketOrBuilder(
      int index) {
    return payloadLevelAppBucket_.get(index);
  }
  private void ensurePayloadLevelAppBucketIsMutable() {
    if (!payloadLevelAppBucket_.isModifiable()) {
      payloadLevelAppBucket_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(payloadLevelAppBucket_);
     }
  }

  /**
   * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
   */
  private void setPayloadLevelAppBucket(
      int index, com.github.yeriomin.playstoreapi.AppBucket value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensurePayloadLevelAppBucketIsMutable();
    payloadLevelAppBucket_.set(index, value);
  }
  /**
   * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
   */
  private void setPayloadLevelAppBucket(
      int index, com.github.yeriomin.playstoreapi.AppBucket.Builder builderForValue) {
    ensurePayloadLevelAppBucketIsMutable();
    payloadLevelAppBucket_.set(index, builderForValue.build());
  }
  /**
   * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
   */
  private void addPayloadLevelAppBucket(com.github.yeriomin.playstoreapi.AppBucket value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensurePayloadLevelAppBucketIsMutable();
    payloadLevelAppBucket_.add(value);
  }
  /**
   * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
   */
  private void addPayloadLevelAppBucket(
      int index, com.github.yeriomin.playstoreapi.AppBucket value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensurePayloadLevelAppBucketIsMutable();
    payloadLevelAppBucket_.add(index, value);
  }
  /**
   * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
   */
  private void addPayloadLevelAppBucket(
      com.github.yeriomin.playstoreapi.AppBucket.Builder builderForValue) {
    ensurePayloadLevelAppBucketIsMutable();
    payloadLevelAppBucket_.add(builderForValue.build());
  }
  /**
   * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
   */
  private void addPayloadLevelAppBucket(
      int index, com.github.yeriomin.playstoreapi.AppBucket.Builder builderForValue) {
    ensurePayloadLevelAppBucketIsMutable();
    payloadLevelAppBucket_.add(index, builderForValue.build());
  }
  /**
   * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
   */
  private void addAllPayloadLevelAppBucket(
      java.lang.Iterable<? extends com.github.yeriomin.playstoreapi.AppBucket> values) {
    ensurePayloadLevelAppBucketIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, payloadLevelAppBucket_);
  }
  /**
   * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
   */
  private void clearPayloadLevelAppBucket() {
    payloadLevelAppBucket_ = emptyProtobufList();
  }
  /**
   * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
   */
  private void removePayloadLevelAppBucket(int index) {
    ensurePayloadLevelAppBucketIsMutable();
    payloadLevelAppBucket_.remove(index);
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeInt32(1, packageKey_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt32(2, applicationTag_);
    }
    for (int i = 0; i < payloadLevelAppBucket_.size(); i++) {
      output.writeMessage(3, payloadLevelAppBucket_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, packageKey_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, applicationTag_);
    }
    for (int i = 0; i < payloadLevelAppBucket_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, payloadLevelAppBucket_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstoreapi.PayloadLevelAppStat parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstoreapi.PayloadLevelAppStat parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.PayloadLevelAppStat parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstoreapi.PayloadLevelAppStat parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.PayloadLevelAppStat parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.PayloadLevelAppStat parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.PayloadLevelAppStat parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.PayloadLevelAppStat parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.PayloadLevelAppStat parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.PayloadLevelAppStat parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstoreapi.PayloadLevelAppStat prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code PayloadLevelAppStat}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstoreapi.PayloadLevelAppStat, Builder> implements
      // @@protoc_insertion_point(builder_implements:PayloadLevelAppStat)
      com.github.yeriomin.playstoreapi.PayloadLevelAppStatOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.PayloadLevelAppStat.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional int32 packageKey = 1;</code>
     */
    public boolean hasPackageKey() {
      return instance.hasPackageKey();
    }
    /**
     * <code>optional int32 packageKey = 1;</code>
     */
    public int getPackageKey() {
      return instance.getPackageKey();
    }
    /**
     * <code>optional int32 packageKey = 1;</code>
     */
    public Builder setPackageKey(int value) {
      copyOnWrite();
      instance.setPackageKey(value);
      return this;
    }
    /**
     * <code>optional int32 packageKey = 1;</code>
     */
    public Builder clearPackageKey() {
      copyOnWrite();
      instance.clearPackageKey();
      return this;
    }

    /**
     * <code>optional int32 applicationTag = 2;</code>
     */
    public boolean hasApplicationTag() {
      return instance.hasApplicationTag();
    }
    /**
     * <code>optional int32 applicationTag = 2;</code>
     */
    public int getApplicationTag() {
      return instance.getApplicationTag();
    }
    /**
     * <code>optional int32 applicationTag = 2;</code>
     */
    public Builder setApplicationTag(int value) {
      copyOnWrite();
      instance.setApplicationTag(value);
      return this;
    }
    /**
     * <code>optional int32 applicationTag = 2;</code>
     */
    public Builder clearApplicationTag() {
      copyOnWrite();
      instance.clearApplicationTag();
      return this;
    }

    /**
     * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
     */
    public java.util.List<com.github.yeriomin.playstoreapi.AppBucket> getPayloadLevelAppBucketList() {
      return java.util.Collections.unmodifiableList(
          instance.getPayloadLevelAppBucketList());
    }
    /**
     * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
     */
    public int getPayloadLevelAppBucketCount() {
      return instance.getPayloadLevelAppBucketCount();
    }/**
     * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
     */
    public com.github.yeriomin.playstoreapi.AppBucket getPayloadLevelAppBucket(int index) {
      return instance.getPayloadLevelAppBucket(index);
    }
    /**
     * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
     */
    public Builder setPayloadLevelAppBucket(
        int index, com.github.yeriomin.playstoreapi.AppBucket value) {
      copyOnWrite();
      instance.setPayloadLevelAppBucket(index, value);
      return this;
    }
    /**
     * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
     */
    public Builder setPayloadLevelAppBucket(
        int index, com.github.yeriomin.playstoreapi.AppBucket.Builder builderForValue) {
      copyOnWrite();
      instance.setPayloadLevelAppBucket(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
     */
    public Builder addPayloadLevelAppBucket(com.github.yeriomin.playstoreapi.AppBucket value) {
      copyOnWrite();
      instance.addPayloadLevelAppBucket(value);
      return this;
    }
    /**
     * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
     */
    public Builder addPayloadLevelAppBucket(
        int index, com.github.yeriomin.playstoreapi.AppBucket value) {
      copyOnWrite();
      instance.addPayloadLevelAppBucket(index, value);
      return this;
    }
    /**
     * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
     */
    public Builder addPayloadLevelAppBucket(
        com.github.yeriomin.playstoreapi.AppBucket.Builder builderForValue) {
      copyOnWrite();
      instance.addPayloadLevelAppBucket(builderForValue);
      return this;
    }
    /**
     * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
     */
    public Builder addPayloadLevelAppBucket(
        int index, com.github.yeriomin.playstoreapi.AppBucket.Builder builderForValue) {
      copyOnWrite();
      instance.addPayloadLevelAppBucket(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
     */
    public Builder addAllPayloadLevelAppBucket(
        java.lang.Iterable<? extends com.github.yeriomin.playstoreapi.AppBucket> values) {
      copyOnWrite();
      instance.addAllPayloadLevelAppBucket(values);
      return this;
    }
    /**
     * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
     */
    public Builder clearPayloadLevelAppBucket() {
      copyOnWrite();
      instance.clearPayloadLevelAppBucket();
      return this;
    }
    /**
     * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
     */
    public Builder removePayloadLevelAppBucket(int index) {
      copyOnWrite();
      instance.removePayloadLevelAppBucket(index);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:PayloadLevelAppStat)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstoreapi.PayloadLevelAppStat();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        payloadLevelAppBucket_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.github.yeriomin.playstoreapi.PayloadLevelAppStat other = (com.github.yeriomin.playstoreapi.PayloadLevelAppStat) arg1;
        packageKey_ = visitor.visitInt(
            hasPackageKey(), packageKey_,
            other.hasPackageKey(), other.packageKey_);
        applicationTag_ = visitor.visitInt(
            hasApplicationTag(), applicationTag_,
            other.hasApplicationTag(), other.applicationTag_);
        payloadLevelAppBucket_= visitor.visitList(payloadLevelAppBucket_, other.payloadLevelAppBucket_);
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
                packageKey_ = input.readInt32();
                break;
              }
              case 16: {
                bitField0_ |= 0x00000002;
                applicationTag_ = input.readInt32();
                break;
              }
              case 26: {
                if (!payloadLevelAppBucket_.isModifiable()) {
                  payloadLevelAppBucket_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(payloadLevelAppBucket_);
                }
                payloadLevelAppBucket_.add(
                    input.readMessage(com.github.yeriomin.playstoreapi.AppBucket.parser(), extensionRegistry));
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstoreapi.PayloadLevelAppStat.class) {
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


  // @@protoc_insertion_point(class_scope:PayloadLevelAppStat)
  private static final com.github.yeriomin.playstoreapi.PayloadLevelAppStat DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new PayloadLevelAppStat();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstoreapi.PayloadLevelAppStat getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<PayloadLevelAppStat> PARSER;

  public static com.google.protobuf.Parser<PayloadLevelAppStat> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

