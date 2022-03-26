package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppLiteralValues {
    public static void main(String[] args) {

//        load config file (.xml)
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("literalValuesContext.xml");

//       construct coach with values from spring ** ! don't use new Class()
        LiteralValuesCoach theCoach = context.getBean("myCoach", LiteralValuesCoach.class);

//        get values the set from Spring config file
        System.out.println(theCoach.getName());
        System.out.println(theCoach.getEmail());

//        close context (will be logged if set)
        context.close();
    }
}
