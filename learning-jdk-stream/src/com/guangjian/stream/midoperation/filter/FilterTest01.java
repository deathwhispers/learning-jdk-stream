package com.guangjian.stream.midoperation.filter;

import com.guangjian.stream.common.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description: TODO
 * @Author: yanggj
 * @Date: 2021/9/19 10:36 下午
 * @Version: 1.0.0
 */
public class FilterTest01 {
    /**
     * 过滤流，过滤流中的元素
     * 对某些元素进行过滤，不合符筛选条件的则无法进入到流的下游
     */

    public static void main(String[] args) {
        // stream的用法
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("zhangsan",18,"男"));
        list.add(new Person("lisi",23,"男"));
        list.add(new Person("wangwu",21,"女"));
        list.add(new Person("zhaoliu",18,"男"));
        list.add(new Person("linqi",19,"女"));
        list.add(new Person("zhou",28,"男"));

        // 过滤所有男的
        List<Person> people = list.stream().filter(person -> "男".equals(person.getSex())).collect(Collectors.toList());
        // 找出所有男并且小于20岁的人
        List<Person> collect = list.stream().filter(person -> "男".equals(person.getSex()) && person.getAge() < 20).collect(Collectors.toList());

    }
}
