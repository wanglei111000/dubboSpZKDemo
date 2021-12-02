package org.base.dubbo.demo.service;


import org.base.dubbo.demo.entry.User;

public interface UserService {
    public User findUserByID(Integer userId);
}
