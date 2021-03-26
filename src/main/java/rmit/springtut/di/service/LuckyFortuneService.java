package rmit.springtut.di.service;

import org.springframework.stereotype.Component;

@Component
public class LuckyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "You will be lucky today";
    }
}
