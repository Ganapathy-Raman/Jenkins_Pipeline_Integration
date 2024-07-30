package com.gana.backend.repositoryimplementation;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gana.backend.model.Insurance;
import com.gana.backend.repository.InsuranceRepo;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class InsuranceRepoImpl implements InsuranceRepo {

	EntityManager entityManager;

	public InsuranceRepoImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	public String save(Insurance insurance) {
		if (insurance != null) {
			entityManager.merge(insurance);
			return "Success";
		} else {
			return "Failed to add";
		}
	}

	@Override
	public Insurance findById(int insuranceid) {
		return entityManager.find(Insurance.class, insuranceid);
	}

	@Override
	public List<Insurance> findAll() {
		return entityManager.createQuery("from Insurance", Insurance.class).getResultList();
	}

	@Override
	public String update(Insurance insurance) {
		if (insurance != null) {
			entityManager.merge(insurance);
			return "Success";
		} else {
			return "Failed to update";
		}

	}

	@Override
	public String deleteById(int insuranceid) {
		Insurance insurance = entityManager.find(Insurance.class, insuranceid);
		if (insurance != null) {
			entityManager.remove(insurance);
			return "Success";
		} else {
			return "Failed to delete";
		}
	}

}
