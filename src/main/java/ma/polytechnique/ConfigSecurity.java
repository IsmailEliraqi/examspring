package ma.polytechnique;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;


@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class ConfigSecurity extends WebSecurityConfiguration{
	@Autowired
	public void config_global(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication().withUser("sair").password("{noop}1234").roles("ADMIN");
		auth.inMemoryAuthentication().withUser("eliraqi").password("{noop}1234").roles("VISITEUR"); 
		
		
		
	}

	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
			.anyRequest()
				.authenticated()
					.and()
		.formLogin()
    		.loginPage("/login")
    		.permitAll()
    	.defaultSuccessUrl("/index") ;	
		
	}

}
