// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstoreapi;

/**
 * Protobuf type {@code BulkDetailsRequest}
 */
public  final class BulkDetailsRequest extends
    com.google.protobuf.GeneratedMessageLite<
        BulkDetailsRequest, BulkDetailsRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:BulkDetailsRequest)
    BulkDetailsRequestOrBuilder {
  private BulkDetailsRequest() {
    docid_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
  }
  private int bitField0_;
  public static final int DOCID_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<String> docid_;
  /**
   * <code>repeated string docid = 1;</code>
   */
  public java.util.List<String> getDocidList() {
    return docid_;
  }
  /**
   * <code>repeated string docid = 1;</code>
   */
  public int getDocidCount() {
    return docid_.size();
  }
  /**
   * <code>repeated string docid = 1;</code>
   */
  public java.lang.String getDocid(int index) {
    return docid_.get(index);
  }
  /**
   * <code>repeated string docid = 1;</code>
   */
  public com.google.protobuf.ByteString
      getDocidBytes(int index) {
    return com.google.protobuf.ByteString.copyFromUtf8(
        docid_.get(index));
  }
  private void ensureDocidIsMutable() {
    if (!docid_.isModifiable()) {
      docid_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(docid_);
     }
  }
  /**
   * <code>repeated string docid = 1;</code>
   */
  private void setDocid(
      int index, java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  ensureDocidIsMutable();
    docid_.set(index, value);
  }
  /**
   * <code>repeated string docid = 1;</code>
   */
  private void addDocid(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  ensureDocidIsMutable();
    docid_.add(value);
  }
  /**
   * <code>repeated string docid = 1;</code>
   */
  private void addAllDocid(
      java.lang.Iterable<java.lang.String> values) {
    ensureDocidIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, docid_);
  }
  /**
   * <code>repeated string docid = 1;</code>
   */
  private void clearDocid() {
    docid_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
  }
  /**
   * <code>repeated string docid = 1;</code>
   */
  private void addDocidBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  ensureDocidIsMutable();
    docid_.add(value.toStringUtf8());
  }

  public static final int INCLUDECHILDDOCS_FIELD_NUMBER = 2;
  private boolean includeChildDocs_;
  /**
   * <code>optional bool includeChildDocs = 2;</code>
   */
  public boolean hasIncludeChildDocs() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional bool includeChildDocs = 2;</code>
   */
  public boolean getIncludeChildDocs() {
    return includeChildDocs_;
  }
  /**
   * <code>optional bool includeChildDocs = 2;</code>
   */
  private void setIncludeChildDocs(boolean value) {
    bitField0_ |= 0x00000001;
    includeChildDocs_ = value;
  }
  /**
   * <code>optional bool includeChildDocs = 2;</code>
   */
  private void clearIncludeChildDocs() {
    bitField0_ = (bitField0_ & ~0x00000001);
    includeChildDocs_ = false;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < docid_.size(); i++) {
      output.writeString(1, docid_.get(i));
    }
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeBool(2, includeChildDocs_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < docid_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeStringSizeNoTag(docid_.get(i));
      }
      size += dataSize;
      size += 1 * getDocidList().size();
    }
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, includeChildDocs_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstoreapi.BulkDetailsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstoreapi.BulkDetailsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.BulkDetailsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstoreapi.BulkDetailsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.BulkDetailsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.BulkDetailsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.BulkDetailsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.BulkDetailsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.BulkDetailsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.BulkDetailsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstoreapi.BulkDetailsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code BulkDetailsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstoreapi.BulkDetailsRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:BulkDetailsRequest)
      com.github.yeriomin.playstoreapi.BulkDetailsRequestOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.BulkDetailsRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>repeated string docid = 1;</code>
     */
    public java.util.List<String>
        getDocidList() {
      return java.util.Collections.unmodifiableList(
          instance.getDocidList());
    }
    /**
     * <code>repeated string docid = 1;</code>
     */
    public int getDocidCount() {
      return instance.getDocidCount();
    }
    /**
     * <code>repeated string docid = 1;</code>
     */
    public java.lang.String getDocid(int index) {
      return instance.getDocid(index);
    }
    /**
     * <code>repeated string docid = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDocidBytes(int index) {
      return instance.getDocidBytes(index);
    }
    /**
     * <code>repeated string docid = 1;</code>
     */
    public Builder setDocid(
        int index, java.lang.String value) {
      copyOnWrite();
      instance.setDocid(index, value);
      return this;
    }
    /**
     * <code>repeated string docid = 1;</code>
     */
    public Builder addDocid(
        java.lang.String value) {
      copyOnWrite();
      instance.addDocid(value);
      return this;
    }
    /**
     * <code>repeated string docid = 1;</code>
     */
    public Builder addAllDocid(
        java.lang.Iterable<java.lang.String> values) {
      copyOnWrite();
      instance.addAllDocid(values);
      return this;
    }
    /**
     * <code>repeated string docid = 1;</code>
     */
    public Builder clearDocid() {
      copyOnWrite();
      instance.clearDocid();
      return this;
    }
    /**
     * <code>repeated string docid = 1;</code>
     */
    public Builder addDocidBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.addDocidBytes(value);
      return this;
    }

    /**
     * <code>optional bool includeChildDocs = 2;</code>
     */
    public boolean hasIncludeChildDocs() {
      return instance.hasIncludeChildDocs();
    }
    /**
     * <code>optional bool includeChildDocs = 2;</code>
     */
    public boolean getIncludeChildDocs() {
      return instance.getIncludeChildDocs();
    }
    /**
     * <code>optional bool includeChildDocs = 2;</code>
     */
    public Builder setIncludeChildDocs(boolean value) {
      copyOnWrite();
      instance.setIncludeChildDocs(value);
      return this;
    }
    /**
     * <code>optional bool includeChildDocs = 2;</code>
     */
    public Builder clearIncludeChildDocs() {
      copyOnWrite();
      instance.clearIncludeChildDocs();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:BulkDetailsRequest)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstoreapi.BulkDetailsRequest();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        docid_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.github.yeriomin.playstoreapi.BulkDetailsRequest other = (com.github.yeriomin.playstoreapi.BulkDetailsRequest) arg1;
        docid_= visitor.visitList(docid_, other.docid_);
        includeChildDocs_ = visitor.visitBoolean(
            hasIncludeChildDocs(), includeChildDocs_,
            other.hasIncludeChildDocs(), other.includeChildDocs_);
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
                if (!docid_.isModifiable()) {
                  docid_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(docid_);
                }
                docid_.add(s);
                break;
              }
              case 16: {
                bitField0_ |= 0x00000001;
                includeChildDocs_ = input.readBool();
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstoreapi.BulkDetailsRequest.class) {
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


  // @@protoc_insertion_point(class_scope:BulkDetailsRequest)
  private static final com.github.yeriomin.playstoreapi.BulkDetailsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new BulkDetailsRequest();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstoreapi.BulkDetailsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<BulkDetailsRequest> PARSER;

  public static com.google.protobuf.Parser<BulkDetailsRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

