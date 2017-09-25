package com.hendisantika.auth;

import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-microservice
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 9/25/17
 * Time: 7:11 AM
 * To change this template use File | Settings | File Templates.
 */

//@Configuration
//@EnableAuthorizationServer
public class OAuth2Config extends AuthorizationServerConfigurerAdapter {
//    @Autowired
//	private AuthenticationManager authenticationManager;
//
//	@Override
//	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
//		endpoints
//		.authenticationManager(this.authenticationManager)
//		.tokenStore(tokenStore());
//	}
//
//	@Override
//	public void configure(AuthorizationServerSecurityConfigurer oauthServer)
//			throws Exception {
//		oauthServer
//			.tokenKeyAccess("permitAll()")
//			.checkTokenAccess("isAuthenticated()");
//	}

//	@Override
//	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
//		clients.inMemory()
//			.withClient("ui1")
//			.secret("ui1-secret")
//			.authorities("ROLE_TRUSTED_CLIENT")
//			.authorizedGrantTypes("authorization_code", "refresh_token")
//			.scopes("ui1.read")
//			.autoApprove(true)
//		.and()
//			.withClient("ui2")
//			.secret("ui2-secret")
//			.authorities("ROLE_TRUSTED_CLIENT")
//			.authorizedGrantTypes("authorization_code", "refresh_token")
//			.scopes("ui2.read", "ui2.write")
//			.autoApprove(true)
//		.and()
//			.withClient("mobile-app")
//			.authorities("ROLE_CLIENT")
//			.authorizedGrantTypes("implicit", "refresh_token")
//			.scopes("read")
//			.autoApprove(true)
//		.and()
//			.withClient("customer-integration-system")
//			.secret("1234567890")
//			.authorities("ROLE_CLIENT")
//			.authorizedGrantTypes("client_credentials")
//			.scopes("read")
//			.autoApprove(true);
//}

//	@Autowired
//	private DataSource dataSource;
//
//	@Bean
//	public JdbcTokenStore tokenStore() {
//		return new JdbcTokenStore(dataSource);
//	}
}
