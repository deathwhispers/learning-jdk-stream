package com.guangjian.stream.common;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author yanggj
 * @version 1.0.0
 * @date 2021/9/20 7:51 下午
 */
public class DomainConnVo {

    private String domainType;
    private List<Integer> data;

    public DomainConnVo(String domainType, Integer size) {
        this.domainType = domainType;
        this.data = Stream.generate(() -> 0).limit(size).collect(Collectors.toList());
    }

    public DomainConnVo() {
    }

    public String getDomainType() {
        return domainType;
    }

    public void setDomainType(String domainType) {
        this.domainType = domainType;
    }

    public List<Integer> getData() {
        return data;
    }

    public void setData(List<Integer> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ConnVo1{" +
                "domainType='" + domainType + '\'' +
                ", data=" + data +
                '}';
    }
}
