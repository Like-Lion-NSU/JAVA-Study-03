package random.menu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import random.menu.service.RandomTestService;

@RestController
@RequestMapping("/api")
public class RandomController {
    @Autowired
    private RandomTestService randomTestService;
    @GetMapping("/TextFromImage")
    public String TextFromImage(@RequestParam String imageUrl) throws Exception {
        return randomTestService.TextFromImage(imageUrl);
    }

    @GetMapping("/getRandomText")
    public String getRandomText(@RequestParam String imageUrl) throws Exception {
        return randomTestService.getRandomText(imageUrl);
    }
}
