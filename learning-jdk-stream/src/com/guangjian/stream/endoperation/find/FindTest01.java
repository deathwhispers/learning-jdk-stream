package com.guangjian.stream.endoperation.find;

import java.util.stream.Stream;

/**
 * @Description: TODO
 * @Author: yanggj
 * @Date: 2021/9/20 5:14 下午
 * @Version: 1.0.0
 */
public class FindTest01 {
    /*
    find：查找stream中的元素
    findFirst：查找stream中的第一个元素并返回
     */
    public static void main(String[] args) {
        // findFirst
        System.out.println(Stream.of(3, 1, 4, 5, 3, 5, 6, 1).findFirst());
        // findAny 返回任意一个元素
        System.out.println(Stream.of(3, 1, 4, 5, 3, 5, 6, 1).findAny());

        // 在并行stream下返回的就过可能一样也可能不一样
        System.out.println(Stream.of(3, 1, 4, 5, 3, 5, 6, 1).parallel().findAny());

    }
}
