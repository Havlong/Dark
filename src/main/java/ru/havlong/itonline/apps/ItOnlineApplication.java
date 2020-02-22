package ru.havlong.itonline.apps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * 21.02.19
 * ItOnlineApplication
 *
 * @author Havlong
 * @version v1.0
 */
@SpringBootApplication
@ComponentScan(basePackages = "ru.havlong.itonline")
@EnableJpaRepositories(basePackages = "ru.havlong.itonline.repositories")
@EntityScan(basePackages = "ru.havlong.itonline.models")
public class ItOnlineApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItOnlineApplication.class, args);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
