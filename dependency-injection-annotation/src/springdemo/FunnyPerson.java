package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FunnyPerson implements Person {

    private final ActivityService activityService;

    @Autowired
    public FunnyPerson(@Qualifier("jokeService") ActivityService activityService) {
        this.activityService = activityService;
    }

    @Override
    public void doSomething() {
        System.out.println("Funny Person: " + activityService.getActivity());
    }
}
