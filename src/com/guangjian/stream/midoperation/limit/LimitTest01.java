package com.guangjian.stream.midoperation.limit;

import java.util.stream.Stream;

/**
 * @author yanggj
 * @version 1.0.0
 * @date 2021/9/20 2:52 下午
 */
public class LimitTest01 {

    /*
    limit: 限制元素的个数，只需传入long类型，表示限制的最大数
     */
    public static void main(String[] args) {
        Stream.of(4, 45, 22, 21, 6, 26, 7, 267, 35, 82, 36, 24).limit(3).forEach(System.out::println);

    }

}
