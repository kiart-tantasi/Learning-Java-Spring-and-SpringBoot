package springdemo.service;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        String[] fortuneArray = {
                "Random Fortune: Money !",
                "Random Fortune: Health !",
                "Random Fortune: Happiness !"
        };
        Random randomer = new Random();
        int randomIdx = randomer.nextInt(fortuneArray.length);
        return fortuneArray[randomIdx];
    }
}
