package africa.Semicolon.Services;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
//@Primary
public class MailGunMailService implements  MailServices{


    @Override
    public void sendMailTo(String email){
        System.out.println("mail sent to" + email + "using MailGun");
    }
}
