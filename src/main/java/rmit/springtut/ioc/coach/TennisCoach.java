package rmit.springtut.ioc.coach;

import org.springframework.stereotype.Component;

@Component("tennisCoach")
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Hit 3k times :)";
    }
}
