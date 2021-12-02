package org.base.dubbo.demo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.base.dubbo.demo.entry.User;
import org.base.dubbo.demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Reference(version = "${service.version}", application = "${dubbo.application.id}", registry = "${dubbo.registry.id}"
    )
    private UserService userService;

    @ResponseBody
    @GetMapping("/user/{userId}")
    public User findUserById(@PathVariable String userId){
        return userService.findUserByID(1);
    }
}
