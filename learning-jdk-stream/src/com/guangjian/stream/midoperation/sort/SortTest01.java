package com.guangjian.stream.midoperation.sort;

import java.util.stream.Stream;

/**
 * @Description: TODO
 * @Author: yanggj
 * @Date: 2021/9/20 2:53 下午
 * @Version: 1.0.0
 */
public class SortTest01 {
    /*
    sort：排序，底层依赖Comparable实现，也可以提供自定义比较器
     */
    public static void main(String[] args) {
        Stream.of(4, 13, 25, 63, 67, 82, 8, 1, 237, 78, 25, 24)
                .sorted()// 默认是升序排序
                .forEach(System.out::println);

        Stream.of(4, 13, 25, 63, 67, 82, 8, 1, 237, 78, 25, 24)
                .sorted((x, y) -> {
                    // 自定义实现比较器，降序
                    if (x < y) {
                        return 1;
                    } else if (x == y) {
                        return 0;
                    } else {
                        return -1;
                    }
                })
                .forEach(System.out::println);


    }
}
