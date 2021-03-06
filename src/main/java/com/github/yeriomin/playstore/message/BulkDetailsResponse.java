// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

/**
 * Protobuf type {@code BulkDetailsResponse}
 */
public  final class BulkDetailsResponse extends
    com.google.protobuf.GeneratedMessageLite<
        BulkDetailsResponse, BulkDetailsResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:BulkDetailsResponse)
    BulkDetailsResponseOrBuilder {
  private BulkDetailsResponse() {
    entry_ = emptyProtobufList();
  }
  public static final int ENTRY_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<com.github.yeriomin.playstore.message.BulkDetailsEntry> entry_;
  /**
   * <code>repeated .BulkDetailsEntry entry = 1;</code>
   */
  public java.util.List<com.github.yeriomin.playstore.message.BulkDetailsEntry> getEntryList() {
    return entry_;
  }
  /**
   * <code>repeated .BulkDetailsEntry entry = 1;</code>
   */
  public java.util.List<? extends com.github.yeriomin.playstore.message.BulkDetailsEntryOrBuilder> 
      getEntryOrBuilderList() {
    return entry_;
  }
  /**
   * <code>repeated .BulkDetailsEntry entry = 1;</code>
   */
  public int getEntryCount() {
    return entry_.size();
  }
  /**
   * <code>repeated .BulkDetailsEntry entry = 1;</code>
   */
  public com.github.yeriomin.playstore.message.BulkDetailsEntry getEntry(int index) {
    return entry_.get(index);
  }
  /**
   * <code>repeated .BulkDetailsEntry entry = 1;</code>
   */
  public com.github.yeriomin.playstore.message.BulkDetailsEntryOrBuilder getEntryOrBuilder(
      int index) {
    return entry_.get(index);
  }
  private void ensureEntryIsMutable() {
    if (!entry_.isModifiable()) {
      entry_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(entry_);
     }
  }

  /**
   * <code>repeated .BulkDetailsEntry entry = 1;</code>
   */
  private void setEntry(
      int index, com.github.yeriomin.playstore.message.BulkDetailsEntry value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureEntryIsMutable();
    entry_.set(index, value);
  }
  /**
   * <code>repeated .BulkDetailsEntry entry = 1;</code>
   */
  private void setEntry(
      int index, com.github.yeriomin.playstore.message.BulkDetailsEntry.Builder builderForValue) {
    ensureEntryIsMutable();
    entry_.set(index, builderForValue.build());
  }
  /**
   * <code>repeated .BulkDetailsEntry entry = 1;</code>
   */
  private void addEntry(com.github.yeriomin.playstore.message.BulkDetailsEntry value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureEntryIsMutable();
    entry_.add(value);
  }
  /**
   * <code>repeated .BulkDetailsEntry entry = 1;</code>
   */
  private void addEntry(
      int index, com.github.yeriomin.playstore.message.BulkDetailsEntry value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureEntryIsMutable();
    entry_.add(index, value);
  }
  /**
   * <code>repeated .BulkDetailsEntry entry = 1;</code>
   */
  private void addEntry(
      com.github.yeriomin.playstore.message.BulkDetailsEntry.Builder builderForValue) {
    ensureEntryIsMutable();
    entry_.add(builderForValue.build());
  }
  /**
   * <code>repeated .BulkDetailsEntry entry = 1;</code>
   */
  private void addEntry(
      int index, com.github.yeriomin.playstore.message.BulkDetailsEntry.Builder builderForValue) {
    ensureEntryIsMutable();
    entry_.add(index, builderForValue.build());
  }
  /**
   * <code>repeated .BulkDetailsEntry entry = 1;</code>
   */
  private void addAllEntry(
      java.lang.Iterable<? extends com.github.yeriomin.playstore.message.BulkDetailsEntry> values) {
    ensureEntryIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, entry_);
  }
  /**
   * <code>repeated .BulkDetailsEntry entry = 1;</code>
   */
  private void clearEntry() {
    entry_ = emptyProtobufList();
  }
  /**
   * <code>repeated .BulkDetailsEntry entry = 1;</code>
   */
  private void removeEntry(int index) {
    ensureEntryIsMutable();
    entry_.remove(index);
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < entry_.size(); i++) {
      output.writeMessage(1, entry_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < entry_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, entry_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstore.message.BulkDetailsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.BulkDetailsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.BulkDetailsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.BulkDetailsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.BulkDetailsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.BulkDetailsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.BulkDetailsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.BulkDetailsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.BulkDetailsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.BulkDetailsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstore.message.BulkDetailsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code BulkDetailsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstore.message.BulkDetailsResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:BulkDetailsResponse)
      com.github.yeriomin.playstore.message.BulkDetailsResponseOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.BulkDetailsResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>repeated .BulkDetailsEntry entry = 1;</code>
     */
    public java.util.List<com.github.yeriomin.playstore.message.BulkDetailsEntry> getEntryList() {
      return java.util.Collections.unmodifiableList(
          instance.getEntryList());
    }
    /**
     * <code>repeated .BulkDetailsEntry entry = 1;</code>
     */
    public int getEntryCount() {
      return instance.getEntryCount();
    }/**
     * <code>repeated .BulkDetailsEntry entry = 1;</code>
     */
    public com.github.yeriomin.playstore.message.BulkDetailsEntry getEntry(int index) {
      return instance.getEntry(index);
    }
    /**
     * <code>repeated .BulkDetailsEntry entry = 1;</code>
     */
    public Builder setEntry(
        int index, com.github.yeriomin.playstore.message.BulkDetailsEntry value) {
      copyOnWrite();
      instance.setEntry(index, value);
      return this;
    }
    /**
     * <code>repeated .BulkDetailsEntry entry = 1;</code>
     */
    public Builder setEntry(
        int index, com.github.yeriomin.playstore.message.BulkDetailsEntry.Builder builderForValue) {
      copyOnWrite();
      instance.setEntry(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .BulkDetailsEntry entry = 1;</code>
     */
    public Builder addEntry(com.github.yeriomin.playstore.message.BulkDetailsEntry value) {
      copyOnWrite();
      instance.addEntry(value);
      return this;
    }
    /**
     * <code>repeated .BulkDetailsEntry entry = 1;</code>
     */
    public Builder addEntry(
        int index, com.github.yeriomin.playstore.message.BulkDetailsEntry value) {
      copyOnWrite();
      instance.addEntry(index, value);
      return this;
    }
    /**
     * <code>repeated .BulkDetailsEntry entry = 1;</code>
     */
    public Builder addEntry(
        com.github.yeriomin.playstore.message.BulkDetailsEntry.Builder builderForValue) {
      copyOnWrite();
      instance.addEntry(builderForValue);
      return this;
    }
    /**
     * <code>repeated .BulkDetailsEntry entry = 1;</code>
     */
    public Builder addEntry(
        int index, com.github.yeriomin.playstore.message.BulkDetailsEntry.Builder builderForValue) {
      copyOnWrite();
      instance.addEntry(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .BulkDetailsEntry entry = 1;</code>
     */
    public Builder addAllEntry(
        java.lang.Iterable<? extends com.github.yeriomin.playstore.message.BulkDetailsEntry> values) {
      copyOnWrite();
      instance.addAllEntry(values);
      return this;
    }
    /**
     * <code>repeated .BulkDetailsEntry entry = 1;</code>
     */
    public Builder clearEntry() {
      copyOnWrite();
      instance.clearEntry();
      return this;
    }
    /**
     * <code>repeated .BulkDetailsEntry entry = 1;</code>
     */
    public Builder removeEntry(int index) {
      copyOnWrite();
      instance.removeEntry(index);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:BulkDetailsResponse)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstore.message.BulkDetailsResponse();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        entry_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.github.yeriomin.playstore.message.BulkDetailsResponse other = (com.github.yeriomin.playstore.message.BulkDetailsResponse) arg1;
        entry_= visitor.visitList(entry_, other.entry_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
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
                if (!entry_.isModifiable()) {
                  entry_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(entry_);
                }
                entry_.add(
                    input.readMessage(com.github.yeriomin.playstore.message.BulkDetailsEntry.parser(), extensionRegistry));
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstore.message.BulkDetailsResponse.class) {
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


  // @@protoc_insertion_point(class_scope:BulkDetailsResponse)
  private static final com.github.yeriomin.playstore.message.BulkDetailsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new BulkDetailsResponse();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstore.message.BulkDetailsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<BulkDetailsResponse> PARSER;

  public static com.google.protobuf.Parser<BulkDetailsResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

