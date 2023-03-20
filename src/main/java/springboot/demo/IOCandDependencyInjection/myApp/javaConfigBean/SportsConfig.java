package springboot.demo.IOCandDependencyInjection.myApp.javaConfigBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springboot.demo.IOCandDependencyInjection.myApp.components.Coach;

@Configuration
public class SportsConfig {

    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
