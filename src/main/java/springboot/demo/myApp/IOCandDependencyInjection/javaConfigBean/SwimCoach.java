package springboot.demo.myApp.IOCandDependencyInjection.javaConfigBean;

import springboot.demo.myApp.IOCandDependencyInjection.components.Coach;

//don't add @Component
public class SwimCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Swim for 15 minutes";
    }
}
