package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springdemo.person.Person;

public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        get bean from spring container (initiating beans)
        Person funnyPerson = context.getBean("funnyPerson", Person.class);
        Person regularPerson = context.getBean("regularPerson", Person.class);
        Person secondRegularPerson = context.getBean("regularPerson", Person.class);

        System.out.println("\n");

//        use Person class method
        funnyPerson.doSomething();
        regularPerson.doSomething();
        secondRegularPerson.doSomething();

        System.out.println("\n");

//        test if two regular people are using the same instance.
        System.out.println("First and Second Person are of the Same Instance: " + (regularPerson == secondRegularPerson));

        System.out.println("\n");

//        close or destroy beans
        context.close();
    }
}
