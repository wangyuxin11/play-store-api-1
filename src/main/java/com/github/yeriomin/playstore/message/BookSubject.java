// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

/**
 * Protobuf type {@code BookSubject}
 */
public  final class BookSubject extends
    com.google.protobuf.GeneratedMessageLite<
        BookSubject, BookSubject.Builder> implements
    // @@protoc_insertion_point(message_implements:BookSubject)
    BookSubjectOrBuilder {
  private BookSubject() {
    name_ = "";
    query_ = "";
    subjectId_ = "";
  }
  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  private java.lang.String name_;
  /**
   * <code>optional string name = 1;</code>
   */
  public boolean hasName() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string name = 1;</code>
   */
  public java.lang.String getName() {
    return name_;
  }
  /**
   * <code>optional string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(name_);
  }
  /**
   * <code>optional string name = 1;</code>
   */
  private void setName(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    name_ = value;
  }
  /**
   * <code>optional string name = 1;</code>
   */
  private void clearName() {
    bitField0_ = (bitField0_ & ~0x00000001);
    name_ = getDefaultInstance().getName();
  }
  /**
   * <code>optional string name = 1;</code>
   */
  private void setNameBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    name_ = value.toStringUtf8();
  }

  public static final int QUERY_FIELD_NUMBER = 2;
  private java.lang.String query_;
  /**
   * <code>optional string query = 2;</code>
   */
  public boolean hasQuery() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional string query = 2;</code>
   */
  public java.lang.String getQuery() {
    return query_;
  }
  /**
   * <code>optional string query = 2;</code>
   */
  public com.google.protobuf.ByteString
      getQueryBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(query_);
  }
  /**
   * <code>optional string query = 2;</code>
   */
  private void setQuery(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
    query_ = value;
  }
  /**
   * <code>optional string query = 2;</code>
   */
  private void clearQuery() {
    bitField0_ = (bitField0_ & ~0x00000002);
    query_ = getDefaultInstance().getQuery();
  }
  /**
   * <code>optional string query = 2;</code>
   */
  private void setQueryBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
    query_ = value.toStringUtf8();
  }

  public static final int SUBJECTID_FIELD_NUMBER = 3;
  private java.lang.String subjectId_;
  /**
   * <code>optional string subjectId = 3;</code>
   */
  public boolean hasSubjectId() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional string subjectId = 3;</code>
   */
  public java.lang.String getSubjectId() {
    return subjectId_;
  }
  /**
   * <code>optional string subjectId = 3;</code>
   */
  public com.google.protobuf.ByteString
      getSubjectIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(subjectId_);
  }
  /**
   * <code>optional string subjectId = 3;</code>
   */
  private void setSubjectId(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
    subjectId_ = value;
  }
  /**
   * <code>optional string subjectId = 3;</code>
   */
  private void clearSubjectId() {
    bitField0_ = (bitField0_ & ~0x00000004);
    subjectId_ = getDefaultInstance().getSubjectId();
  }
  /**
   * <code>optional string subjectId = 3;</code>
   */
  private void setSubjectIdBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
    subjectId_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeString(1, getName());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeString(2, getQuery());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeString(3, getSubjectId());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getName());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getQuery());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(3, getSubjectId());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstore.message.BookSubject parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.BookSubject parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.BookSubject parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.BookSubject parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.BookSubject parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.BookSubject parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.BookSubject parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.BookSubject parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.BookSubject parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.BookSubject parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstore.message.BookSubject prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code BookSubject}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstore.message.BookSubject, Builder> implements
      // @@protoc_insertion_point(builder_implements:BookSubject)
      com.github.yeriomin.playstore.message.BookSubjectOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.BookSubject.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional string name = 1;</code>
     */
    public boolean hasName() {
      return instance.hasName();
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public java.lang.String getName() {
      return instance.getName();
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      return instance.getNameBytes();
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      copyOnWrite();
      instance.setName(value);
      return this;
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public Builder clearName() {
      copyOnWrite();
      instance.clearName();
      return this;
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setNameBytes(value);
      return this;
    }

    /**
     * <code>optional string query = 2;</code>
     */
    public boolean hasQuery() {
      return instance.hasQuery();
    }
    /**
     * <code>optional string query = 2;</code>
     */
    public java.lang.String getQuery() {
      return instance.getQuery();
    }
    /**
     * <code>optional string query = 2;</code>
     */
    public com.google.protobuf.ByteString
        getQueryBytes() {
      return instance.getQueryBytes();
    }
    /**
     * <code>optional string query = 2;</code>
     */
    public Builder setQuery(
        java.lang.String value) {
      copyOnWrite();
      instance.setQuery(value);
      return this;
    }
    /**
     * <code>optional string query = 2;</code>
     */
    public Builder clearQuery() {
      copyOnWrite();
      instance.clearQuery();
      return this;
    }
    /**
     * <code>optional string query = 2;</code>
     */
    public Builder setQueryBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setQueryBytes(value);
      return this;
    }

    /**
     * <code>optional string subjectId = 3;</code>
     */
    public boolean hasSubjectId() {
      return instance.hasSubjectId();
    }
    /**
     * <code>optional string subjectId = 3;</code>
     */
    public java.lang.String getSubjectId() {
      return instance.getSubjectId();
    }
    /**
     * <code>optional string subjectId = 3;</code>
     */
    public com.google.protobuf.ByteString
        getSubjectIdBytes() {
      return instance.getSubjectIdBytes();
    }
    /**
     * <code>optional string subjectId = 3;</code>
     */
    public Builder setSubjectId(
        java.lang.String value) {
      copyOnWrite();
      instance.setSubjectId(value);
      return this;
    }
    /**
     * <code>optional string subjectId = 3;</code>
     */
    public Builder clearSubjectId() {
      copyOnWrite();
      instance.clearSubjectId();
      return this;
    }
    /**
     * <code>optional string subjectId = 3;</code>
     */
    public Builder setSubjectIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setSubjectIdBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:BookSubject)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstore.message.BookSubject();
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
        com.github.yeriomin.playstore.message.BookSubject other = (com.github.yeriomin.playstore.message.BookSubject) arg1;
        name_ = visitor.visitString(
            hasName(), name_,
            other.hasName(), other.name_);
        query_ = visitor.visitString(
            hasQuery(), query_,
            other.hasQuery(), other.query_);
        subjectId_ = visitor.visitString(
            hasSubjectId(), subjectId_,
            other.hasSubjectId(), other.subjectId_);
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
                name_ = s;
                break;
              }
              case 18: {
                String s = input.readString();
                bitField0_ |= 0x00000002;
                query_ = s;
                break;
              }
              case 26: {
                String s = input.readString();
                bitField0_ |= 0x00000004;
                subjectId_ = s;
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstore.message.BookSubject.class) {
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


  // @@protoc_insertion_point(class_scope:BookSubject)
  private static final com.github.yeriomin.playstore.message.BookSubject DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new BookSubject();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstore.message.BookSubject getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<BookSubject> PARSER;

  public static com.google.protobuf.Parser<BookSubject> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

