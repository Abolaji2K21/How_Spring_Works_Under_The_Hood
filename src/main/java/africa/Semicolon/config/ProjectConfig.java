package africa.Semicolon.config;


import africa.Semicolon.Services.HelloService;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.math.BigDecimal;

@Configuration
@ComponentScan(basePackages = "africa.Semicolon")
public class ProjectConfig {


    @Bean
    @Primary
    public HelloService helloService(){
        return new HelloService();
    }

    @Bean
    public BigDecimal bigDecimal(){
        return  new BigDecimal(200);
    }
}
