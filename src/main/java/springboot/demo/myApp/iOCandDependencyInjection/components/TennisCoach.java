package springboot.demo.myApp.iOCandDependencyInjection.components;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Play tennis for 15 minutes";
    }
}
