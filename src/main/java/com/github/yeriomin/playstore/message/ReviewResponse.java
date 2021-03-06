// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

/**
 * Protobuf type {@code ReviewResponse}
 */
public  final class ReviewResponse extends
    com.google.protobuf.GeneratedMessageLite<
        ReviewResponse, ReviewResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:ReviewResponse)
    ReviewResponseOrBuilder {
  private ReviewResponse() {
    nextPageUrl_ = "";
  }
  private int bitField0_;
  public static final int GETRESPONSE_FIELD_NUMBER = 1;
  private com.github.yeriomin.playstore.message.GetReviewsResponse getResponse_;
  /**
   * <code>optional .GetReviewsResponse getResponse = 1;</code>
   */
  public boolean hasGetResponse() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional .GetReviewsResponse getResponse = 1;</code>
   */
  public com.github.yeriomin.playstore.message.GetReviewsResponse getGetResponse() {
    return getResponse_ == null ? com.github.yeriomin.playstore.message.GetReviewsResponse.getDefaultInstance() : getResponse_;
  }
  /**
   * <code>optional .GetReviewsResponse getResponse = 1;</code>
   */
  private void setGetResponse(com.github.yeriomin.playstore.message.GetReviewsResponse value) {
    if (value == null) {
      throw new NullPointerException();
    }
    getResponse_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <code>optional .GetReviewsResponse getResponse = 1;</code>
   */
  private void setGetResponse(
      com.github.yeriomin.playstore.message.GetReviewsResponse.Builder builderForValue) {
    getResponse_ = builderForValue.build();
    bitField0_ |= 0x00000001;
  }
  /**
   * <code>optional .GetReviewsResponse getResponse = 1;</code>
   */
  private void mergeGetResponse(com.github.yeriomin.playstore.message.GetReviewsResponse value) {
    if (getResponse_ != null &&
        getResponse_ != com.github.yeriomin.playstore.message.GetReviewsResponse.getDefaultInstance()) {
      getResponse_ =
        com.github.yeriomin.playstore.message.GetReviewsResponse.newBuilder(getResponse_).mergeFrom(value).buildPartial();
    } else {
      getResponse_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <code>optional .GetReviewsResponse getResponse = 1;</code>
   */
  private void clearGetResponse() {  getResponse_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static final int NEXTPAGEURL_FIELD_NUMBER = 2;
  private java.lang.String nextPageUrl_;
  /**
   * <code>optional string nextPageUrl = 2;</code>
   */
  public boolean hasNextPageUrl() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional string nextPageUrl = 2;</code>
   */
  public java.lang.String getNextPageUrl() {
    return nextPageUrl_;
  }
  /**
   * <code>optional string nextPageUrl = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNextPageUrlBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(nextPageUrl_);
  }
  /**
   * <code>optional string nextPageUrl = 2;</code>
   */
  private void setNextPageUrl(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
    nextPageUrl_ = value;
  }
  /**
   * <code>optional string nextPageUrl = 2;</code>
   */
  private void clearNextPageUrl() {
    bitField0_ = (bitField0_ & ~0x00000002);
    nextPageUrl_ = getDefaultInstance().getNextPageUrl();
  }
  /**
   * <code>optional string nextPageUrl = 2;</code>
   */
  private void setNextPageUrlBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
    nextPageUrl_ = value.toStringUtf8();
  }

  public static final int USERREVIEW_FIELD_NUMBER = 3;
  private com.github.yeriomin.playstore.message.Review userReview_;
  /**
   * <code>optional .Review userReview = 3;</code>
   */
  public boolean hasUserReview() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional .Review userReview = 3;</code>
   */
  public com.github.yeriomin.playstore.message.Review getUserReview() {
    return userReview_ == null ? com.github.yeriomin.playstore.message.Review.getDefaultInstance() : userReview_;
  }
  /**
   * <code>optional .Review userReview = 3;</code>
   */
  private void setUserReview(com.github.yeriomin.playstore.message.Review value) {
    if (value == null) {
      throw new NullPointerException();
    }
    userReview_ = value;
    bitField0_ |= 0x00000004;
    }
  /**
   * <code>optional .Review userReview = 3;</code>
   */
  private void setUserReview(
      com.github.yeriomin.playstore.message.Review.Builder builderForValue) {
    userReview_ = builderForValue.build();
    bitField0_ |= 0x00000004;
  }
  /**
   * <code>optional .Review userReview = 3;</code>
   */
  private void mergeUserReview(com.github.yeriomin.playstore.message.Review value) {
    if (userReview_ != null &&
        userReview_ != com.github.yeriomin.playstore.message.Review.getDefaultInstance()) {
      userReview_ =
        com.github.yeriomin.playstore.message.Review.newBuilder(userReview_).mergeFrom(value).buildPartial();
    } else {
      userReview_ = value;
    }
    bitField0_ |= 0x00000004;
  }
  /**
   * <code>optional .Review userReview = 3;</code>
   */
  private void clearUserReview() {  userReview_ = null;
    bitField0_ = (bitField0_ & ~0x00000004);
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeMessage(1, getGetResponse());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeString(2, getNextPageUrl());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeMessage(3, getUserReview());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getGetResponse());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getNextPageUrl());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getUserReview());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstore.message.ReviewResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.ReviewResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.ReviewResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.ReviewResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.ReviewResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.ReviewResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.ReviewResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.ReviewResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.ReviewResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.ReviewResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstore.message.ReviewResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code ReviewResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstore.message.ReviewResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:ReviewResponse)
      com.github.yeriomin.playstore.message.ReviewResponseOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.ReviewResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional .GetReviewsResponse getResponse = 1;</code>
     */
    public boolean hasGetResponse() {
      return instance.hasGetResponse();
    }
    /**
     * <code>optional .GetReviewsResponse getResponse = 1;</code>
     */
    public com.github.yeriomin.playstore.message.GetReviewsResponse getGetResponse() {
      return instance.getGetResponse();
    }
    /**
     * <code>optional .GetReviewsResponse getResponse = 1;</code>
     */
    public Builder setGetResponse(com.github.yeriomin.playstore.message.GetReviewsResponse value) {
      copyOnWrite();
      instance.setGetResponse(value);
      return this;
      }
    /**
     * <code>optional .GetReviewsResponse getResponse = 1;</code>
     */
    public Builder setGetResponse(
        com.github.yeriomin.playstore.message.GetReviewsResponse.Builder builderForValue) {
      copyOnWrite();
      instance.setGetResponse(builderForValue);
      return this;
    }
    /**
     * <code>optional .GetReviewsResponse getResponse = 1;</code>
     */
    public Builder mergeGetResponse(com.github.yeriomin.playstore.message.GetReviewsResponse value) {
      copyOnWrite();
      instance.mergeGetResponse(value);
      return this;
    }
    /**
     * <code>optional .GetReviewsResponse getResponse = 1;</code>
     */
    public Builder clearGetResponse() {  copyOnWrite();
      instance.clearGetResponse();
      return this;
    }

    /**
     * <code>optional string nextPageUrl = 2;</code>
     */
    public boolean hasNextPageUrl() {
      return instance.hasNextPageUrl();
    }
    /**
     * <code>optional string nextPageUrl = 2;</code>
     */
    public java.lang.String getNextPageUrl() {
      return instance.getNextPageUrl();
    }
    /**
     * <code>optional string nextPageUrl = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNextPageUrlBytes() {
      return instance.getNextPageUrlBytes();
    }
    /**
     * <code>optional string nextPageUrl = 2;</code>
     */
    public Builder setNextPageUrl(
        java.lang.String value) {
      copyOnWrite();
      instance.setNextPageUrl(value);
      return this;
    }
    /**
     * <code>optional string nextPageUrl = 2;</code>
     */
    public Builder clearNextPageUrl() {
      copyOnWrite();
      instance.clearNextPageUrl();
      return this;
    }
    /**
     * <code>optional string nextPageUrl = 2;</code>
     */
    public Builder setNextPageUrlBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setNextPageUrlBytes(value);
      return this;
    }

    /**
     * <code>optional .Review userReview = 3;</code>
     */
    public boolean hasUserReview() {
      return instance.hasUserReview();
    }
    /**
     * <code>optional .Review userReview = 3;</code>
     */
    public com.github.yeriomin.playstore.message.Review getUserReview() {
      return instance.getUserReview();
    }
    /**
     * <code>optional .Review userReview = 3;</code>
     */
    public Builder setUserReview(com.github.yeriomin.playstore.message.Review value) {
      copyOnWrite();
      instance.setUserReview(value);
      return this;
      }
    /**
     * <code>optional .Review userReview = 3;</code>
     */
    public Builder setUserReview(
        com.github.yeriomin.playstore.message.Review.Builder builderForValue) {
      copyOnWrite();
      instance.setUserReview(builderForValue);
      return this;
    }
    /**
     * <code>optional .Review userReview = 3;</code>
     */
    public Builder mergeUserReview(com.github.yeriomin.playstore.message.Review value) {
      copyOnWrite();
      instance.mergeUserReview(value);
      return this;
    }
    /**
     * <code>optional .Review userReview = 3;</code>
     */
    public Builder clearUserReview() {  copyOnWrite();
      instance.clearUserReview();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:ReviewResponse)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstore.message.ReviewResponse();
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
        com.github.yeriomin.playstore.message.ReviewResponse other = (com.github.yeriomin.playstore.message.ReviewResponse) arg1;
        getResponse_ = visitor.visitMessage(getResponse_, other.getResponse_);
        nextPageUrl_ = visitor.visitString(
            hasNextPageUrl(), nextPageUrl_,
            other.hasNextPageUrl(), other.nextPageUrl_);
        userReview_ = visitor.visitMessage(userReview_, other.userReview_);
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
                com.github.yeriomin.playstore.message.GetReviewsResponse.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = getResponse_.toBuilder();
                }
                getResponse_ = input.readMessage(com.github.yeriomin.playstore.message.GetReviewsResponse.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(getResponse_);
                  getResponse_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
              case 18: {
                String s = input.readString();
                bitField0_ |= 0x00000002;
                nextPageUrl_ = s;
                break;
              }
              case 26: {
                com.github.yeriomin.playstore.message.Review.Builder subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = userReview_.toBuilder();
                }
                userReview_ = input.readMessage(com.github.yeriomin.playstore.message.Review.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(userReview_);
                  userReview_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstore.message.ReviewResponse.class) {
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


  // @@protoc_insertion_point(class_scope:ReviewResponse)
  private static final com.github.yeriomin.playstore.message.ReviewResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ReviewResponse();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstore.message.ReviewResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ReviewResponse> PARSER;

  public static com.google.protobuf.Parser<ReviewResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

