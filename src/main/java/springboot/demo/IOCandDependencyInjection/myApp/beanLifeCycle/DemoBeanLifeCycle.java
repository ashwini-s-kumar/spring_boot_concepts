package springboot.demo.IOCandDependencyInjection.myApp.beanLifeCycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoBeanLifeCycle {
    private ThrowBallCoach coach;

    @Autowired
    public DemoBeanLifeCycle(ThrowBallCoach coach){
        this.coach = coach;
    }

    @GetMapping("/lifeCycle")
    public String getLifeCycle(){
        return coach.getLifeCycle();
    }
}
