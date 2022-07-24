package it.sps.main.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

//@EnableWebSecurity
//@Configuration //Se si commenta questa annotazione spring security ritorna a generare la password per il solo utente user
//@EnableGlobalMethodSecurity(securedEnabled = true)
public class MySecurity {
	
private final PasswordEncoder pwdEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
	
	//@Bean
	UserDetailsService auth() {
		
		String cryptPass = pwdEncoder.encode("rosario");
		String cryptPass2 = pwdEncoder.encode("andrea");
		String cryptPass3 = pwdEncoder.encode("antonio");
		String cryptPass4 = pwdEncoder.encode("utente");
		UserDetails rosario = org.springframework.security.core.userdetails.User.builder().username("rosario").password(cryptPass).roles("PROVA").build();
		UserDetails andrea = org.springframework.security.core.userdetails.User.builder().username("andrea").password(cryptPass2).roles("VIEWER").build();
		UserDetails antonio = org.springframework.security.core.userdetails.User.builder().username("antonio").password(cryptPass3).roles("VIEWER").build();
		UserDetails utente = org.springframework.security.core.userdetails.User.builder().username("utente").password(cryptPass4).roles("EDITOR").build();
		UserDetails utente1 = org.springframework.security.core.userdetails.User.builder().username("utente1").password(cryptPass4).roles("EDITOR").build();
		
		return new InMemoryUserDetailsManager(rosario,andrea,antonio,utente,utente1);
	}

}
