package com.MsbJavaTeaching;

import java.io.*;

/**
 * Created by User on 2018/5/18.
 */
public class TestPrintStream {
    public static void main(String[] args) {
        String filename = args[0];
        if(filename!=null) {
            list(filename,System.out);
        }
    }
    public static void list(String f, PrintStream pw) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(f));
            String s = null;
            while ((s=bufferedReader.readLine())!=null) {
                pw.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
