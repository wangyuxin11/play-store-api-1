// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstoreapi;

/**
 * Protobuf type {@code CarrierTos}
 */
public  final class CarrierTos extends
    com.google.protobuf.GeneratedMessageLite<
        CarrierTos, CarrierTos.Builder> implements
    // @@protoc_insertion_point(message_implements:CarrierTos)
    CarrierTosOrBuilder {
  private CarrierTos() {
  }
  private int bitField0_;
  public static final int DCBTOS_FIELD_NUMBER = 1;
  private com.github.yeriomin.playstoreapi.CarrierTosEntry dcbTos_;
  /**
   * <code>optional .CarrierTosEntry dcbTos = 1;</code>
   */
  public boolean hasDcbTos() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional .CarrierTosEntry dcbTos = 1;</code>
   */
  public com.github.yeriomin.playstoreapi.CarrierTosEntry getDcbTos() {
    return dcbTos_ == null ? com.github.yeriomin.playstoreapi.CarrierTosEntry.getDefaultInstance() : dcbTos_;
  }
  /**
   * <code>optional .CarrierTosEntry dcbTos = 1;</code>
   */
  private void setDcbTos(com.github.yeriomin.playstoreapi.CarrierTosEntry value) {
    if (value == null) {
      throw new NullPointerException();
    }
    dcbTos_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <code>optional .CarrierTosEntry dcbTos = 1;</code>
   */
  private void setDcbTos(
      com.github.yeriomin.playstoreapi.CarrierTosEntry.Builder builderForValue) {
    dcbTos_ = builderForValue.build();
    bitField0_ |= 0x00000001;
  }
  /**
   * <code>optional .CarrierTosEntry dcbTos = 1;</code>
   */
  private void mergeDcbTos(com.github.yeriomin.playstoreapi.CarrierTosEntry value) {
    if (dcbTos_ != null &&
        dcbTos_ != com.github.yeriomin.playstoreapi.CarrierTosEntry.getDefaultInstance()) {
      dcbTos_ =
        com.github.yeriomin.playstoreapi.CarrierTosEntry.newBuilder(dcbTos_).mergeFrom(value).buildPartial();
    } else {
      dcbTos_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <code>optional .CarrierTosEntry dcbTos = 1;</code>
   */
  private void clearDcbTos() {  dcbTos_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static final int PIITOS_FIELD_NUMBER = 2;
  private com.github.yeriomin.playstoreapi.CarrierTosEntry piiTos_;
  /**
   * <code>optional .CarrierTosEntry piiTos = 2;</code>
   */
  public boolean hasPiiTos() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional .CarrierTosEntry piiTos = 2;</code>
   */
  public com.github.yeriomin.playstoreapi.CarrierTosEntry getPiiTos() {
    return piiTos_ == null ? com.github.yeriomin.playstoreapi.CarrierTosEntry.getDefaultInstance() : piiTos_;
  }
  /**
   * <code>optional .CarrierTosEntry piiTos = 2;</code>
   */
  private void setPiiTos(com.github.yeriomin.playstoreapi.CarrierTosEntry value) {
    if (value == null) {
      throw new NullPointerException();
    }
    piiTos_ = value;
    bitField0_ |= 0x00000002;
    }
  /**
   * <code>optional .CarrierTosEntry piiTos = 2;</code>
   */
  private void setPiiTos(
      com.github.yeriomin.playstoreapi.CarrierTosEntry.Builder builderForValue) {
    piiTos_ = builderForValue.build();
    bitField0_ |= 0x00000002;
  }
  /**
   * <code>optional .CarrierTosEntry piiTos = 2;</code>
   */
  private void mergePiiTos(com.github.yeriomin.playstoreapi.CarrierTosEntry value) {
    if (piiTos_ != null &&
        piiTos_ != com.github.yeriomin.playstoreapi.CarrierTosEntry.getDefaultInstance()) {
      piiTos_ =
        com.github.yeriomin.playstoreapi.CarrierTosEntry.newBuilder(piiTos_).mergeFrom(value).buildPartial();
    } else {
      piiTos_ = value;
    }
    bitField0_ |= 0x00000002;
  }
  /**
   * <code>optional .CarrierTosEntry piiTos = 2;</code>
   */
  private void clearPiiTos() {  piiTos_ = null;
    bitField0_ = (bitField0_ & ~0x00000002);
  }

  public static final int NEEDSDCBTOSACCEPTANCE_FIELD_NUMBER = 3;
  private boolean needsDcbTosAcceptance_;
  /**
   * <code>optional bool needsDcbTosAcceptance = 3;</code>
   */
  public boolean hasNeedsDcbTosAcceptance() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional bool needsDcbTosAcceptance = 3;</code>
   */
  public boolean getNeedsDcbTosAcceptance() {
    return needsDcbTosAcceptance_;
  }
  /**
   * <code>optional bool needsDcbTosAcceptance = 3;</code>
   */
  private void setNeedsDcbTosAcceptance(boolean value) {
    bitField0_ |= 0x00000004;
    needsDcbTosAcceptance_ = value;
  }
  /**
   * <code>optional bool needsDcbTosAcceptance = 3;</code>
   */
  private void clearNeedsDcbTosAcceptance() {
    bitField0_ = (bitField0_ & ~0x00000004);
    needsDcbTosAcceptance_ = false;
  }

  public static final int NEEDSPIITOSACCEPTANCE_FIELD_NUMBER = 4;
  private boolean needsPiiTosAcceptance_;
  /**
   * <code>optional bool needsPiiTosAcceptance = 4;</code>
   */
  public boolean hasNeedsPiiTosAcceptance() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>optional bool needsPiiTosAcceptance = 4;</code>
   */
  public boolean getNeedsPiiTosAcceptance() {
    return needsPiiTosAcceptance_;
  }
  /**
   * <code>optional bool needsPiiTosAcceptance = 4;</code>
   */
  private void setNeedsPiiTosAcceptance(boolean value) {
    bitField0_ |= 0x00000008;
    needsPiiTosAcceptance_ = value;
  }
  /**
   * <code>optional bool needsPiiTosAcceptance = 4;</code>
   */
  private void clearNeedsPiiTosAcceptance() {
    bitField0_ = (bitField0_ & ~0x00000008);
    needsPiiTosAcceptance_ = false;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeMessage(1, getDcbTos());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeMessage(2, getPiiTos());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeBool(3, needsDcbTosAcceptance_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeBool(4, needsPiiTosAcceptance_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDcbTos());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPiiTos());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, needsDcbTosAcceptance_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, needsPiiTosAcceptance_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstoreapi.CarrierTos parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstoreapi.CarrierTos parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.CarrierTos parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstoreapi.CarrierTos parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.CarrierTos parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.CarrierTos parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.CarrierTos parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.CarrierTos parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.CarrierTos parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.CarrierTos parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstoreapi.CarrierTos prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code CarrierTos}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstoreapi.CarrierTos, Builder> implements
      // @@protoc_insertion_point(builder_implements:CarrierTos)
      com.github.yeriomin.playstoreapi.CarrierTosOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.CarrierTos.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional .CarrierTosEntry dcbTos = 1;</code>
     */
    public boolean hasDcbTos() {
      return instance.hasDcbTos();
    }
    /**
     * <code>optional .CarrierTosEntry dcbTos = 1;</code>
     */
    public com.github.yeriomin.playstoreapi.CarrierTosEntry getDcbTos() {
      return instance.getDcbTos();
    }
    /**
     * <code>optional .CarrierTosEntry dcbTos = 1;</code>
     */
    public Builder setDcbTos(com.github.yeriomin.playstoreapi.CarrierTosEntry value) {
      copyOnWrite();
      instance.setDcbTos(value);
      return this;
      }
    /**
     * <code>optional .CarrierTosEntry dcbTos = 1;</code>
     */
    public Builder setDcbTos(
        com.github.yeriomin.playstoreapi.CarrierTosEntry.Builder builderForValue) {
      copyOnWrite();
      instance.setDcbTos(builderForValue);
      return this;
    }
    /**
     * <code>optional .CarrierTosEntry dcbTos = 1;</code>
     */
    public Builder mergeDcbTos(com.github.yeriomin.playstoreapi.CarrierTosEntry value) {
      copyOnWrite();
      instance.mergeDcbTos(value);
      return this;
    }
    /**
     * <code>optional .CarrierTosEntry dcbTos = 1;</code>
     */
    public Builder clearDcbTos() {  copyOnWrite();
      instance.clearDcbTos();
      return this;
    }

    /**
     * <code>optional .CarrierTosEntry piiTos = 2;</code>
     */
    public boolean hasPiiTos() {
      return instance.hasPiiTos();
    }
    /**
     * <code>optional .CarrierTosEntry piiTos = 2;</code>
     */
    public com.github.yeriomin.playstoreapi.CarrierTosEntry getPiiTos() {
      return instance.getPiiTos();
    }
    /**
     * <code>optional .CarrierTosEntry piiTos = 2;</code>
     */
    public Builder setPiiTos(com.github.yeriomin.playstoreapi.CarrierTosEntry value) {
      copyOnWrite();
      instance.setPiiTos(value);
      return this;
      }
    /**
     * <code>optional .CarrierTosEntry piiTos = 2;</code>
     */
    public Builder setPiiTos(
        com.github.yeriomin.playstoreapi.CarrierTosEntry.Builder builderForValue) {
      copyOnWrite();
      instance.setPiiTos(builderForValue);
      return this;
    }
    /**
     * <code>optional .CarrierTosEntry piiTos = 2;</code>
     */
    public Builder mergePiiTos(com.github.yeriomin.playstoreapi.CarrierTosEntry value) {
      copyOnWrite();
      instance.mergePiiTos(value);
      return this;
    }
    /**
     * <code>optional .CarrierTosEntry piiTos = 2;</code>
     */
    public Builder clearPiiTos() {  copyOnWrite();
      instance.clearPiiTos();
      return this;
    }

    /**
     * <code>optional bool needsDcbTosAcceptance = 3;</code>
     */
    public boolean hasNeedsDcbTosAcceptance() {
      return instance.hasNeedsDcbTosAcceptance();
    }
    /**
     * <code>optional bool needsDcbTosAcceptance = 3;</code>
     */
    public boolean getNeedsDcbTosAcceptance() {
      return instance.getNeedsDcbTosAcceptance();
    }
    /**
     * <code>optional bool needsDcbTosAcceptance = 3;</code>
     */
    public Builder setNeedsDcbTosAcceptance(boolean value) {
      copyOnWrite();
      instance.setNeedsDcbTosAcceptance(value);
      return this;
    }
    /**
     * <code>optional bool needsDcbTosAcceptance = 3;</code>
     */
    public Builder clearNeedsDcbTosAcceptance() {
      copyOnWrite();
      instance.clearNeedsDcbTosAcceptance();
      return this;
    }

    /**
     * <code>optional bool needsPiiTosAcceptance = 4;</code>
     */
    public boolean hasNeedsPiiTosAcceptance() {
      return instance.hasNeedsPiiTosAcceptance();
    }
    /**
     * <code>optional bool needsPiiTosAcceptance = 4;</code>
     */
    public boolean getNeedsPiiTosAcceptance() {
      return instance.getNeedsPiiTosAcceptance();
    }
    /**
     * <code>optional bool needsPiiTosAcceptance = 4;</code>
     */
    public Builder setNeedsPiiTosAcceptance(boolean value) {
      copyOnWrite();
      instance.setNeedsPiiTosAcceptance(value);
      return this;
    }
    /**
     * <code>optional bool needsPiiTosAcceptance = 4;</code>
     */
    public Builder clearNeedsPiiTosAcceptance() {
      copyOnWrite();
      instance.clearNeedsPiiTosAcceptance();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:CarrierTos)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstoreapi.CarrierTos();
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
        com.github.yeriomin.playstoreapi.CarrierTos other = (com.github.yeriomin.playstoreapi.CarrierTos) arg1;
        dcbTos_ = visitor.visitMessage(dcbTos_, other.dcbTos_);
        piiTos_ = visitor.visitMessage(piiTos_, other.piiTos_);
        needsDcbTosAcceptance_ = visitor.visitBoolean(
            hasNeedsDcbTosAcceptance(), needsDcbTosAcceptance_,
            other.hasNeedsDcbTosAcceptance(), other.needsDcbTosAcceptance_);
        needsPiiTosAcceptance_ = visitor.visitBoolean(
            hasNeedsPiiTosAcceptance(), needsPiiTosAcceptance_,
            other.hasNeedsPiiTosAcceptance(), other.needsPiiTosAcceptance_);
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
                com.github.yeriomin.playstoreapi.CarrierTosEntry.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = dcbTos_.toBuilder();
                }
                dcbTos_ = input.readMessage(com.github.yeriomin.playstoreapi.CarrierTosEntry.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(dcbTos_);
                  dcbTos_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
              case 18: {
                com.github.yeriomin.playstoreapi.CarrierTosEntry.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = piiTos_.toBuilder();
                }
                piiTos_ = input.readMessage(com.github.yeriomin.playstoreapi.CarrierTosEntry.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(piiTos_);
                  piiTos_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
              case 24: {
                bitField0_ |= 0x00000004;
                needsDcbTosAcceptance_ = input.readBool();
                break;
              }
              case 32: {
                bitField0_ |= 0x00000008;
                needsPiiTosAcceptance_ = input.readBool();
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstoreapi.CarrierTos.class) {
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


  // @@protoc_insertion_point(class_scope:CarrierTos)
  private static final com.github.yeriomin.playstoreapi.CarrierTos DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new CarrierTos();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstoreapi.CarrierTos getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<CarrierTos> PARSER;

  public static com.google.protobuf.Parser<CarrierTos> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

