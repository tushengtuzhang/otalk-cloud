package com.otalk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zhangtusheng
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class NlpApplication {

    public static void main(String[] args){
        SpringApplication.run(NlpApplication.class,args);
    }
}
