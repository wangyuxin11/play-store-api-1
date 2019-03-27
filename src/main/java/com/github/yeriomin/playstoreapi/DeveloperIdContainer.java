// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstoreapi;

/**
 * Protobuf type {@code DeveloperIdContainer}
 */
public  final class DeveloperIdContainer extends
    com.google.protobuf.GeneratedMessageLite<
        DeveloperIdContainer, DeveloperIdContainer.Builder> implements
    // @@protoc_insertion_point(message_implements:DeveloperIdContainer)
    DeveloperIdContainerOrBuilder {
  private DeveloperIdContainer() {
    developerId_ = "";
  }
  private int bitField0_;
  public static final int DEVELOPERID_FIELD_NUMBER = 1;
  private java.lang.String developerId_;
  /**
   * <code>optional string developerId = 1;</code>
   */
  public boolean hasDeveloperId() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string developerId = 1;</code>
   */
  public java.lang.String getDeveloperId() {
    return developerId_;
  }
  /**
   * <code>optional string developerId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getDeveloperIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(developerId_);
  }
  /**
   * <code>optional string developerId = 1;</code>
   */
  private void setDeveloperId(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    developerId_ = value;
  }
  /**
   * <code>optional string developerId = 1;</code>
   */
  private void clearDeveloperId() {
    bitField0_ = (bitField0_ & ~0x00000001);
    developerId_ = getDefaultInstance().getDeveloperId();
  }
  /**
   * <code>optional string developerId = 1;</code>
   */
  private void setDeveloperIdBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    developerId_ = value.toStringUtf8();
  }

  public static final int UNKNOWNINT2_FIELD_NUMBER = 2;
  private int unknownInt2_;
  /**
   * <code>optional int32 unknownInt2 = 2;</code>
   */
  public boolean hasUnknownInt2() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int32 unknownInt2 = 2;</code>
   */
  public int getUnknownInt2() {
    return unknownInt2_;
  }
  /**
   * <code>optional int32 unknownInt2 = 2;</code>
   */
  private void setUnknownInt2(int value) {
    bitField0_ |= 0x00000002;
    unknownInt2_ = value;
  }
  /**
   * <code>optional int32 unknownInt2 = 2;</code>
   */
  private void clearUnknownInt2() {
    bitField0_ = (bitField0_ & ~0x00000002);
    unknownInt2_ = 0;
  }

  public static final int UNKNOWNINT3_FIELD_NUMBER = 3;
  private int unknownInt3_;
  /**
   * <code>optional int32 unknownInt3 = 3;</code>
   */
  public boolean hasUnknownInt3() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional int32 unknownInt3 = 3;</code>
   */
  public int getUnknownInt3() {
    return unknownInt3_;
  }
  /**
   * <code>optional int32 unknownInt3 = 3;</code>
   */
  private void setUnknownInt3(int value) {
    bitField0_ |= 0x00000004;
    unknownInt3_ = value;
  }
  /**
   * <code>optional int32 unknownInt3 = 3;</code>
   */
  private void clearUnknownInt3() {
    bitField0_ = (bitField0_ & ~0x00000004);
    unknownInt3_ = 0;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeString(1, getDeveloperId());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt32(2, unknownInt2_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeInt32(3, unknownInt3_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getDeveloperId());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, unknownInt2_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, unknownInt3_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstoreapi.DeveloperIdContainer parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstoreapi.DeveloperIdContainer parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.DeveloperIdContainer parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstoreapi.DeveloperIdContainer parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.DeveloperIdContainer parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.DeveloperIdContainer parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.DeveloperIdContainer parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.DeveloperIdContainer parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.DeveloperIdContainer parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.DeveloperIdContainer parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstoreapi.DeveloperIdContainer prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code DeveloperIdContainer}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstoreapi.DeveloperIdContainer, Builder> implements
      // @@protoc_insertion_point(builder_implements:DeveloperIdContainer)
      com.github.yeriomin.playstoreapi.DeveloperIdContainerOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.DeveloperIdContainer.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional string developerId = 1;</code>
     */
    public boolean hasDeveloperId() {
      return instance.hasDeveloperId();
    }
    /**
     * <code>optional string developerId = 1;</code>
     */
    public java.lang.String getDeveloperId() {
      return instance.getDeveloperId();
    }
    /**
     * <code>optional string developerId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDeveloperIdBytes() {
      return instance.getDeveloperIdBytes();
    }
    /**
     * <code>optional string developerId = 1;</code>
     */
    public Builder setDeveloperId(
        java.lang.String value) {
      copyOnWrite();
      instance.setDeveloperId(value);
      return this;
    }
    /**
     * <code>optional string developerId = 1;</code>
     */
    public Builder clearDeveloperId() {
      copyOnWrite();
      instance.clearDeveloperId();
      return this;
    }
    /**
     * <code>optional string developerId = 1;</code>
     */
    public Builder setDeveloperIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setDeveloperIdBytes(value);
      return this;
    }

    /**
     * <code>optional int32 unknownInt2 = 2;</code>
     */
    public boolean hasUnknownInt2() {
      return instance.hasUnknownInt2();
    }
    /**
     * <code>optional int32 unknownInt2 = 2;</code>
     */
    public int getUnknownInt2() {
      return instance.getUnknownInt2();
    }
    /**
     * <code>optional int32 unknownInt2 = 2;</code>
     */
    public Builder setUnknownInt2(int value) {
      copyOnWrite();
      instance.setUnknownInt2(value);
      return this;
    }
    /**
     * <code>optional int32 unknownInt2 = 2;</code>
     */
    public Builder clearUnknownInt2() {
      copyOnWrite();
      instance.clearUnknownInt2();
      return this;
    }

    /**
     * <code>optional int32 unknownInt3 = 3;</code>
     */
    public boolean hasUnknownInt3() {
      return instance.hasUnknownInt3();
    }
    /**
     * <code>optional int32 unknownInt3 = 3;</code>
     */
    public int getUnknownInt3() {
      return instance.getUnknownInt3();
    }
    /**
     * <code>optional int32 unknownInt3 = 3;</code>
     */
    public Builder setUnknownInt3(int value) {
      copyOnWrite();
      instance.setUnknownInt3(value);
      return this;
    }
    /**
     * <code>optional int32 unknownInt3 = 3;</code>
     */
    public Builder clearUnknownInt3() {
      copyOnWrite();
      instance.clearUnknownInt3();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:DeveloperIdContainer)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstoreapi.DeveloperIdContainer();
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
        com.github.yeriomin.playstoreapi.DeveloperIdContainer other = (com.github.yeriomin.playstoreapi.DeveloperIdContainer) arg1;
        developerId_ = visitor.visitString(
            hasDeveloperId(), developerId_,
            other.hasDeveloperId(), other.developerId_);
        unknownInt2_ = visitor.visitInt(
            hasUnknownInt2(), unknownInt2_,
            other.hasUnknownInt2(), other.unknownInt2_);
        unknownInt3_ = visitor.visitInt(
            hasUnknownInt3(), unknownInt3_,
            other.hasUnknownInt3(), other.unknownInt3_);
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
                developerId_ = s;
                break;
              }
              case 16: {
                bitField0_ |= 0x00000002;
                unknownInt2_ = input.readInt32();
                break;
              }
              case 24: {
                bitField0_ |= 0x00000004;
                unknownInt3_ = input.readInt32();
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstoreapi.DeveloperIdContainer.class) {
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


  // @@protoc_insertion_point(class_scope:DeveloperIdContainer)
  private static final com.github.yeriomin.playstoreapi.DeveloperIdContainer DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new DeveloperIdContainer();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstoreapi.DeveloperIdContainer getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<DeveloperIdContainer> PARSER;

  public static com.google.protobuf.Parser<DeveloperIdContainer> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

