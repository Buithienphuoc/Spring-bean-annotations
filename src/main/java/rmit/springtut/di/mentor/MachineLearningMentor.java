package rmit.springtut.di.mentor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import rmit.springtut.di.service.FortuneService;

@Component
public class MachineLearningMentor implements Mentor {
    @Autowired
    @Qualifier("happyFortuneService")
    private final FortuneService fortuneService;

    public MachineLearningMentor(@Qualifier("happyFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Learn one section of Keras!!";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }
}
