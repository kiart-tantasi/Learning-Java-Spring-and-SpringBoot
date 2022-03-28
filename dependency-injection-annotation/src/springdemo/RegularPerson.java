package springdemo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope("prototype")
public class RegularPerson implements Person, DisposableBean {

    @Autowired
    @Qualifier("randomActivityService")
    private ActivityService activityService;

    @Override
    public void doSomething() {
        System.out.println("Regular Person: " + activityService.getActivity());
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Regular Person: This happened after the bean was initiated.");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Regular Person: This happened before the bean is destroyed.");
    }
}
