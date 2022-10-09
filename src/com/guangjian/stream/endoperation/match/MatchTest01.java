package com.guangjian.stream.endoperation.match;

import java.util.stream.Stream;

/**
 * @author yanggj
 * @version 1.0.0
 * @date 2021/9/20 5:20 下午
 */
public class MatchTest01 {

    /*
    匹配
    noneMatch：stream中没有一个元素与条件匹配的
    allMatch：全匹配
    anyMatch：任意匹配
     */
    public static void main(String[] args) {
        // noneMatch  stream中没有跟1相匹配的元素，实际有，故返回false
        boolean noneMatch = Stream.of(1, 2, 3, 4).noneMatch(i -> i == 1);
        System.out.println(noneMatch);

        boolean anyMatch = Stream.of(1, 2, 3, 4).anyMatch(i -> i == 5);
        System.out.println(anyMatch);

        //
        boolean allMatch = Stream.of(1, 2, 3, 4).allMatch(x -> x == 3);
        System.out.println(allMatch);

    }
}
