// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstoreapi;

/**
 * Protobuf type {@code LibraryDirtyData}
 */
public  final class LibraryDirtyData extends
    com.google.protobuf.GeneratedMessageLite<
        LibraryDirtyData, LibraryDirtyData.Builder> implements
    // @@protoc_insertion_point(message_implements:LibraryDirtyData)
    LibraryDirtyDataOrBuilder {
  private LibraryDirtyData() {
  }
  private int bitField0_;
  public static final int BACKEND_FIELD_NUMBER = 1;
  private int backend_;
  /**
   * <code>optional int32 backend = 1;</code>
   */
  public boolean hasBackend() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional int32 backend = 1;</code>
   */
  public int getBackend() {
    return backend_;
  }
  /**
   * <code>optional int32 backend = 1;</code>
   */
  private void setBackend(int value) {
    bitField0_ |= 0x00000001;
    backend_ = value;
  }
  /**
   * <code>optional int32 backend = 1;</code>
   */
  private void clearBackend() {
    bitField0_ = (bitField0_ & ~0x00000001);
    backend_ = 0;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeInt32(1, backend_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, backend_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstoreapi.LibraryDirtyData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstoreapi.LibraryDirtyData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.LibraryDirtyData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstoreapi.LibraryDirtyData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.LibraryDirtyData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.LibraryDirtyData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.LibraryDirtyData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.LibraryDirtyData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.LibraryDirtyData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.LibraryDirtyData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstoreapi.LibraryDirtyData prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code LibraryDirtyData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstoreapi.LibraryDirtyData, Builder> implements
      // @@protoc_insertion_point(builder_implements:LibraryDirtyData)
      com.github.yeriomin.playstoreapi.LibraryDirtyDataOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.LibraryDirtyData.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional int32 backend = 1;</code>
     */
    public boolean hasBackend() {
      return instance.hasBackend();
    }
    /**
     * <code>optional int32 backend = 1;</code>
     */
    public int getBackend() {
      return instance.getBackend();
    }
    /**
     * <code>optional int32 backend = 1;</code>
     */
    public Builder setBackend(int value) {
      copyOnWrite();
      instance.setBackend(value);
      return this;
    }
    /**
     * <code>optional int32 backend = 1;</code>
     */
    public Builder clearBackend() {
      copyOnWrite();
      instance.clearBackend();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:LibraryDirtyData)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstoreapi.LibraryDirtyData();
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
        com.github.yeriomin.playstoreapi.LibraryDirtyData other = (com.github.yeriomin.playstoreapi.LibraryDirtyData) arg1;
        backend_ = visitor.visitInt(
            hasBackend(), backend_,
            other.hasBackend(), other.backend_);
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
                backend_ = input.readInt32();
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstoreapi.LibraryDirtyData.class) {
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


  // @@protoc_insertion_point(class_scope:LibraryDirtyData)
  private static final com.github.yeriomin.playstoreapi.LibraryDirtyData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new LibraryDirtyData();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstoreapi.LibraryDirtyData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<LibraryDirtyData> PARSER;

  public static com.google.protobuf.Parser<LibraryDirtyData> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

