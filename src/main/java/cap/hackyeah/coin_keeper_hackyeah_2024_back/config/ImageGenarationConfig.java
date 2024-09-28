package cap.hackyeah.coin_keeper_hackyeah_2024_back.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ImageGenarationConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
