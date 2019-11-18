package consuming.api.consumingapi.controllers;

import consuming.api.consumingapi.configuration.FeignConfiguration;
import consuming.api.consumingapi.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeignController {

    @Autowired
    private FeignConfiguration feignClient;

    @GetMapping("/feign")
    public List<Post> getAllPosts() {
        return feignClient.getPosts();
    }
}
