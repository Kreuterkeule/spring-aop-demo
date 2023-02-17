package com.kreuterkeule;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.kreuterkeule")
@EnableAspectJAutoProxy
public class BeanConfig {

}
