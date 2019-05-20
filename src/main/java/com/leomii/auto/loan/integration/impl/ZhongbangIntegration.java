package com.leomii.auto.loan.integration.impl;

import com.leomii.auto.loan.integration.ICommunication;
import com.leomii.auto.loan.utils.Constans;
import org.springframework.stereotype.Component;

/**
 * 新网回购申请
 *
 * @author leomii
 */
@Component
public class ZhongbangIntegration<T> implements ICommunication<T> {
    @Override
    public String buyBack(T apply) {
        return Constans.SUCCESS;
    }
}