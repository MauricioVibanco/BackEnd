package com.portfolio.MV;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MvApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvApplication.class, args);
	}
}
/*@Bean
        public WebMvcConfigurer corsConfigurer() {
            return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("https://frontendmv-46aea.web.app")
                        .allowedMethods("*").allowedHeaders("*");
		}
            };
        }
}
*/