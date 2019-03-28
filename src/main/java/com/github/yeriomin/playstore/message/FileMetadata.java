// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

/**
 * Protobuf type {@code FileMetadata}
 */
public  final class FileMetadata extends
    com.google.protobuf.GeneratedMessageLite<
        FileMetadata, FileMetadata.Builder> implements
    // @@protoc_insertion_point(message_implements:FileMetadata)
    FileMetadataOrBuilder {
  private FileMetadata() {
  }
  private int bitField0_;
  public static final int FILETYPE_FIELD_NUMBER = 1;
  private int fileType_;
  /**
   * <code>optional int32 fileType = 1;</code>
   */
  public boolean hasFileType() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional int32 fileType = 1;</code>
   */
  public int getFileType() {
    return fileType_;
  }
  /**
   * <code>optional int32 fileType = 1;</code>
   */
  private void setFileType(int value) {
    bitField0_ |= 0x00000001;
    fileType_ = value;
  }
  /**
   * <code>optional int32 fileType = 1;</code>
   */
  private void clearFileType() {
    bitField0_ = (bitField0_ & ~0x00000001);
    fileType_ = 0;
  }

  public static final int VERSIONCODE_FIELD_NUMBER = 2;
  private int versionCode_;
  /**
   * <code>optional int32 versionCode = 2;</code>
   */
  public boolean hasVersionCode() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int32 versionCode = 2;</code>
   */
  public int getVersionCode() {
    return versionCode_;
  }
  /**
   * <code>optional int32 versionCode = 2;</code>
   */
  private void setVersionCode(int value) {
    bitField0_ |= 0x00000002;
    versionCode_ = value;
  }
  /**
   * <code>optional int32 versionCode = 2;</code>
   */
  private void clearVersionCode() {
    bitField0_ = (bitField0_ & ~0x00000002);
    versionCode_ = 0;
  }

  public static final int SIZE_FIELD_NUMBER = 3;
  private long size_;
  /**
   * <code>optional int64 size = 3;</code>
   */
  public boolean hasSize() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional int64 size = 3;</code>
   */
  public long getSize() {
    return size_;
  }
  /**
   * <code>optional int64 size = 3;</code>
   */
  private void setSize(long value) {
    bitField0_ |= 0x00000004;
    size_ = value;
  }
  /**
   * <code>optional int64 size = 3;</code>
   */
  private void clearSize() {
    bitField0_ = (bitField0_ & ~0x00000004);
    size_ = 0L;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeInt32(1, fileType_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt32(2, versionCode_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeInt64(3, size_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, fileType_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, versionCode_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, size_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstore.message.FileMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.FileMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.FileMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.FileMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.FileMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.FileMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.FileMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.FileMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.FileMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.FileMetadata parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstore.message.FileMetadata prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code FileMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstore.message.FileMetadata, Builder> implements
      // @@protoc_insertion_point(builder_implements:FileMetadata)
      com.github.yeriomin.playstore.message.FileMetadataOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.FileMetadata.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional int32 fileType = 1;</code>
     */
    public boolean hasFileType() {
      return instance.hasFileType();
    }
    /**
     * <code>optional int32 fileType = 1;</code>
     */
    public int getFileType() {
      return instance.getFileType();
    }
    /**
     * <code>optional int32 fileType = 1;</code>
     */
    public Builder setFileType(int value) {
      copyOnWrite();
      instance.setFileType(value);
      return this;
    }
    /**
     * <code>optional int32 fileType = 1;</code>
     */
    public Builder clearFileType() {
      copyOnWrite();
      instance.clearFileType();
      return this;
    }

    /**
     * <code>optional int32 versionCode = 2;</code>
     */
    public boolean hasVersionCode() {
      return instance.hasVersionCode();
    }
    /**
     * <code>optional int32 versionCode = 2;</code>
     */
    public int getVersionCode() {
      return instance.getVersionCode();
    }
    /**
     * <code>optional int32 versionCode = 2;</code>
     */
    public Builder setVersionCode(int value) {
      copyOnWrite();
      instance.setVersionCode(value);
      return this;
    }
    /**
     * <code>optional int32 versionCode = 2;</code>
     */
    public Builder clearVersionCode() {
      copyOnWrite();
      instance.clearVersionCode();
      return this;
    }

    /**
     * <code>optional int64 size = 3;</code>
     */
    public boolean hasSize() {
      return instance.hasSize();
    }
    /**
     * <code>optional int64 size = 3;</code>
     */
    public long getSize() {
      return instance.getSize();
    }
    /**
     * <code>optional int64 size = 3;</code>
     */
    public Builder setSize(long value) {
      copyOnWrite();
      instance.setSize(value);
      return this;
    }
    /**
     * <code>optional int64 size = 3;</code>
     */
    public Builder clearSize() {
      copyOnWrite();
      instance.clearSize();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:FileMetadata)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstore.message.FileMetadata();
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
        com.github.yeriomin.playstore.message.FileMetadata other = (com.github.yeriomin.playstore.message.FileMetadata) arg1;
        fileType_ = visitor.visitInt(
            hasFileType(), fileType_,
            other.hasFileType(), other.fileType_);
        versionCode_ = visitor.visitInt(
            hasVersionCode(), versionCode_,
            other.hasVersionCode(), other.versionCode_);
        size_ = visitor.visitLong(
            hasSize(), size_,
            other.hasSize(), other.size_);
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
                fileType_ = input.readInt32();
                break;
              }
              case 16: {
                bitField0_ |= 0x00000002;
                versionCode_ = input.readInt32();
                break;
              }
              case 24: {
                bitField0_ |= 0x00000004;
                size_ = input.readInt64();
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstore.message.FileMetadata.class) {
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


  // @@protoc_insertion_point(class_scope:FileMetadata)
  private static final com.github.yeriomin.playstore.message.FileMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new FileMetadata();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstore.message.FileMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<FileMetadata> PARSER;

  public static com.google.protobuf.Parser<FileMetadata> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
