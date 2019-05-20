package com.leomii.auto.loan.vo.impl;

import com.leomii.auto.loan.vo.IBuyBackVO;

/**
 * 新网回收申请vo
 *
 * @author leomii
 */
public class XinwangBuyBackVO implements IBuyBackVO {
    private String applyId;

    public String getApplyId() {
        return applyId;
    }

    public XinwangBuyBackVO setApplyId(String applyId) {
        this.applyId = applyId;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("XinwangBuyBackVO{");
        sb.append("applyId='").append(applyId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}