package com.netjstech;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.Contact;
import springfox.documentation.builders.ApiInfoBuilder;
//import io.swagger.models.Contact;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfiguration {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.OAS_30)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.netjstech"))
				.paths(PathSelectors.any())
				.build().apiInfo(apiEndPointInfo());
	}
	public ApiInfo apiEndPointInfo() {
		return new ApiInfoBuilder().title("spring Boot project Rest API")
				.description("Consumer API")
				.contact(new Contact("NetjsTech", "http://netjstech.com", "harshitha.lokireddy@gmail.com"))
				.license("Apache 2.0")
				.licenseUrl("http://www.apache.org/license/LICENSE-2.0.html")
				.version("0.0.1-SNAPSHOT")
				.build();
	}

}