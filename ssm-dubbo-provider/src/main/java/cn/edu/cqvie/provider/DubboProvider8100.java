package cn.edu.cqvie.provider;

import cn.edu.cqvie.api.dto.OrderDto;
import cn.edu.cqvie.api.dto.UserDto;
import cn.edu.cqvie.api.service.OrderService;
import cn.edu.cqvie.api.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

@EnableDubbo
@SpringBootApplication
public class DubboProvider8100 {

    private final Logger logger = LoggerFactory.getLogger(getClass());

//    @Reference
//    private OrderService orderService;


    public static void main(String[] args) {
        SpringApplication.run(DubboProvider8100.class);
    }


//    @Bean
//    public ApplicationRunner runner() {
//        return args -> {
//            OrderDto dto = orderService.createOrder(new OrderDto());
//            logger.info(dto.getOrderCode());
//        };
//    }
}
