package zerobase.weather.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@OpenAPIDefinition(
        info = @Info(title = "날씨 일기 프로젝트 :)",
                description = "날씨 일기를 CRUD 할 수 있는 백엔드 API 입니다.",
                version = "2.0"))
@RequiredArgsConstructor
@Configuration
@EnableWebMvc // WebMvcConfigurer를 활성화시키기 위해 추가
public class SwaggerConfig implements WebMvcConfigurer {
}
