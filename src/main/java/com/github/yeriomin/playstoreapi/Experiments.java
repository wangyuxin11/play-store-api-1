// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstoreapi;

/**
 * Protobuf type {@code Experiments}
 */
public  final class Experiments extends
    com.google.protobuf.GeneratedMessageLite<
        Experiments, Experiments.Builder> implements
    // @@protoc_insertion_point(message_implements:Experiments)
    ExperimentsOrBuilder {
  private Experiments() {
    experimentId_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
  }
  public static final int EXPERIMENTID_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<String> experimentId_;
  /**
   * <code>repeated string experimentId = 1;</code>
   */
  public java.util.List<String> getExperimentIdList() {
    return experimentId_;
  }
  /**
   * <code>repeated string experimentId = 1;</code>
   */
  public int getExperimentIdCount() {
    return experimentId_.size();
  }
  /**
   * <code>repeated string experimentId = 1;</code>
   */
  public java.lang.String getExperimentId(int index) {
    return experimentId_.get(index);
  }
  /**
   * <code>repeated string experimentId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getExperimentIdBytes(int index) {
    return com.google.protobuf.ByteString.copyFromUtf8(
        experimentId_.get(index));
  }
  private void ensureExperimentIdIsMutable() {
    if (!experimentId_.isModifiable()) {
      experimentId_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(experimentId_);
     }
  }
  /**
   * <code>repeated string experimentId = 1;</code>
   */
  private void setExperimentId(
      int index, java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  ensureExperimentIdIsMutable();
    experimentId_.set(index, value);
  }
  /**
   * <code>repeated string experimentId = 1;</code>
   */
  private void addExperimentId(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  ensureExperimentIdIsMutable();
    experimentId_.add(value);
  }
  /**
   * <code>repeated string experimentId = 1;</code>
   */
  private void addAllExperimentId(
      java.lang.Iterable<java.lang.String> values) {
    ensureExperimentIdIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, experimentId_);
  }
  /**
   * <code>repeated string experimentId = 1;</code>
   */
  private void clearExperimentId() {
    experimentId_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
  }
  /**
   * <code>repeated string experimentId = 1;</code>
   */
  private void addExperimentIdBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  ensureExperimentIdIsMutable();
    experimentId_.add(value.toStringUtf8());
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < experimentId_.size(); i++) {
      output.writeString(1, experimentId_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < experimentId_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeStringSizeNoTag(experimentId_.get(i));
      }
      size += dataSize;
      size += 1 * getExperimentIdList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstoreapi.Experiments parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstoreapi.Experiments parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.Experiments parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstoreapi.Experiments parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.Experiments parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.Experiments parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.Experiments parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.Experiments parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.Experiments parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.Experiments parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstoreapi.Experiments prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code Experiments}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstoreapi.Experiments, Builder> implements
      // @@protoc_insertion_point(builder_implements:Experiments)
      com.github.yeriomin.playstoreapi.ExperimentsOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.Experiments.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>repeated string experimentId = 1;</code>
     */
    public java.util.List<String>
        getExperimentIdList() {
      return java.util.Collections.unmodifiableList(
          instance.getExperimentIdList());
    }
    /**
     * <code>repeated string experimentId = 1;</code>
     */
    public int getExperimentIdCount() {
      return instance.getExperimentIdCount();
    }
    /**
     * <code>repeated string experimentId = 1;</code>
     */
    public java.lang.String getExperimentId(int index) {
      return instance.getExperimentId(index);
    }
    /**
     * <code>repeated string experimentId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getExperimentIdBytes(int index) {
      return instance.getExperimentIdBytes(index);
    }
    /**
     * <code>repeated string experimentId = 1;</code>
     */
    public Builder setExperimentId(
        int index, java.lang.String value) {
      copyOnWrite();
      instance.setExperimentId(index, value);
      return this;
    }
    /**
     * <code>repeated string experimentId = 1;</code>
     */
    public Builder addExperimentId(
        java.lang.String value) {
      copyOnWrite();
      instance.addExperimentId(value);
      return this;
    }
    /**
     * <code>repeated string experimentId = 1;</code>
     */
    public Builder addAllExperimentId(
        java.lang.Iterable<java.lang.String> values) {
      copyOnWrite();
      instance.addAllExperimentId(values);
      return this;
    }
    /**
     * <code>repeated string experimentId = 1;</code>
     */
    public Builder clearExperimentId() {
      copyOnWrite();
      instance.clearExperimentId();
      return this;
    }
    /**
     * <code>repeated string experimentId = 1;</code>
     */
    public Builder addExperimentIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.addExperimentIdBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:Experiments)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstoreapi.Experiments();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        experimentId_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.github.yeriomin.playstoreapi.Experiments other = (com.github.yeriomin.playstoreapi.Experiments) arg1;
        experimentId_= visitor.visitList(experimentId_, other.experimentId_);
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
                String s = input.readString();
                if (!experimentId_.isModifiable()) {
                  experimentId_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(experimentId_);
                }
                experimentId_.add(s);
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstoreapi.Experiments.class) {
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


  // @@protoc_insertion_point(class_scope:Experiments)
  private static final com.github.yeriomin.playstoreapi.Experiments DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Experiments();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstoreapi.Experiments getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Experiments> PARSER;

  public static com.google.protobuf.Parser<Experiments> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

