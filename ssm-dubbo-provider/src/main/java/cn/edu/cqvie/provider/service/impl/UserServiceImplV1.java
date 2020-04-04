package cn.edu.cqvie.provider.service.impl;

import cn.edu.cqvie.api.dto.UserDto;
import cn.edu.cqvie.api.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@org.apache.dubbo.config.annotation.Service(version = "1.0.0")
public class UserServiceImplV1 implements UserService {

    public UserDto findById(Long id) {
        log.info("UserService.findById [1.0.0] invoke!");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        UserDto user = new UserDto();
        user.setId(1L);
        user.setName("zhangsan");
        return user;
    }
}
