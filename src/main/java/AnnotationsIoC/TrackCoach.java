package AnnotationsIoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {


    FortuneService fortuneService;

    @Autowired

    TrackCoach(@Qualifier("happyFortuneService") FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout(){

        return "Run a hard 5k";

    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }
}
