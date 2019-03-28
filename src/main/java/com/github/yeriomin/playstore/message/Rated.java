// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

/**
 * Protobuf type {@code Rated}
 */
public  final class Rated extends
    com.google.protobuf.GeneratedMessageLite<
        Rated, Rated.Builder> implements
    // @@protoc_insertion_point(message_implements:Rated)
    RatedOrBuilder {
  private Rated() {
    label_ = "";
    learnMoreHtmlLink_ = "";
  }
  private int bitField0_;
  public static final int LABEL_FIELD_NUMBER = 1;
  private java.lang.String label_;
  /**
   * <code>optional string label = 1;</code>
   */
  public boolean hasLabel() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string label = 1;</code>
   */
  public java.lang.String getLabel() {
    return label_;
  }
  /**
   * <code>optional string label = 1;</code>
   */
  public com.google.protobuf.ByteString
      getLabelBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(label_);
  }
  /**
   * <code>optional string label = 1;</code>
   */
  private void setLabel(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    label_ = value;
  }
  /**
   * <code>optional string label = 1;</code>
   */
  private void clearLabel() {
    bitField0_ = (bitField0_ & ~0x00000001);
    label_ = getDefaultInstance().getLabel();
  }
  /**
   * <code>optional string label = 1;</code>
   */
  private void setLabelBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    label_ = value.toStringUtf8();
  }

  public static final int IMAGE_FIELD_NUMBER = 2;
  private com.github.yeriomin.playstore.message.Image image_;
  /**
   * <code>optional .Image image = 2;</code>
   */
  public boolean hasImage() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional .Image image = 2;</code>
   */
  public com.github.yeriomin.playstore.message.Image getImage() {
    return image_ == null ? com.github.yeriomin.playstore.message.Image.getDefaultInstance() : image_;
  }
  /**
   * <code>optional .Image image = 2;</code>
   */
  private void setImage(com.github.yeriomin.playstore.message.Image value) {
    if (value == null) {
      throw new NullPointerException();
    }
    image_ = value;
    bitField0_ |= 0x00000002;
    }
  /**
   * <code>optional .Image image = 2;</code>
   */
  private void setImage(
      com.github.yeriomin.playstore.message.Image.Builder builderForValue) {
    image_ = builderForValue.build();
    bitField0_ |= 0x00000002;
  }
  /**
   * <code>optional .Image image = 2;</code>
   */
  private void mergeImage(com.github.yeriomin.playstore.message.Image value) {
    if (image_ != null &&
        image_ != com.github.yeriomin.playstore.message.Image.getDefaultInstance()) {
      image_ =
        com.github.yeriomin.playstore.message.Image.newBuilder(image_).mergeFrom(value).buildPartial();
    } else {
      image_ = value;
    }
    bitField0_ |= 0x00000002;
  }
  /**
   * <code>optional .Image image = 2;</code>
   */
  private void clearImage() {  image_ = null;
    bitField0_ = (bitField0_ & ~0x00000002);
  }

  public static final int LEARNMOREHTMLLINK_FIELD_NUMBER = 4;
  private java.lang.String learnMoreHtmlLink_;
  /**
   * <code>optional string learnMoreHtmlLink = 4;</code>
   */
  public boolean hasLearnMoreHtmlLink() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional string learnMoreHtmlLink = 4;</code>
   */
  public java.lang.String getLearnMoreHtmlLink() {
    return learnMoreHtmlLink_;
  }
  /**
   * <code>optional string learnMoreHtmlLink = 4;</code>
   */
  public com.google.protobuf.ByteString
      getLearnMoreHtmlLinkBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(learnMoreHtmlLink_);
  }
  /**
   * <code>optional string learnMoreHtmlLink = 4;</code>
   */
  private void setLearnMoreHtmlLink(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
    learnMoreHtmlLink_ = value;
  }
  /**
   * <code>optional string learnMoreHtmlLink = 4;</code>
   */
  private void clearLearnMoreHtmlLink() {
    bitField0_ = (bitField0_ & ~0x00000004);
    learnMoreHtmlLink_ = getDefaultInstance().getLearnMoreHtmlLink();
  }
  /**
   * <code>optional string learnMoreHtmlLink = 4;</code>
   */
  private void setLearnMoreHtmlLinkBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
    learnMoreHtmlLink_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeString(1, getLabel());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeMessage(2, getImage());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeString(4, getLearnMoreHtmlLink());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getLabel());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getImage());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(4, getLearnMoreHtmlLink());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstore.message.Rated parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.Rated parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.Rated parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.Rated parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.Rated parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.Rated parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.Rated parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.Rated parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.Rated parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.Rated parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstore.message.Rated prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code Rated}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstore.message.Rated, Builder> implements
      // @@protoc_insertion_point(builder_implements:Rated)
      com.github.yeriomin.playstore.message.RatedOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.Rated.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional string label = 1;</code>
     */
    public boolean hasLabel() {
      return instance.hasLabel();
    }
    /**
     * <code>optional string label = 1;</code>
     */
    public java.lang.String getLabel() {
      return instance.getLabel();
    }
    /**
     * <code>optional string label = 1;</code>
     */
    public com.google.protobuf.ByteString
        getLabelBytes() {
      return instance.getLabelBytes();
    }
    /**
     * <code>optional string label = 1;</code>
     */
    public Builder setLabel(
        java.lang.String value) {
      copyOnWrite();
      instance.setLabel(value);
      return this;
    }
    /**
     * <code>optional string label = 1;</code>
     */
    public Builder clearLabel() {
      copyOnWrite();
      instance.clearLabel();
      return this;
    }
    /**
     * <code>optional string label = 1;</code>
     */
    public Builder setLabelBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setLabelBytes(value);
      return this;
    }

    /**
     * <code>optional .Image image = 2;</code>
     */
    public boolean hasImage() {
      return instance.hasImage();
    }
    /**
     * <code>optional .Image image = 2;</code>
     */
    public com.github.yeriomin.playstore.message.Image getImage() {
      return instance.getImage();
    }
    /**
     * <code>optional .Image image = 2;</code>
     */
    public Builder setImage(com.github.yeriomin.playstore.message.Image value) {
      copyOnWrite();
      instance.setImage(value);
      return this;
      }
    /**
     * <code>optional .Image image = 2;</code>
     */
    public Builder setImage(
        com.github.yeriomin.playstore.message.Image.Builder builderForValue) {
      copyOnWrite();
      instance.setImage(builderForValue);
      return this;
    }
    /**
     * <code>optional .Image image = 2;</code>
     */
    public Builder mergeImage(com.github.yeriomin.playstore.message.Image value) {
      copyOnWrite();
      instance.mergeImage(value);
      return this;
    }
    /**
     * <code>optional .Image image = 2;</code>
     */
    public Builder clearImage() {  copyOnWrite();
      instance.clearImage();
      return this;
    }

    /**
     * <code>optional string learnMoreHtmlLink = 4;</code>
     */
    public boolean hasLearnMoreHtmlLink() {
      return instance.hasLearnMoreHtmlLink();
    }
    /**
     * <code>optional string learnMoreHtmlLink = 4;</code>
     */
    public java.lang.String getLearnMoreHtmlLink() {
      return instance.getLearnMoreHtmlLink();
    }
    /**
     * <code>optional string learnMoreHtmlLink = 4;</code>
     */
    public com.google.protobuf.ByteString
        getLearnMoreHtmlLinkBytes() {
      return instance.getLearnMoreHtmlLinkBytes();
    }
    /**
     * <code>optional string learnMoreHtmlLink = 4;</code>
     */
    public Builder setLearnMoreHtmlLink(
        java.lang.String value) {
      copyOnWrite();
      instance.setLearnMoreHtmlLink(value);
      return this;
    }
    /**
     * <code>optional string learnMoreHtmlLink = 4;</code>
     */
    public Builder clearLearnMoreHtmlLink() {
      copyOnWrite();
      instance.clearLearnMoreHtmlLink();
      return this;
    }
    /**
     * <code>optional string learnMoreHtmlLink = 4;</code>
     */
    public Builder setLearnMoreHtmlLinkBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setLearnMoreHtmlLinkBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:Rated)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstore.message.Rated();
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
        com.github.yeriomin.playstore.message.Rated other = (com.github.yeriomin.playstore.message.Rated) arg1;
        label_ = visitor.visitString(
            hasLabel(), label_,
            other.hasLabel(), other.label_);
        image_ = visitor.visitMessage(image_, other.image_);
        learnMoreHtmlLink_ = visitor.visitString(
            hasLearnMoreHtmlLink(), learnMoreHtmlLink_,
            other.hasLearnMoreHtmlLink(), other.learnMoreHtmlLink_);
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
                label_ = s;
                break;
              }
              case 18: {
                com.github.yeriomin.playstore.message.Image.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = image_.toBuilder();
                }
                image_ = input.readMessage(com.github.yeriomin.playstore.message.Image.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(image_);
                  image_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
              case 34: {
                String s = input.readString();
                bitField0_ |= 0x00000004;
                learnMoreHtmlLink_ = s;
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstore.message.Rated.class) {
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


  // @@protoc_insertion_point(class_scope:Rated)
  private static final com.github.yeriomin.playstore.message.Rated DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Rated();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstore.message.Rated getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Rated> PARSER;

  public static com.google.protobuf.Parser<Rated> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
