package com.guangjian.stream.endoperation.count;

import java.util.stream.Stream;

/**
 * @author yanggj
 * @version 1.0.0
 * @date 2021/9/20 5:13 下午
 */
public class CountTest01 {
    /*
    count：统计stream中元素的个数
     */
    public static void main(String[] args) {
        System.out.println(Stream.of(1, 2, 3, 4).count());
    }
}
