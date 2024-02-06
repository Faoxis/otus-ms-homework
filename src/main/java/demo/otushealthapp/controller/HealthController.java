package demo.otushealthapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HealthController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping(value = {"/health", "/health/"})
    public Map<String, String> getOk() {
        logger.info("Thanks for asking my health");
        return Map.of("status", "OK");
    }

}
