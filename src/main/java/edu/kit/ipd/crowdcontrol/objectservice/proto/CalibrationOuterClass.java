// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: calibration.proto

package edu.kit.ipd.crowdcontrol.objectservice.proto;

public final class CalibrationOuterClass {
  private CalibrationOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_crowdcontrol_Calibration_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_crowdcontrol_Calibration_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021calibration.proto\022\014crowdcontrol\"d\n\013Cal" +
      "ibration\022\n\n\002id\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\022\020\n\010qu" +
      "estion\030\003 \001(\t\022\017\n\007answers\030\004 \003(\t\022\030\n\020accepte" +
      "d_answers\030\005 \003(\tB0\n,edu.kit.ipd.crowdcont" +
      "rol.objectservice.protoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_crowdcontrol_Calibration_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_crowdcontrol_Calibration_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_crowdcontrol_Calibration_descriptor,
        new java.lang.String[] { "Id", "Name", "Question", "Answers", "AcceptedAnswers", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}