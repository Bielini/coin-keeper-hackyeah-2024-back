package cap.hackyeah.coin_keeper_hackyeah_2024_back.controller;

import cap.hackyeah.coin_keeper_hackyeah_2024_back.service.ImageGenerationService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController {

    private static final Logger log = LoggerFactory.getLogger(ImageController.class);
    private final ImageGenerationService imageGenerationService;

    public ImageController(ImageGenerationService imageGenerationService) {
        this.imageGenerationService = imageGenerationService;
    }

    @PostMapping("/image")
    public String generate(@RequestBody String prompt) {
        log.info("Incoming prompt: {}", prompt);
        return imageGenerationService.generate(prompt, "256x256", "openai/dall-e-2");
    }
}
