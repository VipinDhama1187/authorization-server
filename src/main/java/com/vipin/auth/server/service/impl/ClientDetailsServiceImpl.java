package com.vipin.auth.server.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.stereotype.Service;

import com.vipin.auth.server.oauth.model.AuthorizationClientDetails;
import com.vipin.auth.server.oauth.model.OauthClientDetails;
import com.vipin.auth.server.repository.ClientDetailsServiceRepository;

@Service("clientDetailsServiceImpl")
public class ClientDetailsServiceImpl implements ClientDetailsService {
	
	@Autowired
	private ClientDetailsServiceRepository  clientDetailsServiceRepository;

	@Override
	public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
		Optional<OauthClientDetails> optionalOauthClientDetails = clientDetailsServiceRepository.findOauthClientDetailsByClientId(clientId);
		
		if(optionalOauthClientDetails.isPresent())
			return new AuthorizationClientDetails(optionalOauthClientDetails.get());
		else
			throw new ClientRegistrationException(String.format("Client is not registered with client id %s", clientId));
	}

}
