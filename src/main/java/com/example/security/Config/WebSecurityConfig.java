package com.example.security.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((requests) -> requests
                        .requestMatchers("/projetos").hasRole("PG_PROJETOS")
                        .requestMatchers("/relatorio-equipe").hasRole("PG_REL_EQUIPE")
                        .requestMatchers("/relatorio-custos").hasRole("PG_REL_CUSTOS")
                        .anyRequest()
                        .authenticated())
                .formLogin((form) -> form
                        .loginPage("/entrar")
                        .defaultSuccessUrl("/", true)
                        .permitAll())
                .logout()
                .logoutSuccessUrl("/entrar?logout")
                .permitAll();

        return http.build();
    }
}
