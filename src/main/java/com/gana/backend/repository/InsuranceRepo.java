package com.gana.backend.repository;

import java.util.List;

import com.gana.backend.model.Insurance;

public interface InsuranceRepo {

	public String save(Insurance insurance);

	public Insurance findById(int insuranceid);

	public List<Insurance> findAll();

	public String update(Insurance insurance);

	public String deleteById(int id);

}
