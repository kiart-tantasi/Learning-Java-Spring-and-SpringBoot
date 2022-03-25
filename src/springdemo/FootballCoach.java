package springdemo;

public class FootballCoach implements Coach {

    private FortuneService fortuneService;

    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public void getWorkout() {
        System.out.println("Kick the ball!");
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
