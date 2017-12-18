package test;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by pascal on 12/18/17.
 */
@EnableDiscoveryClient  //激活eureka中的DiscoveryClient实现
@SpringBootApplication
public class ComputeServiceApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ComputeServiceApplication.class).web(true).run(args);
    }
}