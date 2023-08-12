
package com.portafolio.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerRest {
    @GetMapping("/")
    public String start(){
        return"Portafolio";
    }
}
