package com.qh;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class T {
    Map map = new HashMap();

    Map map2 = Collections.synchronizedMap(new HashMap());



    public static void main(String[] args) {
        String s = null;
        for(int i=0; i<10000;i++){
            s=new String(new char[]{rc(), rc(), rc(), rc(), rc(), rc(), rc(), rc(), rc()});
            System.out.println(s.hashCode());
        }
    }

    public static char rc(){
        int i = new Random().nextInt(127);
        return (char)i;
    }
}
