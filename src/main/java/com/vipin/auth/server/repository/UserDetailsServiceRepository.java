package com.vipin.auth.server.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vipin.auth.server.model.User;

@Repository("userDetailsServiceRepository")
public interface UserDetailsServiceRepository extends JpaRepository<User, Integer> {

	Optional<User> findUserByUsername(String username);

}
