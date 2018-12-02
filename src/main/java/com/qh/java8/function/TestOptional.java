package com.qh.java8.function;

import java.io.IOException;
import java.util.Optional;
import java.util.jar.JarException;

public class TestOptional {
    public static void main(String[] args) {
        /*
        创建一个Optional：不能直接new，只能通过本身的静态方法创建
         */
        Optional.empty();//初始化一个容器，里面没有值,并且无法再往里塞值。private static final Optional<?> EMPTY = new Optional<>();
        Optional.of("");//初始化一个容器放入非空值
        Optional.ofNullable("");//初始化一个可为空的容器。
        /*
            方法
         */
        Optional op = Optional.of("hello");
        System.out.println(op);
        //isPresent  判断是否有值，返回boolean
        System.out.println(op.isPresent());
        //T orElse(T other)  ，有值就返回本身的值，没值就返回参数给的值
        System.out.println(op.orElse("orElse"));
        //T orElseGet(Supplier<? extends T> other)  ，有值就返回本身的值，没值就返回Supplier方法产生的值
        System.out.println(op.orElseGet(()->"orElseGet"));
        //T orElseThrow(Supplier<? extends X> exceptionSupplier) throws X  ，有值就返回本身的值，没值就抛异常
        try {
            System.out.println(op.orElseThrow(NullPointerException::new));
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        //Optional<T> filter(Predicate<? super T> predicate)  符合就返回值，否则返回空的Optional
        System.out.println(op.filter((v)->true));
        //Optional<U> map(Function<? super T, ? extends U> mapper)   映射
        System.out.println(op.map((v)->""));
        //Optional<U> flatMap(Function<? super T, Optional<U>> mapper) 映射，不过Function中的返回类型为Optional封装的值
        System.out.println(op.flatMap((v)->Optional.empty()));

        //void ifPresent(Consumer<? super T> consumer)， 接收一个Consumer方法，有值就执行这个方法
        op.ifPresent((v)-> System.out.println(v));





    }
}
