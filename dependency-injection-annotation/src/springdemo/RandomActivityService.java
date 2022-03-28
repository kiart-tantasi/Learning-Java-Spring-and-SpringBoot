package springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomActivityService implements ActivityService {

    @Value("${something.activityOne}")
    private String activityOne;

    @Value("${something.activityTwo}")
    private String activityTwo;

    @Value("${something.activityThree}")
    private String activityThree;

    @Override
    public String getActivity() {
        String[] strArray = {
                activityOne,
                activityTwo,
                activityThree
        };
        Random random = new Random();
        int randomIndex = random.nextInt(strArray.length);
        return strArray[randomIndex];
    }

}
