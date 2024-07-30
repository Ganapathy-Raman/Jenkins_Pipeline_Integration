package com.gana.backend.service;

import com.gana.backend.model.Insurance;

import java.util.List;

public interface InsuranceService {

	public String addInsurance(Insurance insurance);

	public Insurance getInsurance(int insuranceid);

	public List<Insurance> getAllInsurances();

	public String updateInsurance(Insurance insurance);

	public String deleteInsurance(int insuranceid);

}
