package com.leomii.auto.loan.service;

/**
 * 回购接口
 *
 * @author leomii
 */
public interface IBuyBack {
    /**
     * 回购接口
     *
     * @param applyId 申请单号
     * @return
     */
    String buyBack(String applyId);
}