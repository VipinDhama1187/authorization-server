INSERT INTO oauth2_schema.oauth_client_details
(id, access_token_validity, additional_information, authorities, authorized_grant_types, autoapprove, client_id, client_name, client_secret, created, enabled, refresh_token_validity, resource_ids, "scope", uuid, web_server_redirect_uri)
VALUES(1, 10800, NULL, 'USER', 'password,refresh_token', NULL, 'spring-security-oauth2-read-client', NULL, '12345', NULL, true, 2592000, 'resource-server-rest-api', 'read', NULL, 'http://localhost:8091');
INSERT INTO oauth2_schema.oauth_client_details
(id, access_token_validity, additional_information, authorities, authorized_grant_types, autoapprove, client_id, client_name, client_secret, created, enabled, refresh_token_validity, resource_ids, "scope", uuid, web_server_redirect_uri)
VALUES(2, 10800, NULL, 'USER', 'authorization_code,refresh_token', NULL, 'spring-security-oauth2-read-write-client', NULL, '12345', NULL, true, 2592000, 'resource-server-rest-api', 'read,write', NULL, 'http://localhost:8091');