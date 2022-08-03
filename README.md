## 基于grpc传输文件
- 可以传输任意类型的文件

## 生成java的grpc文件
- windows版本
```  
cd proto
.\protoc.exe --plugin=protoc-gen-grpc=protoc-gen-grpc-java-1.48.0-windows-x86_64.exe  --grpc_out=./   --java_out=./    *.proto
```

