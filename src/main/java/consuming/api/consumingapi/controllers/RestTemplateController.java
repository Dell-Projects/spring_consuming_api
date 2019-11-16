package consuming.api.consumingapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTemplateController {
    @GetMapping("/restTemplate")
    public String usingRestTemplate() {
        return "Rest template";
    }
}
