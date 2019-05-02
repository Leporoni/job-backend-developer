package br.com.intelipost.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.intelipost.login.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}