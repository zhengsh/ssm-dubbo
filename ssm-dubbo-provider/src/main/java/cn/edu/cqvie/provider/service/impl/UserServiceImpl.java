package cn.edu.cqvie.provider.service.impl;

import cn.edu.cqvie.provider.domain.User;
import cn.edu.cqvie.provider.service.UserService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class UserServiceImpl implements UserService {

    public User findById(Long id) {
        User user = new User();
        user.setId(1L);
        user.setName("zhangsan");
        return user;
    }
}
