// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

/**
 * Protobuf type {@code PlusOneData}
 */
public  final class PlusOneData extends
    com.google.protobuf.GeneratedMessageLite<
        PlusOneData, PlusOneData.Builder> implements
    // @@protoc_insertion_point(message_implements:PlusOneData)
    PlusOneDataOrBuilder {
  private PlusOneData() {
    circlesPeople_ = emptyProtobufList();
  }
  private int bitField0_;
  public static final int SETBYUSER_FIELD_NUMBER = 1;
  private boolean setByUser_;
  /**
   * <code>optional bool setByUser = 1;</code>
   */
  public boolean hasSetByUser() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional bool setByUser = 1;</code>
   */
  public boolean getSetByUser() {
    return setByUser_;
  }
  /**
   * <code>optional bool setByUser = 1;</code>
   */
  private void setSetByUser(boolean value) {
    bitField0_ |= 0x00000001;
    setByUser_ = value;
  }
  /**
   * <code>optional bool setByUser = 1;</code>
   */
  private void clearSetByUser() {
    bitField0_ = (bitField0_ & ~0x00000001);
    setByUser_ = false;
  }

  public static final int TOTAL_FIELD_NUMBER = 2;
  private long total_;
  /**
   * <code>optional int64 total = 2;</code>
   */
  public boolean hasTotal() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int64 total = 2;</code>
   */
  public long getTotal() {
    return total_;
  }
  /**
   * <code>optional int64 total = 2;</code>
   */
  private void setTotal(long value) {
    bitField0_ |= 0x00000002;
    total_ = value;
  }
  /**
   * <code>optional int64 total = 2;</code>
   */
  private void clearTotal() {
    bitField0_ = (bitField0_ & ~0x00000002);
    total_ = 0L;
  }

  public static final int CIRCLESTOTAL_FIELD_NUMBER = 3;
  private long circlesTotal_;
  /**
   * <code>optional int64 circlesTotal = 3;</code>
   */
  public boolean hasCirclesTotal() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional int64 circlesTotal = 3;</code>
   */
  public long getCirclesTotal() {
    return circlesTotal_;
  }
  /**
   * <code>optional int64 circlesTotal = 3;</code>
   */
  private void setCirclesTotal(long value) {
    bitField0_ |= 0x00000004;
    circlesTotal_ = value;
  }
  /**
   * <code>optional int64 circlesTotal = 3;</code>
   */
  private void clearCirclesTotal() {
    bitField0_ = (bitField0_ & ~0x00000004);
    circlesTotal_ = 0L;
  }

  public static final int CIRCLESPEOPLE_FIELD_NUMBER = 4;
  private com.google.protobuf.Internal.ProtobufList<com.github.yeriomin.playstore.message.PlusPerson> circlesPeople_;
  /**
   * <code>repeated .PlusPerson circlesPeople = 4;</code>
   */
  public java.util.List<com.github.yeriomin.playstore.message.PlusPerson> getCirclesPeopleList() {
    return circlesPeople_;
  }
  /**
   * <code>repeated .PlusPerson circlesPeople = 4;</code>
   */
  public java.util.List<? extends com.github.yeriomin.playstore.message.PlusPersonOrBuilder> 
      getCirclesPeopleOrBuilderList() {
    return circlesPeople_;
  }
  /**
   * <code>repeated .PlusPerson circlesPeople = 4;</code>
   */
  public int getCirclesPeopleCount() {
    return circlesPeople_.size();
  }
  /**
   * <code>repeated .PlusPerson circlesPeople = 4;</code>
   */
  public com.github.yeriomin.playstore.message.PlusPerson getCirclesPeople(int index) {
    return circlesPeople_.get(index);
  }
  /**
   * <code>repeated .PlusPerson circlesPeople = 4;</code>
   */
  public com.github.yeriomin.playstore.message.PlusPersonOrBuilder getCirclesPeopleOrBuilder(
      int index) {
    return circlesPeople_.get(index);
  }
  private void ensureCirclesPeopleIsMutable() {
    if (!circlesPeople_.isModifiable()) {
      circlesPeople_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(circlesPeople_);
     }
  }

  /**
   * <code>repeated .PlusPerson circlesPeople = 4;</code>
   */
  private void setCirclesPeople(
      int index, com.github.yeriomin.playstore.message.PlusPerson value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureCirclesPeopleIsMutable();
    circlesPeople_.set(index, value);
  }
  /**
   * <code>repeated .PlusPerson circlesPeople = 4;</code>
   */
  private void setCirclesPeople(
      int index, com.github.yeriomin.playstore.message.PlusPerson.Builder builderForValue) {
    ensureCirclesPeopleIsMutable();
    circlesPeople_.set(index, builderForValue.build());
  }
  /**
   * <code>repeated .PlusPerson circlesPeople = 4;</code>
   */
  private void addCirclesPeople(com.github.yeriomin.playstore.message.PlusPerson value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureCirclesPeopleIsMutable();
    circlesPeople_.add(value);
  }
  /**
   * <code>repeated .PlusPerson circlesPeople = 4;</code>
   */
  private void addCirclesPeople(
      int index, com.github.yeriomin.playstore.message.PlusPerson value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureCirclesPeopleIsMutable();
    circlesPeople_.add(index, value);
  }
  /**
   * <code>repeated .PlusPerson circlesPeople = 4;</code>
   */
  private void addCirclesPeople(
      com.github.yeriomin.playstore.message.PlusPerson.Builder builderForValue) {
    ensureCirclesPeopleIsMutable();
    circlesPeople_.add(builderForValue.build());
  }
  /**
   * <code>repeated .PlusPerson circlesPeople = 4;</code>
   */
  private void addCirclesPeople(
      int index, com.github.yeriomin.playstore.message.PlusPerson.Builder builderForValue) {
    ensureCirclesPeopleIsMutable();
    circlesPeople_.add(index, builderForValue.build());
  }
  /**
   * <code>repeated .PlusPerson circlesPeople = 4;</code>
   */
  private void addAllCirclesPeople(
      java.lang.Iterable<? extends com.github.yeriomin.playstore.message.PlusPerson> values) {
    ensureCirclesPeopleIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, circlesPeople_);
  }
  /**
   * <code>repeated .PlusPerson circlesPeople = 4;</code>
   */
  private void clearCirclesPeople() {
    circlesPeople_ = emptyProtobufList();
  }
  /**
   * <code>repeated .PlusPerson circlesPeople = 4;</code>
   */
  private void removeCirclesPeople(int index) {
    ensureCirclesPeopleIsMutable();
    circlesPeople_.remove(index);
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeBool(1, setByUser_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt64(2, total_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeInt64(3, circlesTotal_);
    }
    for (int i = 0; i < circlesPeople_.size(); i++) {
      output.writeMessage(4, circlesPeople_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, setByUser_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, total_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, circlesTotal_);
    }
    for (int i = 0; i < circlesPeople_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, circlesPeople_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstore.message.PlusOneData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.PlusOneData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.PlusOneData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.PlusOneData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.PlusOneData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.PlusOneData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.PlusOneData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.PlusOneData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.PlusOneData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.PlusOneData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstore.message.PlusOneData prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code PlusOneData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstore.message.PlusOneData, Builder> implements
      // @@protoc_insertion_point(builder_implements:PlusOneData)
      com.github.yeriomin.playstore.message.PlusOneDataOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.PlusOneData.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional bool setByUser = 1;</code>
     */
    public boolean hasSetByUser() {
      return instance.hasSetByUser();
    }
    /**
     * <code>optional bool setByUser = 1;</code>
     */
    public boolean getSetByUser() {
      return instance.getSetByUser();
    }
    /**
     * <code>optional bool setByUser = 1;</code>
     */
    public Builder setSetByUser(boolean value) {
      copyOnWrite();
      instance.setSetByUser(value);
      return this;
    }
    /**
     * <code>optional bool setByUser = 1;</code>
     */
    public Builder clearSetByUser() {
      copyOnWrite();
      instance.clearSetByUser();
      return this;
    }

    /**
     * <code>optional int64 total = 2;</code>
     */
    public boolean hasTotal() {
      return instance.hasTotal();
    }
    /**
     * <code>optional int64 total = 2;</code>
     */
    public long getTotal() {
      return instance.getTotal();
    }
    /**
     * <code>optional int64 total = 2;</code>
     */
    public Builder setTotal(long value) {
      copyOnWrite();
      instance.setTotal(value);
      return this;
    }
    /**
     * <code>optional int64 total = 2;</code>
     */
    public Builder clearTotal() {
      copyOnWrite();
      instance.clearTotal();
      return this;
    }

    /**
     * <code>optional int64 circlesTotal = 3;</code>
     */
    public boolean hasCirclesTotal() {
      return instance.hasCirclesTotal();
    }
    /**
     * <code>optional int64 circlesTotal = 3;</code>
     */
    public long getCirclesTotal() {
      return instance.getCirclesTotal();
    }
    /**
     * <code>optional int64 circlesTotal = 3;</code>
     */
    public Builder setCirclesTotal(long value) {
      copyOnWrite();
      instance.setCirclesTotal(value);
      return this;
    }
    /**
     * <code>optional int64 circlesTotal = 3;</code>
     */
    public Builder clearCirclesTotal() {
      copyOnWrite();
      instance.clearCirclesTotal();
      return this;
    }

    /**
     * <code>repeated .PlusPerson circlesPeople = 4;</code>
     */
    public java.util.List<com.github.yeriomin.playstore.message.PlusPerson> getCirclesPeopleList() {
      return java.util.Collections.unmodifiableList(
          instance.getCirclesPeopleList());
    }
    /**
     * <code>repeated .PlusPerson circlesPeople = 4;</code>
     */
    public int getCirclesPeopleCount() {
      return instance.getCirclesPeopleCount();
    }/**
     * <code>repeated .PlusPerson circlesPeople = 4;</code>
     */
    public com.github.yeriomin.playstore.message.PlusPerson getCirclesPeople(int index) {
      return instance.getCirclesPeople(index);
    }
    /**
     * <code>repeated .PlusPerson circlesPeople = 4;</code>
     */
    public Builder setCirclesPeople(
        int index, com.github.yeriomin.playstore.message.PlusPerson value) {
      copyOnWrite();
      instance.setCirclesPeople(index, value);
      return this;
    }
    /**
     * <code>repeated .PlusPerson circlesPeople = 4;</code>
     */
    public Builder setCirclesPeople(
        int index, com.github.yeriomin.playstore.message.PlusPerson.Builder builderForValue) {
      copyOnWrite();
      instance.setCirclesPeople(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .PlusPerson circlesPeople = 4;</code>
     */
    public Builder addCirclesPeople(com.github.yeriomin.playstore.message.PlusPerson value) {
      copyOnWrite();
      instance.addCirclesPeople(value);
      return this;
    }
    /**
     * <code>repeated .PlusPerson circlesPeople = 4;</code>
     */
    public Builder addCirclesPeople(
        int index, com.github.yeriomin.playstore.message.PlusPerson value) {
      copyOnWrite();
      instance.addCirclesPeople(index, value);
      return this;
    }
    /**
     * <code>repeated .PlusPerson circlesPeople = 4;</code>
     */
    public Builder addCirclesPeople(
        com.github.yeriomin.playstore.message.PlusPerson.Builder builderForValue) {
      copyOnWrite();
      instance.addCirclesPeople(builderForValue);
      return this;
    }
    /**
     * <code>repeated .PlusPerson circlesPeople = 4;</code>
     */
    public Builder addCirclesPeople(
        int index, com.github.yeriomin.playstore.message.PlusPerson.Builder builderForValue) {
      copyOnWrite();
      instance.addCirclesPeople(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .PlusPerson circlesPeople = 4;</code>
     */
    public Builder addAllCirclesPeople(
        java.lang.Iterable<? extends com.github.yeriomin.playstore.message.PlusPerson> values) {
      copyOnWrite();
      instance.addAllCirclesPeople(values);
      return this;
    }
    /**
     * <code>repeated .PlusPerson circlesPeople = 4;</code>
     */
    public Builder clearCirclesPeople() {
      copyOnWrite();
      instance.clearCirclesPeople();
      return this;
    }
    /**
     * <code>repeated .PlusPerson circlesPeople = 4;</code>
     */
    public Builder removeCirclesPeople(int index) {
      copyOnWrite();
      instance.removeCirclesPeople(index);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:PlusOneData)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstore.message.PlusOneData();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        circlesPeople_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.github.yeriomin.playstore.message.PlusOneData other = (com.github.yeriomin.playstore.message.PlusOneData) arg1;
        setByUser_ = visitor.visitBoolean(
            hasSetByUser(), setByUser_,
            other.hasSetByUser(), other.setByUser_);
        total_ = visitor.visitLong(
            hasTotal(), total_,
            other.hasTotal(), other.total_);
        circlesTotal_ = visitor.visitLong(
            hasCirclesTotal(), circlesTotal_,
            other.hasCirclesTotal(), other.circlesTotal_);
        circlesPeople_= visitor.visitList(circlesPeople_, other.circlesPeople_);
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
                setByUser_ = input.readBool();
                break;
              }
              case 16: {
                bitField0_ |= 0x00000002;
                total_ = input.readInt64();
                break;
              }
              case 24: {
                bitField0_ |= 0x00000004;
                circlesTotal_ = input.readInt64();
                break;
              }
              case 34: {
                if (!circlesPeople_.isModifiable()) {
                  circlesPeople_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(circlesPeople_);
                }
                circlesPeople_.add(
                    input.readMessage(com.github.yeriomin.playstore.message.PlusPerson.parser(), extensionRegistry));
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstore.message.PlusOneData.class) {
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


  // @@protoc_insertion_point(class_scope:PlusOneData)
  private static final com.github.yeriomin.playstore.message.PlusOneData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new PlusOneData();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstore.message.PlusOneData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<PlusOneData> PARSER;

  public static com.google.protobuf.Parser<PlusOneData> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
