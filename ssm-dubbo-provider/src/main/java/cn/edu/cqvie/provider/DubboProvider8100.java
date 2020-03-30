package cn.edu.cqvie.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class DubboProvider8100 {
    public static void main(String[] args) {
        SpringApplication.run(DubboProvider8100.class);
    }
}
