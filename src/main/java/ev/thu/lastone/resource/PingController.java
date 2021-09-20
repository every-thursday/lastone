package ev.thu.lastone.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
@EnableWebMvc
public class PingController {

  @GetMapping("/ping")
  public String ping() {
    return "OK";
  }
}
