package com.MsbJavaTeaching;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.FileInputStream;

/**
 * Created by User on 2018/5/18.
 */
public class TestFileInputStream {
    public static void main(String[] args) {
        int b = 0;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("D:/Users/Desktop/JavaLearning/src/com/MsbJavaTeaching/TestFileInputStream.java");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("找不到指定文件");
            System.exit(-1);
        }

        try {
            long num = 0;
            while((b=fileInputStream.read())!=-1) {
                System.out.print((char)b);
                num++;
            }
            fileInputStream.close();
            System.out.println();
            System.out.println("共读取了"+num+"个字节");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("文件读取错误");
            System.exit(-1);
        }
    }
}
