package com.grpc.server;

import io.grpc.ServerBuilder;


import java.io.IOException;

public class Server {
    public static void main(String[] args) throws IOException, InterruptedException {

        //todo 在这里输入要发送的文件的绝对路径
        String inputFilePath = "";;
        if (inputFilePath.equals("")){
            return;
        }


        io.grpc.Server server = ServerBuilder.forPort(8080).addService(new ServerImpl(inputFilePath)).build().start();
        server.awaitTermination();
    }
}
