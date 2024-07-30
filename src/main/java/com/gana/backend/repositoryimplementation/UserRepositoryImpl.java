package com.gana.backend.repositoryimplementation;

import org.springframework.stereotype.Repository;

import com.gana.backend.model.User;
import com.gana.backend.repository.UserRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.NonUniqueResultException;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UserRepositoryImpl implements UserRepository {

	EntityManager entityManager;

	public UserRepositoryImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override

	public User findByUserName(String userName) {
		String jpql = "SELECT u FROM User u WHERE u.userName = :userName";
		TypedQuery<User> query = entityManager.createQuery(jpql, User.class);
		query.setParameter("userName", userName);

		try {
			return query.getSingleResult();
		} catch (NoResultException | NonUniqueResultException e) {
			return null;
		}
	}

	@Override
	public User save(User user) {
		entityManager.merge(user);
		return null;

	}

}
