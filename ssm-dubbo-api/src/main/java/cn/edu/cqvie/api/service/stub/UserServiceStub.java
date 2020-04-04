package cn.edu.cqvie.api.service.stub;

import cn.edu.cqvie.api.dto.UserDto;
import cn.edu.cqvie.api.service.UserService;
import lombok.extern.slf4j.Slf4j;

/**
 * 本地存根的实现
 *
 * @author zhengsh
 * @date 2020-04-04
 */
@Slf4j
public class UserServiceStub implements UserService {

    private final UserService userService;

    /**
     * Dubbo 传入远程调用方法
     *
     * @param userService
     */
    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    public UserDto findById(Long id) {
        log.info("stub invoke!");
        if (id != null) {
            return this.userService.findById(id);
        }
        return null;
    }
}
