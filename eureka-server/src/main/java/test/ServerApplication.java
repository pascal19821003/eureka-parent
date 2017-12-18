package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by pascal on 12/18/17.
 */
@EnableEurekaServer  //启动一个服务注册中心提供给其他应用进行对话
@SpringBootApplication
public class ServerApplication {
    public static void main(String[] args) {
//下面两行代码都可以用来启动
        SpringApplication.run(ServerApplication.class, args);
//new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
}