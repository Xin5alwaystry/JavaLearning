package com.MsbJavaTeaching;

/**
 * Created by User on 2018/5/17.
 */
public class ArrayParser {
    public static void main(String[] args) {
        String s = "1,2,3;4,5,6;7,8,9;";
        String[] arrayFirst = s.split(";");
        double[][] d;
        d = new double[arrayFirst.length][];
        for(int i=0;i<arrayFirst.length;i++){
            String[] arraySecond = arrayFirst[i].split(",");
            d[i] = new double[arraySecond.length];
            for(int j=0;j<arraySecond.length;j++){
                d[i][j]=Double.parseDouble(arraySecond[j]);
            }
        }
        for(int i=0;i<d.length;i++) {
            for(int j=0;j<d[i].length;j++){
                System.out.print(d[i][j]+" ");
            }
            System.out.println();
        }
    }
}
