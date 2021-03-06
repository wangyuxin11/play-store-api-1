// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

/**
 * Protobuf type {@code UnknownCategoryContainer}
 */
public  final class UnknownCategoryContainer extends
    com.google.protobuf.GeneratedMessageLite<
        UnknownCategoryContainer, UnknownCategoryContainer.Builder> implements
    // @@protoc_insertion_point(message_implements:UnknownCategoryContainer)
    UnknownCategoryContainerOrBuilder {
  private UnknownCategoryContainer() {
  }
  private int bitField0_;
  public static final int CATEGORYIDCONTAINER_FIELD_NUMBER = 5;
  private com.github.yeriomin.playstore.message.CategoryIdContainer categoryIdContainer_;
  /**
   * <code>optional .CategoryIdContainer categoryIdContainer = 5;</code>
   */
  public boolean hasCategoryIdContainer() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional .CategoryIdContainer categoryIdContainer = 5;</code>
   */
  public com.github.yeriomin.playstore.message.CategoryIdContainer getCategoryIdContainer() {
    return categoryIdContainer_ == null ? com.github.yeriomin.playstore.message.CategoryIdContainer.getDefaultInstance() : categoryIdContainer_;
  }
  /**
   * <code>optional .CategoryIdContainer categoryIdContainer = 5;</code>
   */
  private void setCategoryIdContainer(com.github.yeriomin.playstore.message.CategoryIdContainer value) {
    if (value == null) {
      throw new NullPointerException();
    }
    categoryIdContainer_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <code>optional .CategoryIdContainer categoryIdContainer = 5;</code>
   */
  private void setCategoryIdContainer(
      com.github.yeriomin.playstore.message.CategoryIdContainer.Builder builderForValue) {
    categoryIdContainer_ = builderForValue.build();
    bitField0_ |= 0x00000001;
  }
  /**
   * <code>optional .CategoryIdContainer categoryIdContainer = 5;</code>
   */
  private void mergeCategoryIdContainer(com.github.yeriomin.playstore.message.CategoryIdContainer value) {
    if (categoryIdContainer_ != null &&
        categoryIdContainer_ != com.github.yeriomin.playstore.message.CategoryIdContainer.getDefaultInstance()) {
      categoryIdContainer_ =
        com.github.yeriomin.playstore.message.CategoryIdContainer.newBuilder(categoryIdContainer_).mergeFrom(value).buildPartial();
    } else {
      categoryIdContainer_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <code>optional .CategoryIdContainer categoryIdContainer = 5;</code>
   */
  private void clearCategoryIdContainer() {  categoryIdContainer_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeMessage(5, getCategoryIdContainer());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getCategoryIdContainer());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstore.message.UnknownCategoryContainer parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.UnknownCategoryContainer parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.UnknownCategoryContainer parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.UnknownCategoryContainer parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.UnknownCategoryContainer parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.UnknownCategoryContainer parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.UnknownCategoryContainer parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.UnknownCategoryContainer parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.UnknownCategoryContainer parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.UnknownCategoryContainer parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstore.message.UnknownCategoryContainer prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code UnknownCategoryContainer}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstore.message.UnknownCategoryContainer, Builder> implements
      // @@protoc_insertion_point(builder_implements:UnknownCategoryContainer)
      com.github.yeriomin.playstore.message.UnknownCategoryContainerOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.UnknownCategoryContainer.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional .CategoryIdContainer categoryIdContainer = 5;</code>
     */
    public boolean hasCategoryIdContainer() {
      return instance.hasCategoryIdContainer();
    }
    /**
     * <code>optional .CategoryIdContainer categoryIdContainer = 5;</code>
     */
    public com.github.yeriomin.playstore.message.CategoryIdContainer getCategoryIdContainer() {
      return instance.getCategoryIdContainer();
    }
    /**
     * <code>optional .CategoryIdContainer categoryIdContainer = 5;</code>
     */
    public Builder setCategoryIdContainer(com.github.yeriomin.playstore.message.CategoryIdContainer value) {
      copyOnWrite();
      instance.setCategoryIdContainer(value);
      return this;
      }
    /**
     * <code>optional .CategoryIdContainer categoryIdContainer = 5;</code>
     */
    public Builder setCategoryIdContainer(
        com.github.yeriomin.playstore.message.CategoryIdContainer.Builder builderForValue) {
      copyOnWrite();
      instance.setCategoryIdContainer(builderForValue);
      return this;
    }
    /**
     * <code>optional .CategoryIdContainer categoryIdContainer = 5;</code>
     */
    public Builder mergeCategoryIdContainer(com.github.yeriomin.playstore.message.CategoryIdContainer value) {
      copyOnWrite();
      instance.mergeCategoryIdContainer(value);
      return this;
    }
    /**
     * <code>optional .CategoryIdContainer categoryIdContainer = 5;</code>
     */
    public Builder clearCategoryIdContainer() {  copyOnWrite();
      instance.clearCategoryIdContainer();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:UnknownCategoryContainer)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstore.message.UnknownCategoryContainer();
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
        com.github.yeriomin.playstore.message.UnknownCategoryContainer other = (com.github.yeriomin.playstore.message.UnknownCategoryContainer) arg1;
        categoryIdContainer_ = visitor.visitMessage(categoryIdContainer_, other.categoryIdContainer_);
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
              case 42: {
                com.github.yeriomin.playstore.message.CategoryIdContainer.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = categoryIdContainer_.toBuilder();
                }
                categoryIdContainer_ = input.readMessage(com.github.yeriomin.playstore.message.CategoryIdContainer.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(categoryIdContainer_);
                  categoryIdContainer_ = subBuilder.buildPartial();
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstore.message.UnknownCategoryContainer.class) {
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


  // @@protoc_insertion_point(class_scope:UnknownCategoryContainer)
  private static final com.github.yeriomin.playstore.message.UnknownCategoryContainer DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new UnknownCategoryContainer();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstore.message.UnknownCategoryContainer getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<UnknownCategoryContainer> PARSER;

  public static com.google.protobuf.Parser<UnknownCategoryContainer> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

