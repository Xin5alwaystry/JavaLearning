package com.MsbJavaTeaching;

/**
 * Created by User on 2018/5/16.
 *
 *功能:n个人围成一圈，从第一个人从1开始报数，报到3的人退出，下一个人继续从1开始报数，以此类推，得出最后剩下的人是第几个人。
 */
public class CountThreeQuit {
    public static void main(String[] args) {
        KidCircle kc = new KidCircle(2);
        int countNum = 0;
        Kid k = kc.first;
        while (kc.count > 1) {
            countNum++;
            if (countNum == 3) {
                countNum = 0;
                kc.delete(k);
            }
            k = k.right;
        }
        System.out.println(k.Id);
    }
}

class Kid {
    int Id;
    Kid left;
    Kid right;
}

class KidCircle {
    int count = 0;
    Kid first;
    Kid last;

    KidCircle(int n) {
        for (int i = 0; i < n; i++) {
            add();
        }
    }

    void add() {
        Kid k = new Kid();
        k.Id = count;
        if (count <= 0) {
            first = k;
            last = k;
            k.left = k;
            k.right = k;
        } else {
            last.right = k;
            k.left = last;
            k.right = first;
            first.left = k;
            last = k;
        }
        count++;
    }

    void delete(Kid k) {
        if (count <= 0) {
            return;
        } else if (count == 1) {
            first = last = null;
        } else {
            k.left.right = k.right;
            k.right.left = k.left;

            if (k == first) {
                first = k.right;
            } else if (k == last) {
                last = k.left;
            }
        }
        count--;
    }
}