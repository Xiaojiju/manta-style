package com.xiaojiju.models.enums;

/**
 * 登录方式罗列枚举
 * @since 1.0.0-black
 * @author 一块小饼干
 */
public enum RequiredType {
    /**
     * 默认密码登录方式
     */
    DEFAULT,
    /**
     * 手机号码短信登录
     */
    MOBILE,
    /**
     * 邮箱验证码登录
     */
    E_MAIL,
    /**
     * 微信登录
     */
    WECHAT,
    /**
     * 支付宝登录
     */
    ALIPAY,
    /**
     * github登录
     */
    GITHUB,
    /**
     * QQ登录
     */
    QQ;
}
