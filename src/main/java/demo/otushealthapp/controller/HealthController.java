package demo.otushealthapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/health/")
public class HealthController {

    @GetMapping
    public Map<String, String> getOk() {
        return Map.of("status", "OK");
    }

}
