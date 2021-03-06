// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

/**
 * Protobuf type {@code Targets}
 */
public  final class Targets extends
    com.google.protobuf.GeneratedMessageLite<
        Targets, Targets.Builder> implements
    // @@protoc_insertion_point(message_implements:Targets)
    TargetsOrBuilder {
  private Targets() {
    targetId_ = emptyLongList();
    signature_ = com.google.protobuf.ByteString.EMPTY;
  }
  private int bitField0_;
  public static final int TARGETID_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.LongList targetId_;
  /**
   * <code>repeated int64 targetId = 1;</code>
   */
  public java.util.List<java.lang.Long>
      getTargetIdList() {
    return targetId_;
  }
  /**
   * <code>repeated int64 targetId = 1;</code>
   */
  public int getTargetIdCount() {
    return targetId_.size();
  }
  /**
   * <code>repeated int64 targetId = 1;</code>
   */
  public long getTargetId(int index) {
    return targetId_.getLong(index);
  }
  private void ensureTargetIdIsMutable() {
    if (!targetId_.isModifiable()) {
      targetId_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(targetId_);
     }
  }
  /**
   * <code>repeated int64 targetId = 1;</code>
   */
  private void setTargetId(
      int index, long value) {
    ensureTargetIdIsMutable();
    targetId_.setLong(index, value);
  }
  /**
   * <code>repeated int64 targetId = 1;</code>
   */
  private void addTargetId(long value) {
    ensureTargetIdIsMutable();
    targetId_.addLong(value);
  }
  /**
   * <code>repeated int64 targetId = 1;</code>
   */
  private void addAllTargetId(
      java.lang.Iterable<? extends java.lang.Long> values) {
    ensureTargetIdIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, targetId_);
  }
  /**
   * <code>repeated int64 targetId = 1;</code>
   */
  private void clearTargetId() {
    targetId_ = emptyLongList();
  }

  public static final int SIGNATURE_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString signature_;
  /**
   * <code>optional bytes signature = 2;</code>
   */
  public boolean hasSignature() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional bytes signature = 2;</code>
   */
  public com.google.protobuf.ByteString getSignature() {
    return signature_;
  }
  /**
   * <code>optional bytes signature = 2;</code>
   */
  private void setSignature(com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    signature_ = value;
  }
  /**
   * <code>optional bytes signature = 2;</code>
   */
  private void clearSignature() {
    bitField0_ = (bitField0_ & ~0x00000001);
    signature_ = getDefaultInstance().getSignature();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < targetId_.size(); i++) {
      output.writeInt64(1, targetId_.getLong(i));
    }
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeBytes(2, signature_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < targetId_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(targetId_.getLong(i));
      }
      size += dataSize;
      size += 1 * getTargetIdList().size();
    }
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, signature_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstore.message.Targets parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.Targets parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.Targets parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.Targets parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.Targets parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.Targets parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.Targets parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.Targets parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.Targets parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.Targets parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstore.message.Targets prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code Targets}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstore.message.Targets, Builder> implements
      // @@protoc_insertion_point(builder_implements:Targets)
      com.github.yeriomin.playstore.message.TargetsOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.Targets.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>repeated int64 targetId = 1;</code>
     */
    public java.util.List<java.lang.Long>
        getTargetIdList() {
      return java.util.Collections.unmodifiableList(
          instance.getTargetIdList());
    }
    /**
     * <code>repeated int64 targetId = 1;</code>
     */
    public int getTargetIdCount() {
      return instance.getTargetIdCount();
    }
    /**
     * <code>repeated int64 targetId = 1;</code>
     */
    public long getTargetId(int index) {
      return instance.getTargetId(index);
    }
    /**
     * <code>repeated int64 targetId = 1;</code>
     */
    public Builder setTargetId(
        int index, long value) {
      copyOnWrite();
      instance.setTargetId(index, value);
      return this;
    }
    /**
     * <code>repeated int64 targetId = 1;</code>
     */
    public Builder addTargetId(long value) {
      copyOnWrite();
      instance.addTargetId(value);
      return this;
    }
    /**
     * <code>repeated int64 targetId = 1;</code>
     */
    public Builder addAllTargetId(
        java.lang.Iterable<? extends java.lang.Long> values) {
      copyOnWrite();
      instance.addAllTargetId(values);
      return this;
    }
    /**
     * <code>repeated int64 targetId = 1;</code>
     */
    public Builder clearTargetId() {
      copyOnWrite();
      instance.clearTargetId();
      return this;
    }

    /**
     * <code>optional bytes signature = 2;</code>
     */
    public boolean hasSignature() {
      return instance.hasSignature();
    }
    /**
     * <code>optional bytes signature = 2;</code>
     */
    public com.google.protobuf.ByteString getSignature() {
      return instance.getSignature();
    }
    /**
     * <code>optional bytes signature = 2;</code>
     */
    public Builder setSignature(com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setSignature(value);
      return this;
    }
    /**
     * <code>optional bytes signature = 2;</code>
     */
    public Builder clearSignature() {
      copyOnWrite();
      instance.clearSignature();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:Targets)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstore.message.Targets();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        targetId_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.github.yeriomin.playstore.message.Targets other = (com.github.yeriomin.playstore.message.Targets) arg1;
        targetId_= visitor.visitLongList(targetId_, other.targetId_);
        signature_ = visitor.visitByteString(
            hasSignature(), signature_,
            other.hasSignature(), other.signature_);
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
                if (!targetId_.isModifiable()) {
                  targetId_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(targetId_);
                }
                targetId_.addLong(input.readInt64());
                break;
              }
              case 10: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                if (!targetId_.isModifiable() && input.getBytesUntilLimit() > 0) {
                  targetId_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(targetId_);
                }
                while (input.getBytesUntilLimit() > 0) {
                  targetId_.addLong(input.readInt64());
                }
                input.popLimit(limit);
                break;
              }
              case 18: {
                bitField0_ |= 0x00000001;
                signature_ = input.readBytes();
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstore.message.Targets.class) {
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


  // @@protoc_insertion_point(class_scope:Targets)
  private static final com.github.yeriomin.playstore.message.Targets DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Targets();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstore.message.Targets getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Targets> PARSER;

  public static com.google.protobuf.Parser<Targets> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

