package com.xinwu.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by User on 2017/9/9.
 */
public class TestFileOutputStream {
    public static void main(String[] args) {
        int b = 0;
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("D:\\Users\\Desktop\\JavaTest\\src\\com\\xinwu\\IO\\TestFileInputStream.java");
            out = new FileOutputStream("D:\\Users\\Desktop\\Test\\TestFileInputStream.java");
            while ((b=in.read()) != -1) {
                out.write(b);
            }
            in.close();
            out.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        System.out.println("file is copied successfully");
    }
}
