package com.guangjian.stream.midoperation.peek;

import java.util.stream.Stream;

/**
 * @Description: TODO
 * @Author: yanggj
 * @Date: 2021/9/20 2:53 下午
 * @Version: 1.0.0
 */
public class PeekTest01 {
    /*
    peek：挑选，将元素挑选出来，可以理解为提前消费
     */
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5)
                .peek(x->x+=5)// 将每个元素+5
                .forEach(System.out::println);
    }

}
