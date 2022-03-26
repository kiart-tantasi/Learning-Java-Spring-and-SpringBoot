package springdemo;

import org.springframework.beans.factory.DisposableBean;

public class BaseballCoach implements Coach, DisposableBean {

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

    public void thisIsInitialMethod() {
        System.out.println("initiating bean...");
    }

    @Override
    public void destroy() {
        System.out.println("destroying bean...");
    }




}
