package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppBeanLifeCycle {
    public static void main(String[] args) {

        // load config file (xml)
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycleContext.xml");

        // get bean
        BaseballCoach baseballCoach = context.getBean("coach", BaseballCoach.class);

        // run a method
        System.out.println(baseballCoach.getDailyFortune());

        // close context
        context.close();
    }
}
