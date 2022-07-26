package com.xiang.demo.client.client;

import com.xiang.demo.api.MessageInfo;
import com.xiang.demo.api.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * @author Guangye.Xiang
 * @date 2022年07月26日 09:36
 */
@Slf4j
@Component
public class BClient {
    @Reference(check = false, retries = 0, timeout = 10_000)
    MessageInfo userInfo;
}