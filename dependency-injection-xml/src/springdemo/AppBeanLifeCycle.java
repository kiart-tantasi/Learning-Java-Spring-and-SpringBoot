package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springdemo.coach.BaseballCoach;
import springdemo.coach.Coach;

public class AppBeanLifeCycle {
    public static void main(String[] args) {

        // load config file (xml)
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("beanLifeCycleContext.xml");

        // get bean
        Coach baseballCoach = context.getBean("coach", Coach.class);

        // run a method
        System.out.println(baseballCoach.getDailyFortune());

        // close context
        context.close();
    }
}

//    initiating bean...
//    Random Fortune: Money !
//    destroying bean...

