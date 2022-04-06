package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springdemo.coach.Coach;

public class App {
    public static void main(String[] args) {

//        load config file (.xml)
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext.xml");

//        get bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

//        use Beans
        theCoach.getWorkout();
        System.out.println(theCoach.getDailyFortune());

//        close context (will be logged if set)
        context.close();
    }
}
