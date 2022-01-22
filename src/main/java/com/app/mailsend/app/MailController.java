package com.app.mailsend.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;

@RestController
public class MailController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${email.sender.to}")
    private String to_mail;

    @Autowired
    private MailService mailService;

    @RequestMapping(value = "/")
    public void send(@RequestParam int amount){
        int i = 0;
        while (i < amount) {
            logger.info("Sending .. {}", i);
            try {
                mailService.sendMail(to_mail, "teste", "mensagem teste");
                i++;
                if (i == 10) {
                    i = 0;
                    Thread.sleep(5000);
                }
            } catch (MessagingException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
