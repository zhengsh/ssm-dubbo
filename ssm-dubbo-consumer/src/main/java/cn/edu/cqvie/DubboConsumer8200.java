package cn.edu.cqvie;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class DubboConsumer8200 {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumer8200.class);
    }
}
