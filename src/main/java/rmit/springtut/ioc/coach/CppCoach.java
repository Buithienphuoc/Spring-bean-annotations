package rmit.springtut.ioc.coach;

import org.springframework.stereotype.Component;

@Component("cppCoach")
public class CppCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Do 1 SED exercise!";
    }
}
