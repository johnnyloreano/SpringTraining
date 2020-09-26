package AnnotationsIoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    FortuneService fortuneService;

//    TennisCoach(FortuneService fortuneService){
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout(){
        return "Train yourself alot!";
    }

    @Override
    public String getDailyFortune(){
        return this.fortuneService.getFortune();
    }

    @Autowired
    @Qualifier("happyFortuneService")
    public void setFortuneService(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
}
