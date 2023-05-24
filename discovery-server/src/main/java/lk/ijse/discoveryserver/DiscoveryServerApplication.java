package lk.ijse.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author : Nimesh Piyumantha
 * @PACKAGE_NAME : lk.ijse.discoveryserver
 * @PROJECT_NAME : SpringBoot-POS_Microservice-BackEnd
 * @Date : 5/24/2023
 * @Time : 3:47 PM
 * @since : 0.1.0
 **/
@SpringBootApplication
@EnableEurekaServer // to point out eureka server (discovery server)
public class DiscoveryServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServerApplication.class, args);
    }

}
