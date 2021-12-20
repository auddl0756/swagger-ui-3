package org.roon.club.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeRequests()
                .antMatchers("/sample/all").permitAll()
                .antMatchers("/swagger-ui.html/**", "/configuration/**", "/swagger-resources/**",
                        "/v2/api-docs","/webjars/**", "/webjars/springfox-swagger-ui/*.{js,css}").permitAll()
                .antMatchers("/sample/member").hasRole("USER");

        httpSecurity.formLogin();
    }

    private static final String[] AUTH_WHITELIST = {
            "/swagger-resources/**",
            "/swagger-ui.html/**",
            "/configuration/**",
            "/v2/api-docs",
            "/webjars/*",
            "/webjars/springfox-swagger-ui/*",
            "{js,css}"
    };

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers(AUTH_WHITELIST);
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("user1")
                .password(passwordEncoder().encode("1234"))
                .roles("USER");
    }
}
