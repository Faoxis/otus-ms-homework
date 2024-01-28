package demo.otushealthapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HealthController {

    @GetMapping("/health/")
    public Map<String, String> getOk() {
        return Map.of("status", "OK");
    }

}
