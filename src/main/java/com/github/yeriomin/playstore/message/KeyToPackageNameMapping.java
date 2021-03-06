// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

/**
 * Protobuf type {@code KeyToPackageNameMapping}
 */
public  final class KeyToPackageNameMapping extends
    com.google.protobuf.GeneratedMessageLite<
        KeyToPackageNameMapping, KeyToPackageNameMapping.Builder> implements
    // @@protoc_insertion_point(message_implements:KeyToPackageNameMapping)
    KeyToPackageNameMappingOrBuilder {
  private KeyToPackageNameMapping() {
    uidName_ = "";
    sharedPackageList_ = emptyProtobufList();
  }
  private int bitField0_;
  public static final int PACKAGEKEY_FIELD_NUMBER = 1;
  private int packageKey_;
  /**
   * <code>optional int32 packageKey = 1;</code>
   */
  public boolean hasPackageKey() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional int32 packageKey = 1;</code>
   */
  public int getPackageKey() {
    return packageKey_;
  }
  /**
   * <code>optional int32 packageKey = 1;</code>
   */
  private void setPackageKey(int value) {
    bitField0_ |= 0x00000001;
    packageKey_ = value;
  }
  /**
   * <code>optional int32 packageKey = 1;</code>
   */
  private void clearPackageKey() {
    bitField0_ = (bitField0_ & ~0x00000001);
    packageKey_ = 0;
  }

  public static final int UIDNAME_FIELD_NUMBER = 2;
  private java.lang.String uidName_;
  /**
   * <code>optional string uidName = 2;</code>
   */
  public boolean hasUidName() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional string uidName = 2;</code>
   */
  public java.lang.String getUidName() {
    return uidName_;
  }
  /**
   * <code>optional string uidName = 2;</code>
   */
  public com.google.protobuf.ByteString
      getUidNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(uidName_);
  }
  /**
   * <code>optional string uidName = 2;</code>
   */
  private void setUidName(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
    uidName_ = value;
  }
  /**
   * <code>optional string uidName = 2;</code>
   */
  private void clearUidName() {
    bitField0_ = (bitField0_ & ~0x00000002);
    uidName_ = getDefaultInstance().getUidName();
  }
  /**
   * <code>optional string uidName = 2;</code>
   */
  private void setUidNameBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
    uidName_ = value.toStringUtf8();
  }

  public static final int SHAREDPACKAGELIST_FIELD_NUMBER = 3;
  private com.google.protobuf.Internal.ProtobufList<com.github.yeriomin.playstore.message.PackageInfo> sharedPackageList_;
  /**
   * <code>repeated .PackageInfo sharedPackageList = 3;</code>
   */
  public java.util.List<com.github.yeriomin.playstore.message.PackageInfo> getSharedPackageListList() {
    return sharedPackageList_;
  }
  /**
   * <code>repeated .PackageInfo sharedPackageList = 3;</code>
   */
  public java.util.List<? extends com.github.yeriomin.playstore.message.PackageInfoOrBuilder> 
      getSharedPackageListOrBuilderList() {
    return sharedPackageList_;
  }
  /**
   * <code>repeated .PackageInfo sharedPackageList = 3;</code>
   */
  public int getSharedPackageListCount() {
    return sharedPackageList_.size();
  }
  /**
   * <code>repeated .PackageInfo sharedPackageList = 3;</code>
   */
  public com.github.yeriomin.playstore.message.PackageInfo getSharedPackageList(int index) {
    return sharedPackageList_.get(index);
  }
  /**
   * <code>repeated .PackageInfo sharedPackageList = 3;</code>
   */
  public com.github.yeriomin.playstore.message.PackageInfoOrBuilder getSharedPackageListOrBuilder(
      int index) {
    return sharedPackageList_.get(index);
  }
  private void ensureSharedPackageListIsMutable() {
    if (!sharedPackageList_.isModifiable()) {
      sharedPackageList_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(sharedPackageList_);
     }
  }

  /**
   * <code>repeated .PackageInfo sharedPackageList = 3;</code>
   */
  private void setSharedPackageList(
      int index, com.github.yeriomin.playstore.message.PackageInfo value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureSharedPackageListIsMutable();
    sharedPackageList_.set(index, value);
  }
  /**
   * <code>repeated .PackageInfo sharedPackageList = 3;</code>
   */
  private void setSharedPackageList(
      int index, com.github.yeriomin.playstore.message.PackageInfo.Builder builderForValue) {
    ensureSharedPackageListIsMutable();
    sharedPackageList_.set(index, builderForValue.build());
  }
  /**
   * <code>repeated .PackageInfo sharedPackageList = 3;</code>
   */
  private void addSharedPackageList(com.github.yeriomin.playstore.message.PackageInfo value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureSharedPackageListIsMutable();
    sharedPackageList_.add(value);
  }
  /**
   * <code>repeated .PackageInfo sharedPackageList = 3;</code>
   */
  private void addSharedPackageList(
      int index, com.github.yeriomin.playstore.message.PackageInfo value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureSharedPackageListIsMutable();
    sharedPackageList_.add(index, value);
  }
  /**
   * <code>repeated .PackageInfo sharedPackageList = 3;</code>
   */
  private void addSharedPackageList(
      com.github.yeriomin.playstore.message.PackageInfo.Builder builderForValue) {
    ensureSharedPackageListIsMutable();
    sharedPackageList_.add(builderForValue.build());
  }
  /**
   * <code>repeated .PackageInfo sharedPackageList = 3;</code>
   */
  private void addSharedPackageList(
      int index, com.github.yeriomin.playstore.message.PackageInfo.Builder builderForValue) {
    ensureSharedPackageListIsMutable();
    sharedPackageList_.add(index, builderForValue.build());
  }
  /**
   * <code>repeated .PackageInfo sharedPackageList = 3;</code>
   */
  private void addAllSharedPackageList(
      java.lang.Iterable<? extends com.github.yeriomin.playstore.message.PackageInfo> values) {
    ensureSharedPackageListIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, sharedPackageList_);
  }
  /**
   * <code>repeated .PackageInfo sharedPackageList = 3;</code>
   */
  private void clearSharedPackageList() {
    sharedPackageList_ = emptyProtobufList();
  }
  /**
   * <code>repeated .PackageInfo sharedPackageList = 3;</code>
   */
  private void removeSharedPackageList(int index) {
    ensureSharedPackageListIsMutable();
    sharedPackageList_.remove(index);
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeInt32(1, packageKey_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeString(2, getUidName());
    }
    for (int i = 0; i < sharedPackageList_.size(); i++) {
      output.writeMessage(3, sharedPackageList_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, packageKey_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getUidName());
    }
    for (int i = 0; i < sharedPackageList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, sharedPackageList_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstore.message.KeyToPackageNameMapping parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.KeyToPackageNameMapping parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.KeyToPackageNameMapping parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.KeyToPackageNameMapping parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.KeyToPackageNameMapping parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.KeyToPackageNameMapping parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.KeyToPackageNameMapping parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.KeyToPackageNameMapping parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.KeyToPackageNameMapping parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.KeyToPackageNameMapping parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstore.message.KeyToPackageNameMapping prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code KeyToPackageNameMapping}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstore.message.KeyToPackageNameMapping, Builder> implements
      // @@protoc_insertion_point(builder_implements:KeyToPackageNameMapping)
      com.github.yeriomin.playstore.message.KeyToPackageNameMappingOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.KeyToPackageNameMapping.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional int32 packageKey = 1;</code>
     */
    public boolean hasPackageKey() {
      return instance.hasPackageKey();
    }
    /**
     * <code>optional int32 packageKey = 1;</code>
     */
    public int getPackageKey() {
      return instance.getPackageKey();
    }
    /**
     * <code>optional int32 packageKey = 1;</code>
     */
    public Builder setPackageKey(int value) {
      copyOnWrite();
      instance.setPackageKey(value);
      return this;
    }
    /**
     * <code>optional int32 packageKey = 1;</code>
     */
    public Builder clearPackageKey() {
      copyOnWrite();
      instance.clearPackageKey();
      return this;
    }

    /**
     * <code>optional string uidName = 2;</code>
     */
    public boolean hasUidName() {
      return instance.hasUidName();
    }
    /**
     * <code>optional string uidName = 2;</code>
     */
    public java.lang.String getUidName() {
      return instance.getUidName();
    }
    /**
     * <code>optional string uidName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getUidNameBytes() {
      return instance.getUidNameBytes();
    }
    /**
     * <code>optional string uidName = 2;</code>
     */
    public Builder setUidName(
        java.lang.String value) {
      copyOnWrite();
      instance.setUidName(value);
      return this;
    }
    /**
     * <code>optional string uidName = 2;</code>
     */
    public Builder clearUidName() {
      copyOnWrite();
      instance.clearUidName();
      return this;
    }
    /**
     * <code>optional string uidName = 2;</code>
     */
    public Builder setUidNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setUidNameBytes(value);
      return this;
    }

    /**
     * <code>repeated .PackageInfo sharedPackageList = 3;</code>
     */
    public java.util.List<com.github.yeriomin.playstore.message.PackageInfo> getSharedPackageListList() {
      return java.util.Collections.unmodifiableList(
          instance.getSharedPackageListList());
    }
    /**
     * <code>repeated .PackageInfo sharedPackageList = 3;</code>
     */
    public int getSharedPackageListCount() {
      return instance.getSharedPackageListCount();
    }/**
     * <code>repeated .PackageInfo sharedPackageList = 3;</code>
     */
    public com.github.yeriomin.playstore.message.PackageInfo getSharedPackageList(int index) {
      return instance.getSharedPackageList(index);
    }
    /**
     * <code>repeated .PackageInfo sharedPackageList = 3;</code>
     */
    public Builder setSharedPackageList(
        int index, com.github.yeriomin.playstore.message.PackageInfo value) {
      copyOnWrite();
      instance.setSharedPackageList(index, value);
      return this;
    }
    /**
     * <code>repeated .PackageInfo sharedPackageList = 3;</code>
     */
    public Builder setSharedPackageList(
        int index, com.github.yeriomin.playstore.message.PackageInfo.Builder builderForValue) {
      copyOnWrite();
      instance.setSharedPackageList(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .PackageInfo sharedPackageList = 3;</code>
     */
    public Builder addSharedPackageList(com.github.yeriomin.playstore.message.PackageInfo value) {
      copyOnWrite();
      instance.addSharedPackageList(value);
      return this;
    }
    /**
     * <code>repeated .PackageInfo sharedPackageList = 3;</code>
     */
    public Builder addSharedPackageList(
        int index, com.github.yeriomin.playstore.message.PackageInfo value) {
      copyOnWrite();
      instance.addSharedPackageList(index, value);
      return this;
    }
    /**
     * <code>repeated .PackageInfo sharedPackageList = 3;</code>
     */
    public Builder addSharedPackageList(
        com.github.yeriomin.playstore.message.PackageInfo.Builder builderForValue) {
      copyOnWrite();
      instance.addSharedPackageList(builderForValue);
      return this;
    }
    /**
     * <code>repeated .PackageInfo sharedPackageList = 3;</code>
     */
    public Builder addSharedPackageList(
        int index, com.github.yeriomin.playstore.message.PackageInfo.Builder builderForValue) {
      copyOnWrite();
      instance.addSharedPackageList(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .PackageInfo sharedPackageList = 3;</code>
     */
    public Builder addAllSharedPackageList(
        java.lang.Iterable<? extends com.github.yeriomin.playstore.message.PackageInfo> values) {
      copyOnWrite();
      instance.addAllSharedPackageList(values);
      return this;
    }
    /**
     * <code>repeated .PackageInfo sharedPackageList = 3;</code>
     */
    public Builder clearSharedPackageList() {
      copyOnWrite();
      instance.clearSharedPackageList();
      return this;
    }
    /**
     * <code>repeated .PackageInfo sharedPackageList = 3;</code>
     */
    public Builder removeSharedPackageList(int index) {
      copyOnWrite();
      instance.removeSharedPackageList(index);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:KeyToPackageNameMapping)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstore.message.KeyToPackageNameMapping();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        sharedPackageList_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.github.yeriomin.playstore.message.KeyToPackageNameMapping other = (com.github.yeriomin.playstore.message.KeyToPackageNameMapping) arg1;
        packageKey_ = visitor.visitInt(
            hasPackageKey(), packageKey_,
            other.hasPackageKey(), other.packageKey_);
        uidName_ = visitor.visitString(
            hasUidName(), uidName_,
            other.hasUidName(), other.uidName_);
        sharedPackageList_= visitor.visitList(sharedPackageList_, other.sharedPackageList_);
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
                packageKey_ = input.readInt32();
                break;
              }
              case 18: {
                String s = input.readString();
                bitField0_ |= 0x00000002;
                uidName_ = s;
                break;
              }
              case 26: {
                if (!sharedPackageList_.isModifiable()) {
                  sharedPackageList_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(sharedPackageList_);
                }
                sharedPackageList_.add(
                    input.readMessage(com.github.yeriomin.playstore.message.PackageInfo.parser(), extensionRegistry));
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstore.message.KeyToPackageNameMapping.class) {
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


  // @@protoc_insertion_point(class_scope:KeyToPackageNameMapping)
  private static final com.github.yeriomin.playstore.message.KeyToPackageNameMapping DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new KeyToPackageNameMapping();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstore.message.KeyToPackageNameMapping getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<KeyToPackageNameMapping> PARSER;

  public static com.google.protobuf.Parser<KeyToPackageNameMapping> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

