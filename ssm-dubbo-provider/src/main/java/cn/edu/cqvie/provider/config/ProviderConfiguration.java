package cn.edu.cqvie.provider.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableDubbo(scanBasePackages = "cn.edu.cqvie.provider.service.impl")
@PropertySource("classpath:/spring/dubbo-provider.properties")
public class ProviderConfiguration {
       
}