package com.xinwu.IO;

import java.io.*;

/**
 * Created by User on 2017/9/9.
 */
public class TestBufferedStream1 {
    public static void main(String[] args) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\Users\\Desktop\\JavaTest\\src\\com\\xinwu\\IO\\TestFileInputStream.java"));
            BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\Users\\Desktop\\JavaTest\\src\\com\\xinwu\\IO\\TestFileInputStream.java"));
            String s = null;
            for(int i = 0; i<100; i++) {
                s = String.valueOf(Math.random());
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            while((s=bufferedReader.readLine())!=null) {
                System.out.println(s);
            }
            bufferedWriter.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
