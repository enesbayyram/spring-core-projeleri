package com.enesbayram.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.enesbayram.interf.ISelam;
import com.enesbayram.interf.impl.SelamImpl;

@Configuration
@Import({AConfig.class,BConfig.class})
public class AppConfig {

	@Bean(name = "selam")
	public SelamImpl mesajYaz()
	{
		return new SelamImpl();
	}
}
