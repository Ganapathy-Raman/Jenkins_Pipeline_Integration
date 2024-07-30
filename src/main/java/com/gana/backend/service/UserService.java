package com.gana.backend.service;

import com.gana.backend.model.User;

public interface UserService {
	public User findByUserName(String userName);

	public User saveUser(User user);
}
