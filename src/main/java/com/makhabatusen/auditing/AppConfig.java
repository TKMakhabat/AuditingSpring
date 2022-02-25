package com.makhabatusen.auditing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages={"com.makhabatusen.auditing"})
public class AppConfig {
    @Bean
    public Auditing auditing() {
        return new Auditing();
    }
}