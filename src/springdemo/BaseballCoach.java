package springdemo;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public void getWorkout() {
        System.out.println("Hit Homerun !");
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


}
