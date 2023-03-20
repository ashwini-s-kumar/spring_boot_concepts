package springboot.demo.IOCandDependencyInjection.myApp.javaConfigBean;

import springboot.demo.IOCandDependencyInjection.myApp.components.Coach;

//don't add @Component
public class SwimCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Swim for 15 minutes";
    }
}
