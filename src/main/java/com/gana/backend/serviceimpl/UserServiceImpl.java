package com.gana.backend.serviceimpl;

import org.springframework.stereotype.Service;

import com.gana.backend.model.User;
import com.gana.backend.repository.UserRepository;
import com.gana.backend.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User findByUserName(String username) {
		return userRepository.findByUserName(username);
	}

	@Override
	public User saveUser(User user) {
		user.setPassword((user.getPassword()));
		return userRepository.save(user);
	}
}
