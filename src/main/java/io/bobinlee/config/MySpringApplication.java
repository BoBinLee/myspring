package io.bobinlee.config;

import io.bobinlee.api.Apis;
import io.bobinlee.domain.Domains;
import io.bobinlee.web.Webs;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Import({
        SwaggerConfig.class
})
@EntityScan(
        basePackageClasses = {Domains.class, Jsr310JpaConverters.class})
@ComponentScan(basePackageClasses = {Webs.class, Apis.class, Domains.class})
@EnableJpaAuditing
@EnableJpaRepositories(basePackageClasses = {Domains.class})
@SpringBootApplication
public class MySpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpringApplication.class, args);
    }
}
