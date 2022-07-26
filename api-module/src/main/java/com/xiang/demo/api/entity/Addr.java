/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2021. All Rights Reserved.
 */
package com.xiang.demo.api.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author Guangye.Xiang
 * @date 2022年07月26日 09:18
 */
@Data
public class Addr implements Serializable {

    private List<String> ip;
    private String workloadName;
    private String env;

}