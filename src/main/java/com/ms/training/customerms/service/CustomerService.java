package com.ms.training.customerms.service;

import java.util.List;
import java.util.Optional;

import com.ms.training.customerms.entity.CustomerEntity;


public interface CustomerService {
	public List<CustomerEntity> getCustomers();
	public CustomerEntity saveCustomer(CustomerEntity entity);
	public CustomerEntity editCustomer(CustomerEntity entity) ;
	public void deleteCustomer(Long id);
	
}
