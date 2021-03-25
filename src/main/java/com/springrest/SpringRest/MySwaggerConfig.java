package com.springrest.SpringRest;

/* The static import is used for the regex(..) method. */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;
import springfox.documentation.service.Contact;

 
@Configuration
@EnableSwagger2
public class MySwaggerConfig {
 
    @Bean
    public Docket developerApi() {
    	 return new Docket(DocumentationType.SWAGGER_2)
                 .select().apis(RequestHandlerSelectors.basePackage("com.springrest.SpringRest.controller"))
                 .paths(regex("/developers.*"))
                 .build()
                 .apiInfo(metaData());
    }

    private ApiInfo metaData() {
        @SuppressWarnings("deprecation")
		ApiInfo apiInfo = new ApiInfo(
                "SpringBoot REST Project",
                "This Application manages all the Developers ",
                "1.0",
                "Terms of service",
                "Apache License Version 2.0",
                "https://www.apache.org/licenses/LICENSE-2.0", null);
        return apiInfo;

}
}