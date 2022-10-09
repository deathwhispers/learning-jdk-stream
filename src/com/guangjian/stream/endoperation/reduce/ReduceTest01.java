package com.guangjian.stream.endoperation.reduce;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author yanggj
 * @version 1.0.0
 * @date 2021/9/20 5:28 下午
 */
public class ReduceTest01 {

    /*
    规约操作：所有元素规约成一个，比如对所有元素求和，乘积等
     */
    public static void main(String[] args) {
        // 实现所有元素的求和
        Optional<Integer> reduce = Stream.of(1, 2, 3, 4, 5).reduce((x, y) -> x + y);
        System.out.println(reduce);

        // 求所有元素的乘积
        Optional<Integer> reduce1 = Stream.of(1, 2, 3, 4, 5).reduce((x, y) -> x * y);
        System.out.println(reduce1);
    }
}
