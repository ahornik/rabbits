package com.hornik.rabbit.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import java.util.logging.Logger;

@Configuration
@EnableWebSecurity
public class SecurityConfigRabbit extends WebSecurityConfigurerAdapter {


    private Logger logger = Logger.getLogger(getClass().getName());

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/**").permitAll();

        http.authorizeRequests()
                .antMatchers(HttpMethod.POST, "/**").permitAll();

    }

}
