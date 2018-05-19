package com.MsbJavaTeaching;

import java.io.*;

/**
 * Created by User on 2018/5/17.
 */
public class TestFile {
    public static void main(String[] args) {
        String separator = File.separator;
        String fileName = "myfile.txt";
        String directory = "mydir1" + separator + "mydir2";
        File f = new File(directory, fileName);
        if (f.exists()) {
            System.out.println("文件名：" + f.getAbsolutePath());
            System.out.println("文件大小：" + f.length());
        } else {
            f.getParentFile().mkdirs();
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
