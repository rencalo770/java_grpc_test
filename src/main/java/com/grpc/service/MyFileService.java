// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: file_service.proto

package com.grpc.service;

public final class MyFileService {
  private MyFileService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_grpc_gen_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_grpc_gen_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_grpc_gen_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_grpc_gen_Response_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022file_service.proto\022\014com.grpc.gen\"\025\n\007Re" +
      "quest\022\n\n\002id\030\001 \001(\005\"&\n\010Response\022\016\n\006length\030" +
      "\001 \001(\005\022\n\n\002bs\030\002 \001(\0142I\n\013FileService\022:\n\007getF" +
      "ile\022\025.com.grpc.gen.Request\032\026.com.grpc.ge" +
      "n.Response0\001B#\n\020com.grpc.serviceB\rMyFile" +
      "ServiceP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_grpc_gen_Request_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_grpc_gen_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_grpc_gen_Request_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_com_grpc_gen_Response_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_grpc_gen_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_grpc_gen_Response_descriptor,
        new java.lang.String[] { "Length", "Bs", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}