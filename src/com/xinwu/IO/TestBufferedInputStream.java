package com.xinwu.IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by User on 2017/9/9.
 */
public class TestBufferedInputStream {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {

            fileInputStream = new FileInputStream("D:\\Users\\Desktop\\JavaTest\\src\\com\\xinwu\\IO\\TestFileInputStream.java");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int c = 0;
            System.out.println(bufferedInputStream.read());
            System.out.println(bufferedInputStream.read());
            bufferedInputStream.mark(100);
            for (int i = 0; i < 10 && (c=bufferedInputStream.read())!= -1; i++) {
                System.out.print((char)c+" ");
            }
            System.out.println();
            bufferedInputStream.reset();
            for (int i = 0; i < 10 && (c=bufferedInputStream.read())!= -1; i++) {
                System.out.print((char)c+" ");
            }
            bufferedInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
