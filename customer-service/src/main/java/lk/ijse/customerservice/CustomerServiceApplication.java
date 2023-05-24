package lk.ijse.customerservice;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * @author : Nimesh Piyumantha
 * @PACKAGE_NAME : lk.ijse.customerservice
 * @PROJECT_NAME : SpringBoot-POS_Microservice-BackEnd
 * @Date : 5/24/2023
 * @Time : 4:35 PM
 * @since : 0.1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class CustomerServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}

