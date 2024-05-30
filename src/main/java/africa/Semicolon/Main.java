package africa.Semicolon;

import africa.Semicolon.Services.HelloService;
import africa.Semicolon.Services.MailServices;
import africa.Semicolon.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                 new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

        HelloService helloService =context.getBean(HelloService.class);


        helloService.sayHello("Aramide");


        BigDecimal amount = context.getBean(BigDecimal.class);

        System.out.println(amount);


        MailServices mailServices =context.getBean(MailServices.class);
        mailServices.sendMailTo("Aramide@gmail.com");


    }
}