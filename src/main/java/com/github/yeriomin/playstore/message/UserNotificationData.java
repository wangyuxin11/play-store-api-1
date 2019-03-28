// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

/**
 * Protobuf type {@code UserNotificationData}
 */
public  final class UserNotificationData extends
    com.google.protobuf.GeneratedMessageLite<
        UserNotificationData, UserNotificationData.Builder> implements
    // @@protoc_insertion_point(message_implements:UserNotificationData)
    UserNotificationDataOrBuilder {
  private UserNotificationData() {
    notificationTitle_ = "";
    notificationText_ = "";
    tickerText_ = "";
    dialogTitle_ = "";
    dialogText_ = "";
  }
  private int bitField0_;
  public static final int NOTIFICATIONTITLE_FIELD_NUMBER = 1;
  private java.lang.String notificationTitle_;
  /**
   * <code>optional string notificationTitle = 1;</code>
   */
  public boolean hasNotificationTitle() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string notificationTitle = 1;</code>
   */
  public java.lang.String getNotificationTitle() {
    return notificationTitle_;
  }
  /**
   * <code>optional string notificationTitle = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNotificationTitleBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(notificationTitle_);
  }
  /**
   * <code>optional string notificationTitle = 1;</code>
   */
  private void setNotificationTitle(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    notificationTitle_ = value;
  }
  /**
   * <code>optional string notificationTitle = 1;</code>
   */
  private void clearNotificationTitle() {
    bitField0_ = (bitField0_ & ~0x00000001);
    notificationTitle_ = getDefaultInstance().getNotificationTitle();
  }
  /**
   * <code>optional string notificationTitle = 1;</code>
   */
  private void setNotificationTitleBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    notificationTitle_ = value.toStringUtf8();
  }

  public static final int NOTIFICATIONTEXT_FIELD_NUMBER = 2;
  private java.lang.String notificationText_;
  /**
   * <code>optional string notificationText = 2;</code>
   */
  public boolean hasNotificationText() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional string notificationText = 2;</code>
   */
  public java.lang.String getNotificationText() {
    return notificationText_;
  }
  /**
   * <code>optional string notificationText = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNotificationTextBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(notificationText_);
  }
  /**
   * <code>optional string notificationText = 2;</code>
   */
  private void setNotificationText(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
    notificationText_ = value;
  }
  /**
   * <code>optional string notificationText = 2;</code>
   */
  private void clearNotificationText() {
    bitField0_ = (bitField0_ & ~0x00000002);
    notificationText_ = getDefaultInstance().getNotificationText();
  }
  /**
   * <code>optional string notificationText = 2;</code>
   */
  private void setNotificationTextBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
    notificationText_ = value.toStringUtf8();
  }

  public static final int TICKERTEXT_FIELD_NUMBER = 3;
  private java.lang.String tickerText_;
  /**
   * <code>optional string tickerText = 3;</code>
   */
  public boolean hasTickerText() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional string tickerText = 3;</code>
   */
  public java.lang.String getTickerText() {
    return tickerText_;
  }
  /**
   * <code>optional string tickerText = 3;</code>
   */
  public com.google.protobuf.ByteString
      getTickerTextBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(tickerText_);
  }
  /**
   * <code>optional string tickerText = 3;</code>
   */
  private void setTickerText(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
    tickerText_ = value;
  }
  /**
   * <code>optional string tickerText = 3;</code>
   */
  private void clearTickerText() {
    bitField0_ = (bitField0_ & ~0x00000004);
    tickerText_ = getDefaultInstance().getTickerText();
  }
  /**
   * <code>optional string tickerText = 3;</code>
   */
  private void setTickerTextBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
    tickerText_ = value.toStringUtf8();
  }

  public static final int DIALOGTITLE_FIELD_NUMBER = 4;
  private java.lang.String dialogTitle_;
  /**
   * <code>optional string dialogTitle = 4;</code>
   */
  public boolean hasDialogTitle() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>optional string dialogTitle = 4;</code>
   */
  public java.lang.String getDialogTitle() {
    return dialogTitle_;
  }
  /**
   * <code>optional string dialogTitle = 4;</code>
   */
  public com.google.protobuf.ByteString
      getDialogTitleBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(dialogTitle_);
  }
  /**
   * <code>optional string dialogTitle = 4;</code>
   */
  private void setDialogTitle(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
    dialogTitle_ = value;
  }
  /**
   * <code>optional string dialogTitle = 4;</code>
   */
  private void clearDialogTitle() {
    bitField0_ = (bitField0_ & ~0x00000008);
    dialogTitle_ = getDefaultInstance().getDialogTitle();
  }
  /**
   * <code>optional string dialogTitle = 4;</code>
   */
  private void setDialogTitleBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
    dialogTitle_ = value.toStringUtf8();
  }

  public static final int DIALOGTEXT_FIELD_NUMBER = 5;
  private java.lang.String dialogText_;
  /**
   * <code>optional string dialogText = 5;</code>
   */
  public boolean hasDialogText() {
    return ((bitField0_ & 0x00000010) == 0x00000010);
  }
  /**
   * <code>optional string dialogText = 5;</code>
   */
  public java.lang.String getDialogText() {
    return dialogText_;
  }
  /**
   * <code>optional string dialogText = 5;</code>
   */
  public com.google.protobuf.ByteString
      getDialogTextBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(dialogText_);
  }
  /**
   * <code>optional string dialogText = 5;</code>
   */
  private void setDialogText(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
    dialogText_ = value;
  }
  /**
   * <code>optional string dialogText = 5;</code>
   */
  private void clearDialogText() {
    bitField0_ = (bitField0_ & ~0x00000010);
    dialogText_ = getDefaultInstance().getDialogText();
  }
  /**
   * <code>optional string dialogText = 5;</code>
   */
  private void setDialogTextBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
    dialogText_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeString(1, getNotificationTitle());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeString(2, getNotificationText());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeString(3, getTickerText());
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeString(4, getDialogTitle());
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      output.writeString(5, getDialogText());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getNotificationTitle());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getNotificationText());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(3, getTickerText());
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(4, getDialogTitle());
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(5, getDialogText());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstore.message.UserNotificationData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.UserNotificationData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.UserNotificationData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstore.message.UserNotificationData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.UserNotificationData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.UserNotificationData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.UserNotificationData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.UserNotificationData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstore.message.UserNotificationData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstore.message.UserNotificationData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstore.message.UserNotificationData prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code UserNotificationData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstore.message.UserNotificationData, Builder> implements
      // @@protoc_insertion_point(builder_implements:UserNotificationData)
      com.github.yeriomin.playstore.message.UserNotificationDataOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.UserNotificationData.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional string notificationTitle = 1;</code>
     */
    public boolean hasNotificationTitle() {
      return instance.hasNotificationTitle();
    }
    /**
     * <code>optional string notificationTitle = 1;</code>
     */
    public java.lang.String getNotificationTitle() {
      return instance.getNotificationTitle();
    }
    /**
     * <code>optional string notificationTitle = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNotificationTitleBytes() {
      return instance.getNotificationTitleBytes();
    }
    /**
     * <code>optional string notificationTitle = 1;</code>
     */
    public Builder setNotificationTitle(
        java.lang.String value) {
      copyOnWrite();
      instance.setNotificationTitle(value);
      return this;
    }
    /**
     * <code>optional string notificationTitle = 1;</code>
     */
    public Builder clearNotificationTitle() {
      copyOnWrite();
      instance.clearNotificationTitle();
      return this;
    }
    /**
     * <code>optional string notificationTitle = 1;</code>
     */
    public Builder setNotificationTitleBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setNotificationTitleBytes(value);
      return this;
    }

    /**
     * <code>optional string notificationText = 2;</code>
     */
    public boolean hasNotificationText() {
      return instance.hasNotificationText();
    }
    /**
     * <code>optional string notificationText = 2;</code>
     */
    public java.lang.String getNotificationText() {
      return instance.getNotificationText();
    }
    /**
     * <code>optional string notificationText = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNotificationTextBytes() {
      return instance.getNotificationTextBytes();
    }
    /**
     * <code>optional string notificationText = 2;</code>
     */
    public Builder setNotificationText(
        java.lang.String value) {
      copyOnWrite();
      instance.setNotificationText(value);
      return this;
    }
    /**
     * <code>optional string notificationText = 2;</code>
     */
    public Builder clearNotificationText() {
      copyOnWrite();
      instance.clearNotificationText();
      return this;
    }
    /**
     * <code>optional string notificationText = 2;</code>
     */
    public Builder setNotificationTextBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setNotificationTextBytes(value);
      return this;
    }

    /**
     * <code>optional string tickerText = 3;</code>
     */
    public boolean hasTickerText() {
      return instance.hasTickerText();
    }
    /**
     * <code>optional string tickerText = 3;</code>
     */
    public java.lang.String getTickerText() {
      return instance.getTickerText();
    }
    /**
     * <code>optional string tickerText = 3;</code>
     */
    public com.google.protobuf.ByteString
        getTickerTextBytes() {
      return instance.getTickerTextBytes();
    }
    /**
     * <code>optional string tickerText = 3;</code>
     */
    public Builder setTickerText(
        java.lang.String value) {
      copyOnWrite();
      instance.setTickerText(value);
      return this;
    }
    /**
     * <code>optional string tickerText = 3;</code>
     */
    public Builder clearTickerText() {
      copyOnWrite();
      instance.clearTickerText();
      return this;
    }
    /**
     * <code>optional string tickerText = 3;</code>
     */
    public Builder setTickerTextBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTickerTextBytes(value);
      return this;
    }

    /**
     * <code>optional string dialogTitle = 4;</code>
     */
    public boolean hasDialogTitle() {
      return instance.hasDialogTitle();
    }
    /**
     * <code>optional string dialogTitle = 4;</code>
     */
    public java.lang.String getDialogTitle() {
      return instance.getDialogTitle();
    }
    /**
     * <code>optional string dialogTitle = 4;</code>
     */
    public com.google.protobuf.ByteString
        getDialogTitleBytes() {
      return instance.getDialogTitleBytes();
    }
    /**
     * <code>optional string dialogTitle = 4;</code>
     */
    public Builder setDialogTitle(
        java.lang.String value) {
      copyOnWrite();
      instance.setDialogTitle(value);
      return this;
    }
    /**
     * <code>optional string dialogTitle = 4;</code>
     */
    public Builder clearDialogTitle() {
      copyOnWrite();
      instance.clearDialogTitle();
      return this;
    }
    /**
     * <code>optional string dialogTitle = 4;</code>
     */
    public Builder setDialogTitleBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setDialogTitleBytes(value);
      return this;
    }

    /**
     * <code>optional string dialogText = 5;</code>
     */
    public boolean hasDialogText() {
      return instance.hasDialogText();
    }
    /**
     * <code>optional string dialogText = 5;</code>
     */
    public java.lang.String getDialogText() {
      return instance.getDialogText();
    }
    /**
     * <code>optional string dialogText = 5;</code>
     */
    public com.google.protobuf.ByteString
        getDialogTextBytes() {
      return instance.getDialogTextBytes();
    }
    /**
     * <code>optional string dialogText = 5;</code>
     */
    public Builder setDialogText(
        java.lang.String value) {
      copyOnWrite();
      instance.setDialogText(value);
      return this;
    }
    /**
     * <code>optional string dialogText = 5;</code>
     */
    public Builder clearDialogText() {
      copyOnWrite();
      instance.clearDialogText();
      return this;
    }
    /**
     * <code>optional string dialogText = 5;</code>
     */
    public Builder setDialogTextBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setDialogTextBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:UserNotificationData)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstore.message.UserNotificationData();
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
        com.github.yeriomin.playstore.message.UserNotificationData other = (com.github.yeriomin.playstore.message.UserNotificationData) arg1;
        notificationTitle_ = visitor.visitString(
            hasNotificationTitle(), notificationTitle_,
            other.hasNotificationTitle(), other.notificationTitle_);
        notificationText_ = visitor.visitString(
            hasNotificationText(), notificationText_,
            other.hasNotificationText(), other.notificationText_);
        tickerText_ = visitor.visitString(
            hasTickerText(), tickerText_,
            other.hasTickerText(), other.tickerText_);
        dialogTitle_ = visitor.visitString(
            hasDialogTitle(), dialogTitle_,
            other.hasDialogTitle(), other.dialogTitle_);
        dialogText_ = visitor.visitString(
            hasDialogText(), dialogText_,
            other.hasDialogText(), other.dialogText_);
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
                notificationTitle_ = s;
                break;
              }
              case 18: {
                String s = input.readString();
                bitField0_ |= 0x00000002;
                notificationText_ = s;
                break;
              }
              case 26: {
                String s = input.readString();
                bitField0_ |= 0x00000004;
                tickerText_ = s;
                break;
              }
              case 34: {
                String s = input.readString();
                bitField0_ |= 0x00000008;
                dialogTitle_ = s;
                break;
              }
              case 42: {
                String s = input.readString();
                bitField0_ |= 0x00000010;
                dialogText_ = s;
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstore.message.UserNotificationData.class) {
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


  // @@protoc_insertion_point(class_scope:UserNotificationData)
  private static final com.github.yeriomin.playstore.message.UserNotificationData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new UserNotificationData();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstore.message.UserNotificationData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<UserNotificationData> PARSER;

  public static com.google.protobuf.Parser<UserNotificationData> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
