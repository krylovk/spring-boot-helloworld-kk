package kk.springboothelloworldkk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/")
@RestController
public class RootController {
    @Autowired
    Environment environment;
    @GetMapping
    ResponseEntity get(){
        return ResponseEntity.ok(new Object());
    }
    @GetMapping("/env13205")
    ResponseEntity getEnv(){
        return ResponseEntity.ok(environment);
    }
}
