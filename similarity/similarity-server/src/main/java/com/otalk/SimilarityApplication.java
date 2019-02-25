package com.otalk;

import com.otalk.listener.SimilarityListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zhangtusheng
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
@EnableFeignClients
public class SimilarityApplication {

    public static void main(String[] args){
        SpringApplication springApplication = new SpringApplication(SimilarityApplication .class);
        springApplication.addListeners(new SimilarityListener());
        springApplication.run(args);

    }
}
