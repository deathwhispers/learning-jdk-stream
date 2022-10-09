package com.guangjian.stream.common;

import java.time.LocalDateTime;

/**
 * @author yanggj
 * @version 1.0.0
 * @date 2021/9/20 6:01 下午
 */
public class ConnDto implements Comparable<ConnDto> {

    private String domainType;
    private Integer count;
    private LocalDateTime createTime;

    public ConnDto(String domainType, Integer count, LocalDateTime createTime) {
        this.domainType = domainType;
        this.count = count;
        this.createTime = createTime;
    }

    public String getDomainType() {
        return domainType;
    }

    public void setDomainType(String domainType) {
        this.domainType = domainType;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public int compareTo(ConnDto o) {
        return createTime.compareTo(o.getCreateTime());
    }
}
