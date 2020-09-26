package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    public static void main(String[] args) {

        // Load the SPRING configuration file for BEANS
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beansScope-applicationContext.xml");

        //Create a class based in the BEAN inside the Config file
//        Coach theCoach = context.getBean("trackCoach", Coach.class);
        Coach anotherCoach = context.getBean("baseballCoach", Coach.class);
//        Coach justACoach = context.getBean("volleyballCoach", Coach.class);
//        PogoballCoach theBestCoach = context.getBean("pogoballCoach", PogoballCoach.class);
        //Call the method, as usual
//        System.out.println(theCoach.getDailyWorkout());
//        System.out.println(anotherCoach.getDailyWorkout());
//        System.out.println(anotherCoach.getDailyFortune());
//        System.out.println(justACoach.getDailyWorkout());
//        System.out.println(theBestCoach.getEmailAddress());
//        System.out.println(theBestCoach.getTeam());
//        System.out.println(theBestCoach.getDailyFortune());

        context.close();
    }

}
