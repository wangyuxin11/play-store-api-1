// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

/**
 * Protobuf type {@code AndroidStatisticProto}
 */
public  final class AndroidStatisticProto extends
    com.google.protobuf.GeneratedMessageLite<
        AndroidStatisticProto, AndroidStatisticProto.Builder> implements
    // @@protoc_insertion_point(message_implements:AndroidStatisticProto)
    AndroidStatisticProtoOrBuilder {
  private AndroidStatisticProto() {
    tag_ = "";
  }
  private int bitField0_;
  public static final int TAG_FIELD_NUMBER = 1;
  private java.lang.String tag_;
  /**
   * <code>optional string tag = 1;</code>
   */
  public boolean hasTag() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string tag = 1;</code>
   */
  public java.lang.String getTag() {
    return tag_;
  }
  /**
   * <code>optional string tag = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTagBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(tag_);
  }
  /**
   * <code>optional string tag = 1;</code>
   */
  private void setTag(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    tag_ = value;
  }
  /**
   * <code>optional string tag = 1;</code>
   */
  private void clearTag() {
    bitField0_ = (bitField0_ & ~0x00000001);
    tag_ = getDefaultInstance().getTag();
  }
  /**
   * <code>optional string tag = 1;</code>
   */
  private void setTagBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    tag_ = value.toStringUtf8();
  }

  public static final int COUNT_FIELD_NUMBER = 2;
  private int count_;
  /**
   * <code>optional int32 count = 2;</code>
   */
  public boolean hasCount() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int32 count = 2;</code>
   */
  public int getCount() {
    return count_;
  }
  /**
   * <code>optional int32 count = 2;</code>
   */
  private void setCount(int value) {
    bitField0_ |= 0x00000002;
    count_ = value;
  }
  /**
   * <code>optional int32 count = 2;</code>
   */
  private void clearCount() {
    bitField0_ = (bitField0_ & ~0x00000002);
    count_ = 0;
  }

  public static final int SUM_FIELD_NUMBER = 3;
  private float sum_;
  /**
   * <code>optional float sum = 3;</code>
   */
  public boolean hasSum() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional float sum = 3;</code>
   */
  public float getSum() {
    return sum_;
  }
  /**
   * <code>optional float sum = 3;</code>
   */
  private void setSum(float value) {
    bitField0_ |= 0x00000004;
    sum_ = value;
  }
  /**
   * <code>optional float sum = 3;</code>
   */
  private void clearSum() {
    bitField0_ = (bitField0_ & ~0x00000004);
    sum_ = 0F;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeString(1, getTag());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt32(2, count_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeFloat(3, sum_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getTag());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, count_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, sum_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstore.message.AndroidStatisticProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.AndroidStatisticProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.AndroidStatisticProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.AndroidStatisticProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.AndroidStatisticProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.AndroidStatisticProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.AndroidStatisticProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.AndroidStatisticProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.AndroidStatisticProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.AndroidStatisticProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstore.message.AndroidStatisticProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code AndroidStatisticProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstore.message.AndroidStatisticProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:AndroidStatisticProto)
      com.github.yeriomin.playstore.message.AndroidStatisticProtoOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.AndroidStatisticProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional string tag = 1;</code>
     */
    public boolean hasTag() {
      return instance.hasTag();
    }
    /**
     * <code>optional string tag = 1;</code>
     */
    public java.lang.String getTag() {
      return instance.getTag();
    }
    /**
     * <code>optional string tag = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTagBytes() {
      return instance.getTagBytes();
    }
    /**
     * <code>optional string tag = 1;</code>
     */
    public Builder setTag(
        java.lang.String value) {
      copyOnWrite();
      instance.setTag(value);
      return this;
    }
    /**
     * <code>optional string tag = 1;</code>
     */
    public Builder clearTag() {
      copyOnWrite();
      instance.clearTag();
      return this;
    }
    /**
     * <code>optional string tag = 1;</code>
     */
    public Builder setTagBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTagBytes(value);
      return this;
    }

    /**
     * <code>optional int32 count = 2;</code>
     */
    public boolean hasCount() {
      return instance.hasCount();
    }
    /**
     * <code>optional int32 count = 2;</code>
     */
    public int getCount() {
      return instance.getCount();
    }
    /**
     * <code>optional int32 count = 2;</code>
     */
    public Builder setCount(int value) {
      copyOnWrite();
      instance.setCount(value);
      return this;
    }
    /**
     * <code>optional int32 count = 2;</code>
     */
    public Builder clearCount() {
      copyOnWrite();
      instance.clearCount();
      return this;
    }

    /**
     * <code>optional float sum = 3;</code>
     */
    public boolean hasSum() {
      return instance.hasSum();
    }
    /**
     * <code>optional float sum = 3;</code>
     */
    public float getSum() {
      return instance.getSum();
    }
    /**
     * <code>optional float sum = 3;</code>
     */
    public Builder setSum(float value) {
      copyOnWrite();
      instance.setSum(value);
      return this;
    }
    /**
     * <code>optional float sum = 3;</code>
     */
    public Builder clearSum() {
      copyOnWrite();
      instance.clearSum();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:AndroidStatisticProto)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstore.message.AndroidStatisticProto();
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
        com.github.yeriomin.playstore.message.AndroidStatisticProto other = (com.github.yeriomin.playstore.message.AndroidStatisticProto) arg1;
        tag_ = visitor.visitString(
            hasTag(), tag_,
            other.hasTag(), other.tag_);
        count_ = visitor.visitInt(
            hasCount(), count_,
            other.hasCount(), other.count_);
        sum_ = visitor.visitFloat(
            hasSum(), sum_,
            other.hasSum(), other.sum_);
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
                tag_ = s;
                break;
              }
              case 16: {
                bitField0_ |= 0x00000002;
                count_ = input.readInt32();
                break;
              }
              case 29: {
                bitField0_ |= 0x00000004;
                sum_ = input.readFloat();
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstore.message.AndroidStatisticProto.class) {
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


  // @@protoc_insertion_point(class_scope:AndroidStatisticProto)
  private static final com.github.yeriomin.playstore.message.AndroidStatisticProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AndroidStatisticProto();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstore.message.AndroidStatisticProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<AndroidStatisticProto> PARSER;

  public static com.google.protobuf.Parser<AndroidStatisticProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
