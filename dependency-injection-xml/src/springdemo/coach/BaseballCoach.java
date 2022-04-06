package springdemo.coach;

import org.springframework.beans.factory.DisposableBean;
import springdemo.service.FortuneService;

public class BaseballCoach implements Coach, DisposableBean {

    private FortuneService fortuneService;

    // 1. constructor injection
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    // 2. setter injection
//    public void setFortuneService(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

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
