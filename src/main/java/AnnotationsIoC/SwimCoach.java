package Annotations;

import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "Go do some crawls!";
    }

}
