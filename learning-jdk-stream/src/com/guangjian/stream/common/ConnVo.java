package com.guangjian.stream.common;

import java.util.List;

/**
 * @Description: TODO
 * @Author: yanggj
 * @Date: 2021/9/20 7:49 下午
 * @Version: 1.0.0
 */
public class ConnVo {

    private List<String> createTime;
    private List<DomainConnVo> datas;

    public List<String> getCreateTime() {
        return createTime;
    }

    public void setCreateTime(List<String> createTime) {
        this.createTime = createTime;
    }

    public List<DomainConnVo> getDatas() {
        return datas;
    }

    public void setDatas(List<DomainConnVo> datas) {
        this.datas = datas;
    }

    @Override
    public String toString() {
        return "ConnVo{" +
                "createTime=" + createTime +
                ", datas=" + datas +
                '}';
    }
}
