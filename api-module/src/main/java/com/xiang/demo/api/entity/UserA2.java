package com.xiang.demo.api.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author Guangye.Xiang
 * @date 2022年07月26日 09:18
 */
@Data
public class UserA2 implements Serializable {

    private String name;

    private Integer age;

    private List<Addr> addr;
}