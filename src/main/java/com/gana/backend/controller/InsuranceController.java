package com.gana.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gana.backend.model.Insurance;
import com.gana.backend.serviceimpl.InsuranceServiceImpl;

@RestController
@RequestMapping("/insurance")
@CrossOrigin("http://localhost:7775")

public class InsuranceController {

	InsuranceServiceImpl service;

	public InsuranceController(InsuranceServiceImpl service) {
		super();
		this.service = service;
	}

	@PostMapping
	public String insertInsurance(@RequestBody Insurance insurance) {

		String msg = "";
		try {
			service.addInsurance(insurance);
			msg = "Success";
		} catch (Exception e) {

			msg = "Failure";

		}
		return msg;
	}

	@GetMapping("{insuranceid}")
	public Insurance getInsuranceById(@PathVariable("insuranceid") int insuranceid) {
		return service.getInsurance(insuranceid);
	}

	@GetMapping("/all")
	public List<Insurance> getInsurances() {
		return service.getAllInsurances();
	}

	@PutMapping
	public String updateInsurance(@RequestBody Insurance insurance) {

		String msg = "";
		try {
			service.updateInsurance(insurance);
			msg = "Good";
		} catch (Exception e) {

			msg = "Bad";

		}
		return msg;
	}

	@DeleteMapping("{insuranceid}")
	public String deleteInsuranceById(@PathVariable("insuranceid") int insuranceid) {
		String msg = "";
		try {
			service.deleteInsurance(insuranceid);
			msg = "Fair";
		} catch (Exception e) {

			msg = "Not";

		}
		return msg;
	}

}
