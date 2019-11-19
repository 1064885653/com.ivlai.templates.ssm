package com.ivlai.templates.ssm.utils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import java.text.DecimalFormat;

/**
 * 文件处理工具类
 */
public class FileUtil {


    /**
     * @param imgFile      图片地址
     * @param w            宽度
     * @param h            高度
     * @param s            缩放比例
     * @param outputStream 输出流
     */
    public static void zoomImgByFile(
            File imgFile
            , float w /* 宽 - px */
            , float h /* 高 - px */
            , float s /* 比例 - s% */
            , OutputStream outputStream
    ) throws IOException {

        BufferedImage bufferedImage = ImageIO.read(imgFile);
        String suffix = imgFile.getName().substring(imgFile.getName().lastIndexOf(".") + 1);

        /* 切换图片大小 */
        roomImgSize(w, h, s, outputStream, bufferedImage, suffix);

    }

    public static void zoomImgByUrl(
            String url /* 图片地址 */
            , float w /* 宽 - px */
            , float h /* 高 - px */
            , float s /* 比例 - s% */
            , OutputStream outputStream
            , String suffix
    ) throws IOException {

        URL url1 = new URL(NetUtil.cnUrlEncoding(url));

        BufferedImage bufferedImage = ImageIO.read(url1);

        /* 切换图片大小 */
        roomImgSize(w, h, s, outputStream, bufferedImage, suffix);
    }

    /**
     * 切换图片大小
     *
     * @param w 宽度
     * @param h 高度
     * @param s 缩放比例
     */
    private static void roomImgSize(float w, float h, float s, OutputStream outputStream, BufferedImage bufferedImage, String suffix) throws IOException {
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();

        if (s > 1000) s = 1000;
        if (w > 20000) w = 20000;
        if (h > 20000) h = 20000;

        int newWidth;
        int newHeight;

        if (0 != w && 0 != h) {
            /* 同时有宽高 */
            newWidth = (int) w;
            newHeight = (int) h;
            newWidth = Math.max(newWidth, 1);
            newHeight = Math.max(newHeight, 1);
        } else if (0 == w && 0 == h) {
            /* 没有宽高 */
            newWidth = width;
            newHeight = height;
        } else if (0 == w) {
            /* 只有高 */
            newHeight = (int) h;
            newWidth = (int) (h / height * width);
            newWidth = Math.max(newWidth, 1);
        } else {
            /* 只有宽 */
            newWidth = (int) w;
            newHeight = (int) (w / width * height);
            newHeight = Math.max(newHeight, 1);
        }

        if (0 != s) {
            newWidth = (int) (newWidth * s / 100);
            newHeight = (int) (newHeight * s / 100);
            newWidth = Math.max(newWidth, 1);
            newHeight = Math.max(newHeight, 1);
        }

        BufferedImage tag = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_3BYTE_BGR);
        //绘制改变尺寸后的图
        tag.getGraphics().drawImage(bufferedImage, 0, 0, newWidth, newHeight, null);
        ImageIO.write(tag, suffix, outputStream);
    }

    /**
     * 复制文件 - 使用字节流 - 可复制所有类型文件
     *
     * @param file      源文件
     * @param file_save 保存的目标文件
     */
    public static void copyFile(File file, File file_save) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file_save));
        byte[] bytes = new byte[1024];
        int length;
        while ((length = bufferedInputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes, 0, length);
            bufferedOutputStream.flush();
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }

    /**
     * 将指定文字保存到文件
     *
     * @param text 要保存的文本
     * @param file 要保存的文件
     */
    public static void saveFileByString(String text, File file) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
        bufferedWriter.write(text);
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    /**
     * 将文件大小转换为 字符串类型
     *
     * @param size 文件大小
     * @return 字符串类型的文件大小
     */
    public static String countFileSizeToString(long size) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (size < 1024) {
            return String.valueOf(size) + "B";
        } else if (size < 1048576) {
            String format = decimalFormat.format(size / 1024.0);
            return format + "KB";
        } else if (size < 1073741824) {
            String format = decimalFormat.format(size / 1048576.0);
            return format + "MB";
        } else {
            String format = decimalFormat.format(size / 1073741824.0);
            return format + "GB";
        }
    }

}
