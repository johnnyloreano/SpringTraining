package AnnotationsIoC;



import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    private FortuneService fortuneService;


    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }

    @Autowired
    @Qualifier("happyFortuneService")
    public void insertTheFortune(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
}
