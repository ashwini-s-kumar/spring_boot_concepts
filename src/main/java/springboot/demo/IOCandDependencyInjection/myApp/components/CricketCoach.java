package springboot.demo.IOCandDependencyInjection.myApp.components;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Play cricket for 15 minutes";
    }
}
