package cn.edu.cqvie.api.service;

import cn.edu.cqvie.api.dto.OrderDto;

public interface OrderService {

    OrderDto createOrder(OrderDto orderDto);
}
