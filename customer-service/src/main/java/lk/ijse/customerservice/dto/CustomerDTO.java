package lk.ijse.customerservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author : Nimesh Piyumantha
 * @PACKAGE_NAME : lk.ijse.customerservice.dto
 * @PROJECT_NAME : SpringBoot-POS_Microservice-BackEnd
 * @Date : 5/24/2023
 * @Time : 4:09 PM
 * @since : 0.1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerDTO {
    private String id;
    private String name;
    private String address;
    private double salary;
}
