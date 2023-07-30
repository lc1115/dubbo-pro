package com.cjl.service.impl;

import com.cjl.service.UserService;
import org.apache.dubbo.config.annotation.Service;


@Service
public class UserServiceImpl implements UserService {
    public String sayHello() {
        return "1111111122222";//恭喜，远程调用成功
    }
}
