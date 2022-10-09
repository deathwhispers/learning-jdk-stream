package com.guangjian.stream.midoperation.flatMap;

import java.util.stream.Stream;

/**
 * @author yanggj
 * @version 1.0.0
 * @date 2021/9/20 2:45 下午
 */
public class FlatMapTest01 {

    /**
     * 拆解流，将流中每一个元素拆解成一个流
     */
    public static void main(String[] args) {
        /*
        将元素拍平拍扁，然后重新组成一个新的stream，并将这些stream串行合并成一条am
         */
        Stream.of("a,b,c,d,e,f,g", "h,r,h,y,u,k,r")
                // 将Stream中的每个元素转化为另一个stream2，再对stream2进行操作
                .flatMap(item -> Stream.of(item.split(",")))
                .forEach(System.out::println);

        /*
        flatMapToInt,flatMapToLong...类比mapToInt
         */
    }
}
