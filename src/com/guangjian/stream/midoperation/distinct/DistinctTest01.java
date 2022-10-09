package com.guangjian.stream.midoperation.distinct;

import java.util.stream.Stream;

/**
 * @author yanggj
 * @version 1.0.0
 * @date 2021/9/20 2:52 下午
 */
public class DistinctTest01 {

    /*
    distinct:根据equals方法进行判断，如果要对自定义的bean去重，则需要重写equals方法。
     */
    public static void main(String[] args) {
        Stream.of(7, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 3, 1, 6, 4, 7, 7).distinct().forEach(System.out::println);
    }
}
