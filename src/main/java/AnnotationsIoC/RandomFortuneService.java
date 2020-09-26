package springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
    String[] fortunes = {"Today is your lucky day!", "Read some book today!", "Take a rest today!"};

    Random random;
    public RandomFortuneService(){
        random = new Random();
        random.setSeed(123456789);
    }

    @Override
    public String getFortune(){
        return  fortunes[this.random.nextInt(3)];
    }
}
