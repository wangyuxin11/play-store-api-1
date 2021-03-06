// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

/**
 * Protobuf type {@code Dependency}
 */
public  final class Dependency extends
    com.google.protobuf.GeneratedMessageLite<
        Dependency, Dependency.Builder> implements
    // @@protoc_insertion_point(message_implements:Dependency)
    DependencyOrBuilder {
  private Dependency() {
    packageName_ = "";
  }
  private int bitField0_;
  public static final int PACKAGENAME_FIELD_NUMBER = 1;
  private java.lang.String packageName_;
  /**
   * <code>optional string packageName = 1;</code>
   */
  public boolean hasPackageName() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string packageName = 1;</code>
   */
  public java.lang.String getPackageName() {
    return packageName_;
  }
  /**
   * <code>optional string packageName = 1;</code>
   */
  public com.google.protobuf.ByteString
      getPackageNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(packageName_);
  }
  /**
   * <code>optional string packageName = 1;</code>
   */
  private void setPackageName(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    packageName_ = value;
  }
  /**
   * <code>optional string packageName = 1;</code>
   */
  private void clearPackageName() {
    bitField0_ = (bitField0_ & ~0x00000001);
    packageName_ = getDefaultInstance().getPackageName();
  }
  /**
   * <code>optional string packageName = 1;</code>
   */
  private void setPackageNameBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    packageName_ = value.toStringUtf8();
  }

  public static final int VERSION_FIELD_NUMBER = 2;
  private int version_;
  /**
   * <code>optional int32 version = 2;</code>
   */
  public boolean hasVersion() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int32 version = 2;</code>
   */
  public int getVersion() {
    return version_;
  }
  /**
   * <code>optional int32 version = 2;</code>
   */
  private void setVersion(int value) {
    bitField0_ |= 0x00000002;
    version_ = value;
  }
  /**
   * <code>optional int32 version = 2;</code>
   */
  private void clearVersion() {
    bitField0_ = (bitField0_ & ~0x00000002);
    version_ = 0;
  }

  public static final int UNKNOWN4_FIELD_NUMBER = 4;
  private int unknown4_;
  /**
   * <code>optional int32 unknown4 = 4;</code>
   */
  public boolean hasUnknown4() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional int32 unknown4 = 4;</code>
   */
  public int getUnknown4() {
    return unknown4_;
  }
  /**
   * <code>optional int32 unknown4 = 4;</code>
   */
  private void setUnknown4(int value) {
    bitField0_ |= 0x00000004;
    unknown4_ = value;
  }
  /**
   * <code>optional int32 unknown4 = 4;</code>
   */
  private void clearUnknown4() {
    bitField0_ = (bitField0_ & ~0x00000004);
    unknown4_ = 0;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeString(1, getPackageName());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt32(2, version_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeInt32(4, unknown4_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getPackageName());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, version_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, unknown4_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstore.message.Dependency parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.Dependency parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.Dependency parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.Dependency parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.Dependency parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.Dependency parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.Dependency parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.Dependency parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.Dependency parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.Dependency parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstore.message.Dependency prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code Dependency}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstore.message.Dependency, Builder> implements
      // @@protoc_insertion_point(builder_implements:Dependency)
      com.github.yeriomin.playstore.message.DependencyOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.Dependency.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional string packageName = 1;</code>
     */
    public boolean hasPackageName() {
      return instance.hasPackageName();
    }
    /**
     * <code>optional string packageName = 1;</code>
     */
    public java.lang.String getPackageName() {
      return instance.getPackageName();
    }
    /**
     * <code>optional string packageName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPackageNameBytes() {
      return instance.getPackageNameBytes();
    }
    /**
     * <code>optional string packageName = 1;</code>
     */
    public Builder setPackageName(
        java.lang.String value) {
      copyOnWrite();
      instance.setPackageName(value);
      return this;
    }
    /**
     * <code>optional string packageName = 1;</code>
     */
    public Builder clearPackageName() {
      copyOnWrite();
      instance.clearPackageName();
      return this;
    }
    /**
     * <code>optional string packageName = 1;</code>
     */
    public Builder setPackageNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setPackageNameBytes(value);
      return this;
    }

    /**
     * <code>optional int32 version = 2;</code>
     */
    public boolean hasVersion() {
      return instance.hasVersion();
    }
    /**
     * <code>optional int32 version = 2;</code>
     */
    public int getVersion() {
      return instance.getVersion();
    }
    /**
     * <code>optional int32 version = 2;</code>
     */
    public Builder setVersion(int value) {
      copyOnWrite();
      instance.setVersion(value);
      return this;
    }
    /**
     * <code>optional int32 version = 2;</code>
     */
    public Builder clearVersion() {
      copyOnWrite();
      instance.clearVersion();
      return this;
    }

    /**
     * <code>optional int32 unknown4 = 4;</code>
     */
    public boolean hasUnknown4() {
      return instance.hasUnknown4();
    }
    /**
     * <code>optional int32 unknown4 = 4;</code>
     */
    public int getUnknown4() {
      return instance.getUnknown4();
    }
    /**
     * <code>optional int32 unknown4 = 4;</code>
     */
    public Builder setUnknown4(int value) {
      copyOnWrite();
      instance.setUnknown4(value);
      return this;
    }
    /**
     * <code>optional int32 unknown4 = 4;</code>
     */
    public Builder clearUnknown4() {
      copyOnWrite();
      instance.clearUnknown4();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:Dependency)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstore.message.Dependency();
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
        com.github.yeriomin.playstore.message.Dependency other = (com.github.yeriomin.playstore.message.Dependency) arg1;
        packageName_ = visitor.visitString(
            hasPackageName(), packageName_,
            other.hasPackageName(), other.packageName_);
        version_ = visitor.visitInt(
            hasVersion(), version_,
            other.hasVersion(), other.version_);
        unknown4_ = visitor.visitInt(
            hasUnknown4(), unknown4_,
            other.hasUnknown4(), other.unknown4_);
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
                packageName_ = s;
                break;
              }
              case 16: {
                bitField0_ |= 0x00000002;
                version_ = input.readInt32();
                break;
              }
              case 32: {
                bitField0_ |= 0x00000004;
                unknown4_ = input.readInt32();
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstore.message.Dependency.class) {
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


  // @@protoc_insertion_point(class_scope:Dependency)
  private static final com.github.yeriomin.playstore.message.Dependency DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Dependency();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstore.message.Dependency getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Dependency> PARSER;

  public static com.google.protobuf.Parser<Dependency> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

