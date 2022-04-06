package sourcecodeconfig.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import sourcecodeconfig.service.ActivityService;

@Component
public class RegularPerson implements Person {

    @Value("${dummy.regularperson}")
    private String dataFromApplicationProperties;

    private ActivityService activityService;

    @Autowired
    public RegularPerson(ActivityService activityService) {
        this.activityService = activityService;
    }

    @Override
    public void doSomething() {
        System.out.println(dataFromApplicationProperties + activityService.getActivity());
    }

}
