package com.codingapi.tx.manager.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Description:
 * Company: CodingApi
 * Date: 2018/11/29
 *
 * @author ujued
 */
@ConfigurationProperties(prefix = "tx-lcn.manager")
@Component
@Data
public class TxManagerConfig {

    public TxManagerConfig(@Value("${server.port}") Integer port) {
        this.port = port + 1;
        this.host = "127.0.0.1";
        this.heartTime = 5;
        this.concurrentLevel = 0;
        this.dtxTime = 36000;
        this.adminKey = "codingapi";
        this.exUrl = "/provider/email-to/ujued@qq.com";
    }

    /**
     * manager host
     */
    private String host;

    /**
     * support  port
     */
    private int port;

    /**
     * netty heart check time (s)
     */
    private int heartTime;

    /**
     * 事务处理并发等级
     */
    private int concurrentLevel;

    /**
     * 分布式事务超时时间
     */
    private int dtxTime;

    /**
     * 后台密码
     */
    private String adminKey;

    /**
     * 是否允许异常回调
     */
    private boolean exUrlEnabled = true;

    /**
     * 异常回调地址
     */
    private String exUrl;
}
