package com.gana.backend.repository;

import com.gana.backend.model.User;

public interface UserRepository {

	public User findByUserName(String userName);

	public User save(User user);
}
