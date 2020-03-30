package cn.edu.cqvie.provider.service.impl;

import cn.edu.cqvie.api.dto.UserDto;
import cn.edu.cqvie.api.service.UserService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class UserServiceImpl implements UserService {

    public UserDto findById(Long id) {
        UserDto user = new UserDto();
        user.setId(1L);
        user.setName("zhangsan");
        return user;
    }
}
