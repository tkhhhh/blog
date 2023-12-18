package com.myblog.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
@Configuration
public class WebSecuritConfig {
    @Bean
    public HttpSecurity httpSecurity(HttpSecurity http) throws Exception{
        http.
            authorizeHttpRequests((requests) -> requests.requestMatchers("/", "/home").permitAll()
                                    .anyRequest().authenticated())
            .formLogin((form) -> form.loginPage("/lohin").permitAll())
            .logout((logout) -> logout.permitAll());
        return http;
    }

    
}
