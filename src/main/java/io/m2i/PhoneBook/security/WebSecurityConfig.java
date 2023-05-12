package io.m2i.PhoneBook.security;

import io.m2i.PhoneBook.service.UserDetailsServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    UserDetailsService userDetailsService() {
        return new UserDetailsServiceImpl();
    }
    @Bean
    BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setPasswordEncoder(passwordEncoder());
        provider.setUserDetailsService(userDetailsService());
        return provider;
    }

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .authorizeHttpRequests(requests -> {
                    requests
                            .requestMatchers("/").permitAll()
                            .requestMatchers("/users/**").permitAll()
                            .anyRequest().authenticated();
                })
                .formLogin(form -> {
                    form
                            .loginPage("/login")
                            .usernameParameter("email") // <input name="email">
                            .passwordParameter("password") // <input name="password">
                            .permitAll()
                            .defaultSuccessUrl("/", true);
                })
                .logout(logout -> {
                    logout
                            .logoutUrl("/logout");
                })
                .build();
    }

}
