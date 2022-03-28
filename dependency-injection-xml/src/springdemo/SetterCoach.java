package springdemo;

public class SetterCoach implements Coach {

    private FortuneService fortuneService;

    public SetterCoach() {
        System.out.println("constructing...");
    }

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
