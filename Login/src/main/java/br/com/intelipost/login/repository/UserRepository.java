package br.com.intelipost.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.intelipost.login.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}