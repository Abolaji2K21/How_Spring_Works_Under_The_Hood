package africa.Semicolon.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class SendGridMailService implements MailServices{

    @Autowired
    private HelloService helloService;


    @Autowired
    public SendGridMailService(HelloService helloService){
        System.out.println("Sending Via Hello Services");
        this.helloService = helloService;
    }

    @Override
    public void sendMailTo(String email){
        helloService.sayHello(email);
        System.out.println("mail sent to " + email + " using sendGrid");
    }
}
