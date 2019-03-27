// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstoreapi;

/**
 * Protobuf type {@code GetReviewsResponse}
 */
public  final class GetReviewsResponse extends
    com.google.protobuf.GeneratedMessageLite<
        GetReviewsResponse, GetReviewsResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:GetReviewsResponse)
    GetReviewsResponseOrBuilder {
  private GetReviewsResponse() {
    review_ = emptyProtobufList();
  }
  private int bitField0_;
  public static final int REVIEW_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<com.github.yeriomin.playstoreapi.Review> review_;
  /**
   * <code>repeated .Review review = 1;</code>
   */
  public java.util.List<com.github.yeriomin.playstoreapi.Review> getReviewList() {
    return review_;
  }
  /**
   * <code>repeated .Review review = 1;</code>
   */
  public java.util.List<? extends com.github.yeriomin.playstoreapi.ReviewOrBuilder> 
      getReviewOrBuilderList() {
    return review_;
  }
  /**
   * <code>repeated .Review review = 1;</code>
   */
  public int getReviewCount() {
    return review_.size();
  }
  /**
   * <code>repeated .Review review = 1;</code>
   */
  public com.github.yeriomin.playstoreapi.Review getReview(int index) {
    return review_.get(index);
  }
  /**
   * <code>repeated .Review review = 1;</code>
   */
  public com.github.yeriomin.playstoreapi.ReviewOrBuilder getReviewOrBuilder(
      int index) {
    return review_.get(index);
  }
  private void ensureReviewIsMutable() {
    if (!review_.isModifiable()) {
      review_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(review_);
     }
  }

  /**
   * <code>repeated .Review review = 1;</code>
   */
  private void setReview(
      int index, com.github.yeriomin.playstoreapi.Review value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureReviewIsMutable();
    review_.set(index, value);
  }
  /**
   * <code>repeated .Review review = 1;</code>
   */
  private void setReview(
      int index, com.github.yeriomin.playstoreapi.Review.Builder builderForValue) {
    ensureReviewIsMutable();
    review_.set(index, builderForValue.build());
  }
  /**
   * <code>repeated .Review review = 1;</code>
   */
  private void addReview(com.github.yeriomin.playstoreapi.Review value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureReviewIsMutable();
    review_.add(value);
  }
  /**
   * <code>repeated .Review review = 1;</code>
   */
  private void addReview(
      int index, com.github.yeriomin.playstoreapi.Review value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureReviewIsMutable();
    review_.add(index, value);
  }
  /**
   * <code>repeated .Review review = 1;</code>
   */
  private void addReview(
      com.github.yeriomin.playstoreapi.Review.Builder builderForValue) {
    ensureReviewIsMutable();
    review_.add(builderForValue.build());
  }
  /**
   * <code>repeated .Review review = 1;</code>
   */
  private void addReview(
      int index, com.github.yeriomin.playstoreapi.Review.Builder builderForValue) {
    ensureReviewIsMutable();
    review_.add(index, builderForValue.build());
  }
  /**
   * <code>repeated .Review review = 1;</code>
   */
  private void addAllReview(
      java.lang.Iterable<? extends com.github.yeriomin.playstoreapi.Review> values) {
    ensureReviewIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, review_);
  }
  /**
   * <code>repeated .Review review = 1;</code>
   */
  private void clearReview() {
    review_ = emptyProtobufList();
  }
  /**
   * <code>repeated .Review review = 1;</code>
   */
  private void removeReview(int index) {
    ensureReviewIsMutable();
    review_.remove(index);
  }

  public static final int MATCHINGCOUNT_FIELD_NUMBER = 2;
  private long matchingCount_;
  /**
   * <code>optional int64 matchingCount = 2;</code>
   */
  public boolean hasMatchingCount() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional int64 matchingCount = 2;</code>
   */
  public long getMatchingCount() {
    return matchingCount_;
  }
  /**
   * <code>optional int64 matchingCount = 2;</code>
   */
  private void setMatchingCount(long value) {
    bitField0_ |= 0x00000001;
    matchingCount_ = value;
  }
  /**
   * <code>optional int64 matchingCount = 2;</code>
   */
  private void clearMatchingCount() {
    bitField0_ = (bitField0_ & ~0x00000001);
    matchingCount_ = 0L;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < review_.size(); i++) {
      output.writeMessage(1, review_.get(i));
    }
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeInt64(2, matchingCount_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < review_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, review_.get(i));
    }
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, matchingCount_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstoreapi.GetReviewsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstoreapi.GetReviewsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.GetReviewsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstoreapi.GetReviewsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.GetReviewsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.GetReviewsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.GetReviewsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.GetReviewsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.GetReviewsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.GetReviewsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstoreapi.GetReviewsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code GetReviewsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstoreapi.GetReviewsResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:GetReviewsResponse)
      com.github.yeriomin.playstoreapi.GetReviewsResponseOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.GetReviewsResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>repeated .Review review = 1;</code>
     */
    public java.util.List<com.github.yeriomin.playstoreapi.Review> getReviewList() {
      return java.util.Collections.unmodifiableList(
          instance.getReviewList());
    }
    /**
     * <code>repeated .Review review = 1;</code>
     */
    public int getReviewCount() {
      return instance.getReviewCount();
    }/**
     * <code>repeated .Review review = 1;</code>
     */
    public com.github.yeriomin.playstoreapi.Review getReview(int index) {
      return instance.getReview(index);
    }
    /**
     * <code>repeated .Review review = 1;</code>
     */
    public Builder setReview(
        int index, com.github.yeriomin.playstoreapi.Review value) {
      copyOnWrite();
      instance.setReview(index, value);
      return this;
    }
    /**
     * <code>repeated .Review review = 1;</code>
     */
    public Builder setReview(
        int index, com.github.yeriomin.playstoreapi.Review.Builder builderForValue) {
      copyOnWrite();
      instance.setReview(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .Review review = 1;</code>
     */
    public Builder addReview(com.github.yeriomin.playstoreapi.Review value) {
      copyOnWrite();
      instance.addReview(value);
      return this;
    }
    /**
     * <code>repeated .Review review = 1;</code>
     */
    public Builder addReview(
        int index, com.github.yeriomin.playstoreapi.Review value) {
      copyOnWrite();
      instance.addReview(index, value);
      return this;
    }
    /**
     * <code>repeated .Review review = 1;</code>
     */
    public Builder addReview(
        com.github.yeriomin.playstoreapi.Review.Builder builderForValue) {
      copyOnWrite();
      instance.addReview(builderForValue);
      return this;
    }
    /**
     * <code>repeated .Review review = 1;</code>
     */
    public Builder addReview(
        int index, com.github.yeriomin.playstoreapi.Review.Builder builderForValue) {
      copyOnWrite();
      instance.addReview(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .Review review = 1;</code>
     */
    public Builder addAllReview(
        java.lang.Iterable<? extends com.github.yeriomin.playstoreapi.Review> values) {
      copyOnWrite();
      instance.addAllReview(values);
      return this;
    }
    /**
     * <code>repeated .Review review = 1;</code>
     */
    public Builder clearReview() {
      copyOnWrite();
      instance.clearReview();
      return this;
    }
    /**
     * <code>repeated .Review review = 1;</code>
     */
    public Builder removeReview(int index) {
      copyOnWrite();
      instance.removeReview(index);
      return this;
    }

    /**
     * <code>optional int64 matchingCount = 2;</code>
     */
    public boolean hasMatchingCount() {
      return instance.hasMatchingCount();
    }
    /**
     * <code>optional int64 matchingCount = 2;</code>
     */
    public long getMatchingCount() {
      return instance.getMatchingCount();
    }
    /**
     * <code>optional int64 matchingCount = 2;</code>
     */
    public Builder setMatchingCount(long value) {
      copyOnWrite();
      instance.setMatchingCount(value);
      return this;
    }
    /**
     * <code>optional int64 matchingCount = 2;</code>
     */
    public Builder clearMatchingCount() {
      copyOnWrite();
      instance.clearMatchingCount();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:GetReviewsResponse)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstoreapi.GetReviewsResponse();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        review_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.github.yeriomin.playstoreapi.GetReviewsResponse other = (com.github.yeriomin.playstoreapi.GetReviewsResponse) arg1;
        review_= visitor.visitList(review_, other.review_);
        matchingCount_ = visitor.visitLong(
            hasMatchingCount(), matchingCount_,
            other.hasMatchingCount(), other.matchingCount_);
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
                if (!review_.isModifiable()) {
                  review_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(review_);
                }
                review_.add(
                    input.readMessage(com.github.yeriomin.playstoreapi.Review.parser(), extensionRegistry));
                break;
              }
              case 16: {
                bitField0_ |= 0x00000001;
                matchingCount_ = input.readInt64();
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstoreapi.GetReviewsResponse.class) {
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


  // @@protoc_insertion_point(class_scope:GetReviewsResponse)
  private static final com.github.yeriomin.playstoreapi.GetReviewsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new GetReviewsResponse();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstoreapi.GetReviewsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<GetReviewsResponse> PARSER;

  public static com.google.protobuf.Parser<GetReviewsResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

