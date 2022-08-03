package com.grpc.server;

import com.google.protobuf.ByteString;
import com.grpc.service.FileServiceGrpc;
import com.grpc.service.Request;
import com.grpc.service.Response;

import com.grpc.service.FileServiceGrpc;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.io.RandomAccessFile;

public class ServerImpl extends FileServiceGrpc.FileServiceImplBase {
    private final String inputFilePath;

    public ServerImpl(String videoPath){
        this.inputFilePath = videoPath;
    }

    @Override
    public void getFile(Request request, StreamObserver<Response> responseObserver)  {

        try {
            RandomAccessFile readFile = new RandomAccessFile(this.inputFilePath, "r");
            System.out.printf("%s length is %d ...", this.inputFilePath, readFile.length());
            byte[] bs = new byte[1000];
            int i;
            while ((i = readFile.read(bs)) > 0){
                Response response = Response.newBuilder().setLength(i).setBs(ByteString.copyFrom(bs)).build();
                responseObserver.onNext(response);
            }
            System.out.println("file transport complete!");
            responseObserver.onCompleted();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
