package consuming.api.consumingapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
public class ConsumingApi {

	public static void main(String[] args) {
		SpringApplication.run(ConsumingApi.class, args);
	}

	@GetMapping("/")
	public ModelAndView home() {
		return new ModelAndView("/swagger-ui.html");
	}
}
