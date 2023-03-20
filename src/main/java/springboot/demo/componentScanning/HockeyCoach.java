package springboot.demo.componentScanning;

import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements NewCoach {
    @Override
    public String getDailyWorkout() {
        return "Play hockey for 15 minutes";
    }
}
