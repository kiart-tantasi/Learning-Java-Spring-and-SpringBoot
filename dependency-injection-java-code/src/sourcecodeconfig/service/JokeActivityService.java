package sourcecodeconfig.service;

import org.springframework.stereotype.Component;

@Component
public class JokeActivityService implements ActivityService {

    @Override
    public String getActivity() {
        return "I AM MAKING A JOKE ! SUPER FUNNY, RIGHT ?";
    }

}
