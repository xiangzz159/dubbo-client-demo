package com.xiang.demo.api.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author Guangye.Xiang
 * @date 2022年07月26日 09:16
 */
@Data
@ToString
public class User implements Serializable {
    private String name;

    private Integer age;

    private String addr;
}