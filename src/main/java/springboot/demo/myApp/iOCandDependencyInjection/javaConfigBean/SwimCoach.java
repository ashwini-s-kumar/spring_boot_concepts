package springboot.demo.myApp.iOCandDependencyInjection.javaConfigBean;

import springboot.demo.myApp.iOCandDependencyInjection.components.Coach;

//don't add @Component
public class SwimCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Swim for 15 minutes";
    }
}
