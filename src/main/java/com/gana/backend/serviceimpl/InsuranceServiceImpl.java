package com.gana.backend.serviceimpl;

import java.util.List;
import org.springframework.stereotype.Service;

import com.gana.backend.model.Insurance;
import com.gana.backend.repository.InsuranceRepo;

import com.gana.backend.service.InsuranceService;

@Service
public class InsuranceServiceImpl implements InsuranceService {

	InsuranceRepo repo;

	public InsuranceServiceImpl(InsuranceRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public String addInsurance(Insurance insurance) {

		return repo.save(insurance);

	}

	@Override
	public Insurance getInsurance(int insuranceid) {

		return repo.findById(insuranceid);

	}

	@Override
	public List<Insurance> getAllInsurances() {
		return repo.findAll();

	}

	@Override
	public String updateInsurance(Insurance insurance) {
		return repo.update(insurance);

	}

	@Override
	public String deleteInsurance(int insuranceid) {
		return repo.deleteById(insuranceid);

	}

}
