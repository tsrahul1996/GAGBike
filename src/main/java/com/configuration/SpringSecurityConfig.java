

package com.configuration;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	
	   @Override
	    protected void configure(HttpSecurity http) throws Exception {
		   http.cors();
		   http.csrf().disable()
          .authorizeRequests()
          .antMatchers(HttpMethod.OPTIONS, "/**")
          .permitAll();
		   
		   http.authorizeRequests().antMatchers("/").permitAll().and()
           .authorizeRequests().antMatchers("/console/**").permitAll();
		   
		   http.headers().frameOptions().disable(); 
	  
		   
		
	    }



	/*
	 @Override protected void configure(HttpSecurity http) throws Exception {
	 http.cors().and().csrf(). disable() .authorizeRequests()
	 .antMatchers(HttpMethod.OPTIONS, "/**") .permitAll() .anyRequest()
	 .authenticated() .and() .httpBasic();
	 http.headers().frameOptions().disable(); }
	
	
	@Bean CorsConfigurationSource corsConfigurationSource() { CorsConfiguration
	configuration = new CorsConfiguration();
	configuration.setAllowedOrigins(Arrays.asList("http://150.1.18.138:4200"));
	configuration.setAllowedMethods(Arrays.asList("GET","POST"));
	UrlBasedCorsConfigurationSource source = new
	UrlBasedCorsConfigurationSource(); source.registerCorsConfiguration("/**",
	configuration); return source; }
	 */
	

}