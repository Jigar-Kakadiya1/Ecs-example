package ai.prama.ecs.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Slf4j
public class HomeController {

    @GetMapping("/")
    public String home() {
        log.info("home controller with initial endpoints");
        return "Welcome to Prama!";
    }

    @GetMapping("/name/{name}")
    public String getName(@PathVariable String name) {
        if (name != null) {
            log.info("home controller with getName and Name is :" + name);
            return "Welcome to Prama " + name;
        } else {
            log.info("home controller with getName endpoints and Name is empty");
            return "your name is empty or null";
        }

    }
}
