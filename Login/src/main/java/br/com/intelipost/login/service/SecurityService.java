package br.com.intelipost.login.service;

public interface SecurityService {
	
	String findLoggedInUsername();

	void autoLogin(String username, String password);
}