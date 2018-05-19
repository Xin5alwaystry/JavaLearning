package com.MsbJavaTeaching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

/**
 * Created by User on 2018/5/18.
 */
public class TestTranform {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String s = null;
        try {
            s = bufferedReader.readLine();
            while(s!=null){
                if(s.equalsIgnoreCase("exit")) {
                    break;
                }
                System.out.println(s.toUpperCase());
                s = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
