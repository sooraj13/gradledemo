package com.example.demo.respositories;

import com.example.demo.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustRepository extends JpaRepository<Customer,Long> {



}
