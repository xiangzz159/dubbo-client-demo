package com.xiang.demo.api;

import com.xiang.demo.api.entity.User;
import com.xiang.demo.api.entity.User2;

import java.awt.print.Book;

/**
 * @author Guangye.Xiang
 * @date 2022年07月26日 09:15
 */
public interface UserInfo {
    User getUser(String name);

    User2 getUser2(String name);

    void initUser(User user);

    void initBook(Book book);
}
