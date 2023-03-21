package springboot.demo.myApp.iOCandDependencyInjection.beanScope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.demo.myApp.iOCandDependencyInjection.components.Coach;

@RestController
public class DemoBeanScope {
    private Coach coach1;
    private Coach coach2;

    private Coach coach3;
    private Coach coach4;

    @Autowired
    public DemoBeanScope(@Qualifier("cricketCoach") Coach coach1, @Qualifier("cricketCoach") Coach coach2,
                         @Qualifier("baseBallCoach") Coach coach3, @Qualifier("baseBallCoach") Coach coach4) {
        System.out.println("In constructor : " + getClass().getSimpleName());
        this.coach1 = coach1;
        this.coach2 = coach2;
        this.coach3 = coach3;
        this.coach4 = coach4;
    }

    @GetMapping("/checkBeanScope1")
    public String checkBeanScope1()
    {
        return " Is coach1 ==  coach2: "+ (coach1 == coach2);
    }

    @GetMapping("/checkBeanScope2")
    public String checkBeanScope2()
    {
        return " Is coach3 ==  coach4: "+ (coach3 == coach4);
    }
}
