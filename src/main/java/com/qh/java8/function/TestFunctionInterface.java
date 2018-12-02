package com.qh.java8.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestFunctionInterface {


    public static void main(String[] args) {
        //java中，lambda函数是对象，必须依附于一种特别的对象类型--函数式接口
        IFunctionInterface myInterface = ()-> System.out.println("hello word");//函数式接口可以保存一个函数
        System.out.println(myInterface.getClass());//这个函数是保存在一个自动分配的类中
        System.out.println(myInterface.getClass().getSuperclass());//这个类的父类就是Object
        System.out.println(myInterface.getClass().getInterfaces().length);//这个类实现了一个接口
        System.out.println(myInterface.getClass().getInterfaces()[0]);//实现的接口就是IFunctionInterface

        System.out.println("--------------------------");
        List<String> list = Arrays.asList("asdfas","asff","nihao");
        list.stream().map(String::toUpperCase).forEach(System.out::println);

//        Comparator<? super E> comparator = ;
//        list.sort(comparator);
//
//        Function f = a->a.toString();
    }
}
