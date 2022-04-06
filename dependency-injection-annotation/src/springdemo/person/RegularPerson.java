package springdemo.person;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import springdemo.service.ActivityService;

import javax.annotation.PostConstruct;

@Component
@Scope("prototype") // comment this to use singleton scope
public class RegularPerson implements Person, DisposableBean {

    // 1. field qualifier
    @Autowired
    @Qualifier("randomActivityService")
    private ActivityService activityService;

    // 2. constructor qualifier
//    @Autowired
//    public RegularPerson(@Qualifier("randomActivityService") ActivityService activityService) {
//        this.activityService = activityService;
//    }

    @Override
    public void doSomething() {
        System.out.println("Regular Person: " + activityService.getActivity());
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Regular Person: This happened after the bean was initiated. (post-construct)");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Regular Person: This happened before the bean is destroyed. (pre-destroy)");
    }
}
