package com.leomii.auto.loan.service.impl;

import com.leomii.auto.loan.integration.ICommunication;
import com.leomii.auto.loan.service.IBuyBack;
import com.leomii.auto.loan.utils.Constans;
import com.leomii.auto.loan.vo.impl.ZhongbangBuyBackVO;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * 新网回购申请
 *
 * @author leomii
 */
@Service("zhongbangBuyBack")
public class ZhongbangBugBackImpl implements IBuyBack {
    private static final Logger LOGGER = LoggerFactory.getLogger(ZhongbangBugBackImpl.class);

    @Autowired
    private ICommunication<ZhongbangBuyBackVO> zhongbangIntegration;

    @Override
    public String buyBack(String applyId) {
        if (StringUtils.isEmpty(applyId)) {
            return Constans.PARAM_IS_NULL;
        }
        LOGGER.info("众邦回购，applyId：{}", applyId);
        return zhongbangIntegration.buyBack(new ZhongbangBuyBackVO()
                .setApplyId(applyId)
                .setRequestTime(LocalDateTime.now().toString()));
    }
}