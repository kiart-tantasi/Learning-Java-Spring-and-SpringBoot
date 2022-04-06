package springdemo.coach;

import springdemo.service.FortuneService;

public class SetterCoach implements Coach {

    private FortuneService fortuneService;

    // 1. constructor injection
//    public SetterCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    // 2. setter injection
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("setting...");
        this.fortuneService = fortuneService;
    }

    @Override
    public void getWorkout() {
        System.out.println("SETTER INJECTION!");
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
