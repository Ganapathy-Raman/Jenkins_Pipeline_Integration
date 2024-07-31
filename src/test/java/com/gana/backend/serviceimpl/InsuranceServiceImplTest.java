package com.gana.backend.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.gana.backend.model.Insurance;
import com.gana.backend.service.InsuranceService;

@SpringBootTest
class InsuranceServiceImplTest {

	@Autowired
	private InsuranceService insuranceService;

	@Test
	void testAddInsurance() {
		Insurance insurance = new Insurance(0, 67, 35, 35, 56, 24, 67);
		assertEquals("Success", insuranceService.addInsurance(insurance));
	}

	@Test
	void testAddInsurance1() {
		Insurance insurance = null;
		assertEquals("Failed to add", insuranceService.addInsurance(insurance));
	}

	@Test
	void testGetInsurance() {
		assertNotNull(insuranceService.getInsurance(70));
	}

	@Test
	void testGetInsurance1() {
		assertNull(insuranceService.getInsurance(1));
	}

	@Test
	void testGetAllInsurances() {
		assertNotNull(insuranceService.getAllInsurances());
	}

	@Test
	void testUpdateInsurance() {
		Insurance insurance = new Insurance(8, 67, 35, 35, 56, 24, 67);
		assertEquals("Success", insuranceService.updateInsurance(insurance));

	}

	@Test
	void testUpdateInsurance1() {
		Insurance insurance = null;
		assertEquals("Failed to update", insuranceService.updateInsurance(insurance));

	}

	@Test
	void testDeleteInsurance() {
		assertEquals("Success", insuranceService.deleteInsurance(44));
	}

	@Test
	void testDeleteInsurance1() {
		assertEquals("Failed to delete", insuranceService.deleteInsurance(11));
	}

}
