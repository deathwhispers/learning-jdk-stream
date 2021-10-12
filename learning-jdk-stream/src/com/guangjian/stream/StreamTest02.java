package com.guangjian.stream;

import com.guangjian.stream.common.ConnDto;
import com.guangjian.stream.common.ConnVo;
import com.guangjian.stream.common.DomainConnVo;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Description: TODO
 * @Author: yanggj
 * @Date: 2021/9/20 5:45 下午
 * @Version: 1.0.0
 */
public class StreamTest02 {

    /*
    分组和分片：将collect的结果集展示为map形式
     */
    public static void main(String[] args) {
        // stream的用法
        ArrayList<ConnDto> list = new ArrayList<>();
        list.add(new ConnDto("1", 40, LocalDateTime.parse("2021-09-18T16:40:00")));
        list.add(new ConnDto("1", 41, LocalDateTime.parse("2021-09-18T16:41:00")));
        list.add(new ConnDto("1", 42, LocalDateTime.parse("2021-09-18T16:42:00")));
        list.add(new ConnDto("1", 43, LocalDateTime.parse("2021-09-18T16:43:00")));
        list.add(new ConnDto("1", 44, LocalDateTime.parse("2021-09-18T16:44:00")));
        list.add(new ConnDto("1", 45, LocalDateTime.parse("2021-09-18T16:45:00")));
        list.add(new ConnDto("2", 40, LocalDateTime.parse("2021-09-18T16:40:00")));
        list.add(new ConnDto("2", 41, LocalDateTime.parse("2021-09-18T16:41:00")));
        list.add(new ConnDto("2", 42, LocalDateTime.parse("2021-09-18T16:42:00")));
        list.add(new ConnDto("2", 43, LocalDateTime.parse("2021-09-18T16:43:00")));
        list.add(new ConnDto("2", 44, LocalDateTime.parse("2021-09-18T16:44:00")));
        list.add(new ConnDto("2", 45, LocalDateTime.parse("2021-09-18T16:45:00")));
        list.add(new ConnDto("3", 40, LocalDateTime.parse("2021-09-18T16:40:00")));
        list.add(new ConnDto("3", 41, LocalDateTime.parse("2021-09-18T16:41:00")));
        list.add(new ConnDto("3", 42, LocalDateTime.parse("2021-09-18T16:42:00")));
        list.add(new ConnDto("4", 43, LocalDateTime.parse("2021-09-18T16:43:00")));
        list.add(new ConnDto("3", 44, LocalDateTime.parse("2021-09-18T16:44:00")));
        list.add(new ConnDto("4", 45, LocalDateTime.parse("2021-09-18T16:45:00")));

        Map<LocalDateTime, List<ConnDto>> collect = list.stream().collect(Collectors.groupingBy(ConnDto::getCreateTime));


        List<String> times = Stream.generate(() -> "").limit(collect.size()).collect(Collectors.toList());
        HashMap<String, List> hashMap1 = new HashMap<>();

        DomainConnVo domainConnVo11 = new DomainConnVo("1", collect.size());
        DomainConnVo domainConnVo12 = new DomainConnVo("2", collect.size());
        DomainConnVo domainConnVo13 = new DomainConnVo("3", collect.size());
        DomainConnVo domainConnVo14 = new DomainConnVo("4", collect.size());


        hashMap1.put("1", domainConnVo11.getData());
        hashMap1.put("2", domainConnVo12.getData());
        hashMap1.put("3", domainConnVo13.getData());
        hashMap1.put("4", domainConnVo14.getData());
        int num = 0;

        for (Map.Entry<LocalDateTime, List<ConnDto>> entry : collect.entrySet()) {
            LocalDateTime k = entry.getKey();
            List<ConnDto> v = entry.getValue();
            times.set(num, k.toString());// 添加时间
            for (ConnDto item : v) {
                List o = hashMap1.get(item.getDomainType());
                if (o != null) {
                    o.set(num, item.getCount());
                }
            }
            num++;
        }

        ConnVo connVo = new ConnVo();
        connVo.setCreateTime(times);
        ArrayList<DomainConnVo> domainConnVos = new ArrayList<>();
        domainConnVos.add(domainConnVo11);
        domainConnVos.add(domainConnVo12);
        domainConnVos.add(domainConnVo13);
        domainConnVos.add(domainConnVo14);
        connVo.setDatas(domainConnVos);

        System.out.println(connVo);
    }
}
