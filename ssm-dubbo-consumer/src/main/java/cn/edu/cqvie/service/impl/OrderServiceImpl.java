package cn.edu.cqvie.service.impl;

import cn.edu.cqvie.api.dto.OrderDto;
import cn.edu.cqvie.api.dto.UserDto;
import cn.edu.cqvie.api.service.OrderService;
import cn.edu.cqvie.api.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    private UserService userService;

    @Override
    public OrderDto createOrder(OrderDto orderDto) {
        if (orderDto == null) {
            orderDto = new OrderDto();
        }
        Long userId = orderDto.getUserId() == null ? 1L : orderDto.getUserId();
        UserDto userDto = userService.findById(userId);

        orderDto.setOrderCode(UUID.randomUUID().toString().replace("-", ""));
        orderDto.setUserName(userDto.getName());
        return orderDto;
    }
}
