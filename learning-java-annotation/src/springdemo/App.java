package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person funnyPerson = context.getBean("funnyPerson", Person.class);

        Person regularPerson = context.getBean("regularPerson", Person.class);

        funnyPerson.doSomething();

        regularPerson.doSomething();
    }
}
