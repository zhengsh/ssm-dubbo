package cn.edu.cqvie.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix
//@EnableDubbo
@SpringBootApplication
public class DubboProvider8100 {

    public static void main(String[] args) {
        SpringApplication.run(DubboProvider8100.class);
    }

}
