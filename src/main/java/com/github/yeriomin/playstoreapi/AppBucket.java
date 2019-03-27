// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstoreapi;

/**
 * Protobuf type {@code AppBucket}
 */
public  final class AppBucket extends
    com.google.protobuf.GeneratedMessageLite<
        AppBucket, AppBucket.Builder> implements
    // @@protoc_insertion_point(message_implements:AppBucket)
    AppBucketOrBuilder {
  private AppBucket() {
    statCounters_ = emptyProtobufList();
  }
  private int bitField0_;
  public static final int BUCKETSTARTMSEC_FIELD_NUMBER = 1;
  private long bucketStartMsec_;
  /**
   * <code>optional int64 bucketStartMsec = 1;</code>
   */
  public boolean hasBucketStartMsec() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional int64 bucketStartMsec = 1;</code>
   */
  public long getBucketStartMsec() {
    return bucketStartMsec_;
  }
  /**
   * <code>optional int64 bucketStartMsec = 1;</code>
   */
  private void setBucketStartMsec(long value) {
    bitField0_ |= 0x00000001;
    bucketStartMsec_ = value;
  }
  /**
   * <code>optional int64 bucketStartMsec = 1;</code>
   */
  private void clearBucketStartMsec() {
    bitField0_ = (bitField0_ & ~0x00000001);
    bucketStartMsec_ = 0L;
  }

  public static final int BUCKETDURATIONMSEC_FIELD_NUMBER = 2;
  private long bucketDurationMsec_;
  /**
   * <code>optional int64 bucketDurationMsec = 2;</code>
   */
  public boolean hasBucketDurationMsec() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int64 bucketDurationMsec = 2;</code>
   */
  public long getBucketDurationMsec() {
    return bucketDurationMsec_;
  }
  /**
   * <code>optional int64 bucketDurationMsec = 2;</code>
   */
  private void setBucketDurationMsec(long value) {
    bitField0_ |= 0x00000002;
    bucketDurationMsec_ = value;
  }
  /**
   * <code>optional int64 bucketDurationMsec = 2;</code>
   */
  private void clearBucketDurationMsec() {
    bitField0_ = (bitField0_ & ~0x00000002);
    bucketDurationMsec_ = 0L;
  }

  public static final int STATCOUNTERS_FIELD_NUMBER = 3;
  private com.google.protobuf.Internal.ProtobufList<com.github.yeriomin.playstoreapi.StatCounters> statCounters_;
  /**
   * <code>repeated .StatCounters statCounters = 3;</code>
   */
  public java.util.List<com.github.yeriomin.playstoreapi.StatCounters> getStatCountersList() {
    return statCounters_;
  }
  /**
   * <code>repeated .StatCounters statCounters = 3;</code>
   */
  public java.util.List<? extends com.github.yeriomin.playstoreapi.StatCountersOrBuilder> 
      getStatCountersOrBuilderList() {
    return statCounters_;
  }
  /**
   * <code>repeated .StatCounters statCounters = 3;</code>
   */
  public int getStatCountersCount() {
    return statCounters_.size();
  }
  /**
   * <code>repeated .StatCounters statCounters = 3;</code>
   */
  public com.github.yeriomin.playstoreapi.StatCounters getStatCounters(int index) {
    return statCounters_.get(index);
  }
  /**
   * <code>repeated .StatCounters statCounters = 3;</code>
   */
  public com.github.yeriomin.playstoreapi.StatCountersOrBuilder getStatCountersOrBuilder(
      int index) {
    return statCounters_.get(index);
  }
  private void ensureStatCountersIsMutable() {
    if (!statCounters_.isModifiable()) {
      statCounters_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(statCounters_);
     }
  }

  /**
   * <code>repeated .StatCounters statCounters = 3;</code>
   */
  private void setStatCounters(
      int index, com.github.yeriomin.playstoreapi.StatCounters value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureStatCountersIsMutable();
    statCounters_.set(index, value);
  }
  /**
   * <code>repeated .StatCounters statCounters = 3;</code>
   */
  private void setStatCounters(
      int index, com.github.yeriomin.playstoreapi.StatCounters.Builder builderForValue) {
    ensureStatCountersIsMutable();
    statCounters_.set(index, builderForValue.build());
  }
  /**
   * <code>repeated .StatCounters statCounters = 3;</code>
   */
  private void addStatCounters(com.github.yeriomin.playstoreapi.StatCounters value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureStatCountersIsMutable();
    statCounters_.add(value);
  }
  /**
   * <code>repeated .StatCounters statCounters = 3;</code>
   */
  private void addStatCounters(
      int index, com.github.yeriomin.playstoreapi.StatCounters value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureStatCountersIsMutable();
    statCounters_.add(index, value);
  }
  /**
   * <code>repeated .StatCounters statCounters = 3;</code>
   */
  private void addStatCounters(
      com.github.yeriomin.playstoreapi.StatCounters.Builder builderForValue) {
    ensureStatCountersIsMutable();
    statCounters_.add(builderForValue.build());
  }
  /**
   * <code>repeated .StatCounters statCounters = 3;</code>
   */
  private void addStatCounters(
      int index, com.github.yeriomin.playstoreapi.StatCounters.Builder builderForValue) {
    ensureStatCountersIsMutable();
    statCounters_.add(index, builderForValue.build());
  }
  /**
   * <code>repeated .StatCounters statCounters = 3;</code>
   */
  private void addAllStatCounters(
      java.lang.Iterable<? extends com.github.yeriomin.playstoreapi.StatCounters> values) {
    ensureStatCountersIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, statCounters_);
  }
  /**
   * <code>repeated .StatCounters statCounters = 3;</code>
   */
  private void clearStatCounters() {
    statCounters_ = emptyProtobufList();
  }
  /**
   * <code>repeated .StatCounters statCounters = 3;</code>
   */
  private void removeStatCounters(int index) {
    ensureStatCountersIsMutable();
    statCounters_.remove(index);
  }

  public static final int OPERATIONCOUNT_FIELD_NUMBER = 4;
  private long operationCount_;
  /**
   * <code>optional int64 operationCount = 4;</code>
   */
  public boolean hasOperationCount() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional int64 operationCount = 4;</code>
   */
  public long getOperationCount() {
    return operationCount_;
  }
  /**
   * <code>optional int64 operationCount = 4;</code>
   */
  private void setOperationCount(long value) {
    bitField0_ |= 0x00000004;
    operationCount_ = value;
  }
  /**
   * <code>optional int64 operationCount = 4;</code>
   */
  private void clearOperationCount() {
    bitField0_ = (bitField0_ & ~0x00000004);
    operationCount_ = 0L;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeInt64(1, bucketStartMsec_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt64(2, bucketDurationMsec_);
    }
    for (int i = 0; i < statCounters_.size(); i++) {
      output.writeMessage(3, statCounters_.get(i));
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeInt64(4, operationCount_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, bucketStartMsec_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, bucketDurationMsec_);
    }
    for (int i = 0; i < statCounters_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, statCounters_.get(i));
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, operationCount_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstoreapi.AppBucket parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstoreapi.AppBucket parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.AppBucket parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstoreapi.AppBucket parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.AppBucket parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.AppBucket parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.AppBucket parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.AppBucket parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.AppBucket parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.AppBucket parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstoreapi.AppBucket prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code AppBucket}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstoreapi.AppBucket, Builder> implements
      // @@protoc_insertion_point(builder_implements:AppBucket)
      com.github.yeriomin.playstoreapi.AppBucketOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.AppBucket.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional int64 bucketStartMsec = 1;</code>
     */
    public boolean hasBucketStartMsec() {
      return instance.hasBucketStartMsec();
    }
    /**
     * <code>optional int64 bucketStartMsec = 1;</code>
     */
    public long getBucketStartMsec() {
      return instance.getBucketStartMsec();
    }
    /**
     * <code>optional int64 bucketStartMsec = 1;</code>
     */
    public Builder setBucketStartMsec(long value) {
      copyOnWrite();
      instance.setBucketStartMsec(value);
      return this;
    }
    /**
     * <code>optional int64 bucketStartMsec = 1;</code>
     */
    public Builder clearBucketStartMsec() {
      copyOnWrite();
      instance.clearBucketStartMsec();
      return this;
    }

    /**
     * <code>optional int64 bucketDurationMsec = 2;</code>
     */
    public boolean hasBucketDurationMsec() {
      return instance.hasBucketDurationMsec();
    }
    /**
     * <code>optional int64 bucketDurationMsec = 2;</code>
     */
    public long getBucketDurationMsec() {
      return instance.getBucketDurationMsec();
    }
    /**
     * <code>optional int64 bucketDurationMsec = 2;</code>
     */
    public Builder setBucketDurationMsec(long value) {
      copyOnWrite();
      instance.setBucketDurationMsec(value);
      return this;
    }
    /**
     * <code>optional int64 bucketDurationMsec = 2;</code>
     */
    public Builder clearBucketDurationMsec() {
      copyOnWrite();
      instance.clearBucketDurationMsec();
      return this;
    }

    /**
     * <code>repeated .StatCounters statCounters = 3;</code>
     */
    public java.util.List<com.github.yeriomin.playstoreapi.StatCounters> getStatCountersList() {
      return java.util.Collections.unmodifiableList(
          instance.getStatCountersList());
    }
    /**
     * <code>repeated .StatCounters statCounters = 3;</code>
     */
    public int getStatCountersCount() {
      return instance.getStatCountersCount();
    }/**
     * <code>repeated .StatCounters statCounters = 3;</code>
     */
    public com.github.yeriomin.playstoreapi.StatCounters getStatCounters(int index) {
      return instance.getStatCounters(index);
    }
    /**
     * <code>repeated .StatCounters statCounters = 3;</code>
     */
    public Builder setStatCounters(
        int index, com.github.yeriomin.playstoreapi.StatCounters value) {
      copyOnWrite();
      instance.setStatCounters(index, value);
      return this;
    }
    /**
     * <code>repeated .StatCounters statCounters = 3;</code>
     */
    public Builder setStatCounters(
        int index, com.github.yeriomin.playstoreapi.StatCounters.Builder builderForValue) {
      copyOnWrite();
      instance.setStatCounters(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .StatCounters statCounters = 3;</code>
     */
    public Builder addStatCounters(com.github.yeriomin.playstoreapi.StatCounters value) {
      copyOnWrite();
      instance.addStatCounters(value);
      return this;
    }
    /**
     * <code>repeated .StatCounters statCounters = 3;</code>
     */
    public Builder addStatCounters(
        int index, com.github.yeriomin.playstoreapi.StatCounters value) {
      copyOnWrite();
      instance.addStatCounters(index, value);
      return this;
    }
    /**
     * <code>repeated .StatCounters statCounters = 3;</code>
     */
    public Builder addStatCounters(
        com.github.yeriomin.playstoreapi.StatCounters.Builder builderForValue) {
      copyOnWrite();
      instance.addStatCounters(builderForValue);
      return this;
    }
    /**
     * <code>repeated .StatCounters statCounters = 3;</code>
     */
    public Builder addStatCounters(
        int index, com.github.yeriomin.playstoreapi.StatCounters.Builder builderForValue) {
      copyOnWrite();
      instance.addStatCounters(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .StatCounters statCounters = 3;</code>
     */
    public Builder addAllStatCounters(
        java.lang.Iterable<? extends com.github.yeriomin.playstoreapi.StatCounters> values) {
      copyOnWrite();
      instance.addAllStatCounters(values);
      return this;
    }
    /**
     * <code>repeated .StatCounters statCounters = 3;</code>
     */
    public Builder clearStatCounters() {
      copyOnWrite();
      instance.clearStatCounters();
      return this;
    }
    /**
     * <code>repeated .StatCounters statCounters = 3;</code>
     */
    public Builder removeStatCounters(int index) {
      copyOnWrite();
      instance.removeStatCounters(index);
      return this;
    }

    /**
     * <code>optional int64 operationCount = 4;</code>
     */
    public boolean hasOperationCount() {
      return instance.hasOperationCount();
    }
    /**
     * <code>optional int64 operationCount = 4;</code>
     */
    public long getOperationCount() {
      return instance.getOperationCount();
    }
    /**
     * <code>optional int64 operationCount = 4;</code>
     */
    public Builder setOperationCount(long value) {
      copyOnWrite();
      instance.setOperationCount(value);
      return this;
    }
    /**
     * <code>optional int64 operationCount = 4;</code>
     */
    public Builder clearOperationCount() {
      copyOnWrite();
      instance.clearOperationCount();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:AppBucket)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstoreapi.AppBucket();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        statCounters_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.github.yeriomin.playstoreapi.AppBucket other = (com.github.yeriomin.playstoreapi.AppBucket) arg1;
        bucketStartMsec_ = visitor.visitLong(
            hasBucketStartMsec(), bucketStartMsec_,
            other.hasBucketStartMsec(), other.bucketStartMsec_);
        bucketDurationMsec_ = visitor.visitLong(
            hasBucketDurationMsec(), bucketDurationMsec_,
            other.hasBucketDurationMsec(), other.bucketDurationMsec_);
        statCounters_= visitor.visitList(statCounters_, other.statCounters_);
        operationCount_ = visitor.visitLong(
            hasOperationCount(), operationCount_,
            other.hasOperationCount(), other.operationCount_);
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
                bucketStartMsec_ = input.readInt64();
                break;
              }
              case 16: {
                bitField0_ |= 0x00000002;
                bucketDurationMsec_ = input.readInt64();
                break;
              }
              case 26: {
                if (!statCounters_.isModifiable()) {
                  statCounters_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(statCounters_);
                }
                statCounters_.add(
                    input.readMessage(com.github.yeriomin.playstoreapi.StatCounters.parser(), extensionRegistry));
                break;
              }
              case 32: {
                bitField0_ |= 0x00000004;
                operationCount_ = input.readInt64();
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstoreapi.AppBucket.class) {
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


  // @@protoc_insertion_point(class_scope:AppBucket)
  private static final com.github.yeriomin.playstoreapi.AppBucket DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AppBucket();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstoreapi.AppBucket getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<AppBucket> PARSER;

  public static com.google.protobuf.Parser<AppBucket> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

