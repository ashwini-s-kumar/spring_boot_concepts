package springboot.demo.IOCandDependencyInjection.myApp.javaConfigBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.demo.IOCandDependencyInjection.myApp.components.Coach;

@RestController
public class DemoConfigBean {
    private Coach coach;

    @Autowired
    public DemoConfigBean(@Qualifier("swimCoach") Coach coach){
        this.coach = coach;
    }

    @GetMapping("/configBean")
    public String getDailyWorkout(){
        return coach.getDailyWorkout();
    }
}
