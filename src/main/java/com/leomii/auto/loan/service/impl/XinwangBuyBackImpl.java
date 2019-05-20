package com.leomii.auto.loan.service.impl;

import com.leomii.auto.loan.integration.ICommunication;
import com.leomii.auto.loan.service.IBuyBack;
import com.leomii.auto.loan.utils.Constans;
import com.leomii.auto.loan.vo.impl.XinwangBuyBackVO;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 新网回购申请
 *
 * @author leomii
 */
@Service("xinwangBuyBack")
public class XinwangBuyBackImpl implements IBuyBack {
    private static final Logger LOGGER = LoggerFactory.getLogger(XinwangBuyBackImpl.class);

    @Autowired
    private ICommunication<XinwangBuyBackVO> xinwangIntegration;

    @Override
    public String buyBack(String applyId) {
        if (StringUtils.isEmpty(applyId)) {
            return Constans.PARAM_IS_NULL;
        }
        LOGGER.info("新网回购，applyId：{}", applyId);
        return xinwangIntegration.buyBack(new XinwangBuyBackVO().setApplyId(applyId));
    }
}