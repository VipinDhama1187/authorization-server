package com.vipin.auth.server.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vipin.auth.server.oauth.model.OauthClientDetails;

@Repository("clientDetailsServiceRepository")
public interface ClientDetailsServiceRepository extends JpaRepository<OauthClientDetails, Integer> {

	Optional<OauthClientDetails> findOauthClientDetailsByClientId(String clientId);
}
