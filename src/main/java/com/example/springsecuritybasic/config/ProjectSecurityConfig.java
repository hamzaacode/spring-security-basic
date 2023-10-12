package com.example.springsecuritybasic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests(request -> request.anyRequest().denyAll());
        http.formLogin(withDefaults());
        http.httpBasic(withDefaults());
        return http.build();
    }

//    @Bean
//    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception{
//        http.authorizeHttpRequests(request -> request.anyRequest().permitAll());
//        http.formLogin(withDefaults());
//        http.httpBasic(withDefaults());
//        return http.build();
//    }

//    @Bean
//    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
//        //  http.authorizeHttpRequests(request -> request.anyRequest().permitAll());
//        http.authorizeHttpRequests().requestMatchers("/userInfo").authenticated();
//        http.authorizeHttpRequests().requestMatchers("/welcome", "/getContactInfo").permitAll();
//        http.formLogin();
//        http.httpBasic();
//        return (SecurityFilterChain) http.build();
//    }
}
