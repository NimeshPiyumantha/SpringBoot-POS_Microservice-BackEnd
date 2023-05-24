package lk.ijse.customerservice.service;

import lk.ijse.customerservice.dto.CustomDTO;
import lk.ijse.customerservice.dto.CustomerDTO;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

/**
 * @author : Nimesh Piyumantha
 * @PACKAGE_NAME : lk.ijse.customerservice.service
 * @PROJECT_NAME : SpringBoot-POS_Microservice-BackEnd
 * @Date : 5/24/2023
 * @Time : 4:11 PM
 * @since : 0.1.0
 **/
public interface CustomerService {
    void saveCustomer(@ModelAttribute CustomerDTO dto);

    void updateCustomer(@RequestBody CustomerDTO dto);

    void deleteCustomer(@RequestBody CustomerDTO dto);

    CustomerDTO searchCusId(String id);

    ArrayList<CustomerDTO> loadAllCustomer();

    @ResponseBody
    CustomDTO customerIdGenerate();

    @ResponseBody
    CustomDTO getSumCustomer();
}

