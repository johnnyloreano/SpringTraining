package AnnotationsIoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springdemo.Coach;

public class AnnotationIOCHelloApp {
    public static void main(String[] args) {

        // Load the SPRING configuration file for BEANS
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationsIOC-applicationContext.xml");

        //Create a class based in the BEAN inside the Config file
        TrackCoach anotherCoach = context.getBean("trackCoach", TrackCoach.class);
        TennisCoach tennisCoach = context.getBean("tennisCoach", TennisCoach.class);
        BaseballCoach baseballCoach = context.getBean("baseballCoach", BaseballCoach.class);
//        Call the method, as usual
        System.out.println(anotherCoach.getDailyWorkout());
        System.out.println(tennisCoach.getDailyFortune());
        System.out.println(baseballCoach.getDailyFortune());

        context.close();
    }

}
