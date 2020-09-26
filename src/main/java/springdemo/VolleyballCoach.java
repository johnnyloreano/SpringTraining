package springdemo;

public class VolleyballCoach implements  Coach{

    FortuneService fortuneService;

    VolleyballCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Do some jumps around your house!";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune() ;
    }
}
