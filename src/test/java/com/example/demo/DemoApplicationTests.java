package com.example.demo;

import com.example.demo.controller.CustProfileController;
import com.example.demo.dto.Response;
import com.example.demo.models.Customer;
import com.example.demo.respositories.CustRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	CustProfileController custProfileController;

	@MockBean
	CustRepository custRepository;

	@Test
	void contextLoads() {
	}




	@Test
	public void getCustDetailsTest(){
		Long custId = 1L; 
		when(custRepository.findById(custId)).thenReturn(Optional.of(new Customer(1L, "sooraj")));
		Response resp = custProfileController.getCustDetails(custId);
		assertEquals(200L,resp.getRespCode());

	}


	@Test
	public void addCustomerTest(){
		Customer cust = new Customer(1L,"sooraj");
		when(custRepository.save(cust)).thenReturn(cust);
		Customer customer = custProfileController.addCustomer(cust);
		assertEquals(1L,customer.getCustId());

	}

	@Test
	public void updateCustomerTest(){
		Customer cust = new Customer(1L,"sooraj PV");
		when(custRepository.save(cust)).thenReturn(cust);
		Response resp = custProfileController.updateCustomer(cust);
		assertEquals(200L,resp.getRespCode());

	}

	@Test
	public void deleteCustomerTest(){
		Customer cust = new Customer(1L,"sooraj PV");
		Response resp = custProfileController.deleteCustomer(cust);
		verify(custRepository,times(1)).delete(cust);

	}




}
