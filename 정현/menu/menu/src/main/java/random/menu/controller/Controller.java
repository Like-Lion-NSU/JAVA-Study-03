package random.menu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.google.cloud.spring.vision.CloudVisionTemplate;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class Controller {
    @Autowired
    private ResourceLoader resourceLoader;

    @Autowired
    private CloudVisionTemplate cloudVisionTemplate;

    @GetMapping("/extractTextFromImage")
    public String extract() {
        String imageUrl = "https://cloud.google.com/vision/docs/images/sign_text.png";
        return this.cloudVisionTemplate.extractTextFromImage(this.resourceLoader.getResource(imageUrl));
    }
}
