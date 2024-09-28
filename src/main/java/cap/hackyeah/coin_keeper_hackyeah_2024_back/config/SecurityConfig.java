package cap.hackyeah.coin_keeper_hackyeah_2024_back.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityConfig {

   /* @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.authorizeHttpRequests(requests -> requests
                .requestMatchers("/myBalance").authenticated()
                .requestMatchers("/login", "offers").permitAll())
                .httpBasic(Customizer.withDefaults())
                .build();
    }*/
}
