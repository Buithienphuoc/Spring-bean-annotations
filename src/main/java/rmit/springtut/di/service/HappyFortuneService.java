package rmit.springtut.di.service;

import org.springframework.stereotype.Component;

@Component("happyFortuneService")
public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Happy coding, 2day is your lucky day!! .... ";
    }
}
