package ai.prama.ecs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ai.prama.ecs.models.UserEntity;

@RestController
@RequestMapping("/get")
public class HomeController {

    @Autowired
    UserEntity entity;

    @GetMapping("/data")
    public UserEntity getEntity() {
        return entity;
    }

}
