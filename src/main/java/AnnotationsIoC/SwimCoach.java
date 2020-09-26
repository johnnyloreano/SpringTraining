package AnnotationsIoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach{

    @Autowired
    @Qualifier("randomFortuneService")
    FortuneService fortuneService;


    @Override
    public String getDailyWorkout(){
        return "Go do some crawls!";
    }


    @Override
    public String getDailyFortune(){
        return this.fortuneService.getFortune();
    }
}
