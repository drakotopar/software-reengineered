package com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith3Layers.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.software_reengineered.blogPost")
@EntityScan(basePackages = "com.software_reengineered.blogPost")
@ComponentScan(basePackages = "com.software_reengineered.blogPost")
public class App {

	public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
