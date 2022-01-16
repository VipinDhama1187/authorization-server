package com.vipin.auth.server.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.vipin.auth.server.model.SecurityUserDetails;
import com.vipin.auth.server.model.User;
import com.vipin.auth.server.repository.UserDetailsServiceRepository;

@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserDetailsServiceRepository userDetailsServiceRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> optionalUser = userDetailsServiceRepository.findUserByUsername(username);
		if (optionalUser.isPresent())
			return new SecurityUserDetails(optionalUser.get());
		else
			throw new UsernameNotFoundException(String.format("User with username %s not found", username));
	}

}
