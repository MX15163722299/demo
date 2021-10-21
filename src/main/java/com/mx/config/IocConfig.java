package com.mx.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  //声明当前类是一个配置类，相当于xml文件
@ComponentScan("com.mx")//扫描器，设置扫描包范围，回去扫描指定包下的
public class IocConfig {


}
