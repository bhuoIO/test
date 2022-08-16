package com.kindata.uniearn.api.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
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
public class SwaggerConfig {

    @Value("${swagger2.enable}")
    private boolean enable;

    /**
     * 配置swagger2核心配置docket </br>
     * swagger访问路径：http://localhost:8081/swagger-ui.html </br>
     * swagger业务接口api
     *
     * @return
     */
    @Bean
    public Docket restApiBusiness() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("量化核心系统")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .paths(PathSelectors.any())
                .build()
                .enable(enable);
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("量化核心系统")
                .contact(new Contact("quant-wzw", "http://www.google.com", "597384114@qq.com"))
                .description("quant")
                .version("1.0.0")
                .termsOfServiceUrl("http://www.google.com")
                .build();
    }

}
