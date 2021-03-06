// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

/**
 * Protobuf type {@code ClientLibraryState}
 */
public  final class ClientLibraryState extends
    com.google.protobuf.GeneratedMessageLite<
        ClientLibraryState, ClientLibraryState.Builder> implements
    // @@protoc_insertion_point(message_implements:ClientLibraryState)
    ClientLibraryStateOrBuilder {
  private ClientLibraryState() {
    serverToken_ = com.google.protobuf.ByteString.EMPTY;
    libraryId_ = "";
  }
  private int bitField0_;
  public static final int CORPUS_FIELD_NUMBER = 1;
  private int corpus_;
  /**
   * <code>optional int32 corpus = 1;</code>
   */
  public boolean hasCorpus() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional int32 corpus = 1;</code>
   */
  public int getCorpus() {
    return corpus_;
  }
  /**
   * <code>optional int32 corpus = 1;</code>
   */
  private void setCorpus(int value) {
    bitField0_ |= 0x00000001;
    corpus_ = value;
  }
  /**
   * <code>optional int32 corpus = 1;</code>
   */
  private void clearCorpus() {
    bitField0_ = (bitField0_ & ~0x00000001);
    corpus_ = 0;
  }

  public static final int SERVERTOKEN_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString serverToken_;
  /**
   * <code>optional bytes serverToken = 2;</code>
   */
  public boolean hasServerToken() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional bytes serverToken = 2;</code>
   */
  public com.google.protobuf.ByteString getServerToken() {
    return serverToken_;
  }
  /**
   * <code>optional bytes serverToken = 2;</code>
   */
  private void setServerToken(com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
    serverToken_ = value;
  }
  /**
   * <code>optional bytes serverToken = 2;</code>
   */
  private void clearServerToken() {
    bitField0_ = (bitField0_ & ~0x00000002);
    serverToken_ = getDefaultInstance().getServerToken();
  }

  public static final int HASHCODESUM_FIELD_NUMBER = 3;
  private long hashCodeSum_;
  /**
   * <code>optional int64 hashCodeSum = 3;</code>
   */
  public boolean hasHashCodeSum() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional int64 hashCodeSum = 3;</code>
   */
  public long getHashCodeSum() {
    return hashCodeSum_;
  }
  /**
   * <code>optional int64 hashCodeSum = 3;</code>
   */
  private void setHashCodeSum(long value) {
    bitField0_ |= 0x00000004;
    hashCodeSum_ = value;
  }
  /**
   * <code>optional int64 hashCodeSum = 3;</code>
   */
  private void clearHashCodeSum() {
    bitField0_ = (bitField0_ & ~0x00000004);
    hashCodeSum_ = 0L;
  }

  public static final int LIBRARYSIZE_FIELD_NUMBER = 4;
  private int librarySize_;
  /**
   * <code>optional int32 librarySize = 4;</code>
   */
  public boolean hasLibrarySize() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>optional int32 librarySize = 4;</code>
   */
  public int getLibrarySize() {
    return librarySize_;
  }
  /**
   * <code>optional int32 librarySize = 4;</code>
   */
  private void setLibrarySize(int value) {
    bitField0_ |= 0x00000008;
    librarySize_ = value;
  }
  /**
   * <code>optional int32 librarySize = 4;</code>
   */
  private void clearLibrarySize() {
    bitField0_ = (bitField0_ & ~0x00000008);
    librarySize_ = 0;
  }

  public static final int LIBRARYID_FIELD_NUMBER = 5;
  private java.lang.String libraryId_;
  /**
   * <code>optional string libraryId = 5;</code>
   */
  public boolean hasLibraryId() {
    return ((bitField0_ & 0x00000010) == 0x00000010);
  }
  /**
   * <code>optional string libraryId = 5;</code>
   */
  public java.lang.String getLibraryId() {
    return libraryId_;
  }
  /**
   * <code>optional string libraryId = 5;</code>
   */
  public com.google.protobuf.ByteString
      getLibraryIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(libraryId_);
  }
  /**
   * <code>optional string libraryId = 5;</code>
   */
  private void setLibraryId(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
    libraryId_ = value;
  }
  /**
   * <code>optional string libraryId = 5;</code>
   */
  private void clearLibraryId() {
    bitField0_ = (bitField0_ & ~0x00000010);
    libraryId_ = getDefaultInstance().getLibraryId();
  }
  /**
   * <code>optional string libraryId = 5;</code>
   */
  private void setLibraryIdBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
    libraryId_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeInt32(1, corpus_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeBytes(2, serverToken_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeInt64(3, hashCodeSum_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeInt32(4, librarySize_);
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      output.writeString(5, getLibraryId());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, corpus_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, serverToken_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, hashCodeSum_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, librarySize_);
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(5, getLibraryId());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstore.message.ClientLibraryState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.ClientLibraryState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.ClientLibraryState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.ClientLibraryState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.ClientLibraryState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.ClientLibraryState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.ClientLibraryState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.ClientLibraryState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.ClientLibraryState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.ClientLibraryState parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstore.message.ClientLibraryState prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code ClientLibraryState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstore.message.ClientLibraryState, Builder> implements
      // @@protoc_insertion_point(builder_implements:ClientLibraryState)
      com.github.yeriomin.playstore.message.ClientLibraryStateOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.ClientLibraryState.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional int32 corpus = 1;</code>
     */
    public boolean hasCorpus() {
      return instance.hasCorpus();
    }
    /**
     * <code>optional int32 corpus = 1;</code>
     */
    public int getCorpus() {
      return instance.getCorpus();
    }
    /**
     * <code>optional int32 corpus = 1;</code>
     */
    public Builder setCorpus(int value) {
      copyOnWrite();
      instance.setCorpus(value);
      return this;
    }
    /**
     * <code>optional int32 corpus = 1;</code>
     */
    public Builder clearCorpus() {
      copyOnWrite();
      instance.clearCorpus();
      return this;
    }

    /**
     * <code>optional bytes serverToken = 2;</code>
     */
    public boolean hasServerToken() {
      return instance.hasServerToken();
    }
    /**
     * <code>optional bytes serverToken = 2;</code>
     */
    public com.google.protobuf.ByteString getServerToken() {
      return instance.getServerToken();
    }
    /**
     * <code>optional bytes serverToken = 2;</code>
     */
    public Builder setServerToken(com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setServerToken(value);
      return this;
    }
    /**
     * <code>optional bytes serverToken = 2;</code>
     */
    public Builder clearServerToken() {
      copyOnWrite();
      instance.clearServerToken();
      return this;
    }

    /**
     * <code>optional int64 hashCodeSum = 3;</code>
     */
    public boolean hasHashCodeSum() {
      return instance.hasHashCodeSum();
    }
    /**
     * <code>optional int64 hashCodeSum = 3;</code>
     */
    public long getHashCodeSum() {
      return instance.getHashCodeSum();
    }
    /**
     * <code>optional int64 hashCodeSum = 3;</code>
     */
    public Builder setHashCodeSum(long value) {
      copyOnWrite();
      instance.setHashCodeSum(value);
      return this;
    }
    /**
     * <code>optional int64 hashCodeSum = 3;</code>
     */
    public Builder clearHashCodeSum() {
      copyOnWrite();
      instance.clearHashCodeSum();
      return this;
    }

    /**
     * <code>optional int32 librarySize = 4;</code>
     */
    public boolean hasLibrarySize() {
      return instance.hasLibrarySize();
    }
    /**
     * <code>optional int32 librarySize = 4;</code>
     */
    public int getLibrarySize() {
      return instance.getLibrarySize();
    }
    /**
     * <code>optional int32 librarySize = 4;</code>
     */
    public Builder setLibrarySize(int value) {
      copyOnWrite();
      instance.setLibrarySize(value);
      return this;
    }
    /**
     * <code>optional int32 librarySize = 4;</code>
     */
    public Builder clearLibrarySize() {
      copyOnWrite();
      instance.clearLibrarySize();
      return this;
    }

    /**
     * <code>optional string libraryId = 5;</code>
     */
    public boolean hasLibraryId() {
      return instance.hasLibraryId();
    }
    /**
     * <code>optional string libraryId = 5;</code>
     */
    public java.lang.String getLibraryId() {
      return instance.getLibraryId();
    }
    /**
     * <code>optional string libraryId = 5;</code>
     */
    public com.google.protobuf.ByteString
        getLibraryIdBytes() {
      return instance.getLibraryIdBytes();
    }
    /**
     * <code>optional string libraryId = 5;</code>
     */
    public Builder setLibraryId(
        java.lang.String value) {
      copyOnWrite();
      instance.setLibraryId(value);
      return this;
    }
    /**
     * <code>optional string libraryId = 5;</code>
     */
    public Builder clearLibraryId() {
      copyOnWrite();
      instance.clearLibraryId();
      return this;
    }
    /**
     * <code>optional string libraryId = 5;</code>
     */
    public Builder setLibraryIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setLibraryIdBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:ClientLibraryState)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstore.message.ClientLibraryState();
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
        com.github.yeriomin.playstore.message.ClientLibraryState other = (com.github.yeriomin.playstore.message.ClientLibraryState) arg1;
        corpus_ = visitor.visitInt(
            hasCorpus(), corpus_,
            other.hasCorpus(), other.corpus_);
        serverToken_ = visitor.visitByteString(
            hasServerToken(), serverToken_,
            other.hasServerToken(), other.serverToken_);
        hashCodeSum_ = visitor.visitLong(
            hasHashCodeSum(), hashCodeSum_,
            other.hasHashCodeSum(), other.hashCodeSum_);
        librarySize_ = visitor.visitInt(
            hasLibrarySize(), librarySize_,
            other.hasLibrarySize(), other.librarySize_);
        libraryId_ = visitor.visitString(
            hasLibraryId(), libraryId_,
            other.hasLibraryId(), other.libraryId_);
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
                corpus_ = input.readInt32();
                break;
              }
              case 18: {
                bitField0_ |= 0x00000002;
                serverToken_ = input.readBytes();
                break;
              }
              case 24: {
                bitField0_ |= 0x00000004;
                hashCodeSum_ = input.readInt64();
                break;
              }
              case 32: {
                bitField0_ |= 0x00000008;
                librarySize_ = input.readInt32();
                break;
              }
              case 42: {
                String s = input.readString();
                bitField0_ |= 0x00000010;
                libraryId_ = s;
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstore.message.ClientLibraryState.class) {
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


  // @@protoc_insertion_point(class_scope:ClientLibraryState)
  private static final com.github.yeriomin.playstore.message.ClientLibraryState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ClientLibraryState();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstore.message.ClientLibraryState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ClientLibraryState> PARSER;

  public static com.google.protobuf.Parser<ClientLibraryState> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

