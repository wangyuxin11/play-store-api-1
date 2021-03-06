// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

/**
 * Protobuf type {@code VideoRentalTerm}
 */
public  final class VideoRentalTerm extends
    com.google.protobuf.GeneratedMessageLite<
        VideoRentalTerm, VideoRentalTerm.Builder> implements
    // @@protoc_insertion_point(message_implements:VideoRentalTerm)
    VideoRentalTermOrBuilder {
  private VideoRentalTerm() {
    offerAbbreviation_ = "";
    rentalHeader_ = "";
    term_ = emptyProtobufList();
  }
  public interface TermOrBuilder extends
      // @@protoc_insertion_point(interface_extends:VideoRentalTerm.Term)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional string header = 5;</code>
     */
    boolean hasHeader();
    /**
     * <code>optional string header = 5;</code>
     */
    java.lang.String getHeader();
    /**
     * <code>optional string header = 5;</code>
     */
    com.google.protobuf.ByteString
        getHeaderBytes();

    /**
     * <code>optional string body = 6;</code>
     */
    boolean hasBody();
    /**
     * <code>optional string body = 6;</code>
     */
    java.lang.String getBody();
    /**
     * <code>optional string body = 6;</code>
     */
    com.google.protobuf.ByteString
        getBodyBytes();
  }
  /**
   * Protobuf type {@code VideoRentalTerm.Term}
   */
  public  static final class Term extends
      com.google.protobuf.GeneratedMessageLite<
          Term, Term.Builder> implements
      // @@protoc_insertion_point(message_implements:VideoRentalTerm.Term)
      TermOrBuilder {
    private Term() {
      header_ = "";
      body_ = "";
    }
    private int bitField0_;
    public static final int HEADER_FIELD_NUMBER = 5;
    private java.lang.String header_;
    /**
     * <code>optional string header = 5;</code>
     */
    public boolean hasHeader() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string header = 5;</code>
     */
    public java.lang.String getHeader() {
      return header_;
    }
    /**
     * <code>optional string header = 5;</code>
     */
    public com.google.protobuf.ByteString
        getHeaderBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(header_);
    }
    /**
     * <code>optional string header = 5;</code>
     */
    private void setHeader(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      header_ = value;
    }
    /**
     * <code>optional string header = 5;</code>
     */
    private void clearHeader() {
      bitField0_ = (bitField0_ & ~0x00000001);
      header_ = getDefaultInstance().getHeader();
    }
    /**
     * <code>optional string header = 5;</code>
     */
    private void setHeaderBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      header_ = value.toStringUtf8();
    }

    public static final int BODY_FIELD_NUMBER = 6;
    private java.lang.String body_;
    /**
     * <code>optional string body = 6;</code>
     */
    public boolean hasBody() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string body = 6;</code>
     */
    public java.lang.String getBody() {
      return body_;
    }
    /**
     * <code>optional string body = 6;</code>
     */
    public com.google.protobuf.ByteString
        getBodyBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(body_);
    }
    /**
     * <code>optional string body = 6;</code>
     */
    private void setBody(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      body_ = value;
    }
    /**
     * <code>optional string body = 6;</code>
     */
    private void clearBody() {
      bitField0_ = (bitField0_ & ~0x00000002);
      body_ = getDefaultInstance().getBody();
    }
    /**
     * <code>optional string body = 6;</code>
     */
    private void setBodyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      body_ = value.toStringUtf8();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeString(5, getHeader());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeString(6, getBody());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(5, getHeader());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(6, getBody());
      }
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static com.github.yeriomin.playstore.message.VideoRentalTerm.Term parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.github.yeriomin.playstore.message.VideoRentalTerm.Term parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.github.yeriomin.playstore.message.VideoRentalTerm.Term parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.github.yeriomin.playstore.message.VideoRentalTerm.Term parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.github.yeriomin.playstore.message.VideoRentalTerm.Term parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.github.yeriomin.playstore.message.VideoRentalTerm.Term parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.github.yeriomin.playstore.message.VideoRentalTerm.Term parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static com.github.yeriomin.playstore.message.VideoRentalTerm.Term parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.github.yeriomin.playstore.message.VideoRentalTerm.Term parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.github.yeriomin.playstore.message.VideoRentalTerm.Term parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.github.yeriomin.playstore.message.VideoRentalTerm.Term prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code VideoRentalTerm.Term}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.github.yeriomin.playstore.message.VideoRentalTerm.Term, Builder> implements
        // @@protoc_insertion_point(builder_implements:VideoRentalTerm.Term)
        com.github.yeriomin.playstore.message.VideoRentalTerm.TermOrBuilder {
      // Construct using com.github.yeriomin.playstoreapi.VideoRentalTerm.Term.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional string header = 5;</code>
       */
      public boolean hasHeader() {
        return instance.hasHeader();
      }
      /**
       * <code>optional string header = 5;</code>
       */
      public java.lang.String getHeader() {
        return instance.getHeader();
      }
      /**
       * <code>optional string header = 5;</code>
       */
      public com.google.protobuf.ByteString
          getHeaderBytes() {
        return instance.getHeaderBytes();
      }
      /**
       * <code>optional string header = 5;</code>
       */
      public Builder setHeader(
          java.lang.String value) {
        copyOnWrite();
        instance.setHeader(value);
        return this;
      }
      /**
       * <code>optional string header = 5;</code>
       */
      public Builder clearHeader() {
        copyOnWrite();
        instance.clearHeader();
        return this;
      }
      /**
       * <code>optional string header = 5;</code>
       */
      public Builder setHeaderBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setHeaderBytes(value);
        return this;
      }

      /**
       * <code>optional string body = 6;</code>
       */
      public boolean hasBody() {
        return instance.hasBody();
      }
      /**
       * <code>optional string body = 6;</code>
       */
      public java.lang.String getBody() {
        return instance.getBody();
      }
      /**
       * <code>optional string body = 6;</code>
       */
      public com.google.protobuf.ByteString
          getBodyBytes() {
        return instance.getBodyBytes();
      }
      /**
       * <code>optional string body = 6;</code>
       */
      public Builder setBody(
          java.lang.String value) {
        copyOnWrite();
        instance.setBody(value);
        return this;
      }
      /**
       * <code>optional string body = 6;</code>
       */
      public Builder clearBody() {
        copyOnWrite();
        instance.clearBody();
        return this;
      }
      /**
       * <code>optional string body = 6;</code>
       */
      public Builder setBodyBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setBodyBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:VideoRentalTerm.Term)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new com.github.yeriomin.playstore.message.VideoRentalTerm.Term();
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
          com.github.yeriomin.playstore.message.VideoRentalTerm.Term other = (com.github.yeriomin.playstore.message.VideoRentalTerm.Term) arg1;
          header_ = visitor.visitString(
              hasHeader(), header_,
              other.hasHeader(), other.header_);
          body_ = visitor.visitString(
              hasBody(), body_,
              other.hasBody(), other.body_);
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
                case 42: {
                  String s = input.readString();
                  bitField0_ |= 0x00000001;
                  header_ = s;
                  break;
                }
                case 50: {
                  String s = input.readString();
                  bitField0_ |= 0x00000002;
                  body_ = s;
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
          if (PARSER == null) {    synchronized (com.github.yeriomin.playstore.message.VideoRentalTerm.Term.class) {
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


    // @@protoc_insertion_point(class_scope:VideoRentalTerm.Term)
    private static final com.github.yeriomin.playstore.message.VideoRentalTerm.Term DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Term();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static com.github.yeriomin.playstore.message.VideoRentalTerm.Term getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Term> PARSER;

    public static com.google.protobuf.Parser<Term> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  private int bitField0_;
  public static final int OFFERTYPE_FIELD_NUMBER = 1;
  private int offerType_;
  /**
   * <code>optional int32 offerType = 1;</code>
   */
  public boolean hasOfferType() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional int32 offerType = 1;</code>
   */
  public int getOfferType() {
    return offerType_;
  }
  /**
   * <code>optional int32 offerType = 1;</code>
   */
  private void setOfferType(int value) {
    bitField0_ |= 0x00000001;
    offerType_ = value;
  }
  /**
   * <code>optional int32 offerType = 1;</code>
   */
  private void clearOfferType() {
    bitField0_ = (bitField0_ & ~0x00000001);
    offerType_ = 0;
  }

  public static final int OFFERABBREVIATION_FIELD_NUMBER = 2;
  private java.lang.String offerAbbreviation_;
  /**
   * <code>optional string offerAbbreviation = 2;</code>
   */
  public boolean hasOfferAbbreviation() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional string offerAbbreviation = 2;</code>
   */
  public java.lang.String getOfferAbbreviation() {
    return offerAbbreviation_;
  }
  /**
   * <code>optional string offerAbbreviation = 2;</code>
   */
  public com.google.protobuf.ByteString
      getOfferAbbreviationBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(offerAbbreviation_);
  }
  /**
   * <code>optional string offerAbbreviation = 2;</code>
   */
  private void setOfferAbbreviation(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
    offerAbbreviation_ = value;
  }
  /**
   * <code>optional string offerAbbreviation = 2;</code>
   */
  private void clearOfferAbbreviation() {
    bitField0_ = (bitField0_ & ~0x00000002);
    offerAbbreviation_ = getDefaultInstance().getOfferAbbreviation();
  }
  /**
   * <code>optional string offerAbbreviation = 2;</code>
   */
  private void setOfferAbbreviationBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
    offerAbbreviation_ = value.toStringUtf8();
  }

  public static final int RENTALHEADER_FIELD_NUMBER = 3;
  private java.lang.String rentalHeader_;
  /**
   * <code>optional string rentalHeader = 3;</code>
   */
  public boolean hasRentalHeader() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional string rentalHeader = 3;</code>
   */
  public java.lang.String getRentalHeader() {
    return rentalHeader_;
  }
  /**
   * <code>optional string rentalHeader = 3;</code>
   */
  public com.google.protobuf.ByteString
      getRentalHeaderBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(rentalHeader_);
  }
  /**
   * <code>optional string rentalHeader = 3;</code>
   */
  private void setRentalHeader(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
    rentalHeader_ = value;
  }
  /**
   * <code>optional string rentalHeader = 3;</code>
   */
  private void clearRentalHeader() {
    bitField0_ = (bitField0_ & ~0x00000004);
    rentalHeader_ = getDefaultInstance().getRentalHeader();
  }
  /**
   * <code>optional string rentalHeader = 3;</code>
   */
  private void setRentalHeaderBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
    rentalHeader_ = value.toStringUtf8();
  }

  public static final int TERM_FIELD_NUMBER = 4;
  private com.google.protobuf.Internal.ProtobufList<com.github.yeriomin.playstore.message.VideoRentalTerm.Term> term_;
  /**
   * <code>repeated group Term = 4 { ... }</code>
   */
  public java.util.List<com.github.yeriomin.playstore.message.VideoRentalTerm.Term> getTermList() {
    return term_;
  }
  /**
   * <code>repeated group Term = 4 { ... }</code>
   */
  public java.util.List<? extends com.github.yeriomin.playstore.message.VideoRentalTerm.TermOrBuilder> 
      getTermOrBuilderList() {
    return term_;
  }
  /**
   * <code>repeated group Term = 4 { ... }</code>
   */
  public int getTermCount() {
    return term_.size();
  }
  /**
   * <code>repeated group Term = 4 { ... }</code>
   */
  public com.github.yeriomin.playstore.message.VideoRentalTerm.Term getTerm(int index) {
    return term_.get(index);
  }
  /**
   * <code>repeated group Term = 4 { ... }</code>
   */
  public com.github.yeriomin.playstore.message.VideoRentalTerm.TermOrBuilder getTermOrBuilder(
      int index) {
    return term_.get(index);
  }
  private void ensureTermIsMutable() {
    if (!term_.isModifiable()) {
      term_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(term_);
     }
  }

  /**
   * <code>repeated group Term = 4 { ... }</code>
   */
  private void setTerm(
      int index, com.github.yeriomin.playstore.message.VideoRentalTerm.Term value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureTermIsMutable();
    term_.set(index, value);
  }
  /**
   * <code>repeated group Term = 4 { ... }</code>
   */
  private void setTerm(
      int index, com.github.yeriomin.playstore.message.VideoRentalTerm.Term.Builder builderForValue) {
    ensureTermIsMutable();
    term_.set(index, builderForValue.build());
  }
  /**
   * <code>repeated group Term = 4 { ... }</code>
   */
  private void addTerm(com.github.yeriomin.playstore.message.VideoRentalTerm.Term value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureTermIsMutable();
    term_.add(value);
  }
  /**
   * <code>repeated group Term = 4 { ... }</code>
   */
  private void addTerm(
      int index, com.github.yeriomin.playstore.message.VideoRentalTerm.Term value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureTermIsMutable();
    term_.add(index, value);
  }
  /**
   * <code>repeated group Term = 4 { ... }</code>
   */
  private void addTerm(
      com.github.yeriomin.playstore.message.VideoRentalTerm.Term.Builder builderForValue) {
    ensureTermIsMutable();
    term_.add(builderForValue.build());
  }
  /**
   * <code>repeated group Term = 4 { ... }</code>
   */
  private void addTerm(
      int index, com.github.yeriomin.playstore.message.VideoRentalTerm.Term.Builder builderForValue) {
    ensureTermIsMutable();
    term_.add(index, builderForValue.build());
  }
  /**
   * <code>repeated group Term = 4 { ... }</code>
   */
  private void addAllTerm(
      java.lang.Iterable<? extends com.github.yeriomin.playstore.message.VideoRentalTerm.Term> values) {
    ensureTermIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, term_);
  }
  /**
   * <code>repeated group Term = 4 { ... }</code>
   */
  private void clearTerm() {
    term_ = emptyProtobufList();
  }
  /**
   * <code>repeated group Term = 4 { ... }</code>
   */
  private void removeTerm(int index) {
    ensureTermIsMutable();
    term_.remove(index);
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeInt32(1, offerType_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeString(2, getOfferAbbreviation());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeString(3, getRentalHeader());
    }
    for (int i = 0; i < term_.size(); i++) {
      output.writeGroup(4, term_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, offerType_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getOfferAbbreviation());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(3, getRentalHeader());
    }
    for (int i = 0; i < term_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeGroupSize(4, term_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstore.message.VideoRentalTerm parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.VideoRentalTerm parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.VideoRentalTerm parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.VideoRentalTerm parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.VideoRentalTerm parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.VideoRentalTerm parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.VideoRentalTerm parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.VideoRentalTerm parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.VideoRentalTerm parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.VideoRentalTerm parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstore.message.VideoRentalTerm prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code VideoRentalTerm}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstore.message.VideoRentalTerm, Builder> implements
      // @@protoc_insertion_point(builder_implements:VideoRentalTerm)
      com.github.yeriomin.playstore.message.VideoRentalTermOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.VideoRentalTerm.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional int32 offerType = 1;</code>
     */
    public boolean hasOfferType() {
      return instance.hasOfferType();
    }
    /**
     * <code>optional int32 offerType = 1;</code>
     */
    public int getOfferType() {
      return instance.getOfferType();
    }
    /**
     * <code>optional int32 offerType = 1;</code>
     */
    public Builder setOfferType(int value) {
      copyOnWrite();
      instance.setOfferType(value);
      return this;
    }
    /**
     * <code>optional int32 offerType = 1;</code>
     */
    public Builder clearOfferType() {
      copyOnWrite();
      instance.clearOfferType();
      return this;
    }

    /**
     * <code>optional string offerAbbreviation = 2;</code>
     */
    public boolean hasOfferAbbreviation() {
      return instance.hasOfferAbbreviation();
    }
    /**
     * <code>optional string offerAbbreviation = 2;</code>
     */
    public java.lang.String getOfferAbbreviation() {
      return instance.getOfferAbbreviation();
    }
    /**
     * <code>optional string offerAbbreviation = 2;</code>
     */
    public com.google.protobuf.ByteString
        getOfferAbbreviationBytes() {
      return instance.getOfferAbbreviationBytes();
    }
    /**
     * <code>optional string offerAbbreviation = 2;</code>
     */
    public Builder setOfferAbbreviation(
        java.lang.String value) {
      copyOnWrite();
      instance.setOfferAbbreviation(value);
      return this;
    }
    /**
     * <code>optional string offerAbbreviation = 2;</code>
     */
    public Builder clearOfferAbbreviation() {
      copyOnWrite();
      instance.clearOfferAbbreviation();
      return this;
    }
    /**
     * <code>optional string offerAbbreviation = 2;</code>
     */
    public Builder setOfferAbbreviationBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setOfferAbbreviationBytes(value);
      return this;
    }

    /**
     * <code>optional string rentalHeader = 3;</code>
     */
    public boolean hasRentalHeader() {
      return instance.hasRentalHeader();
    }
    /**
     * <code>optional string rentalHeader = 3;</code>
     */
    public java.lang.String getRentalHeader() {
      return instance.getRentalHeader();
    }
    /**
     * <code>optional string rentalHeader = 3;</code>
     */
    public com.google.protobuf.ByteString
        getRentalHeaderBytes() {
      return instance.getRentalHeaderBytes();
    }
    /**
     * <code>optional string rentalHeader = 3;</code>
     */
    public Builder setRentalHeader(
        java.lang.String value) {
      copyOnWrite();
      instance.setRentalHeader(value);
      return this;
    }
    /**
     * <code>optional string rentalHeader = 3;</code>
     */
    public Builder clearRentalHeader() {
      copyOnWrite();
      instance.clearRentalHeader();
      return this;
    }
    /**
     * <code>optional string rentalHeader = 3;</code>
     */
    public Builder setRentalHeaderBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setRentalHeaderBytes(value);
      return this;
    }

    /**
     * <code>repeated group Term = 4 { ... }</code>
     */
    public java.util.List<com.github.yeriomin.playstore.message.VideoRentalTerm.Term> getTermList() {
      return java.util.Collections.unmodifiableList(
          instance.getTermList());
    }
    /**
     * <code>repeated group Term = 4 { ... }</code>
     */
    public int getTermCount() {
      return instance.getTermCount();
    }/**
     * <code>repeated group Term = 4 { ... }</code>
     */
    public com.github.yeriomin.playstore.message.VideoRentalTerm.Term getTerm(int index) {
      return instance.getTerm(index);
    }
    /**
     * <code>repeated group Term = 4 { ... }</code>
     */
    public Builder setTerm(
        int index, com.github.yeriomin.playstore.message.VideoRentalTerm.Term value) {
      copyOnWrite();
      instance.setTerm(index, value);
      return this;
    }
    /**
     * <code>repeated group Term = 4 { ... }</code>
     */
    public Builder setTerm(
        int index, com.github.yeriomin.playstore.message.VideoRentalTerm.Term.Builder builderForValue) {
      copyOnWrite();
      instance.setTerm(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated group Term = 4 { ... }</code>
     */
    public Builder addTerm(com.github.yeriomin.playstore.message.VideoRentalTerm.Term value) {
      copyOnWrite();
      instance.addTerm(value);
      return this;
    }
    /**
     * <code>repeated group Term = 4 { ... }</code>
     */
    public Builder addTerm(
        int index, com.github.yeriomin.playstore.message.VideoRentalTerm.Term value) {
      copyOnWrite();
      instance.addTerm(index, value);
      return this;
    }
    /**
     * <code>repeated group Term = 4 { ... }</code>
     */
    public Builder addTerm(
        com.github.yeriomin.playstore.message.VideoRentalTerm.Term.Builder builderForValue) {
      copyOnWrite();
      instance.addTerm(builderForValue);
      return this;
    }
    /**
     * <code>repeated group Term = 4 { ... }</code>
     */
    public Builder addTerm(
        int index, com.github.yeriomin.playstore.message.VideoRentalTerm.Term.Builder builderForValue) {
      copyOnWrite();
      instance.addTerm(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated group Term = 4 { ... }</code>
     */
    public Builder addAllTerm(
        java.lang.Iterable<? extends com.github.yeriomin.playstore.message.VideoRentalTerm.Term> values) {
      copyOnWrite();
      instance.addAllTerm(values);
      return this;
    }
    /**
     * <code>repeated group Term = 4 { ... }</code>
     */
    public Builder clearTerm() {
      copyOnWrite();
      instance.clearTerm();
      return this;
    }
    /**
     * <code>repeated group Term = 4 { ... }</code>
     */
    public Builder removeTerm(int index) {
      copyOnWrite();
      instance.removeTerm(index);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:VideoRentalTerm)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstore.message.VideoRentalTerm();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        term_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.github.yeriomin.playstore.message.VideoRentalTerm other = (com.github.yeriomin.playstore.message.VideoRentalTerm) arg1;
        offerType_ = visitor.visitInt(
            hasOfferType(), offerType_,
            other.hasOfferType(), other.offerType_);
        offerAbbreviation_ = visitor.visitString(
            hasOfferAbbreviation(), offerAbbreviation_,
            other.hasOfferAbbreviation(), other.offerAbbreviation_);
        rentalHeader_ = visitor.visitString(
            hasRentalHeader(), rentalHeader_,
            other.hasRentalHeader(), other.rentalHeader_);
        term_= visitor.visitList(term_, other.term_);
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
                offerType_ = input.readInt32();
                break;
              }
              case 18: {
                String s = input.readString();
                bitField0_ |= 0x00000002;
                offerAbbreviation_ = s;
                break;
              }
              case 26: {
                String s = input.readString();
                bitField0_ |= 0x00000004;
                rentalHeader_ = s;
                break;
              }
              case 35: {
                if (!term_.isModifiable()) {
                  term_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(term_);
                }
                term_.add(input.readGroup(4, com.github.yeriomin.playstore.message.VideoRentalTerm.Term.parser(),
                    extensionRegistry));
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstore.message.VideoRentalTerm.class) {
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


  // @@protoc_insertion_point(class_scope:VideoRentalTerm)
  private static final com.github.yeriomin.playstore.message.VideoRentalTerm DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new VideoRentalTerm();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstore.message.VideoRentalTerm getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<VideoRentalTerm> PARSER;

  public static com.google.protobuf.Parser<VideoRentalTerm> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

