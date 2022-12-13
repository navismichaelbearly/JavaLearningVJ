package com.n2s.AnnConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Coffee getCoffee() {
		return new Coffee();
	}
	@Bean
	public Tea getTea() {
		return new Tea();
	}
}
