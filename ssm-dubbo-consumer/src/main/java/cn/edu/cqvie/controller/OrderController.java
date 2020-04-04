package cn.edu.cqvie.controller;

import cn.edu.cqvie.api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/order/createOrder")
    public String createOrder() {

            return orderService.createOrder(null).getOrderCode();
    }
}
