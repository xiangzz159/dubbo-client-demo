/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2021. All Rights Reserved.
 */
package com.xiang.demo.api;

import com.xiang.demo.api.entity.UserA;
import com.xiang.demo.api.entity.UserA2;

/**
 * @author Guangye.Xiang
 * @date 2022年07月26日 09:16
 */
public interface UserAInfo {
    UserA getUserA(String name);

    UserA2 getUserA2(String name);

}