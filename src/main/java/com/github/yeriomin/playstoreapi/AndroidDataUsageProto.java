// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstoreapi;

/**
 * Protobuf type {@code AndroidDataUsageProto}
 */
public  final class AndroidDataUsageProto extends
    com.google.protobuf.GeneratedMessageLite<
        AndroidDataUsageProto, AndroidDataUsageProto.Builder> implements
    // @@protoc_insertion_point(message_implements:AndroidDataUsageProto)
    AndroidDataUsageProtoOrBuilder {
  private AndroidDataUsageProto() {
    keyToPackageNameMapping_ = emptyProtobufList();
    payloadLevelAppStat_ = emptyProtobufList();
    ipLayerNetworkStat_ = emptyProtobufList();
  }
  private int bitField0_;
  public static final int VERSION_FIELD_NUMBER = 1;
  private int version_;
  /**
   * <code>optional int32 version = 1;</code>
   */
  public boolean hasVersion() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional int32 version = 1;</code>
   */
  public int getVersion() {
    return version_;
  }
  /**
   * <code>optional int32 version = 1;</code>
   */
  private void setVersion(int value) {
    bitField0_ |= 0x00000001;
    version_ = value;
  }
  /**
   * <code>optional int32 version = 1;</code>
   */
  private void clearVersion() {
    bitField0_ = (bitField0_ & ~0x00000001);
    version_ = 0;
  }

  public static final int CURRENTREPORTMSEC_FIELD_NUMBER = 2;
  private long currentReportMsec_;
  /**
   * <code>optional int64 currentReportMsec = 2;</code>
   */
  public boolean hasCurrentReportMsec() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int64 currentReportMsec = 2;</code>
   */
  public long getCurrentReportMsec() {
    return currentReportMsec_;
  }
  /**
   * <code>optional int64 currentReportMsec = 2;</code>
   */
  private void setCurrentReportMsec(long value) {
    bitField0_ |= 0x00000002;
    currentReportMsec_ = value;
  }
  /**
   * <code>optional int64 currentReportMsec = 2;</code>
   */
  private void clearCurrentReportMsec() {
    bitField0_ = (bitField0_ & ~0x00000002);
    currentReportMsec_ = 0L;
  }

  public static final int KEYTOPACKAGENAMEMAPPING_FIELD_NUMBER = 3;
  private com.google.protobuf.Internal.ProtobufList<com.github.yeriomin.playstoreapi.KeyToPackageNameMapping> keyToPackageNameMapping_;
  /**
   * <code>repeated .KeyToPackageNameMapping keyToPackageNameMapping = 3;</code>
   */
  public java.util.List<com.github.yeriomin.playstoreapi.KeyToPackageNameMapping> getKeyToPackageNameMappingList() {
    return keyToPackageNameMapping_;
  }
  /**
   * <code>repeated .KeyToPackageNameMapping keyToPackageNameMapping = 3;</code>
   */
  public java.util.List<? extends com.github.yeriomin.playstoreapi.KeyToPackageNameMappingOrBuilder> 
      getKeyToPackageNameMappingOrBuilderList() {
    return keyToPackageNameMapping_;
  }
  /**
   * <code>repeated .KeyToPackageNameMapping keyToPackageNameMapping = 3;</code>
   */
  public int getKeyToPackageNameMappingCount() {
    return keyToPackageNameMapping_.size();
  }
  /**
   * <code>repeated .KeyToPackageNameMapping keyToPackageNameMapping = 3;</code>
   */
  public com.github.yeriomin.playstoreapi.KeyToPackageNameMapping getKeyToPackageNameMapping(int index) {
    return keyToPackageNameMapping_.get(index);
  }
  /**
   * <code>repeated .KeyToPackageNameMapping keyToPackageNameMapping = 3;</code>
   */
  public com.github.yeriomin.playstoreapi.KeyToPackageNameMappingOrBuilder getKeyToPackageNameMappingOrBuilder(
      int index) {
    return keyToPackageNameMapping_.get(index);
  }
  private void ensureKeyToPackageNameMappingIsMutable() {
    if (!keyToPackageNameMapping_.isModifiable()) {
      keyToPackageNameMapping_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(keyToPackageNameMapping_);
     }
  }

  /**
   * <code>repeated .KeyToPackageNameMapping keyToPackageNameMapping = 3;</code>
   */
  private void setKeyToPackageNameMapping(
      int index, com.github.yeriomin.playstoreapi.KeyToPackageNameMapping value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureKeyToPackageNameMappingIsMutable();
    keyToPackageNameMapping_.set(index, value);
  }
  /**
   * <code>repeated .KeyToPackageNameMapping keyToPackageNameMapping = 3;</code>
   */
  private void setKeyToPackageNameMapping(
      int index, com.github.yeriomin.playstoreapi.KeyToPackageNameMapping.Builder builderForValue) {
    ensureKeyToPackageNameMappingIsMutable();
    keyToPackageNameMapping_.set(index, builderForValue.build());
  }
  /**
   * <code>repeated .KeyToPackageNameMapping keyToPackageNameMapping = 3;</code>
   */
  private void addKeyToPackageNameMapping(com.github.yeriomin.playstoreapi.KeyToPackageNameMapping value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureKeyToPackageNameMappingIsMutable();
    keyToPackageNameMapping_.add(value);
  }
  /**
   * <code>repeated .KeyToPackageNameMapping keyToPackageNameMapping = 3;</code>
   */
  private void addKeyToPackageNameMapping(
      int index, com.github.yeriomin.playstoreapi.KeyToPackageNameMapping value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureKeyToPackageNameMappingIsMutable();
    keyToPackageNameMapping_.add(index, value);
  }
  /**
   * <code>repeated .KeyToPackageNameMapping keyToPackageNameMapping = 3;</code>
   */
  private void addKeyToPackageNameMapping(
      com.github.yeriomin.playstoreapi.KeyToPackageNameMapping.Builder builderForValue) {
    ensureKeyToPackageNameMappingIsMutable();
    keyToPackageNameMapping_.add(builderForValue.build());
  }
  /**
   * <code>repeated .KeyToPackageNameMapping keyToPackageNameMapping = 3;</code>
   */
  private void addKeyToPackageNameMapping(
      int index, com.github.yeriomin.playstoreapi.KeyToPackageNameMapping.Builder builderForValue) {
    ensureKeyToPackageNameMappingIsMutable();
    keyToPackageNameMapping_.add(index, builderForValue.build());
  }
  /**
   * <code>repeated .KeyToPackageNameMapping keyToPackageNameMapping = 3;</code>
   */
  private void addAllKeyToPackageNameMapping(
      java.lang.Iterable<? extends com.github.yeriomin.playstoreapi.KeyToPackageNameMapping> values) {
    ensureKeyToPackageNameMappingIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, keyToPackageNameMapping_);
  }
  /**
   * <code>repeated .KeyToPackageNameMapping keyToPackageNameMapping = 3;</code>
   */
  private void clearKeyToPackageNameMapping() {
    keyToPackageNameMapping_ = emptyProtobufList();
  }
  /**
   * <code>repeated .KeyToPackageNameMapping keyToPackageNameMapping = 3;</code>
   */
  private void removeKeyToPackageNameMapping(int index) {
    ensureKeyToPackageNameMappingIsMutable();
    keyToPackageNameMapping_.remove(index);
  }

  public static final int PAYLOADLEVELAPPSTAT_FIELD_NUMBER = 4;
  private com.google.protobuf.Internal.ProtobufList<com.github.yeriomin.playstoreapi.PayloadLevelAppStat> payloadLevelAppStat_;
  /**
   * <code>repeated .PayloadLevelAppStat payloadLevelAppStat = 4;</code>
   */
  public java.util.List<com.github.yeriomin.playstoreapi.PayloadLevelAppStat> getPayloadLevelAppStatList() {
    return payloadLevelAppStat_;
  }
  /**
   * <code>repeated .PayloadLevelAppStat payloadLevelAppStat = 4;</code>
   */
  public java.util.List<? extends com.github.yeriomin.playstoreapi.PayloadLevelAppStatOrBuilder> 
      getPayloadLevelAppStatOrBuilderList() {
    return payloadLevelAppStat_;
  }
  /**
   * <code>repeated .PayloadLevelAppStat payloadLevelAppStat = 4;</code>
   */
  public int getPayloadLevelAppStatCount() {
    return payloadLevelAppStat_.size();
  }
  /**
   * <code>repeated .PayloadLevelAppStat payloadLevelAppStat = 4;</code>
   */
  public com.github.yeriomin.playstoreapi.PayloadLevelAppStat getPayloadLevelAppStat(int index) {
    return payloadLevelAppStat_.get(index);
  }
  /**
   * <code>repeated .PayloadLevelAppStat payloadLevelAppStat = 4;</code>
   */
  public com.github.yeriomin.playstoreapi.PayloadLevelAppStatOrBuilder getPayloadLevelAppStatOrBuilder(
      int index) {
    return payloadLevelAppStat_.get(index);
  }
  private void ensurePayloadLevelAppStatIsMutable() {
    if (!payloadLevelAppStat_.isModifiable()) {
      payloadLevelAppStat_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(payloadLevelAppStat_);
     }
  }

  /**
   * <code>repeated .PayloadLevelAppStat payloadLevelAppStat = 4;</code>
   */
  private void setPayloadLevelAppStat(
      int index, com.github.yeriomin.playstoreapi.PayloadLevelAppStat value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensurePayloadLevelAppStatIsMutable();
    payloadLevelAppStat_.set(index, value);
  }
  /**
   * <code>repeated .PayloadLevelAppStat payloadLevelAppStat = 4;</code>
   */
  private void setPayloadLevelAppStat(
      int index, com.github.yeriomin.playstoreapi.PayloadLevelAppStat.Builder builderForValue) {
    ensurePayloadLevelAppStatIsMutable();
    payloadLevelAppStat_.set(index, builderForValue.build());
  }
  /**
   * <code>repeated .PayloadLevelAppStat payloadLevelAppStat = 4;</code>
   */
  private void addPayloadLevelAppStat(com.github.yeriomin.playstoreapi.PayloadLevelAppStat value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensurePayloadLevelAppStatIsMutable();
    payloadLevelAppStat_.add(value);
  }
  /**
   * <code>repeated .PayloadLevelAppStat payloadLevelAppStat = 4;</code>
   */
  private void addPayloadLevelAppStat(
      int index, com.github.yeriomin.playstoreapi.PayloadLevelAppStat value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensurePayloadLevelAppStatIsMutable();
    payloadLevelAppStat_.add(index, value);
  }
  /**
   * <code>repeated .PayloadLevelAppStat payloadLevelAppStat = 4;</code>
   */
  private void addPayloadLevelAppStat(
      com.github.yeriomin.playstoreapi.PayloadLevelAppStat.Builder builderForValue) {
    ensurePayloadLevelAppStatIsMutable();
    payloadLevelAppStat_.add(builderForValue.build());
  }
  /**
   * <code>repeated .PayloadLevelAppStat payloadLevelAppStat = 4;</code>
   */
  private void addPayloadLevelAppStat(
      int index, com.github.yeriomin.playstoreapi.PayloadLevelAppStat.Builder builderForValue) {
    ensurePayloadLevelAppStatIsMutable();
    payloadLevelAppStat_.add(index, builderForValue.build());
  }
  /**
   * <code>repeated .PayloadLevelAppStat payloadLevelAppStat = 4;</code>
   */
  private void addAllPayloadLevelAppStat(
      java.lang.Iterable<? extends com.github.yeriomin.playstoreapi.PayloadLevelAppStat> values) {
    ensurePayloadLevelAppStatIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, payloadLevelAppStat_);
  }
  /**
   * <code>repeated .PayloadLevelAppStat payloadLevelAppStat = 4;</code>
   */
  private void clearPayloadLevelAppStat() {
    payloadLevelAppStat_ = emptyProtobufList();
  }
  /**
   * <code>repeated .PayloadLevelAppStat payloadLevelAppStat = 4;</code>
   */
  private void removePayloadLevelAppStat(int index) {
    ensurePayloadLevelAppStatIsMutable();
    payloadLevelAppStat_.remove(index);
  }

  public static final int IPLAYERNETWORKSTAT_FIELD_NUMBER = 5;
  private com.google.protobuf.Internal.ProtobufList<com.github.yeriomin.playstoreapi.IpLayerNetworkStat> ipLayerNetworkStat_;
  /**
   * <code>repeated .IpLayerNetworkStat ipLayerNetworkStat = 5;</code>
   */
  public java.util.List<com.github.yeriomin.playstoreapi.IpLayerNetworkStat> getIpLayerNetworkStatList() {
    return ipLayerNetworkStat_;
  }
  /**
   * <code>repeated .IpLayerNetworkStat ipLayerNetworkStat = 5;</code>
   */
  public java.util.List<? extends com.github.yeriomin.playstoreapi.IpLayerNetworkStatOrBuilder> 
      getIpLayerNetworkStatOrBuilderList() {
    return ipLayerNetworkStat_;
  }
  /**
   * <code>repeated .IpLayerNetworkStat ipLayerNetworkStat = 5;</code>
   */
  public int getIpLayerNetworkStatCount() {
    return ipLayerNetworkStat_.size();
  }
  /**
   * <code>repeated .IpLayerNetworkStat ipLayerNetworkStat = 5;</code>
   */
  public com.github.yeriomin.playstoreapi.IpLayerNetworkStat getIpLayerNetworkStat(int index) {
    return ipLayerNetworkStat_.get(index);
  }
  /**
   * <code>repeated .IpLayerNetworkStat ipLayerNetworkStat = 5;</code>
   */
  public com.github.yeriomin.playstoreapi.IpLayerNetworkStatOrBuilder getIpLayerNetworkStatOrBuilder(
      int index) {
    return ipLayerNetworkStat_.get(index);
  }
  private void ensureIpLayerNetworkStatIsMutable() {
    if (!ipLayerNetworkStat_.isModifiable()) {
      ipLayerNetworkStat_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(ipLayerNetworkStat_);
     }
  }

  /**
   * <code>repeated .IpLayerNetworkStat ipLayerNetworkStat = 5;</code>
   */
  private void setIpLayerNetworkStat(
      int index, com.github.yeriomin.playstoreapi.IpLayerNetworkStat value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureIpLayerNetworkStatIsMutable();
    ipLayerNetworkStat_.set(index, value);
  }
  /**
   * <code>repeated .IpLayerNetworkStat ipLayerNetworkStat = 5;</code>
   */
  private void setIpLayerNetworkStat(
      int index, com.github.yeriomin.playstoreapi.IpLayerNetworkStat.Builder builderForValue) {
    ensureIpLayerNetworkStatIsMutable();
    ipLayerNetworkStat_.set(index, builderForValue.build());
  }
  /**
   * <code>repeated .IpLayerNetworkStat ipLayerNetworkStat = 5;</code>
   */
  private void addIpLayerNetworkStat(com.github.yeriomin.playstoreapi.IpLayerNetworkStat value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureIpLayerNetworkStatIsMutable();
    ipLayerNetworkStat_.add(value);
  }
  /**
   * <code>repeated .IpLayerNetworkStat ipLayerNetworkStat = 5;</code>
   */
  private void addIpLayerNetworkStat(
      int index, com.github.yeriomin.playstoreapi.IpLayerNetworkStat value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureIpLayerNetworkStatIsMutable();
    ipLayerNetworkStat_.add(index, value);
  }
  /**
   * <code>repeated .IpLayerNetworkStat ipLayerNetworkStat = 5;</code>
   */
  private void addIpLayerNetworkStat(
      com.github.yeriomin.playstoreapi.IpLayerNetworkStat.Builder builderForValue) {
    ensureIpLayerNetworkStatIsMutable();
    ipLayerNetworkStat_.add(builderForValue.build());
  }
  /**
   * <code>repeated .IpLayerNetworkStat ipLayerNetworkStat = 5;</code>
   */
  private void addIpLayerNetworkStat(
      int index, com.github.yeriomin.playstoreapi.IpLayerNetworkStat.Builder builderForValue) {
    ensureIpLayerNetworkStatIsMutable();
    ipLayerNetworkStat_.add(index, builderForValue.build());
  }
  /**
   * <code>repeated .IpLayerNetworkStat ipLayerNetworkStat = 5;</code>
   */
  private void addAllIpLayerNetworkStat(
      java.lang.Iterable<? extends com.github.yeriomin.playstoreapi.IpLayerNetworkStat> values) {
    ensureIpLayerNetworkStatIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, ipLayerNetworkStat_);
  }
  /**
   * <code>repeated .IpLayerNetworkStat ipLayerNetworkStat = 5;</code>
   */
  private void clearIpLayerNetworkStat() {
    ipLayerNetworkStat_ = emptyProtobufList();
  }
  /**
   * <code>repeated .IpLayerNetworkStat ipLayerNetworkStat = 5;</code>
   */
  private void removeIpLayerNetworkStat(int index) {
    ensureIpLayerNetworkStatIsMutable();
    ipLayerNetworkStat_.remove(index);
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeInt32(1, version_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt64(2, currentReportMsec_);
    }
    for (int i = 0; i < keyToPackageNameMapping_.size(); i++) {
      output.writeMessage(3, keyToPackageNameMapping_.get(i));
    }
    for (int i = 0; i < payloadLevelAppStat_.size(); i++) {
      output.writeMessage(4, payloadLevelAppStat_.get(i));
    }
    for (int i = 0; i < ipLayerNetworkStat_.size(); i++) {
      output.writeMessage(5, ipLayerNetworkStat_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, version_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, currentReportMsec_);
    }
    for (int i = 0; i < keyToPackageNameMapping_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, keyToPackageNameMapping_.get(i));
    }
    for (int i = 0; i < payloadLevelAppStat_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, payloadLevelAppStat_.get(i));
    }
    for (int i = 0; i < ipLayerNetworkStat_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, ipLayerNetworkStat_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.github.yeriomin.playstoreapi.AndroidDataUsageProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstoreapi.AndroidDataUsageProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.AndroidDataUsageProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.github.yeriomin.playstoreapi.AndroidDataUsageProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.AndroidDataUsageProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.AndroidDataUsageProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.AndroidDataUsageProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.AndroidDataUsageProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.AndroidDataUsageProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.github.yeriomin.playstoreapi.AndroidDataUsageProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.yeriomin.playstoreapi.AndroidDataUsageProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code AndroidDataUsageProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.github.yeriomin.playstoreapi.AndroidDataUsageProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:AndroidDataUsageProto)
      com.github.yeriomin.playstoreapi.AndroidDataUsageProtoOrBuilder {
    // Construct using com.github.yeriomin.playstoreapi.AndroidDataUsageProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional int32 version = 1;</code>
     */
    public boolean hasVersion() {
      return instance.hasVersion();
    }
    /**
     * <code>optional int32 version = 1;</code>
     */
    public int getVersion() {
      return instance.getVersion();
    }
    /**
     * <code>optional int32 version = 1;</code>
     */
    public Builder setVersion(int value) {
      copyOnWrite();
      instance.setVersion(value);
      return this;
    }
    /**
     * <code>optional int32 version = 1;</code>
     */
    public Builder clearVersion() {
      copyOnWrite();
      instance.clearVersion();
      return this;
    }

    /**
     * <code>optional int64 currentReportMsec = 2;</code>
     */
    public boolean hasCurrentReportMsec() {
      return instance.hasCurrentReportMsec();
    }
    /**
     * <code>optional int64 currentReportMsec = 2;</code>
     */
    public long getCurrentReportMsec() {
      return instance.getCurrentReportMsec();
    }
    /**
     * <code>optional int64 currentReportMsec = 2;</code>
     */
    public Builder setCurrentReportMsec(long value) {
      copyOnWrite();
      instance.setCurrentReportMsec(value);
      return this;
    }
    /**
     * <code>optional int64 currentReportMsec = 2;</code>
     */
    public Builder clearCurrentReportMsec() {
      copyOnWrite();
      instance.clearCurrentReportMsec();
      return this;
    }

    /**
     * <code>repeated .KeyToPackageNameMapping keyToPackageNameMapping = 3;</code>
     */
    public java.util.List<com.github.yeriomin.playstoreapi.KeyToPackageNameMapping> getKeyToPackageNameMappingList() {
      return java.util.Collections.unmodifiableList(
          instance.getKeyToPackageNameMappingList());
    }
    /**
     * <code>repeated .KeyToPackageNameMapping keyToPackageNameMapping = 3;</code>
     */
    public int getKeyToPackageNameMappingCount() {
      return instance.getKeyToPackageNameMappingCount();
    }/**
     * <code>repeated .KeyToPackageNameMapping keyToPackageNameMapping = 3;</code>
     */
    public com.github.yeriomin.playstoreapi.KeyToPackageNameMapping getKeyToPackageNameMapping(int index) {
      return instance.getKeyToPackageNameMapping(index);
    }
    /**
     * <code>repeated .KeyToPackageNameMapping keyToPackageNameMapping = 3;</code>
     */
    public Builder setKeyToPackageNameMapping(
        int index, com.github.yeriomin.playstoreapi.KeyToPackageNameMapping value) {
      copyOnWrite();
      instance.setKeyToPackageNameMapping(index, value);
      return this;
    }
    /**
     * <code>repeated .KeyToPackageNameMapping keyToPackageNameMapping = 3;</code>
     */
    public Builder setKeyToPackageNameMapping(
        int index, com.github.yeriomin.playstoreapi.KeyToPackageNameMapping.Builder builderForValue) {
      copyOnWrite();
      instance.setKeyToPackageNameMapping(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .KeyToPackageNameMapping keyToPackageNameMapping = 3;</code>
     */
    public Builder addKeyToPackageNameMapping(com.github.yeriomin.playstoreapi.KeyToPackageNameMapping value) {
      copyOnWrite();
      instance.addKeyToPackageNameMapping(value);
      return this;
    }
    /**
     * <code>repeated .KeyToPackageNameMapping keyToPackageNameMapping = 3;</code>
     */
    public Builder addKeyToPackageNameMapping(
        int index, com.github.yeriomin.playstoreapi.KeyToPackageNameMapping value) {
      copyOnWrite();
      instance.addKeyToPackageNameMapping(index, value);
      return this;
    }
    /**
     * <code>repeated .KeyToPackageNameMapping keyToPackageNameMapping = 3;</code>
     */
    public Builder addKeyToPackageNameMapping(
        com.github.yeriomin.playstoreapi.KeyToPackageNameMapping.Builder builderForValue) {
      copyOnWrite();
      instance.addKeyToPackageNameMapping(builderForValue);
      return this;
    }
    /**
     * <code>repeated .KeyToPackageNameMapping keyToPackageNameMapping = 3;</code>
     */
    public Builder addKeyToPackageNameMapping(
        int index, com.github.yeriomin.playstoreapi.KeyToPackageNameMapping.Builder builderForValue) {
      copyOnWrite();
      instance.addKeyToPackageNameMapping(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .KeyToPackageNameMapping keyToPackageNameMapping = 3;</code>
     */
    public Builder addAllKeyToPackageNameMapping(
        java.lang.Iterable<? extends com.github.yeriomin.playstoreapi.KeyToPackageNameMapping> values) {
      copyOnWrite();
      instance.addAllKeyToPackageNameMapping(values);
      return this;
    }
    /**
     * <code>repeated .KeyToPackageNameMapping keyToPackageNameMapping = 3;</code>
     */
    public Builder clearKeyToPackageNameMapping() {
      copyOnWrite();
      instance.clearKeyToPackageNameMapping();
      return this;
    }
    /**
     * <code>repeated .KeyToPackageNameMapping keyToPackageNameMapping = 3;</code>
     */
    public Builder removeKeyToPackageNameMapping(int index) {
      copyOnWrite();
      instance.removeKeyToPackageNameMapping(index);
      return this;
    }

    /**
     * <code>repeated .PayloadLevelAppStat payloadLevelAppStat = 4;</code>
     */
    public java.util.List<com.github.yeriomin.playstoreapi.PayloadLevelAppStat> getPayloadLevelAppStatList() {
      return java.util.Collections.unmodifiableList(
          instance.getPayloadLevelAppStatList());
    }
    /**
     * <code>repeated .PayloadLevelAppStat payloadLevelAppStat = 4;</code>
     */
    public int getPayloadLevelAppStatCount() {
      return instance.getPayloadLevelAppStatCount();
    }/**
     * <code>repeated .PayloadLevelAppStat payloadLevelAppStat = 4;</code>
     */
    public com.github.yeriomin.playstoreapi.PayloadLevelAppStat getPayloadLevelAppStat(int index) {
      return instance.getPayloadLevelAppStat(index);
    }
    /**
     * <code>repeated .PayloadLevelAppStat payloadLevelAppStat = 4;</code>
     */
    public Builder setPayloadLevelAppStat(
        int index, com.github.yeriomin.playstoreapi.PayloadLevelAppStat value) {
      copyOnWrite();
      instance.setPayloadLevelAppStat(index, value);
      return this;
    }
    /**
     * <code>repeated .PayloadLevelAppStat payloadLevelAppStat = 4;</code>
     */
    public Builder setPayloadLevelAppStat(
        int index, com.github.yeriomin.playstoreapi.PayloadLevelAppStat.Builder builderForValue) {
      copyOnWrite();
      instance.setPayloadLevelAppStat(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .PayloadLevelAppStat payloadLevelAppStat = 4;</code>
     */
    public Builder addPayloadLevelAppStat(com.github.yeriomin.playstoreapi.PayloadLevelAppStat value) {
      copyOnWrite();
      instance.addPayloadLevelAppStat(value);
      return this;
    }
    /**
     * <code>repeated .PayloadLevelAppStat payloadLevelAppStat = 4;</code>
     */
    public Builder addPayloadLevelAppStat(
        int index, com.github.yeriomin.playstoreapi.PayloadLevelAppStat value) {
      copyOnWrite();
      instance.addPayloadLevelAppStat(index, value);
      return this;
    }
    /**
     * <code>repeated .PayloadLevelAppStat payloadLevelAppStat = 4;</code>
     */
    public Builder addPayloadLevelAppStat(
        com.github.yeriomin.playstoreapi.PayloadLevelAppStat.Builder builderForValue) {
      copyOnWrite();
      instance.addPayloadLevelAppStat(builderForValue);
      return this;
    }
    /**
     * <code>repeated .PayloadLevelAppStat payloadLevelAppStat = 4;</code>
     */
    public Builder addPayloadLevelAppStat(
        int index, com.github.yeriomin.playstoreapi.PayloadLevelAppStat.Builder builderForValue) {
      copyOnWrite();
      instance.addPayloadLevelAppStat(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .PayloadLevelAppStat payloadLevelAppStat = 4;</code>
     */
    public Builder addAllPayloadLevelAppStat(
        java.lang.Iterable<? extends com.github.yeriomin.playstoreapi.PayloadLevelAppStat> values) {
      copyOnWrite();
      instance.addAllPayloadLevelAppStat(values);
      return this;
    }
    /**
     * <code>repeated .PayloadLevelAppStat payloadLevelAppStat = 4;</code>
     */
    public Builder clearPayloadLevelAppStat() {
      copyOnWrite();
      instance.clearPayloadLevelAppStat();
      return this;
    }
    /**
     * <code>repeated .PayloadLevelAppStat payloadLevelAppStat = 4;</code>
     */
    public Builder removePayloadLevelAppStat(int index) {
      copyOnWrite();
      instance.removePayloadLevelAppStat(index);
      return this;
    }

    /**
     * <code>repeated .IpLayerNetworkStat ipLayerNetworkStat = 5;</code>
     */
    public java.util.List<com.github.yeriomin.playstoreapi.IpLayerNetworkStat> getIpLayerNetworkStatList() {
      return java.util.Collections.unmodifiableList(
          instance.getIpLayerNetworkStatList());
    }
    /**
     * <code>repeated .IpLayerNetworkStat ipLayerNetworkStat = 5;</code>
     */
    public int getIpLayerNetworkStatCount() {
      return instance.getIpLayerNetworkStatCount();
    }/**
     * <code>repeated .IpLayerNetworkStat ipLayerNetworkStat = 5;</code>
     */
    public com.github.yeriomin.playstoreapi.IpLayerNetworkStat getIpLayerNetworkStat(int index) {
      return instance.getIpLayerNetworkStat(index);
    }
    /**
     * <code>repeated .IpLayerNetworkStat ipLayerNetworkStat = 5;</code>
     */
    public Builder setIpLayerNetworkStat(
        int index, com.github.yeriomin.playstoreapi.IpLayerNetworkStat value) {
      copyOnWrite();
      instance.setIpLayerNetworkStat(index, value);
      return this;
    }
    /**
     * <code>repeated .IpLayerNetworkStat ipLayerNetworkStat = 5;</code>
     */
    public Builder setIpLayerNetworkStat(
        int index, com.github.yeriomin.playstoreapi.IpLayerNetworkStat.Builder builderForValue) {
      copyOnWrite();
      instance.setIpLayerNetworkStat(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .IpLayerNetworkStat ipLayerNetworkStat = 5;</code>
     */
    public Builder addIpLayerNetworkStat(com.github.yeriomin.playstoreapi.IpLayerNetworkStat value) {
      copyOnWrite();
      instance.addIpLayerNetworkStat(value);
      return this;
    }
    /**
     * <code>repeated .IpLayerNetworkStat ipLayerNetworkStat = 5;</code>
     */
    public Builder addIpLayerNetworkStat(
        int index, com.github.yeriomin.playstoreapi.IpLayerNetworkStat value) {
      copyOnWrite();
      instance.addIpLayerNetworkStat(index, value);
      return this;
    }
    /**
     * <code>repeated .IpLayerNetworkStat ipLayerNetworkStat = 5;</code>
     */
    public Builder addIpLayerNetworkStat(
        com.github.yeriomin.playstoreapi.IpLayerNetworkStat.Builder builderForValue) {
      copyOnWrite();
      instance.addIpLayerNetworkStat(builderForValue);
      return this;
    }
    /**
     * <code>repeated .IpLayerNetworkStat ipLayerNetworkStat = 5;</code>
     */
    public Builder addIpLayerNetworkStat(
        int index, com.github.yeriomin.playstoreapi.IpLayerNetworkStat.Builder builderForValue) {
      copyOnWrite();
      instance.addIpLayerNetworkStat(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .IpLayerNetworkStat ipLayerNetworkStat = 5;</code>
     */
    public Builder addAllIpLayerNetworkStat(
        java.lang.Iterable<? extends com.github.yeriomin.playstoreapi.IpLayerNetworkStat> values) {
      copyOnWrite();
      instance.addAllIpLayerNetworkStat(values);
      return this;
    }
    /**
     * <code>repeated .IpLayerNetworkStat ipLayerNetworkStat = 5;</code>
     */
    public Builder clearIpLayerNetworkStat() {
      copyOnWrite();
      instance.clearIpLayerNetworkStat();
      return this;
    }
    /**
     * <code>repeated .IpLayerNetworkStat ipLayerNetworkStat = 5;</code>
     */
    public Builder removeIpLayerNetworkStat(int index) {
      copyOnWrite();
      instance.removeIpLayerNetworkStat(index);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:AndroidDataUsageProto)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.github.yeriomin.playstoreapi.AndroidDataUsageProto();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        keyToPackageNameMapping_.makeImmutable();
        payloadLevelAppStat_.makeImmutable();
        ipLayerNetworkStat_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.github.yeriomin.playstoreapi.AndroidDataUsageProto other = (com.github.yeriomin.playstoreapi.AndroidDataUsageProto) arg1;
        version_ = visitor.visitInt(
            hasVersion(), version_,
            other.hasVersion(), other.version_);
        currentReportMsec_ = visitor.visitLong(
            hasCurrentReportMsec(), currentReportMsec_,
            other.hasCurrentReportMsec(), other.currentReportMsec_);
        keyToPackageNameMapping_= visitor.visitList(keyToPackageNameMapping_, other.keyToPackageNameMapping_);
        payloadLevelAppStat_= visitor.visitList(payloadLevelAppStat_, other.payloadLevelAppStat_);
        ipLayerNetworkStat_= visitor.visitList(ipLayerNetworkStat_, other.ipLayerNetworkStat_);
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
                version_ = input.readInt32();
                break;
              }
              case 16: {
                bitField0_ |= 0x00000002;
                currentReportMsec_ = input.readInt64();
                break;
              }
              case 26: {
                if (!keyToPackageNameMapping_.isModifiable()) {
                  keyToPackageNameMapping_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(keyToPackageNameMapping_);
                }
                keyToPackageNameMapping_.add(
                    input.readMessage(com.github.yeriomin.playstoreapi.KeyToPackageNameMapping.parser(), extensionRegistry));
                break;
              }
              case 34: {
                if (!payloadLevelAppStat_.isModifiable()) {
                  payloadLevelAppStat_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(payloadLevelAppStat_);
                }
                payloadLevelAppStat_.add(
                    input.readMessage(com.github.yeriomin.playstoreapi.PayloadLevelAppStat.parser(), extensionRegistry));
                break;
              }
              case 42: {
                if (!ipLayerNetworkStat_.isModifiable()) {
                  ipLayerNetworkStat_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(ipLayerNetworkStat_);
                }
                ipLayerNetworkStat_.add(
                    input.readMessage(com.github.yeriomin.playstoreapi.IpLayerNetworkStat.parser(), extensionRegistry));
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
        if (PARSER == null) {    synchronized (com.github.yeriomin.playstoreapi.AndroidDataUsageProto.class) {
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


  // @@protoc_insertion_point(class_scope:AndroidDataUsageProto)
  private static final com.github.yeriomin.playstoreapi.AndroidDataUsageProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AndroidDataUsageProto();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.github.yeriomin.playstoreapi.AndroidDataUsageProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<AndroidDataUsageProto> PARSER;

  public static com.google.protobuf.Parser<AndroidDataUsageProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

