package smartmed.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

import static smartmed.constant.SmartMedConstants.BASE_PACKAGE_NAME;
import static springfox.documentation.spi.DocumentationType.SWAGGER_2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Value("${smartmed.swagger.version}")
    private String version;

    @Bean
    public Docket api() {
        ApiInfo apiInfo = new ApiInfo("SMARTMED", "REST API SMARTMED", version, null,
                new Contact("", "", ""), null, null, new ArrayList<>());
        return new Docket(SWAGGER_2)
                .apiInfo(apiInfo)
                .select()
                .apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE_NAME))
                .paths(PathSelectors.any())
                .build();
    }
}