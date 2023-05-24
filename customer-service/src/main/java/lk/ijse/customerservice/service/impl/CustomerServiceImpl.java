package lk.ijse.customerservice.service.impl;

import lk.ijse.customerservice.dto.CustomDTO;
import lk.ijse.customerservice.dto.CustomerDTO;
import lk.ijse.customerservice.service.CustomerService;

import java.util.ArrayList;

/**
 * @author : Nimesh Piyumantha
 * @PACKAGE_NAME : lk.ijse.customerservice.service.impl
 * @PROJECT_NAME : SpringBoot-POS_Microservice-BackEnd
 * @Date : 5/24/2023
 * @Time : 4:13 PM
 * @since : 0.1.0
 **/
public class CustomerServiceImpl implements CustomerService {
    @Override
    public void saveCustomer(CustomerDTO dto) {

    }

    @Override
    public void updateCustomer(CustomerDTO dto) {

    }

    @Override
    public void deleteCustomer(CustomerDTO dto) {

    }

    @Override
    public CustomerDTO searchCusId(String id) {
        return null;
    }

    @Override
    public ArrayList<CustomerDTO> loadAllCustomer() {
        return null;
    }

    @Override
    public CustomDTO customerIdGenerate() {
        return null;
    }

    @Override
    public CustomDTO getSumCustomer() {
        return null;
    }
}
