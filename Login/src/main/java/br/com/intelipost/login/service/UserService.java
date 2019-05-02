package br.com.intelipost.login.service;

import br.com.intelipost.login.model.User;

public interface UserService {
	
	void save(User user);

	User findByUsername(String username);
}