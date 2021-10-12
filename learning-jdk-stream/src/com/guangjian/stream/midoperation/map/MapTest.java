package com.guangjian.stream.midoperation.map;

import com.guangjian.stream.common.Person;

import java.util.ArrayList;
import java.util.Locale;

/**
 * @Description: TODO
 * @Author: yanggj
 * @Date: 2021/9/20 12:29 上午
 * @Version: 1.0.0
 */
public class MapTest {

    public static void main(String[] args) {
        /*
        map 把一种类型的stream转换成另一种类型的stream
         */
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("zhangsan", 18, "男"));
        list.add(new Person("lisi", 23, "男"));
        list.add(new Person("wangwu", 21, "女"));
        list.add(new Person("zhaoliu", 18, "男"));
        list.add(new Person("linqi", 19, "女"));
        list.add(new Person("zhou", 28, "男"));
        // 将姓名转化成大写
        list.stream().map(person -> person.getName().toUpperCase(Locale.ROOT)).forEach(System.out::println);

        // 映射成姓名的长度
        list.stream().map(person -> person.getName().length()).forEach(System.out::println);
        /*
        mapToInt,mapToLong,mapToDouble:将元素转换成特定的stream，限定了返回值的类型
         */

    }
}
