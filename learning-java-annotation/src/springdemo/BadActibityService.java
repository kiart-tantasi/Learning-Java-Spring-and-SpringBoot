package springdemo;

import org.springframework.stereotype.Component;

@Component("badService")
public class BadActibityService implements ActivityService {
    @Override
    public String getActivity() {
        return "I AM DOING BAD THING";
    }
}
