package com.pharma.targeting.eshot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerDocumentationConfiguration {

	@Bean
	public Docket customConfig() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/api/*"))
				.apis(RequestHandlerSelectors.basePackage("com.pharma.targeting.eshot"))
				.build()
				.apiInfo(metaData());
	}
	
	private ApiInfo metaData() {
		
		return new ApiInfoBuilder()
				.title("Pharma Targeting EShot Api Documentation")
				.description("Pharma Targeting Eshot Services details documentation")
				.version("1.0.0")
				.license("Apache 2.0")
				.licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
				.contact(new Contact("SR", "http://www", "SR@gmail.com"))
				.build();
				
	}
	
	
	
	
	
	
	
	
	
	
	
}
