package com.ms.training.customerms.entity;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="customer")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CustomerEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String cust_name;
    private int cust_type_code;
    private String cust_type_desc;
    private String mobile;
    private String address;
    private int isActive;
    private Date createdDate;
    
	
    
}
