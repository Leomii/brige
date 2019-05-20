package com.leomii.auto.loan.controller;

import com.leomii.auto.loan.enumration.CapitalEnum;
import com.leomii.auto.loan.service.IBuyBack;
import com.leomii.auto.loan.utils.SpringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 线下还款入口
 *
 * @author leomii
 */
@RestController
public class OfflineRepayment {
    private static final Logger LOGGER = LoggerFactory.getLogger(OfflineRepayment.class);
    private Map<String, String> capitals;

    @Autowired
    private SpringUtils springUtils;

    @PostConstruct
    private void capitalInit() {
        capitals = new HashMap<>(CapitalEnum.values().length);
        Arrays.asList(CapitalEnum.values()).stream().forEach(c -> capitals.put(c.getCode(), c.getName()));
    }

    @GetMapping("/buyBack/{capital}/{applyId}")
    public String buyBack(@PathVariable("capital") String capital, @PathVariable("applyId") String applyId) {
        LOGGER.info("buyBack processing,capital:{},applyId:{}", capital, applyId);
        String beanId = capitals.get(capital) + "BuyBack";
        IBuyBack buyBack = (IBuyBack) springUtils.getObject(beanId, IBuyBack.class);
        return buyBack.buyBack(applyId);
    }
}