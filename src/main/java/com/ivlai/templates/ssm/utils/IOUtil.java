package com.ivlai.templates.ssm.utils;

import java.io.*;

public class IOUtil {


    /**
     * 将输入流转换为输出流
     *
     * @param inputStream  输入流
     * @param outputStream 输出流
     * @throws IOException IO获取异常
     */
    public static void InToOut(InputStream inputStream, OutputStream outputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
//        bufferedInputStream.transferTo(bufferedOutputStream);
        inputStream.close();
        outputStream.close();
    }


}