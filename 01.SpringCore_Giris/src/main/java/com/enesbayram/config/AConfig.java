package com.enesbayram.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.enesbayram.model.A;

@Configuration
public class AConfig {

	@Bean(name = "abean")
	public A yazdir()
	{
		return new A();
	}
}
