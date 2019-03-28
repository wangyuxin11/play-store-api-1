// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

/**
 * Protobuf type {@code TestingProgramDetails}
 */
public  final class TestingProgramDetails extends
    com.google.protobuf.GeneratedMessageLite<
        TestingProgramDetails, TestingProgramDetails.Builder> implements
    // @@protoc_insertion_point(message_implements:TestingProgramDetails)
    TestingProgramDetailsOrBuilder {
  private TestingProgramDetails() {
  }
  private int bitField0_;
  public static final int FLAG1_FIELD_NUMBER = 2;
  private boolean flag1_;
  /**
   * <code>optional bool flag1 = 2;</code>
   */
  public boolean hasFlag1() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional bool flag1 = 2;</code>
   */
  public boolean getFlag1() {
    return flag1_;
  }
  /**
   * <code>optional bool flag1 = 2;</code>
   */
  private void setFlag1(boolean value) {
    bitField0_ |= 0x00000001;
    flag1_ = value;
  }
  /**
   * <code>optional bool flag1 = 2;</code>
   */
  private void clearFlag1() {
    bitField0_ = (bitField0_ & ~0x00000001);
    flag1_ = false;
  }

  public static final int ID_FIELD_NUMBER = 3;
  private long id_;
  /**
   * <code>optional int64 id = 3;</code>
   */
  public boolean hasId() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int64 id = 3;</code>
   */
  public long getId() {
    return id_;
  }
  /**
   * <code>optional int64 id = 3;</code>
   */
  private void setId(long value) {
    bitField0_ |= 0x00000002;
    id_ = value;
  }
  /**
   * <code>optional int64 id = 3;</code>
   */
  private void clearId() {
    bitField0_ = (bitField0_ & ~0x00000002);
    id_ = 0L;
  }

  public static final int UNSUBSCRIBED_FIELD_NUMBER = 4;
  private boolean unsubscribed_;
  /**
   * <code>optional bool unsubscribed = 4;</code>
   */
  public boolean hasUnsubscribed() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional bool unsubscribed = 4;</code>
   */
  public boolean getUnsubscribed() {
    return unsubscribed_;
  }
  /**
   * <code>optional bool unsubscribed = 4;</code>
   */
  private void setUnsubscribed(boolean value) {
    bitField0_ |= 0x00000004;
    unsubscribed_ = value;
  }
  /**
   * <code>optional bool unsubscribed = 4;</code>
   */
  private void clearUnsubscribed() {
    bitField0_ = (bitField0_ & ~0x00000004);
    unsubscribed_ = false;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeBool(2, flag1_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt64(3, id_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeBool(4, unsubscribed_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, flag1_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, id_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, unsubscribed_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstore.message.TestingProgramDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.TestingProgramDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.TestingProgramDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.TestingProgramDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.TestingProgramDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.TestingProgramDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.TestingProgramDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.TestingProgramDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.TestingProgramDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.TestingProgramDetails parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstore.message.TestingProgramDetails prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code TestingProgramDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstore.message.TestingProgramDetails, Builder> implements
      // @@protoc_insertion_point(builder_implements:TestingProgramDetails)
      com.github.yeriomin.playstore.message.TestingProgramDetailsOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.TestingProgramDetails.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional bool flag1 = 2;</code>
     */
    public boolean hasFlag1() {
      return instance.hasFlag1();
    }
    /**
     * <code>optional bool flag1 = 2;</code>
     */
    public boolean getFlag1() {
      return instance.getFlag1();
    }
    /**
     * <code>optional bool flag1 = 2;</code>
     */
    public Builder setFlag1(boolean value) {
      copyOnWrite();
      instance.setFlag1(value);
      return this;
    }
    /**
     * <code>optional bool flag1 = 2;</code>
     */
    public Builder clearFlag1() {
      copyOnWrite();
      instance.clearFlag1();
      return this;
    }

    /**
     * <code>optional int64 id = 3;</code>
     */
    public boolean hasId() {
      return instance.hasId();
    }
    /**
     * <code>optional int64 id = 3;</code>
     */
    public long getId() {
      return instance.getId();
    }
    /**
     * <code>optional int64 id = 3;</code>
     */
    public Builder setId(long value) {
      copyOnWrite();
      instance.setId(value);
      return this;
    }
    /**
     * <code>optional int64 id = 3;</code>
     */
    public Builder clearId() {
      copyOnWrite();
      instance.clearId();
      return this;
    }

    /**
     * <code>optional bool unsubscribed = 4;</code>
     */
    public boolean hasUnsubscribed() {
      return instance.hasUnsubscribed();
    }
    /**
     * <code>optional bool unsubscribed = 4;</code>
     */
    public boolean getUnsubscribed() {
      return instance.getUnsubscribed();
    }
    /**
     * <code>optional bool unsubscribed = 4;</code>
     */
    public Builder setUnsubscribed(boolean value) {
      copyOnWrite();
      instance.setUnsubscribed(value);
      return this;
    }
    /**
     * <code>optional bool unsubscribed = 4;</code>
     */
    public Builder clearUnsubscribed() {
      copyOnWrite();
      instance.clearUnsubscribed();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:TestingProgramDetails)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstore.message.TestingProgramDetails();
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
        com.github.yeriomin.playstore.message.TestingProgramDetails other = (com.github.yeriomin.playstore.message.TestingProgramDetails) arg1;
        flag1_ = visitor.visitBoolean(
            hasFlag1(), flag1_,
            other.hasFlag1(), other.flag1_);
        id_ = visitor.visitLong(
            hasId(), id_,
            other.hasId(), other.id_);
        unsubscribed_ = visitor.visitBoolean(
            hasUnsubscribed(), unsubscribed_,
            other.hasUnsubscribed(), other.unsubscribed_);
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
              case 16: {
                bitField0_ |= 0x00000001;
                flag1_ = input.readBool();
                break;
              }
              case 24: {
                bitField0_ |= 0x00000002;
                id_ = input.readInt64();
                break;
              }
              case 32: {
                bitField0_ |= 0x00000004;
                unsubscribed_ = input.readBool();
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstore.message.TestingProgramDetails.class) {
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


  // @@protoc_insertion_point(class_scope:TestingProgramDetails)
  private static final com.github.yeriomin.playstore.message.TestingProgramDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new TestingProgramDetails();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstore.message.TestingProgramDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<TestingProgramDetails> PARSER;

  public static com.google.protobuf.Parser<TestingProgramDetails> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
