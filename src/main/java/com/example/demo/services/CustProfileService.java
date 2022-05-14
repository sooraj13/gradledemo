package com.example.demo.services;

import com.example.demo.dto.Response;
import com.example.demo.models.Customer;
import com.example.demo.respositories.CustRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustProfileService {

    @Autowired
    CustRepository custRepository;


    public Customer getCustDetails(Long custId) {

        Customer cust = null;
        Optional<Customer> customer = custRepository.findById(custId);
        if(customer.isPresent()){
            cust = customer.get();
        }
        return cust;

    }


    public Customer addCust(Customer cust) {

        custRepository.save(cust);
        return cust;
    }

    public Response updateCust(Customer cust) {

        custRepository.save(cust);
        Response resp = new Response(200L,"success");
        return resp;
    }

    public Response deleteCust(Customer cust) {

        custRepository.delete(cust);
        Response resp = new Response(200L,"success");
        return resp;

    }
}
