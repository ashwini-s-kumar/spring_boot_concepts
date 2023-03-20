package springboot.demo.myApp.IOCandDependencyInjection.demoComponentScanning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.demo.componentScanning.NewCoach;


@RestController
public class DemoComponentScanning {
    private NewCoach newCoach;

    @Autowired
    public DemoComponentScanning(NewCoach newCoach){
        System.out.println("In constructor : " + getClass().getSimpleName());
        this.newCoach = newCoach;
    }

    @GetMapping("/componentScan/dailyWorkout")
    public String getDailyWorkout(){
        return "componentScanning : " + newCoach.getDailyWorkout();
    }
}
