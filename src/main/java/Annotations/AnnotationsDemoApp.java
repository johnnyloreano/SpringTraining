package Annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springdemo.Coach;

public class AnnotationsDemoApp {
    public static void main(String[] args) {

        // Load the SPRING configuration file for BEANS
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotations-applicationContext.xml");

        //Create a class based in the BEAN inside the Config file
        TennisCoach tennisCoach = context.getBean("TennisCoachComponent", TennisCoach.class);
        SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);

        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(swimCoach.getDailyWorkout());

        context.close();
    }

}
