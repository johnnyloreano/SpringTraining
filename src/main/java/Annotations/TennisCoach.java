package Annotations;

import org.springframework.stereotype.Component;

@Component("TennisCoachComponent")
public class TennisCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "Train yourself alot!";
    }

}
