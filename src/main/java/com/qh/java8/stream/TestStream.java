package com.qh.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {




        //构造Stream
        Stream<String> stream = Stream.of("nihao","z","hello","abcdefg");

        //Stream转array
        String[] stringArray = stream.toArray(length -> new String[length]);
//        stream.toArray(String[]::new);
//        stream.toArray();
        System.out.println(Arrays.asList(stringArray));

        //array转Stream
        stream =Stream.of(stringArray);

        //stream 转 List
        List<String> list =stream.collect(Collectors.toList());
//        stream.collect(ArrayList::new,ArrayList::add,ArrayList::addAll);//跟上面是等价的，不过这个才是本质的。
        System.out.println(list.toString());

    }
}
