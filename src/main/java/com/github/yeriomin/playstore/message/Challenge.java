// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

/**
 * Protobuf type {@code Challenge}
 */
public  final class Challenge extends
    com.google.protobuf.GeneratedMessageLite<
        Challenge, Challenge.Builder> implements
    // @@protoc_insertion_point(message_implements:Challenge)
    ChallengeOrBuilder {
  private Challenge() {
  }
  private int bitField0_;
  public static final int ADDRESSCHALLENGE_FIELD_NUMBER = 1;
  private com.github.yeriomin.playstore.message.AddressChallenge addressChallenge_;
  /**
   * <code>optional .AddressChallenge addressChallenge = 1;</code>
   */
  public boolean hasAddressChallenge() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional .AddressChallenge addressChallenge = 1;</code>
   */
  public com.github.yeriomin.playstore.message.AddressChallenge getAddressChallenge() {
    return addressChallenge_ == null ? com.github.yeriomin.playstore.message.AddressChallenge.getDefaultInstance() : addressChallenge_;
  }
  /**
   * <code>optional .AddressChallenge addressChallenge = 1;</code>
   */
  private void setAddressChallenge(com.github.yeriomin.playstore.message.AddressChallenge value) {
    if (value == null) {
      throw new NullPointerException();
    }
    addressChallenge_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <code>optional .AddressChallenge addressChallenge = 1;</code>
   */
  private void setAddressChallenge(
      com.github.yeriomin.playstore.message.AddressChallenge.Builder builderForValue) {
    addressChallenge_ = builderForValue.build();
    bitField0_ |= 0x00000001;
  }
  /**
   * <code>optional .AddressChallenge addressChallenge = 1;</code>
   */
  private void mergeAddressChallenge(com.github.yeriomin.playstore.message.AddressChallenge value) {
    if (addressChallenge_ != null &&
        addressChallenge_ != com.github.yeriomin.playstore.message.AddressChallenge.getDefaultInstance()) {
      addressChallenge_ =
        com.github.yeriomin.playstore.message.AddressChallenge.newBuilder(addressChallenge_).mergeFrom(value).buildPartial();
    } else {
      addressChallenge_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <code>optional .AddressChallenge addressChallenge = 1;</code>
   */
  private void clearAddressChallenge() {  addressChallenge_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static final int AUTHENTICATIONCHALLENGE_FIELD_NUMBER = 2;
  private com.github.yeriomin.playstore.message.AuthenticationChallenge authenticationChallenge_;
  /**
   * <code>optional .AuthenticationChallenge authenticationChallenge = 2;</code>
   */
  public boolean hasAuthenticationChallenge() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional .AuthenticationChallenge authenticationChallenge = 2;</code>
   */
  public com.github.yeriomin.playstore.message.AuthenticationChallenge getAuthenticationChallenge() {
    return authenticationChallenge_ == null ? com.github.yeriomin.playstore.message.AuthenticationChallenge.getDefaultInstance() : authenticationChallenge_;
  }
  /**
   * <code>optional .AuthenticationChallenge authenticationChallenge = 2;</code>
   */
  private void setAuthenticationChallenge(com.github.yeriomin.playstore.message.AuthenticationChallenge value) {
    if (value == null) {
      throw new NullPointerException();
    }
    authenticationChallenge_ = value;
    bitField0_ |= 0x00000002;
    }
  /**
   * <code>optional .AuthenticationChallenge authenticationChallenge = 2;</code>
   */
  private void setAuthenticationChallenge(
      com.github.yeriomin.playstore.message.AuthenticationChallenge.Builder builderForValue) {
    authenticationChallenge_ = builderForValue.build();
    bitField0_ |= 0x00000002;
  }
  /**
   * <code>optional .AuthenticationChallenge authenticationChallenge = 2;</code>
   */
  private void mergeAuthenticationChallenge(com.github.yeriomin.playstore.message.AuthenticationChallenge value) {
    if (authenticationChallenge_ != null &&
        authenticationChallenge_ != com.github.yeriomin.playstore.message.AuthenticationChallenge.getDefaultInstance()) {
      authenticationChallenge_ =
        com.github.yeriomin.playstore.message.AuthenticationChallenge.newBuilder(authenticationChallenge_).mergeFrom(value).buildPartial();
    } else {
      authenticationChallenge_ = value;
    }
    bitField0_ |= 0x00000002;
  }
  /**
   * <code>optional .AuthenticationChallenge authenticationChallenge = 2;</code>
   */
  private void clearAuthenticationChallenge() {  authenticationChallenge_ = null;
    bitField0_ = (bitField0_ & ~0x00000002);
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeMessage(1, getAddressChallenge());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeMessage(2, getAuthenticationChallenge());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAddressChallenge());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAuthenticationChallenge());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstore.message.Challenge parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.Challenge parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.Challenge parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.Challenge parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.Challenge parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.Challenge parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.Challenge parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.Challenge parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.Challenge parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.Challenge parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstore.message.Challenge prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code Challenge}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstore.message.Challenge, Builder> implements
      // @@protoc_insertion_point(builder_implements:Challenge)
      com.github.yeriomin.playstore.message.ChallengeOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.Challenge.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional .AddressChallenge addressChallenge = 1;</code>
     */
    public boolean hasAddressChallenge() {
      return instance.hasAddressChallenge();
    }
    /**
     * <code>optional .AddressChallenge addressChallenge = 1;</code>
     */
    public com.github.yeriomin.playstore.message.AddressChallenge getAddressChallenge() {
      return instance.getAddressChallenge();
    }
    /**
     * <code>optional .AddressChallenge addressChallenge = 1;</code>
     */
    public Builder setAddressChallenge(com.github.yeriomin.playstore.message.AddressChallenge value) {
      copyOnWrite();
      instance.setAddressChallenge(value);
      return this;
      }
    /**
     * <code>optional .AddressChallenge addressChallenge = 1;</code>
     */
    public Builder setAddressChallenge(
        com.github.yeriomin.playstore.message.AddressChallenge.Builder builderForValue) {
      copyOnWrite();
      instance.setAddressChallenge(builderForValue);
      return this;
    }
    /**
     * <code>optional .AddressChallenge addressChallenge = 1;</code>
     */
    public Builder mergeAddressChallenge(com.github.yeriomin.playstore.message.AddressChallenge value) {
      copyOnWrite();
      instance.mergeAddressChallenge(value);
      return this;
    }
    /**
     * <code>optional .AddressChallenge addressChallenge = 1;</code>
     */
    public Builder clearAddressChallenge() {  copyOnWrite();
      instance.clearAddressChallenge();
      return this;
    }

    /**
     * <code>optional .AuthenticationChallenge authenticationChallenge = 2;</code>
     */
    public boolean hasAuthenticationChallenge() {
      return instance.hasAuthenticationChallenge();
    }
    /**
     * <code>optional .AuthenticationChallenge authenticationChallenge = 2;</code>
     */
    public com.github.yeriomin.playstore.message.AuthenticationChallenge getAuthenticationChallenge() {
      return instance.getAuthenticationChallenge();
    }
    /**
     * <code>optional .AuthenticationChallenge authenticationChallenge = 2;</code>
     */
    public Builder setAuthenticationChallenge(com.github.yeriomin.playstore.message.AuthenticationChallenge value) {
      copyOnWrite();
      instance.setAuthenticationChallenge(value);
      return this;
      }
    /**
     * <code>optional .AuthenticationChallenge authenticationChallenge = 2;</code>
     */
    public Builder setAuthenticationChallenge(
        com.github.yeriomin.playstore.message.AuthenticationChallenge.Builder builderForValue) {
      copyOnWrite();
      instance.setAuthenticationChallenge(builderForValue);
      return this;
    }
    /**
     * <code>optional .AuthenticationChallenge authenticationChallenge = 2;</code>
     */
    public Builder mergeAuthenticationChallenge(com.github.yeriomin.playstore.message.AuthenticationChallenge value) {
      copyOnWrite();
      instance.mergeAuthenticationChallenge(value);
      return this;
    }
    /**
     * <code>optional .AuthenticationChallenge authenticationChallenge = 2;</code>
     */
    public Builder clearAuthenticationChallenge() {  copyOnWrite();
      instance.clearAuthenticationChallenge();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:Challenge)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstore.message.Challenge();
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
        com.github.yeriomin.playstore.message.Challenge other = (com.github.yeriomin.playstore.message.Challenge) arg1;
        addressChallenge_ = visitor.visitMessage(addressChallenge_, other.addressChallenge_);
        authenticationChallenge_ = visitor.visitMessage(authenticationChallenge_, other.authenticationChallenge_);
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
                com.github.yeriomin.playstore.message.AddressChallenge.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = addressChallenge_.toBuilder();
                }
                addressChallenge_ = input.readMessage(com.github.yeriomin.playstore.message.AddressChallenge.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(addressChallenge_);
                  addressChallenge_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
              case 18: {
                com.github.yeriomin.playstore.message.AuthenticationChallenge.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = authenticationChallenge_.toBuilder();
                }
                authenticationChallenge_ = input.readMessage(com.github.yeriomin.playstore.message.AuthenticationChallenge.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(authenticationChallenge_);
                  authenticationChallenge_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstore.message.Challenge.class) {
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


  // @@protoc_insertion_point(class_scope:Challenge)
  private static final com.github.yeriomin.playstore.message.Challenge DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Challenge();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstore.message.Challenge getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Challenge> PARSER;

  public static com.google.protobuf.Parser<Challenge> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

