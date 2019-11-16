package consuming.api.consumingapi.controllers;

import consuming.api.consumingapi.configuration.RestTemplateConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestTemplateController {
    @GetMapping("/restTemplate")
    public ResponseEntity<String> usingRestTemplate() {

        RestTemplate restTemplate = new RestTemplate();
        String url = "https://gturnquist-quoters.cfapps.io/api/random";
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

        return response;
    }
}
