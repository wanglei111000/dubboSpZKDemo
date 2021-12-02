package org.base.dubbo.demo.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import org.base.dubbo.demo.entry.User;
import org.base.dubbo.demo.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Service(
        version = "${service.version}",
        application = "${dubbo.application.id}",
        registry = "${dubbo.registry.id}"
)
public class UserServiceImpl implements UserService {

    @Override
    public User findUserByID(Integer userId) {
        User user = new User();
        user.setId(1);
        user.setName("杨幂");
        user.setSex(0);
        List<String> hobbies = new ArrayList<String>();
        hobbies.add("读书");
        hobbies.add("篮球");
        user.setHobbyList(hobbies);
        return user;
    }
}
