package com.leomii.auto.loan.enumration;

/**
 * 资方枚举
 *
 * @author leomii
 */
public enum CapitalEnum {
    /**
     * 新网
     */
    XIN_WANG("EX-XW", "xinwang"),

    /**
     * 众邦
     */
    ZHONG_BANG("EX-ZB", "zhongbang"),

    ;

    private String code;
    private String name;

    private CapitalEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}