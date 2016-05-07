package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
public class DemoApplication{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Configuration
	public static  class SecurityConfiguration extends WebSecurityConfigurerAdapter{
		@Override
		public void configure(WebSecurity web) throws Exception {
			web.ignoring().antMatchers("/**");
		}
	}

}
