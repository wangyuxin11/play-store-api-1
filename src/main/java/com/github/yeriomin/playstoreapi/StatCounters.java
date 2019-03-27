// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstoreapi;

/**
 * Protobuf type {@code StatCounters}
 */
public  final class StatCounters extends
    com.google.protobuf.GeneratedMessageLite<
        StatCounters, StatCounters.Builder> implements
    // @@protoc_insertion_point(message_implements:StatCounters)
    StatCountersOrBuilder {
  private StatCounters() {
  }
  private int bitField0_;
  public static final int NETWORKPROTO_FIELD_NUMBER = 1;
  private int networkProto_;
  /**
   * <code>optional int32 networkProto = 1;</code>
   */
  public boolean hasNetworkProto() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional int32 networkProto = 1;</code>
   */
  public int getNetworkProto() {
    return networkProto_;
  }
  /**
   * <code>optional int32 networkProto = 1;</code>
   */
  private void setNetworkProto(int value) {
    bitField0_ |= 0x00000001;
    networkProto_ = value;
  }
  /**
   * <code>optional int32 networkProto = 1;</code>
   */
  private void clearNetworkProto() {
    bitField0_ = (bitField0_ & ~0x00000001);
    networkProto_ = 0;
  }

  public static final int DIRECTION_FIELD_NUMBER = 2;
  private int direction_;
  /**
   * <code>optional int32 direction = 2;</code>
   */
  public boolean hasDirection() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int32 direction = 2;</code>
   */
  public int getDirection() {
    return direction_;
  }
  /**
   * <code>optional int32 direction = 2;</code>
   */
  private void setDirection(int value) {
    bitField0_ |= 0x00000002;
    direction_ = value;
  }
  /**
   * <code>optional int32 direction = 2;</code>
   */
  private void clearDirection() {
    bitField0_ = (bitField0_ & ~0x00000002);
    direction_ = 0;
  }

  public static final int COUNTERDATA_FIELD_NUMBER = 3;
  private com.github.yeriomin.playstoreapi.CounterData counterData_;
  /**
   * <code>optional .CounterData counterData = 3;</code>
   */
  public boolean hasCounterData() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional .CounterData counterData = 3;</code>
   */
  public com.github.yeriomin.playstoreapi.CounterData getCounterData() {
    return counterData_ == null ? com.github.yeriomin.playstoreapi.CounterData.getDefaultInstance() : counterData_;
  }
  /**
   * <code>optional .CounterData counterData = 3;</code>
   */
  private void setCounterData(com.github.yeriomin.playstoreapi.CounterData value) {
    if (value == null) {
      throw new NullPointerException();
    }
    counterData_ = value;
    bitField0_ |= 0x00000004;
    }
  /**
   * <code>optional .CounterData counterData = 3;</code>
   */
  private void setCounterData(
      com.github.yeriomin.playstoreapi.CounterData.Builder builderForValue) {
    counterData_ = builderForValue.build();
    bitField0_ |= 0x00000004;
  }
  /**
   * <code>optional .CounterData counterData = 3;</code>
   */
  private void mergeCounterData(com.github.yeriomin.playstoreapi.CounterData value) {
    if (counterData_ != null &&
        counterData_ != com.github.yeriomin.playstoreapi.CounterData.getDefaultInstance()) {
      counterData_ =
        com.github.yeriomin.playstoreapi.CounterData.newBuilder(counterData_).mergeFrom(value).buildPartial();
    } else {
      counterData_ = value;
    }
    bitField0_ |= 0x00000004;
  }
  /**
   * <code>optional .CounterData counterData = 3;</code>
   */
  private void clearCounterData() {  counterData_ = null;
    bitField0_ = (bitField0_ & ~0x00000004);
  }

  public static final int FGBG_FIELD_NUMBER = 4;
  private int fgBg_;
  /**
   * <code>optional int32 fgBg = 4;</code>
   */
  public boolean hasFgBg() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>optional int32 fgBg = 4;</code>
   */
  public int getFgBg() {
    return fgBg_;
  }
  /**
   * <code>optional int32 fgBg = 4;</code>
   */
  private void setFgBg(int value) {
    bitField0_ |= 0x00000008;
    fgBg_ = value;
  }
  /**
   * <code>optional int32 fgBg = 4;</code>
   */
  private void clearFgBg() {
    bitField0_ = (bitField0_ & ~0x00000008);
    fgBg_ = 0;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeInt32(1, networkProto_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt32(2, direction_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeMessage(3, getCounterData());
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeInt32(4, fgBg_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, networkProto_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, direction_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getCounterData());
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, fgBg_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstoreapi.StatCounters parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstoreapi.StatCounters parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.StatCounters parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstoreapi.StatCounters parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.StatCounters parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.StatCounters parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.StatCounters parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.StatCounters parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.StatCounters parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.StatCounters parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstoreapi.StatCounters prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code StatCounters}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstoreapi.StatCounters, Builder> implements
      // @@protoc_insertion_point(builder_implements:StatCounters)
      com.github.yeriomin.playstoreapi.StatCountersOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.StatCounters.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional int32 networkProto = 1;</code>
     */
    public boolean hasNetworkProto() {
      return instance.hasNetworkProto();
    }
    /**
     * <code>optional int32 networkProto = 1;</code>
     */
    public int getNetworkProto() {
      return instance.getNetworkProto();
    }
    /**
     * <code>optional int32 networkProto = 1;</code>
     */
    public Builder setNetworkProto(int value) {
      copyOnWrite();
      instance.setNetworkProto(value);
      return this;
    }
    /**
     * <code>optional int32 networkProto = 1;</code>
     */
    public Builder clearNetworkProto() {
      copyOnWrite();
      instance.clearNetworkProto();
      return this;
    }

    /**
     * <code>optional int32 direction = 2;</code>
     */
    public boolean hasDirection() {
      return instance.hasDirection();
    }
    /**
     * <code>optional int32 direction = 2;</code>
     */
    public int getDirection() {
      return instance.getDirection();
    }
    /**
     * <code>optional int32 direction = 2;</code>
     */
    public Builder setDirection(int value) {
      copyOnWrite();
      instance.setDirection(value);
      return this;
    }
    /**
     * <code>optional int32 direction = 2;</code>
     */
    public Builder clearDirection() {
      copyOnWrite();
      instance.clearDirection();
      return this;
    }

    /**
     * <code>optional .CounterData counterData = 3;</code>
     */
    public boolean hasCounterData() {
      return instance.hasCounterData();
    }
    /**
     * <code>optional .CounterData counterData = 3;</code>
     */
    public com.github.yeriomin.playstoreapi.CounterData getCounterData() {
      return instance.getCounterData();
    }
    /**
     * <code>optional .CounterData counterData = 3;</code>
     */
    public Builder setCounterData(com.github.yeriomin.playstoreapi.CounterData value) {
      copyOnWrite();
      instance.setCounterData(value);
      return this;
      }
    /**
     * <code>optional .CounterData counterData = 3;</code>
     */
    public Builder setCounterData(
        com.github.yeriomin.playstoreapi.CounterData.Builder builderForValue) {
      copyOnWrite();
      instance.setCounterData(builderForValue);
      return this;
    }
    /**
     * <code>optional .CounterData counterData = 3;</code>
     */
    public Builder mergeCounterData(com.github.yeriomin.playstoreapi.CounterData value) {
      copyOnWrite();
      instance.mergeCounterData(value);
      return this;
    }
    /**
     * <code>optional .CounterData counterData = 3;</code>
     */
    public Builder clearCounterData() {  copyOnWrite();
      instance.clearCounterData();
      return this;
    }

    /**
     * <code>optional int32 fgBg = 4;</code>
     */
    public boolean hasFgBg() {
      return instance.hasFgBg();
    }
    /**
     * <code>optional int32 fgBg = 4;</code>
     */
    public int getFgBg() {
      return instance.getFgBg();
    }
    /**
     * <code>optional int32 fgBg = 4;</code>
     */
    public Builder setFgBg(int value) {
      copyOnWrite();
      instance.setFgBg(value);
      return this;
    }
    /**
     * <code>optional int32 fgBg = 4;</code>
     */
    public Builder clearFgBg() {
      copyOnWrite();
      instance.clearFgBg();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:StatCounters)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstoreapi.StatCounters();
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
        com.github.yeriomin.playstoreapi.StatCounters other = (com.github.yeriomin.playstoreapi.StatCounters) arg1;
        networkProto_ = visitor.visitInt(
            hasNetworkProto(), networkProto_,
            other.hasNetworkProto(), other.networkProto_);
        direction_ = visitor.visitInt(
            hasDirection(), direction_,
            other.hasDirection(), other.direction_);
        counterData_ = visitor.visitMessage(counterData_, other.counterData_);
        fgBg_ = visitor.visitInt(
            hasFgBg(), fgBg_,
            other.hasFgBg(), other.fgBg_);
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
                networkProto_ = input.readInt32();
                break;
              }
              case 16: {
                bitField0_ |= 0x00000002;
                direction_ = input.readInt32();
                break;
              }
              case 26: {
                com.github.yeriomin.playstoreapi.CounterData.Builder subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = counterData_.toBuilder();
                }
                counterData_ = input.readMessage(com.github.yeriomin.playstoreapi.CounterData.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(counterData_);
                  counterData_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
              case 32: {
                bitField0_ |= 0x00000008;
                fgBg_ = input.readInt32();
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstoreapi.StatCounters.class) {
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


  // @@protoc_insertion_point(class_scope:StatCounters)
  private static final com.github.yeriomin.playstoreapi.StatCounters DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new StatCounters();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstoreapi.StatCounters getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<StatCounters> PARSER;

  public static com.google.protobuf.Parser<StatCounters> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

