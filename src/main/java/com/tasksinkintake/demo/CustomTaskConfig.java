package com.tasksinkintake.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomTaskConfig {

	@Bean
	public CustomTaskProcessor customTaskProcessor() {
		return new CustomTaskProcessor();
	}
}
