package com.enesbayram.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.enesbayram.model.B;

@Configuration
public class BConfig {

	@Bean(name = "bbean")
	public B yazdir()
	{
		return new B();
	}
}
