package com.guangjian.stream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Description: TODO
 * @Author: yanggj
 * @Date: 2021/9/20 5:34 下午
 * @Version: 1.0.0
 */
public class StreamTest01 {

    public static void main(String[] args) {
        // 统计
        IntSummaryStatistics summaryStatistics1 = Stream.of(1, 2, 3, 4).mapToInt(x -> x).summaryStatistics();// 将流转换成int流，再进行统计
        IntSummaryStatistics summaryStatistics = IntStream.of(1, 2, 46, 43, 46).summaryStatistics();// 创建时使用int流
        System.out.println(summaryStatistics.getMax());// 最大值
        System.out.println(summaryStatistics.getMin());// 最小值
        System.out.println(summaryStatistics.getSum());// 求和
        System.out.println(summaryStatistics.getCount());// 计数
        System.out.println(summaryStatistics.getAverage());// 平均值
        summaryStatistics.accept(1);// 接收一个新记录到统计流中
        System.out.println(summaryStatistics.getSum());// 添加元素后求和，比原来多1

        // 接收另一个统计流，合并为当前这个summaryStatistics
        summaryStatistics.combine(summaryStatistics1);
        System.out.println(summaryStatistics.getSum());
        System.out.println(summaryStatistics.getCount());// 9


    }
}
