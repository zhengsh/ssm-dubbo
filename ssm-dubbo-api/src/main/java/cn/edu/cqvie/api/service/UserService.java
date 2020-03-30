package cn.edu.cqvie.api.service;

import cn.edu.cqvie.api.dto.UserDto;

public interface UserService {

    UserDto findById(Long id);
}
