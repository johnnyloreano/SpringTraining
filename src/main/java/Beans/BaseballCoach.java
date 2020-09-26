package Beans;



import org.springframework.beans.factory.DisposableBean;
import springdemo.Coach;
import springdemo.FortuneService;

public class BaseballCoach implements Coach, DisposableBean {

    private FortuneService fortuneService;

    public  BaseballCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }

    public void init(){
        System.out.println("Initializing a Baseball Coach...");
    }

    public void destroy(){
        System.out.println("Destroying a Baseball Coach...");
    }
}
