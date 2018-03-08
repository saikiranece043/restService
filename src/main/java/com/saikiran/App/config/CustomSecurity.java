package com.saikiran.App.config;

import com.saikiran.App.model.CustomUserDetails;
import com.saikiran.App.service.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
@EnableWebSecurity
public class CustomSecurity extends WebSecurityConfigurerAdapter {

@Autowired
private CustomUserDetailsService userDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
       //Using in memory  authentication

        /*auth.inMemoryAuthentication()
                .withUser("Saikiran").password("498116").roles("user").and()
                .withUser("Sini").password("497962").roles("admin");*/



        auth.userDetailsService(userDetailsService);

    }

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {


        httpSecurity.csrf().disable();
        httpSecurity.authorizeRequests()
                  .anyRequest()
                .fullyAuthenticated().and().httpBasic();



    }
}
