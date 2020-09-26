package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    public static void main(String[] args) {

        // Load the SPRING configuration file for BEANS
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Create a class based in the BEAN inside the Config file
        Coach theCoach = context.getBean("trackCoach", Coach.class);
        Coach anotherCoach = context.getBean("baseballCoach", Coach.class);
        Coach justACoach = context.getBean("volleyballCoach", Coach.class);

        //Call the method, as usual
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(anotherCoach.getDailyWorkout());
        System.out.println(justACoach.getDailyWorkout());

        context.close();
    }

}
