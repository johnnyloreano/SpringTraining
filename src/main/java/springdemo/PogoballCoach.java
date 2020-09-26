package springdemo;

public class PogoballCoach implements Coach{
    FortuneService fortuneService;
    private String emailAddress;
    private String team;

    PogoballCoach(){

    }
    @Override
    public String getDailyWorkout() {
        return "Go kick some balls!";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
    public void setTeam(String team){
        this.team = team;
    }

    public String getEmailAddress(){
        return this.emailAddress;
    }
    public String getTeam(){
        return this.team;
    }

}
