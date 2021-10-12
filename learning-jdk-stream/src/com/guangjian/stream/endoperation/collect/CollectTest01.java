package com.guangjian.stream.endoperation.collect;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Description: TODO
 * @Author: yanggj
 * @Date: 2021/9/20 5:10 下午
 * @Version: 1.0.0
 */
public class CollectTest01 {
    /*
    collect：可以将最终的数据流收集到一个容器中
     */
    public static void main(String[] args) {
        // 将元素收集到一个set中
        Set<String> collect = Stream.of("zhang san", "li si", "", "wang wu").collect(Collectors.toSet());
        collect.forEach(System.out::println);
    }
}
