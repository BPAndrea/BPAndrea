package com.greenfox.inmemory.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.inMemoryAuthentication()

        .withUser("ajay").password("{noop}test").roles("USER").and()
        .withUser("demo").password("{noop}test2").roles("ADMIN");
  }

  @Override
  protected void configure(HttpSecurity httpSecurity) throws Exception {

    httpSecurity
        .authorizeRequests()
        //.anyRequest()
       // .fullyAuthenticated()
        .antMatchers("/rest/*").hasRole("USER")
        .and()
        .formLogin()
        .permitAll();
        //.addFilterBefore(customFilter(), BasicAuthenticationFilter.class)
       //.httpBasic();
    //httpSecurity.csrf().disable();

  }

/*  @Bean
  public CustomFilter customFilter() {
    return new CustomFilter();
  }*/
}
