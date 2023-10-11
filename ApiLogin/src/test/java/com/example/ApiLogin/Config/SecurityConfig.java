package com.example.ApiLogin.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public abstract class SecurityConfig {
    @Bean
    public abstract PasswordEncoder passwordEncoder();
        return new

    void BCryptPasswordEncoder() {

    }
}
