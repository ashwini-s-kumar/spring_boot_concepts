package springboot.demo.myApp.IOCandDependencyInjection.beanLifeCycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import springboot.demo.myApp.IOCandDependencyInjection.components.Coach;

@Component
public class ThrowBallCoach implements Coach {
    private String lifeCycle;

    @PostConstruct
    public void myCustomInit(){
        String init = "In myCustomInit for class : " + getClass().getSimpleName();
        System.out.println(init);
        lifeCycle = init  +" , Check for preDestroy in logs";
    }

    @PreDestroy
    public void myCustomDestroy(){
        String destroy = "In myCustomDestroy for class : " + getClass().getSimpleName();
        System.out.println(destroy);
    }

    @Override
    public String getDailyWorkout() {
        return lifeCycle;
    }

    public String getLifeCycle(){
        return lifeCycle;
    }
}
