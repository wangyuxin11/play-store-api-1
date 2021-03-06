// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

/**
 * Protobuf type {@code UserProfileResponse}
 */
public  final class UserProfileResponse extends
    com.google.protobuf.GeneratedMessageLite<
        UserProfileResponse, UserProfileResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:UserProfileResponse)
    UserProfileResponseOrBuilder {
  private UserProfileResponse() {
  }
  private int bitField0_;
  public static final int USERPROFILE_FIELD_NUMBER = 1;
  private com.github.yeriomin.playstore.message.UserProfile userProfile_;
  /**
   * <code>optional .UserProfile userProfile = 1;</code>
   */
  public boolean hasUserProfile() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional .UserProfile userProfile = 1;</code>
   */
  public com.github.yeriomin.playstore.message.UserProfile getUserProfile() {
    return userProfile_ == null ? com.github.yeriomin.playstore.message.UserProfile.getDefaultInstance() : userProfile_;
  }
  /**
   * <code>optional .UserProfile userProfile = 1;</code>
   */
  private void setUserProfile(com.github.yeriomin.playstore.message.UserProfile value) {
    if (value == null) {
      throw new NullPointerException();
    }
    userProfile_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <code>optional .UserProfile userProfile = 1;</code>
   */
  private void setUserProfile(
      com.github.yeriomin.playstore.message.UserProfile.Builder builderForValue) {
    userProfile_ = builderForValue.build();
    bitField0_ |= 0x00000001;
  }
  /**
   * <code>optional .UserProfile userProfile = 1;</code>
   */
  private void mergeUserProfile(com.github.yeriomin.playstore.message.UserProfile value) {
    if (userProfile_ != null &&
        userProfile_ != com.github.yeriomin.playstore.message.UserProfile.getDefaultInstance()) {
      userProfile_ =
        com.github.yeriomin.playstore.message.UserProfile.newBuilder(userProfile_).mergeFrom(value).buildPartial();
    } else {
      userProfile_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <code>optional .UserProfile userProfile = 1;</code>
   */
  private void clearUserProfile() {  userProfile_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeMessage(1, getUserProfile());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUserProfile());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstore.message.UserProfileResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.UserProfileResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.UserProfileResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.UserProfileResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.UserProfileResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.UserProfileResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.UserProfileResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.UserProfileResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.UserProfileResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.UserProfileResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstore.message.UserProfileResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code UserProfileResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstore.message.UserProfileResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:UserProfileResponse)
      com.github.yeriomin.playstore.message.UserProfileResponseOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.UserProfileResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional .UserProfile userProfile = 1;</code>
     */
    public boolean hasUserProfile() {
      return instance.hasUserProfile();
    }
    /**
     * <code>optional .UserProfile userProfile = 1;</code>
     */
    public com.github.yeriomin.playstore.message.UserProfile getUserProfile() {
      return instance.getUserProfile();
    }
    /**
     * <code>optional .UserProfile userProfile = 1;</code>
     */
    public Builder setUserProfile(com.github.yeriomin.playstore.message.UserProfile value) {
      copyOnWrite();
      instance.setUserProfile(value);
      return this;
      }
    /**
     * <code>optional .UserProfile userProfile = 1;</code>
     */
    public Builder setUserProfile(
        com.github.yeriomin.playstore.message.UserProfile.Builder builderForValue) {
      copyOnWrite();
      instance.setUserProfile(builderForValue);
      return this;
    }
    /**
     * <code>optional .UserProfile userProfile = 1;</code>
     */
    public Builder mergeUserProfile(com.github.yeriomin.playstore.message.UserProfile value) {
      copyOnWrite();
      instance.mergeUserProfile(value);
      return this;
    }
    /**
     * <code>optional .UserProfile userProfile = 1;</code>
     */
    public Builder clearUserProfile() {  copyOnWrite();
      instance.clearUserProfile();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:UserProfileResponse)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstore.message.UserProfileResponse();
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
        com.github.yeriomin.playstore.message.UserProfileResponse other = (com.github.yeriomin.playstore.message.UserProfileResponse) arg1;
        userProfile_ = visitor.visitMessage(userProfile_, other.userProfile_);
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
                com.github.yeriomin.playstore.message.UserProfile.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = userProfile_.toBuilder();
                }
                userProfile_ = input.readMessage(com.github.yeriomin.playstore.message.UserProfile.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(userProfile_);
                  userProfile_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstore.message.UserProfileResponse.class) {
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


  // @@protoc_insertion_point(class_scope:UserProfileResponse)
  private static final com.github.yeriomin.playstore.message.UserProfileResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new UserProfileResponse();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstore.message.UserProfileResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<UserProfileResponse> PARSER;

  public static com.google.protobuf.Parser<UserProfileResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

