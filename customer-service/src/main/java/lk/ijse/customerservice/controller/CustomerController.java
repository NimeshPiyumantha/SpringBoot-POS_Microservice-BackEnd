package lk.ijse.customerservice.controller;

import lk.ijse.customerservice.dto.CustomDTO;
import lk.ijse.customerservice.dto.CustomerDTO;
import lk.ijse.customerservice.service.CustomerService;
import lk.ijse.customerservice.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Nimesh Piyumantha
 * @PACKAGE_NAME : lk.ijse.customerservice.controller
 * @PROJECT_NAME : SpringBoot-POS_Microservice-BackEnd
 * @Date : 5/24/2023
 * @Time : 4:16 PM
 * @since : 0.1.0
 **/
@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService service;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseEntity saveCustomer(@ModelAttribute CustomerDTO dto) {
        service.saveCustomer(dto);
        return new ResponseEntity(new Response("OK", "Successfully Registered.!", null), HttpStatus.CREATED);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping
    public ResponseEntity updateCustomer(@RequestBody CustomerDTO dto) {
        service.updateCustomer(dto);
        return new ResponseEntity(new Response("OK", "Successfully Updated. :" + dto.getId(), null), HttpStatus.OK);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @DeleteMapping
    public ResponseEntity deleteCustomer(@RequestBody CustomerDTO dto) {
        service.deleteCustomer(dto);
        return new ResponseEntity(new Response("OK", "Successfully Deleted. :" + dto.getId(), null), HttpStatus.OK);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping(path = "/searchCusId", params = {"id"})
    public CustomerDTO searchCusId(String id) {
        return service.searchCusId(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping(path = "/loadAllCustomer")
    public ResponseEntity loadAllCustomer() {
        return new ResponseEntity(new Response("OK", "Successfully Loaded. :", service.loadAllCustomer()), HttpStatus.OK);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping(path = "/CustomerIdGenerate")
    public @ResponseBody CustomDTO customerIdGenerate() {
        return service.customerIdGenerate();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping(path = "/CustomerCount")
    public @ResponseBody CustomDTO getSumCustomer() {
        return service.getSumCustomer();
    }
}