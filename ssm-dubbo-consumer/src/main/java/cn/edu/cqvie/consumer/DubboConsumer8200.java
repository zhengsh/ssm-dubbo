package cn.edu.cqvie.consumer;

import cn.edu.cqvie.api.dto.UserDto;
import cn.edu.cqvie.api.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DubboConsumer8200 {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Reference
    private UserService userService;


    public static void main(String[] args) {
        SpringApplication.run(DubboConsumer8200.class);
    }



    @Bean
    public ApplicationRunner runner() {
        return args -> {
            UserDto dto = userService.findById(1L);
            logger.info(dto.getName());
        };
    }
}
