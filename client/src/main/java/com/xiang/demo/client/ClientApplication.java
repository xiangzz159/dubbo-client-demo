
package com.xiang.demo.client;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Guangye.Xiang
 * @date 2022年07月26日 09:33
 */
@SpringBootApplication
@EnableDubbo
public class ClientApplication {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(ClientApplication.class, args);
    }
}
