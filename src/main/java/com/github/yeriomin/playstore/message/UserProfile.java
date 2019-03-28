// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

/**
 * Protobuf type {@code UserProfile}
 */
public  final class UserProfile extends
    com.google.protobuf.GeneratedMessageLite<
        UserProfile, UserProfile.Builder> implements
    // @@protoc_insertion_point(message_implements:UserProfile)
    UserProfileOrBuilder {
  private UserProfile() {
    personIdString_ = "";
    personId_ = "";
    name_ = "";
    image_ = emptyProtobufList();
    googlePlusUrl_ = "";
    googlePlusTagline_ = "";
  }
  private int bitField0_;
  public static final int PERSONIDSTRING_FIELD_NUMBER = 1;
  private java.lang.String personIdString_;
  /**
   * <code>optional string personIdString = 1;</code>
   */
  public boolean hasPersonIdString() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string personIdString = 1;</code>
   */
  public java.lang.String getPersonIdString() {
    return personIdString_;
  }
  /**
   * <code>optional string personIdString = 1;</code>
   */
  public com.google.protobuf.ByteString
      getPersonIdStringBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(personIdString_);
  }
  /**
   * <code>optional string personIdString = 1;</code>
   */
  private void setPersonIdString(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    personIdString_ = value;
  }
  /**
   * <code>optional string personIdString = 1;</code>
   */
  private void clearPersonIdString() {
    bitField0_ = (bitField0_ & ~0x00000001);
    personIdString_ = getDefaultInstance().getPersonIdString();
  }
  /**
   * <code>optional string personIdString = 1;</code>
   */
  private void setPersonIdStringBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    personIdString_ = value.toStringUtf8();
  }

  public static final int PERSONID_FIELD_NUMBER = 2;
  private java.lang.String personId_;
  /**
   * <code>optional string personId = 2;</code>
   */
  public boolean hasPersonId() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional string personId = 2;</code>
   */
  public java.lang.String getPersonId() {
    return personId_;
  }
  /**
   * <code>optional string personId = 2;</code>
   */
  public com.google.protobuf.ByteString
      getPersonIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(personId_);
  }
  /**
   * <code>optional string personId = 2;</code>
   */
  private void setPersonId(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
    personId_ = value;
  }
  /**
   * <code>optional string personId = 2;</code>
   */
  private void clearPersonId() {
    bitField0_ = (bitField0_ & ~0x00000002);
    personId_ = getDefaultInstance().getPersonId();
  }
  /**
   * <code>optional string personId = 2;</code>
   */
  private void setPersonIdBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
    personId_ = value.toStringUtf8();
  }

  public static final int UNKNOWN1_FIELD_NUMBER = 3;
  private int unknown1_;
  /**
   * <code>optional int32 unknown1 = 3;</code>
   */
  public boolean hasUnknown1() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional int32 unknown1 = 3;</code>
   */
  public int getUnknown1() {
    return unknown1_;
  }
  /**
   * <code>optional int32 unknown1 = 3;</code>
   */
  private void setUnknown1(int value) {
    bitField0_ |= 0x00000004;
    unknown1_ = value;
  }
  /**
   * <code>optional int32 unknown1 = 3;</code>
   */
  private void clearUnknown1() {
    bitField0_ = (bitField0_ & ~0x00000004);
    unknown1_ = 0;
  }

  public static final int UNKNOWN2_FIELD_NUMBER = 4;
  private int unknown2_;
  /**
   * <code>optional int32 unknown2 = 4;</code>
   */
  public boolean hasUnknown2() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>optional int32 unknown2 = 4;</code>
   */
  public int getUnknown2() {
    return unknown2_;
  }
  /**
   * <code>optional int32 unknown2 = 4;</code>
   */
  private void setUnknown2(int value) {
    bitField0_ |= 0x00000008;
    unknown2_ = value;
  }
  /**
   * <code>optional int32 unknown2 = 4;</code>
   */
  private void clearUnknown2() {
    bitField0_ = (bitField0_ & ~0x00000008);
    unknown2_ = 0;
  }

  public static final int NAME_FIELD_NUMBER = 5;
  private java.lang.String name_;
  /**
   * <code>optional string name = 5;</code>
   */
  public boolean hasName() {
    return ((bitField0_ & 0x00000010) == 0x00000010);
  }
  /**
   * <code>optional string name = 5;</code>
   */
  public java.lang.String getName() {
    return name_;
  }
  /**
   * <code>optional string name = 5;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(name_);
  }
  /**
   * <code>optional string name = 5;</code>
   */
  private void setName(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
    name_ = value;
  }
  /**
   * <code>optional string name = 5;</code>
   */
  private void clearName() {
    bitField0_ = (bitField0_ & ~0x00000010);
    name_ = getDefaultInstance().getName();
  }
  /**
   * <code>optional string name = 5;</code>
   */
  private void setNameBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
    name_ = value.toStringUtf8();
  }

  public static final int IMAGE_FIELD_NUMBER = 10;
  private com.google.protobuf.Internal.ProtobufList<com.github.yeriomin.playstore.message.Image> image_;
  /**
   * <code>repeated .Image image = 10;</code>
   */
  public java.util.List<com.github.yeriomin.playstore.message.Image> getImageList() {
    return image_;
  }
  /**
   * <code>repeated .Image image = 10;</code>
   */
  public java.util.List<? extends com.github.yeriomin.playstore.message.ImageOrBuilder> 
      getImageOrBuilderList() {
    return image_;
  }
  /**
   * <code>repeated .Image image = 10;</code>
   */
  public int getImageCount() {
    return image_.size();
  }
  /**
   * <code>repeated .Image image = 10;</code>
   */
  public com.github.yeriomin.playstore.message.Image getImage(int index) {
    return image_.get(index);
  }
  /**
   * <code>repeated .Image image = 10;</code>
   */
  public com.github.yeriomin.playstore.message.ImageOrBuilder getImageOrBuilder(
      int index) {
    return image_.get(index);
  }
  private void ensureImageIsMutable() {
    if (!image_.isModifiable()) {
      image_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(image_);
     }
  }

  /**
   * <code>repeated .Image image = 10;</code>
   */
  private void setImage(
      int index, com.github.yeriomin.playstore.message.Image value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureImageIsMutable();
    image_.set(index, value);
  }
  /**
   * <code>repeated .Image image = 10;</code>
   */
  private void setImage(
      int index, com.github.yeriomin.playstore.message.Image.Builder builderForValue) {
    ensureImageIsMutable();
    image_.set(index, builderForValue.build());
  }
  /**
   * <code>repeated .Image image = 10;</code>
   */
  private void addImage(com.github.yeriomin.playstore.message.Image value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureImageIsMutable();
    image_.add(value);
  }
  /**
   * <code>repeated .Image image = 10;</code>
   */
  private void addImage(
      int index, com.github.yeriomin.playstore.message.Image value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureImageIsMutable();
    image_.add(index, value);
  }
  /**
   * <code>repeated .Image image = 10;</code>
   */
  private void addImage(
      com.github.yeriomin.playstore.message.Image.Builder builderForValue) {
    ensureImageIsMutable();
    image_.add(builderForValue.build());
  }
  /**
   * <code>repeated .Image image = 10;</code>
   */
  private void addImage(
      int index, com.github.yeriomin.playstore.message.Image.Builder builderForValue) {
    ensureImageIsMutable();
    image_.add(index, builderForValue.build());
  }
  /**
   * <code>repeated .Image image = 10;</code>
   */
  private void addAllImage(
      java.lang.Iterable<? extends com.github.yeriomin.playstore.message.Image> values) {
    ensureImageIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, image_);
  }
  /**
   * <code>repeated .Image image = 10;</code>
   */
  private void clearImage() {
    image_ = emptyProtobufList();
  }
  /**
   * <code>repeated .Image image = 10;</code>
   */
  private void removeImage(int index) {
    ensureImageIsMutable();
    image_.remove(index);
  }

  public static final int GOOGLEPLUSURL_FIELD_NUMBER = 19;
  private java.lang.String googlePlusUrl_;
  /**
   * <code>optional string googlePlusUrl = 19;</code>
   */
  public boolean hasGooglePlusUrl() {
    return ((bitField0_ & 0x00000020) == 0x00000020);
  }
  /**
   * <code>optional string googlePlusUrl = 19;</code>
   */
  public java.lang.String getGooglePlusUrl() {
    return googlePlusUrl_;
  }
  /**
   * <code>optional string googlePlusUrl = 19;</code>
   */
  public com.google.protobuf.ByteString
      getGooglePlusUrlBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(googlePlusUrl_);
  }
  /**
   * <code>optional string googlePlusUrl = 19;</code>
   */
  private void setGooglePlusUrl(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
    googlePlusUrl_ = value;
  }
  /**
   * <code>optional string googlePlusUrl = 19;</code>
   */
  private void clearGooglePlusUrl() {
    bitField0_ = (bitField0_ & ~0x00000020);
    googlePlusUrl_ = getDefaultInstance().getGooglePlusUrl();
  }
  /**
   * <code>optional string googlePlusUrl = 19;</code>
   */
  private void setGooglePlusUrlBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
    googlePlusUrl_ = value.toStringUtf8();
  }

  public static final int GOOGLEPLUSTAGLINE_FIELD_NUMBER = 22;
  private java.lang.String googlePlusTagline_;
  /**
   * <code>optional string googlePlusTagline = 22;</code>
   */
  public boolean hasGooglePlusTagline() {
    return ((bitField0_ & 0x00000040) == 0x00000040);
  }
  /**
   * <code>optional string googlePlusTagline = 22;</code>
   */
  public java.lang.String getGooglePlusTagline() {
    return googlePlusTagline_;
  }
  /**
   * <code>optional string googlePlusTagline = 22;</code>
   */
  public com.google.protobuf.ByteString
      getGooglePlusTaglineBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(googlePlusTagline_);
  }
  /**
   * <code>optional string googlePlusTagline = 22;</code>
   */
  private void setGooglePlusTagline(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
    googlePlusTagline_ = value;
  }
  /**
   * <code>optional string googlePlusTagline = 22;</code>
   */
  private void clearGooglePlusTagline() {
    bitField0_ = (bitField0_ & ~0x00000040);
    googlePlusTagline_ = getDefaultInstance().getGooglePlusTagline();
  }
  /**
   * <code>optional string googlePlusTagline = 22;</code>
   */
  private void setGooglePlusTaglineBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
    googlePlusTagline_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeString(1, getPersonIdString());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeString(2, getPersonId());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeInt32(3, unknown1_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeInt32(4, unknown2_);
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      output.writeString(5, getName());
    }
    for (int i = 0; i < image_.size(); i++) {
      output.writeMessage(10, image_.get(i));
    }
    if (((bitField0_ & 0x00000020) == 0x00000020)) {
      output.writeString(19, getGooglePlusUrl());
    }
    if (((bitField0_ & 0x00000040) == 0x00000040)) {
      output.writeString(22, getGooglePlusTagline());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getPersonIdString());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getPersonId());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, unknown1_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, unknown2_);
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(5, getName());
    }
    for (int i = 0; i < image_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(10, image_.get(i));
    }
    if (((bitField0_ & 0x00000020) == 0x00000020)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(19, getGooglePlusUrl());
    }
    if (((bitField0_ & 0x00000040) == 0x00000040)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(22, getGooglePlusTagline());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstore.message.UserProfile parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.UserProfile parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.UserProfile parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.UserProfile parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.UserProfile parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.UserProfile parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.UserProfile parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.UserProfile parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.UserProfile parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.UserProfile parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstore.message.UserProfile prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code UserProfile}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstore.message.UserProfile, Builder> implements
      // @@protoc_insertion_point(builder_implements:UserProfile)
      com.github.yeriomin.playstore.message.UserProfileOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.UserProfile.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional string personIdString = 1;</code>
     */
    public boolean hasPersonIdString() {
      return instance.hasPersonIdString();
    }
    /**
     * <code>optional string personIdString = 1;</code>
     */
    public java.lang.String getPersonIdString() {
      return instance.getPersonIdString();
    }
    /**
     * <code>optional string personIdString = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPersonIdStringBytes() {
      return instance.getPersonIdStringBytes();
    }
    /**
     * <code>optional string personIdString = 1;</code>
     */
    public Builder setPersonIdString(
        java.lang.String value) {
      copyOnWrite();
      instance.setPersonIdString(value);
      return this;
    }
    /**
     * <code>optional string personIdString = 1;</code>
     */
    public Builder clearPersonIdString() {
      copyOnWrite();
      instance.clearPersonIdString();
      return this;
    }
    /**
     * <code>optional string personIdString = 1;</code>
     */
    public Builder setPersonIdStringBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setPersonIdStringBytes(value);
      return this;
    }

    /**
     * <code>optional string personId = 2;</code>
     */
    public boolean hasPersonId() {
      return instance.hasPersonId();
    }
    /**
     * <code>optional string personId = 2;</code>
     */
    public java.lang.String getPersonId() {
      return instance.getPersonId();
    }
    /**
     * <code>optional string personId = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPersonIdBytes() {
      return instance.getPersonIdBytes();
    }
    /**
     * <code>optional string personId = 2;</code>
     */
    public Builder setPersonId(
        java.lang.String value) {
      copyOnWrite();
      instance.setPersonId(value);
      return this;
    }
    /**
     * <code>optional string personId = 2;</code>
     */
    public Builder clearPersonId() {
      copyOnWrite();
      instance.clearPersonId();
      return this;
    }
    /**
     * <code>optional string personId = 2;</code>
     */
    public Builder setPersonIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setPersonIdBytes(value);
      return this;
    }

    /**
     * <code>optional int32 unknown1 = 3;</code>
     */
    public boolean hasUnknown1() {
      return instance.hasUnknown1();
    }
    /**
     * <code>optional int32 unknown1 = 3;</code>
     */
    public int getUnknown1() {
      return instance.getUnknown1();
    }
    /**
     * <code>optional int32 unknown1 = 3;</code>
     */
    public Builder setUnknown1(int value) {
      copyOnWrite();
      instance.setUnknown1(value);
      return this;
    }
    /**
     * <code>optional int32 unknown1 = 3;</code>
     */
    public Builder clearUnknown1() {
      copyOnWrite();
      instance.clearUnknown1();
      return this;
    }

    /**
     * <code>optional int32 unknown2 = 4;</code>
     */
    public boolean hasUnknown2() {
      return instance.hasUnknown2();
    }
    /**
     * <code>optional int32 unknown2 = 4;</code>
     */
    public int getUnknown2() {
      return instance.getUnknown2();
    }
    /**
     * <code>optional int32 unknown2 = 4;</code>
     */
    public Builder setUnknown2(int value) {
      copyOnWrite();
      instance.setUnknown2(value);
      return this;
    }
    /**
     * <code>optional int32 unknown2 = 4;</code>
     */
    public Builder clearUnknown2() {
      copyOnWrite();
      instance.clearUnknown2();
      return this;
    }

    /**
     * <code>optional string name = 5;</code>
     */
    public boolean hasName() {
      return instance.hasName();
    }
    /**
     * <code>optional string name = 5;</code>
     */
    public java.lang.String getName() {
      return instance.getName();
    }
    /**
     * <code>optional string name = 5;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      return instance.getNameBytes();
    }
    /**
     * <code>optional string name = 5;</code>
     */
    public Builder setName(
        java.lang.String value) {
      copyOnWrite();
      instance.setName(value);
      return this;
    }
    /**
     * <code>optional string name = 5;</code>
     */
    public Builder clearName() {
      copyOnWrite();
      instance.clearName();
      return this;
    }
    /**
     * <code>optional string name = 5;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setNameBytes(value);
      return this;
    }

    /**
     * <code>repeated .Image image = 10;</code>
     */
    public java.util.List<com.github.yeriomin.playstore.message.Image> getImageList() {
      return java.util.Collections.unmodifiableList(
          instance.getImageList());
    }
    /**
     * <code>repeated .Image image = 10;</code>
     */
    public int getImageCount() {
      return instance.getImageCount();
    }/**
     * <code>repeated .Image image = 10;</code>
     */
    public com.github.yeriomin.playstore.message.Image getImage(int index) {
      return instance.getImage(index);
    }
    /**
     * <code>repeated .Image image = 10;</code>
     */
    public Builder setImage(
        int index, com.github.yeriomin.playstore.message.Image value) {
      copyOnWrite();
      instance.setImage(index, value);
      return this;
    }
    /**
     * <code>repeated .Image image = 10;</code>
     */
    public Builder setImage(
        int index, com.github.yeriomin.playstore.message.Image.Builder builderForValue) {
      copyOnWrite();
      instance.setImage(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .Image image = 10;</code>
     */
    public Builder addImage(com.github.yeriomin.playstore.message.Image value) {
      copyOnWrite();
      instance.addImage(value);
      return this;
    }
    /**
     * <code>repeated .Image image = 10;</code>
     */
    public Builder addImage(
        int index, com.github.yeriomin.playstore.message.Image value) {
      copyOnWrite();
      instance.addImage(index, value);
      return this;
    }
    /**
     * <code>repeated .Image image = 10;</code>
     */
    public Builder addImage(
        com.github.yeriomin.playstore.message.Image.Builder builderForValue) {
      copyOnWrite();
      instance.addImage(builderForValue);
      return this;
    }
    /**
     * <code>repeated .Image image = 10;</code>
     */
    public Builder addImage(
        int index, com.github.yeriomin.playstore.message.Image.Builder builderForValue) {
      copyOnWrite();
      instance.addImage(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .Image image = 10;</code>
     */
    public Builder addAllImage(
        java.lang.Iterable<? extends com.github.yeriomin.playstore.message.Image> values) {
      copyOnWrite();
      instance.addAllImage(values);
      return this;
    }
    /**
     * <code>repeated .Image image = 10;</code>
     */
    public Builder clearImage() {
      copyOnWrite();
      instance.clearImage();
      return this;
    }
    /**
     * <code>repeated .Image image = 10;</code>
     */
    public Builder removeImage(int index) {
      copyOnWrite();
      instance.removeImage(index);
      return this;
    }

    /**
     * <code>optional string googlePlusUrl = 19;</code>
     */
    public boolean hasGooglePlusUrl() {
      return instance.hasGooglePlusUrl();
    }
    /**
     * <code>optional string googlePlusUrl = 19;</code>
     */
    public java.lang.String getGooglePlusUrl() {
      return instance.getGooglePlusUrl();
    }
    /**
     * <code>optional string googlePlusUrl = 19;</code>
     */
    public com.google.protobuf.ByteString
        getGooglePlusUrlBytes() {
      return instance.getGooglePlusUrlBytes();
    }
    /**
     * <code>optional string googlePlusUrl = 19;</code>
     */
    public Builder setGooglePlusUrl(
        java.lang.String value) {
      copyOnWrite();
      instance.setGooglePlusUrl(value);
      return this;
    }
    /**
     * <code>optional string googlePlusUrl = 19;</code>
     */
    public Builder clearGooglePlusUrl() {
      copyOnWrite();
      instance.clearGooglePlusUrl();
      return this;
    }
    /**
     * <code>optional string googlePlusUrl = 19;</code>
     */
    public Builder setGooglePlusUrlBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setGooglePlusUrlBytes(value);
      return this;
    }

    /**
     * <code>optional string googlePlusTagline = 22;</code>
     */
    public boolean hasGooglePlusTagline() {
      return instance.hasGooglePlusTagline();
    }
    /**
     * <code>optional string googlePlusTagline = 22;</code>
     */
    public java.lang.String getGooglePlusTagline() {
      return instance.getGooglePlusTagline();
    }
    /**
     * <code>optional string googlePlusTagline = 22;</code>
     */
    public com.google.protobuf.ByteString
        getGooglePlusTaglineBytes() {
      return instance.getGooglePlusTaglineBytes();
    }
    /**
     * <code>optional string googlePlusTagline = 22;</code>
     */
    public Builder setGooglePlusTagline(
        java.lang.String value) {
      copyOnWrite();
      instance.setGooglePlusTagline(value);
      return this;
    }
    /**
     * <code>optional string googlePlusTagline = 22;</code>
     */
    public Builder clearGooglePlusTagline() {
      copyOnWrite();
      instance.clearGooglePlusTagline();
      return this;
    }
    /**
     * <code>optional string googlePlusTagline = 22;</code>
     */
    public Builder setGooglePlusTaglineBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setGooglePlusTaglineBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:UserProfile)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstore.message.UserProfile();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        image_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.github.yeriomin.playstore.message.UserProfile other = (com.github.yeriomin.playstore.message.UserProfile) arg1;
        personIdString_ = visitor.visitString(
            hasPersonIdString(), personIdString_,
            other.hasPersonIdString(), other.personIdString_);
        personId_ = visitor.visitString(
            hasPersonId(), personId_,
            other.hasPersonId(), other.personId_);
        unknown1_ = visitor.visitInt(
            hasUnknown1(), unknown1_,
            other.hasUnknown1(), other.unknown1_);
        unknown2_ = visitor.visitInt(
            hasUnknown2(), unknown2_,
            other.hasUnknown2(), other.unknown2_);
        name_ = visitor.visitString(
            hasName(), name_,
            other.hasName(), other.name_);
        image_= visitor.visitList(image_, other.image_);
        googlePlusUrl_ = visitor.visitString(
            hasGooglePlusUrl(), googlePlusUrl_,
            other.hasGooglePlusUrl(), other.googlePlusUrl_);
        googlePlusTagline_ = visitor.visitString(
            hasGooglePlusTagline(), googlePlusTagline_,
            other.hasGooglePlusTagline(), other.googlePlusTagline_);
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
                personIdString_ = s;
                break;
              }
              case 18: {
                String s = input.readString();
                bitField0_ |= 0x00000002;
                personId_ = s;
                break;
              }
              case 24: {
                bitField0_ |= 0x00000004;
                unknown1_ = input.readInt32();
                break;
              }
              case 32: {
                bitField0_ |= 0x00000008;
                unknown2_ = input.readInt32();
                break;
              }
              case 42: {
                String s = input.readString();
                bitField0_ |= 0x00000010;
                name_ = s;
                break;
              }
              case 82: {
                if (!image_.isModifiable()) {
                  image_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(image_);
                }
                image_.add(
                    input.readMessage(com.github.yeriomin.playstore.message.Image.parser(), extensionRegistry));
                break;
              }
              case 154: {
                String s = input.readString();
                bitField0_ |= 0x00000020;
                googlePlusUrl_ = s;
                break;
              }
              case 178: {
                String s = input.readString();
                bitField0_ |= 0x00000040;
                googlePlusTagline_ = s;
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstore.message.UserProfile.class) {
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


  // @@protoc_insertion_point(class_scope:UserProfile)
  private static final com.github.yeriomin.playstore.message.UserProfile DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new UserProfile();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstore.message.UserProfile getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<UserProfile> PARSER;

  public static com.google.protobuf.Parser<UserProfile> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
