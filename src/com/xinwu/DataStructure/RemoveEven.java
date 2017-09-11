package com.xinwu.DataStructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 功能:删除集合类中的偶数
 * Created by User on 2017/9/10.
 */
public class RemoveEven {
    public static void main(String[] args) {
        List<Integer> targetList = new LinkedList<Integer>();
        targetList.add(1);
        targetList.add(2);
        targetList.add(3);
        targetList.add(4);
        Iterator iterable = targetList.iterator();
        while(iterable.hasNext()) {
            System.out.print(iterable.next()+" ");
        }
        remove(targetList);
    }

    private static void remove(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() %2 ==0) {
                it.remove();
            }
        }
    }
}


