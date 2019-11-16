package consuming.api.consumingapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
public class WebClientController {

    @Autowired
    private WebClient.Builder webClientBuilder;

    @GetMapping("/webClient")
    public String setWebClientBuilder() {

        String response = webClientBuilder.build()
                .get()
                .uri("https://gturnquist-quoters.cfapps.io/api/random")
                .retrieve()
                .bodyToMono(String.class)
                .block();

        return response;
    }
}