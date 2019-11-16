package consuming.api.consumingapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebClientController {
    @GetMapping("/webClient")
    public String usingWebClient() {
        return "Web client";
    }
}
