package springboot.demo.myApp.IOCandDependencyInjection.javaConfigBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springboot.demo.myApp.IOCandDependencyInjection.components.Coach;

@Configuration
public class SportsConfig {

    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
