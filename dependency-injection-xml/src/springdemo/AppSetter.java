package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springdemo.coach.Coach;

public class AppSetter {
    public static void main(String[] args) {

//        load config file (.xml)
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("setterContext.xml");

//        get bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

//        get set value from getter
        System.out.println("Set Fortune: " + theCoach.getDailyFortune());

//        close context (will be logged if set)
        context.close();
    }
}
