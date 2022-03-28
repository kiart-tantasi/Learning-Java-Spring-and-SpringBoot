package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        get bean from spring container (initiating beans)
        Person funnyPerson = context.getBean("funnyPerson", Person.class);
        Person regularPerson = context.getBean("regularPerson", Person.class);
        Person secondRegularPerson = context.getBean("regularPerson", Person.class);

//        use Person class method
        funnyPerson.doSomething();
        regularPerson.doSomething();

//        test if two regular people are using the same instance.
        System.out.println("First and Second Person are of the Same Instance: " + (regularPerson == secondRegularPerson));

//        close or destroy beans
        context.close();
    }
}
