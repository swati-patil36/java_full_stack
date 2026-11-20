package com.swati.spring_sec_demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsPasswordService;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration 
@EnableWebSecurity 
public class SecurityConfig {

    @Bean 
    public SecurityFilterChain securityFilterChain(HttpSecurity http)throws Exception {

        // // Imperative way of writing the below code only for first line
        // Customizer<CsrfConfigurer<HttpSecurity>> custCsrf = new Customizer<CsrfConfigurer<HttpSecurity>>() {
        //     @Override
        //     public void customize(CsrfConfigurer<HttpSecurity> configurer) {
        //         configurer.disable();

        //     }
        // };
        // http.csrf(custCsrf);
        
        //lambok way of writing the above code- only for the below 1st line
        // http.csrf(customizer -> customizer.disable());
        // http.authorizeHttpRequests(request -> request.anyRequest().authenticated());
        // // http.formLogin(Customizer.withDefaults());
        // http.httpBasic(Customizer.withDefaults());
        // http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

        http.csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(request -> request.anyRequest().authenticated())
            .httpBasic(Customizer.withDefaults())
            .sessionManagement(session -> 
                    session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
            // .authenticationProvider(authProvider());
            
        return http.build();
    }

    // @Bean
    // public UserDetailsService userDetailsService(){

    //     UserDetails user = User.withUsername("swati")
    //             .password("{noop}swati123")
    //             .roles("USER")
    //             .build();

    //     UserDetails admin = User.withUsername("admin")
    //             .password("{noop}admin123")
    //             .roles("ADMIN")
    //             .build();

    //     return new InMemoryUserDetailsManager(user,admin);
    // }

    @Autowired 
    private UserDetailsService userDetailsService;

    

    @Bean 
    // @Autowired 
    public AuthenticationProvider authProvider(){
        // DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        // provider.setUserDetailsService(userDetailsService());
        // provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());

        DaoAuthenticationProvider provider = new DaoAuthenticationProvider(userDetailsService);

        // provider.setUserDetailsPasswordService(userDetailsPasswordService);
        provider.setPasswordEncoder(new BCryptPasswordEncoder(12));
        return provider;   
    }



    
}
