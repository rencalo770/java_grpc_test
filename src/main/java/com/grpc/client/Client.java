package com.grpc.client;

import com.grpc.service.Request;
import com.grpc.service.Response;
import com.grpc.service.FileServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.netty.NegotiationType;
import io.grpc.netty.NettyChannelBuilder;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;

public class Client {

    private final String videoPath;

    public Client(String videoPath){
        this.videoPath = videoPath;
    }

    public void getFile() throws IOException {

        ManagedChannel channel = NettyChannelBuilder.forAddress("127.0.0.1", 8080).negotiationType(NegotiationType.PLAINTEXT).build();
        FileServiceGrpc.FileServiceBlockingStub blockingStub = FileServiceGrpc.newBlockingStub(channel);
        Request request = Request.newBuilder().setId(1).build();

        RandomAccessFile writeFile = new RandomAccessFile(this.videoPath, "rw");
        Iterator<Response> helloResponseIterator = blockingStub.getFile(request);
        while (helloResponseIterator.hasNext()){
            Response response = helloResponseIterator.next();
            writeFile.seek(writeFile.length());
            writeFile.write(response.getBs().toByteArray());
            System.out.println("写入文件长度:" + response.getLength());
        }

    }

    public static void main(String[] args) throws IOException {

        //todo 在这里输入要保存的文件的绝对路径
        String outputFilePath = "";
        if (outputFilePath.equals("")){
            return;
        }

        Client client = new Client(outputFilePath);
        client.getFile();
    }
}
