package rmit.springtut.di.mentor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import rmit.springtut.di.service.FortuneService;

@Component
public class PythonMentor implements Mentor {
    // Define attribute for the dependency
    @Autowired
    @Qualifier("luckyFortuneService")
    private final FortuneService fortuneService;

    // Define constructor
    @Autowired
    public PythonMentor(@Qualifier("luckyFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 1h to practice Numpy, you will be the best Python developer :)";
    }

    @Override
    public String getDailyFortune() {
        System.out.println("Python mentor: getting daily fortune...");
        return fortuneService.getFortune();
    }
}
