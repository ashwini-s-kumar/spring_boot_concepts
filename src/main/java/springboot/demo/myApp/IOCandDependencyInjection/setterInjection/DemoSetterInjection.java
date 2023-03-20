package springboot.demo.myApp.IOCandDependencyInjection.setterInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.demo.myApp.IOCandDependencyInjection.components.Coach;

@RestController
public class DemoSetterInjection {
    private Coach coach;

    // if there is only one constructor , then @Autowired is not needed.
    @Autowired
    public void setCoach(@Qualifier("cricketCoach") Coach coach) {
        System.out.println("In setter : " + getClass().getSimpleName());
        this.coach = coach;
    }

    @GetMapping("/setter/dailyWorkout")
    public String getDailyWorkout()
    {
        return "setter : "+coach.getDailyWorkout();
    }
}
