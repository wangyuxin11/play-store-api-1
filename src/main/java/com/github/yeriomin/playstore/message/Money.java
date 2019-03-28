// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

/**
 * Protobuf type {@code Money}
 */
public  final class Money extends
    com.google.protobuf.GeneratedMessageLite<
        Money, Money.Builder> implements
    // @@protoc_insertion_point(message_implements:Money)
    MoneyOrBuilder {
  private Money() {
    currencyCode_ = "";
    formattedAmount_ = "";
  }
  private int bitField0_;
  public static final int MICROS_FIELD_NUMBER = 1;
  private long micros_;
  /**
   * <code>optional int64 micros = 1;</code>
   */
  public boolean hasMicros() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional int64 micros = 1;</code>
   */
  public long getMicros() {
    return micros_;
  }
  /**
   * <code>optional int64 micros = 1;</code>
   */
  private void setMicros(long value) {
    bitField0_ |= 0x00000001;
    micros_ = value;
  }
  /**
   * <code>optional int64 micros = 1;</code>
   */
  private void clearMicros() {
    bitField0_ = (bitField0_ & ~0x00000001);
    micros_ = 0L;
  }

  public static final int CURRENCYCODE_FIELD_NUMBER = 2;
  private java.lang.String currencyCode_;
  /**
   * <code>optional string currencyCode = 2;</code>
   */
  public boolean hasCurrencyCode() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional string currencyCode = 2;</code>
   */
  public java.lang.String getCurrencyCode() {
    return currencyCode_;
  }
  /**
   * <code>optional string currencyCode = 2;</code>
   */
  public com.google.protobuf.ByteString
      getCurrencyCodeBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(currencyCode_);
  }
  /**
   * <code>optional string currencyCode = 2;</code>
   */
  private void setCurrencyCode(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
    currencyCode_ = value;
  }
  /**
   * <code>optional string currencyCode = 2;</code>
   */
  private void clearCurrencyCode() {
    bitField0_ = (bitField0_ & ~0x00000002);
    currencyCode_ = getDefaultInstance().getCurrencyCode();
  }
  /**
   * <code>optional string currencyCode = 2;</code>
   */
  private void setCurrencyCodeBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
    currencyCode_ = value.toStringUtf8();
  }

  public static final int FORMATTEDAMOUNT_FIELD_NUMBER = 3;
  private java.lang.String formattedAmount_;
  /**
   * <code>optional string formattedAmount = 3;</code>
   */
  public boolean hasFormattedAmount() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional string formattedAmount = 3;</code>
   */
  public java.lang.String getFormattedAmount() {
    return formattedAmount_;
  }
  /**
   * <code>optional string formattedAmount = 3;</code>
   */
  public com.google.protobuf.ByteString
      getFormattedAmountBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(formattedAmount_);
  }
  /**
   * <code>optional string formattedAmount = 3;</code>
   */
  private void setFormattedAmount(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
    formattedAmount_ = value;
  }
  /**
   * <code>optional string formattedAmount = 3;</code>
   */
  private void clearFormattedAmount() {
    bitField0_ = (bitField0_ & ~0x00000004);
    formattedAmount_ = getDefaultInstance().getFormattedAmount();
  }
  /**
   * <code>optional string formattedAmount = 3;</code>
   */
  private void setFormattedAmountBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
    formattedAmount_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeInt64(1, micros_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeString(2, getCurrencyCode());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeString(3, getFormattedAmount());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, micros_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getCurrencyCode());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(3, getFormattedAmount());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstore.message.Money parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.Money parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.Money parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.Money parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.Money parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.Money parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.Money parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.Money parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.Money parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.Money parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstore.message.Money prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code Money}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstore.message.Money, Builder> implements
      // @@protoc_insertion_point(builder_implements:Money)
      com.github.yeriomin.playstore.message.MoneyOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.Money.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional int64 micros = 1;</code>
     */
    public boolean hasMicros() {
      return instance.hasMicros();
    }
    /**
     * <code>optional int64 micros = 1;</code>
     */
    public long getMicros() {
      return instance.getMicros();
    }
    /**
     * <code>optional int64 micros = 1;</code>
     */
    public Builder setMicros(long value) {
      copyOnWrite();
      instance.setMicros(value);
      return this;
    }
    /**
     * <code>optional int64 micros = 1;</code>
     */
    public Builder clearMicros() {
      copyOnWrite();
      instance.clearMicros();
      return this;
    }

    /**
     * <code>optional string currencyCode = 2;</code>
     */
    public boolean hasCurrencyCode() {
      return instance.hasCurrencyCode();
    }
    /**
     * <code>optional string currencyCode = 2;</code>
     */
    public java.lang.String getCurrencyCode() {
      return instance.getCurrencyCode();
    }
    /**
     * <code>optional string currencyCode = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCurrencyCodeBytes() {
      return instance.getCurrencyCodeBytes();
    }
    /**
     * <code>optional string currencyCode = 2;</code>
     */
    public Builder setCurrencyCode(
        java.lang.String value) {
      copyOnWrite();
      instance.setCurrencyCode(value);
      return this;
    }
    /**
     * <code>optional string currencyCode = 2;</code>
     */
    public Builder clearCurrencyCode() {
      copyOnWrite();
      instance.clearCurrencyCode();
      return this;
    }
    /**
     * <code>optional string currencyCode = 2;</code>
     */
    public Builder setCurrencyCodeBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setCurrencyCodeBytes(value);
      return this;
    }

    /**
     * <code>optional string formattedAmount = 3;</code>
     */
    public boolean hasFormattedAmount() {
      return instance.hasFormattedAmount();
    }
    /**
     * <code>optional string formattedAmount = 3;</code>
     */
    public java.lang.String getFormattedAmount() {
      return instance.getFormattedAmount();
    }
    /**
     * <code>optional string formattedAmount = 3;</code>
     */
    public com.google.protobuf.ByteString
        getFormattedAmountBytes() {
      return instance.getFormattedAmountBytes();
    }
    /**
     * <code>optional string formattedAmount = 3;</code>
     */
    public Builder setFormattedAmount(
        java.lang.String value) {
      copyOnWrite();
      instance.setFormattedAmount(value);
      return this;
    }
    /**
     * <code>optional string formattedAmount = 3;</code>
     */
    public Builder clearFormattedAmount() {
      copyOnWrite();
      instance.clearFormattedAmount();
      return this;
    }
    /**
     * <code>optional string formattedAmount = 3;</code>
     */
    public Builder setFormattedAmountBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setFormattedAmountBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:Money)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstore.message.Money();
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
        com.github.yeriomin.playstore.message.Money other = (com.github.yeriomin.playstore.message.Money) arg1;
        micros_ = visitor.visitLong(
            hasMicros(), micros_,
            other.hasMicros(), other.micros_);
        currencyCode_ = visitor.visitString(
            hasCurrencyCode(), currencyCode_,
            other.hasCurrencyCode(), other.currencyCode_);
        formattedAmount_ = visitor.visitString(
            hasFormattedAmount(), formattedAmount_,
            other.hasFormattedAmount(), other.formattedAmount_);
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
                micros_ = input.readInt64();
                break;
              }
              case 18: {
                String s = input.readString();
                bitField0_ |= 0x00000002;
                currencyCode_ = s;
                break;
              }
              case 26: {
                String s = input.readString();
                bitField0_ |= 0x00000004;
                formattedAmount_ = s;
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstore.message.Money.class) {
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


  // @@protoc_insertion_point(class_scope:Money)
  private static final com.github.yeriomin.playstore.message.Money DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Money();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstore.message.Money getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Money> PARSER;

  public static com.google.protobuf.Parser<Money> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
