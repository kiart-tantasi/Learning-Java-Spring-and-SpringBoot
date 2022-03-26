package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RegularPerson implements Person {

    @Autowired
    @Qualifier("randomActivityService")
    private ActivityService activityService;

    @Override
    public void doSomething() {
        System.out.println("Regular Person: " + activityService.getActivity());
    }
}
