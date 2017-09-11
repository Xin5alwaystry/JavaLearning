package com.xinwu.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by User on 2017/9/9.
 */
public class TestFileInputStream {
    public static void main(String[] args) {
        int b = 0;
        FileInputStream in = null;
        try {
            in = new FileInputStream("D:\\Users\\Desktop\\JavaTest\\src\\com\\xinwu\\IO\\TestFileInputStream.java");
        } catch (FileNotFoundException e) {
            System.out.println("can not find the file");
            System.exit(-1);
        }

        long num = 0;
        try {
            while((b=in.read()) != -1) {
                System.out.print((char)b);
                num++;
            }
            in.close();
            System.out.println();
            System.out.println("总共获取了"+num+"个字节");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件读取错误");
            System.exit(-1);
        }

    }
}
