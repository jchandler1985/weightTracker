package weightTracker;

import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;

import java.util.HashSet;
import java.util.Set;

public final class weightTrackerSpeechletRequestStreamHandler extends SpeechletRequestStreamHandler {
    private static final Set<String> supportedApplicationIds = new HashSet<String>();
    static {
        /*
         * This Id can be found on https://developer.amazon.com/edw/home.html#/ "Edit" the relevant
         * Alexa Skill and put the relevant Application Ids in this Set.
         */
        supportedApplicationIds.add("amzn1.ask.skill.46b8cc00-5fc1-4bfe-b20f-942f0394a518");
    }

    public weightTrackerSpeechletRequestStreamHandler() {
        super(new weightTrackerSpeechlet(), supportedApplicationIds);
    }
}
