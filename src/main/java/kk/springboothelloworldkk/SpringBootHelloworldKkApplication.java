package kk.springboothelloworldkk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringBootHelloworldKkApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootHelloworldKkApplication.class, args);
    }

}
