package Beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springdemo.Coach;

public class BeanScopeDemoApp {
    public static void main(String[] args) {

        // Load the SPRING configuration file for BEANS
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beansScope-applicationContext.xml");

        //Create a class based in the BEAN inside the Config file
        Coach anotherCoach = context.getBean("baseballCoach", Coach.class);
        System.out.println(anotherCoach.getDailyWorkout());

        context.close();
    }

}
