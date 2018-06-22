package br.com.phoebus.npspring5tutorial.controller;

import br.com.phoebus.npspring5tutorial.mail.MailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
public class MailController {

    private MailSender mailSender;

    public MailController(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    @RequestMapping("/mail")
    public String mail() throws MessagingException {
        this.mailSender.send("leonardo.leitao@dce.ufpb.br", "A test mail", "Body of the test mail.");
        return "Mail sent";
    }
}
