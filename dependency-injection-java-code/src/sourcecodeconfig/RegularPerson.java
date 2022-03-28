package sourcecodeconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RegularPerson implements Person {

    @Value("${dummy.regularperson}")
    private String regularPersonTag;

    private ActivityService activityService;

    public RegularPerson(ActivityService activityService) {
        this.activityService = activityService;
    }

    @Override
    public void doSomething() {
        System.out.println(regularPersonTag + activityService.getActivity());
    }

}
