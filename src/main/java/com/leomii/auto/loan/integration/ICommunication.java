package com.leomii.auto.loan.integration;

/**
 * 资方业务接口
 *
 * @author leomii
 */
public interface ICommunication<T> {
    /**
     * 回购接口
     *
     * @param apply 申请信息
     * @return
     */
    String buyBack(T apply);
}