
package com.xiang.demo.client.controller;

import com.google.gson.JsonObject;
import com.xiang.demo.api.MessageInfo;
import com.xiang.demo.api.UserInfo;
import com.xiang.demo.api.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Guangye.Xiang
 * @date 2022年07月26日 09:34
 */
@RestController
@RequestMapping("http")
@Slf4j
public class TestController {

    @Reference(check = false, retries = 0, timeout = 10_000)
    UserInfo userInfo;

    @Reference(check = false, retries = 0, timeout = 10_000)
    MessageInfo messageInfo;

    @PostMapping(value = "post")
    public String testPost(HttpServletRequest request, @RequestBody JsonObject jsonpObject) {
        User user = userInfo.getUser("felix");
        user.setAddr("Address");
        log.info("invoke response: " + user.toString());
        return user.toString();
    }

    @PostMapping(value = "post2")
    public String testPost2(HttpServletRequest request) throws InterruptedException {
        return "ok";
    }

    @PostMapping(value = "sendMsg")
    public String sendMsg(HttpServletRequest request, @RequestBody String jsonObject) throws InterruptedException {
        log.info("sendMsg data:{}", jsonObject);
        messageInfo.send(jsonObject);
        return jsonObject;
    }



}