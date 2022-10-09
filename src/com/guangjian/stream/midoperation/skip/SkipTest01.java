package com.guangjian.stream.midoperation.skip;

import java.util.stream.Stream;

/**
 * @author yanggj
 * @version 1.0.0
 * @date 2021/9/20 2:53 下午
 */
public class SkipTest01 {

    /*
    skip：跳过 元素
     */
    public static void main(String[] args) {
        Stream.of(12, 3, 4, 5, 6, 7).skip(3)// 跳过前3个元素
                .forEach(System.out::println);
    }
}
