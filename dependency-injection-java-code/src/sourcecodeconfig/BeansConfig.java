package sourcecodeconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import sourcecodeconfig.person.Person;
import sourcecodeconfig.person.RegularPerson;
import sourcecodeconfig.service.ActivityService;
import sourcecodeconfig.service.JokeActivityService;

@Configuration
//@ComponentScan("sourcecodeconfig") // beans-auto-scan
@PropertySource("classpath:application.properties")
public class BeansConfig {

    @Bean
    public ActivityService jokeActivityService() {
        return new JokeActivityService();
    }

    @Bean
    public Person regularPerson() {
        return new RegularPerson(jokeActivityService());
    }
}