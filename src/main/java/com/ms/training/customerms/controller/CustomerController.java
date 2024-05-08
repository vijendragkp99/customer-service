package com.ms.training.customerms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ms.training.customerms.entity.CustomerEntity;
import com.ms.training.customerms.service.CustomerServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
    @Autowired
    private CustomerServiceImpl service;

    @RequestMapping(value="/fetch", method = RequestMethod.GET)
    public List<CustomerEntity> get(){
        return service.getCustomers();
    }
    
        
    @RequestMapping(value="/add", method = RequestMethod.POST)
    public CustomerEntity save(@RequestBody CustomerEntity entity){
        return service.saveCustomer(entity);
    }
    
    @RequestMapping(value="/edit", method = RequestMethod.PUT)
    public CustomerEntity edit(@RequestBody CustomerEntity entity){
        return service.editCustomer(entity);
    }

    @RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable Long id){
        System.out.println("ID=" + id);
         service.deleteCustomer(id);
         return "SUCCESS";
    }
    
    
}
