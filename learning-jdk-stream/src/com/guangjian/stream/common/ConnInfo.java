package com.guangjian.stream.common;

import java.util.List;

/**
 * @Description: TODO
 * @Author: yanggj
 * @Date: 2021/9/20 5:59 下午
 * @Version: 1.0.0
 */
public class ConnInfo {

    private String domainType;
    private List<Integer> data;

    public ConnInfo(String domainType) {
        this.domainType = domainType;
    }

    public ConnInfo(String domainType, List<Integer> data) {
        this.domainType = domainType;
        this.data = data;
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
}
