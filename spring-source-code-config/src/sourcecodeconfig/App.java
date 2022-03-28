package sourcecodeconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        // use AnnotationConfigApplicationContext instead of ClassPathXmlApplicationContext
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class); // put package name to auto scan the whole package

        // get bean
        Person regularPerson = context.getBean("regularPerson", Person.class);

        // test method
        regularPerson.doSomething();

        // close context
        context.close();
    }
}
