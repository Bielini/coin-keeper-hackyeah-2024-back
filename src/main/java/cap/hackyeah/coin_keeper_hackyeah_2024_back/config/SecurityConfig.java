package cap.hackyeah.coin_keeper_hackyeah_2024_back.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.authorizeHttpRequests(requests -> requests
                .requestMatchers("/myBalance").authenticated()
                .requestMatchers("/login", "offers").permitAll())
                .httpBasic(Customizer.withDefaults())
                .build();
    }
}
