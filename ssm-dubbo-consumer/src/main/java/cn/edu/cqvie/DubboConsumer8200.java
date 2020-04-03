package cn.edu.cqvie;

import cn.edu.cqvie.api.dto.UserDto;
import cn.edu.cqvie.api.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@EnableDubbo
@SpringBootApplication
public class DubboConsumer8200 {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumer8200.class);
    }
}
