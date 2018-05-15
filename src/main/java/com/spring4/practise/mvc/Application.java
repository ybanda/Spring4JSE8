package com.spring4.practise.mvc;


import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@ImportResource("classpath:spring-config.xml")
@SpringBootApplication
@Configuration
@EnableSwagger2
//@EnableAutoConfiguration
public class Application  extends SpringBootServletInitializer{
//WebMvcConfigurationSupport{
//SpringBootServletInitializer

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    // Used for reading JSP Resources
//    @Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(Application.class);
//	}
    
    @Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com"))
				.paths(PathSelectors.regex("/api.*"))
				.build();
		//PathSelectors.any()
	}
	
    
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's Test  inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }
    
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
          .addResourceLocations("classpath:/META-INF/resources/");
     
        registry.addResourceHandler("/webjars/**")
          .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

}