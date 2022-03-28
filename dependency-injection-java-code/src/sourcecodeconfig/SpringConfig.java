package sourcecodeconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("sourcecodeconfig") // beans-auto-scan
@PropertySource("classpath:dummy.properties")
public class SpringConfig {

    @Bean
    public ActivityService jokeActivityService() {
        return new JokeActivityService();
    }

    @Bean
    public Person regularPerson() {
        return new RegularPerson(jokeActivityService());
    }
}