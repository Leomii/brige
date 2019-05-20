package com.leomii.auto.loan.vo.impl;

import com.leomii.auto.loan.vo.IBuyBackVO;

/**
 * 众邦回收申请vo
 *
 * @author leomii
 */
public class ZhongbangBuyBackVO implements IBuyBackVO {
    /**
     * 申请编号
     */
    private String applyId;
    /**
     * 请求时间
     */
    private String requestTime;

    public String getApplyId() {
        return applyId;
    }

    public ZhongbangBuyBackVO setApplyId(String applyId) {
        this.applyId = applyId;
        return this;
    }

    public String getRequestTime() {
        return requestTime;
    }

    public ZhongbangBuyBackVO setRequestTime(String requestTime) {
        this.requestTime = requestTime;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ZhongbangBuyBackVO{");
        sb.append("applyId='").append(applyId).append('\'');
        sb.append(", requestTime='").append(requestTime).append('\'');
        sb.append('}');
        return sb.toString();
    }
}