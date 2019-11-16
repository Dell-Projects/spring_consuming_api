package consuming.api.consumingapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @GetMapping("/feign")
    public String usingFeign() {
        return "Feign";
    }
}
