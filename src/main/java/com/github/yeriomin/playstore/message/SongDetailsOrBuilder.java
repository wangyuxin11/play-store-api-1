// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.github.yeriomin.playstore.message;

public interface SongDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SongDetails)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional string name = 1;</code>
   */
  boolean hasName();
  /**
   * <code>optional string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional .MusicDetails details = 2;</code>
   */
  boolean hasDetails();
  /**
   * <code>optional .MusicDetails details = 2;</code>
   */
  com.github.yeriomin.playstore.message.MusicDetails getDetails();

  /**
   * <code>optional string albumName = 3;</code>
   */
  boolean hasAlbumName();
  /**
   * <code>optional string albumName = 3;</code>
   */
  java.lang.String getAlbumName();
  /**
   * <code>optional string albumName = 3;</code>
   */
  com.google.protobuf.ByteString
      getAlbumNameBytes();

  /**
   * <code>optional int32 trackNumber = 4;</code>
   */
  boolean hasTrackNumber();
  /**
   * <code>optional int32 trackNumber = 4;</code>
   */
  int getTrackNumber();

  /**
   * <code>optional string previewUrl = 5;</code>
   */
  boolean hasPreviewUrl();
  /**
   * <code>optional string previewUrl = 5;</code>
   */
  java.lang.String getPreviewUrl();
  /**
   * <code>optional string previewUrl = 5;</code>
   */
  com.google.protobuf.ByteString
      getPreviewUrlBytes();

  /**
   * <code>optional .ArtistDetails displayArtist = 6;</code>
   */
  boolean hasDisplayArtist();
  /**
   * <code>optional .ArtistDetails displayArtist = 6;</code>
   */
  com.github.yeriomin.playstore.message.ArtistDetails getDisplayArtist();
}
