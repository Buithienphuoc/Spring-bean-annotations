package rmit.springtut.di.mentor;

import org.springframework.stereotype.Component;

@Component("machineLearningMentor")
public class MachineLearningMentor implements Mentor {
    @Override
    public String getDailyWorkout() {
        return null;
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
