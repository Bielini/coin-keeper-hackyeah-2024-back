package cap.hackyeah.coin_keeper_hackyeah_2024_back.service.impl;

import cap.hackyeah.coin_keeper_hackyeah_2024_back.service.ImageGenerationService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Collections;

@Service
public class ImageGenarationServiceImpl implements ImageGenerationService {

    private final RestTemplate restTemplate;

    public ImageGenarationServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public String generate(String prompt, String size, String model) {
        String key = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoiODc3NWY0ZGYtMmYwYS00ZTJmLWE5YjktN2QxZTNhNzI1MzExIiwidHlwZSI6ImFwaV90b2tlbiJ9.cUjo1wNgmvv8pXhJJTOzfn0ZzIVJE50bUurp8bRhoHk";
        String url = "https://api.edenai.run/v2/image/generation";
        String body = "{\"response_as_dict\":true,\"attributes_as_list\":false,\"show_base_64\":true,\"show_original_response\":false,\"num_images\":1,\"providers\":[\"" + model + "\"],\"text\":\"" + "In the fantasy world "+prompt + "\",\"resolution\":\"512x512\"}";

        MultiValueMap<String, String> headers = new HttpHeaders();
        headers.put("Content-Type", Collections.singletonList("application/json"));
        headers.put("Authorization", Collections.singletonList("Bearer " + key));

        RequestEntity<String> request = new RequestEntity<>(body, headers, HttpMethod.POST, URI.create(url));
        ResponseEntity<String> exchange = restTemplate.postForEntity(url, request, String.class);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            JsonNode rootNode = objectMapper.readTree(exchange.getBody());
            JsonNode itemsNode = rootNode.path(model).path("items");
            if (itemsNode.isArray() && !itemsNode.isEmpty()) {
                return itemsNode.get(0).path("image").asText();
            }
        } catch (Exception e) {
            return "Exception: " + e;
        }
        return "Empty response from server";
    }
}
