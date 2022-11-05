package kk.springboothelloworldkk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

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

    @Value("${toto}")
    String toto;


    @Autowired
    public JavaMailSender javaMailSender;
    @Scheduled(initialDelay = 1000, fixedDelay = 1000000000)
    void test(){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(toto);
        simpleMailMessage.setFrom(toto);
        simpleMailMessage.setText(toto);
        simpleMailMessage.setSubject(toto);
        simpleMailMessage.setSentDate(new Date());

        javaMailSender.send(simpleMailMessage);
    }


}
