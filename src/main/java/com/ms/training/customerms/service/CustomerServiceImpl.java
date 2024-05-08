package com.ms.training.customerms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.training.customerms.entity.CustomerEntity;
import com.ms.training.customerms.repo.CustomerRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository repository;

	public List<CustomerEntity> getCustomers() {
		return repository.findAll();
	}

	public CustomerEntity saveCustomer(CustomerEntity entity) {
		entity.setIsActive(1);
		entity.setCreatedDate(new Date());
		repository.save(entity);
		return entity;
	}

	public CustomerEntity editCustomer(CustomerEntity entity) {
		Optional<CustomerEntity> customerFromDb = repository.findById(entity.getId());

		if (customerFromDb.isPresent()) {
			CustomerEntity b = customerFromDb.get();
			b.setCust_name(entity.getCust_name());
			b.setCust_type_code(entity.getCust_type_code());
			b.setCust_type_desc(entity.getCust_type_desc());
			b.setAddress(entity.getAddress());
			b.setMobile(entity.getMobile());
			b.setCreatedDate(new Date());
			repository.save(b);

		} else {
			repository.save(entity);
		}

		return entity;
	}

	public void deleteCustomer(Long id) {
		repository.deleteById(id);
	}

}
