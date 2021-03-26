package rmit.springtut.ioc.coach;

import org.springframework.stereotype.Component;

@Component
public class JavaCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Create 1 Spring boot API";
    }
}
