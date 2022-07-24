package it.sps.main.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	private final PasswordEncoder pwdEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
  
	/**
	 * This section defines the user accounts which can be used for
	 * authentication as well as the roles each user has.
	*/
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {

		String cryptPass = pwdEncoder.encode("password");
		
		auth.inMemoryAuthentication()
	  		.withUser("viewer").password(cryptPass).roles("VIEWER").and()
	  		.withUser("editor").password(cryptPass).roles("EDITOR");
	}

	/**
	 * This section defines the security policy for the app.
	 * - BASIC authentication is supported (enough for this REST-based demo)
	 * - /employees is secured using URL security shown below
	 * - CSRF headers are disabled since we are only testing the REST interface,
	 *   not a web one.
	 *
	 * NOTE: GET is not shown which defaults to permitted.
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		  
		http
	    	.httpBasic().and()
	    	.authorizeRequests()
	        .antMatchers(HttpMethod.POST, "/employees").hasRole("EDITOR")
	        .antMatchers(HttpMethod.POST, "/saveFilm").hasRole("ADMIN")
	        .antMatchers(HttpMethod.POST, "/deleteFilm/**").hasRole("ADMIN").and()
	        .csrf().disable();
	}
	
}