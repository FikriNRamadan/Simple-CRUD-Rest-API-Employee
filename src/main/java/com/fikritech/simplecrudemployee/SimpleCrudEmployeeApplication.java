package com.fikritech.simplecrudemployee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication(scanBasePackages = {"com.fikritech.simplecrudemployee"})
public class SimpleCrudEmployeeApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(SimpleCrudEmployeeApplication.class, args);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage(this.getClass()
						.getPackageName()))
				.paths(PathSelectors.any())
				.build()
				.useDefaultResponseMessages(false);
	}

}
