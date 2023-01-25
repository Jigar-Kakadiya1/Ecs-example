package ai.prama.ecs.controller;

import ai.prama.ecs.models.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    UserEntity entity;

    @GetMapping("/data")
    public UserEntity getEntity() {
        log.info("user data found...");
        return entity;
    }

}
