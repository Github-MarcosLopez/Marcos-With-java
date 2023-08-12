package com.portafolio.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControllerRest {
    @GetMapping("/")
    public String start(){
        log.info("Controller MVC - return ControllerRest");
        return"index";
    }
}
