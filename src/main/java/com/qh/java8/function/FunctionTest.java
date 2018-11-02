package com.qh.java8.function;
import java.util.function.Function;
public class FunctionTest {
    public static void main(String[] args) {
        FunctionTest test = new FunctionTest();
        System.out.println(test.compute(2,(a)->a*3,(a)->a*a));
        System.out.println(test.then(2,(a)->a*3,(a)->a*a));
    }
    public int compute(int a , Function<Integer,Integer> fun1, Function<Integer,Integer> fun2){
        return fun1.compose(fun2).apply(a);
    }
    public int then(int a , Function<Integer,Integer> fun1, Function<Integer,Integer> fun2){
        return fun1.andThen(fun2).apply(a);
    }
}
    /*
    这个例子用来说明Function自带的默认方法 compose 和 andThen
        default <V> Function<V, R> compose(Function<? super V, ? extends T> before) {
            Objects.requireNonNull(before);
            return (V v) -> apply(before.apply(v));
        }
        default <V> Function<T, V> andThen(Function<? super R, ? extends V> after) {
            Objects.requireNonNull(after);
            return (T t) -> after.apply(apply(t));
        }
    先要理解为什么compose方法返回的也是一个方法？
    compose接收的参数是一个方法，即行为：将V转换为T
    compose本身的行为是： 先执行参数方法的行为（将V转换为T），我再将T转换为R
    最终compose的结果就是：将V转换为R。 这还是一个Function，符合Function的签名。其结果是将参数方法与自身组合（先执行参数方法）
    源码可以看出，Function 中 compose 和 andThen 这两个方法的差别只在于参数方法的执行顺序。

    那么这个例子中的两个函数就好理解了。
    compute： 先将fun1和fun2组合（先执行fun2，将a转换为a*a；再执行fun1，将a*a转换为a*a*3），
            组合结果还是一个行为：将a转换为a*a*3
            这个组合结果是一个Function行为，它执行apply， 也就是a=2， 2*2*3=12
    then：  先执行fun1，再执行fun2， 结果组合为一个行为： (a*3)的平方
            结果是 2*3 的平方，也就是36

     */

    /*
    BiFunction的andThen方法中接受的方法参数是Function而不是BiFunction，因为先执行BiFunction.apply ，其结果只有一个值，这个值只能传递给Function
    A B =>C;   C=>D;   ==>  A B =>D
    为什么BiFunction中没有compose 方法?
    因为BiFunction需要接收两个参数，而另一个行为只能返回一个返回值，所以双向Function不能组合，只能串联。
     */
