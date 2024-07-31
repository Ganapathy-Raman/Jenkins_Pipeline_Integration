package com.gana.backend.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.gana.backend.model.Customer;
import com.gana.backend.model.Insurance;
//import com.gana.backend.model.Customer;
//import com.gana.backend.model.Insurance;
import com.gana.backend.service.CustomerService;

@SpringBootTest
class CustomerServiceImplTest {

	@Autowired
	private CustomerService customerService;

	@Test
	void testAddCustomer() {
		Insurance insurance = new Insurance(0, 67, 38, 23, 4, 3, 43);
		Customer customer = new Customer(0, "Guru", "Twenty", "up", "male", insurance);
		assertEquals("Success", customerService.addCustomer(customer));
	}

	@Test
	void testAddCustomer1() {
		Customer customer = null;
		assertEquals("Failed to add", customerService.addCustomer(customer));
	}

	@Test
	void testGetCustomer() {
		assertNotNull(customerService.getCustomer(51));
	}

	@Test
	void testGetCustomer1() {
		assertNull(customerService.getCustomer(1));
	}

	@Test
	void testGetAllCustomers() {
		assertNotNull(customerService.getAllCustomers());
	}

	@Test
	void testUpdateCustomer() {
		Insurance insurance = new Insurance(10, 25, 3, 23, 4, 3, 43);
		Customer customer = new Customer(8, "George prabha", "thirty", "dgl", "male", insurance);
		assertEquals("Success", customerService.updateCustomer(customer));
	}

	@Test
	void testUpdateCustomer1() {
		Customer customer = null;
		assertEquals("Failed to update", customerService.updateCustomer(customer));
	}

	@Test
	void testDeleteCustomer() {
		assertEquals("Success", customerService.deleteCustomer(64));
	}

	@Test
	void testDeleteCustomer1() {
		assertEquals("Failed to delete", customerService.deleteCustomer(8));
	}

}
