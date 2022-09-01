package Task3;

import org.junit.runner.Description;
import org.junit.runner.notification.RunListener;


public class MyListener extends RunListener {
    @Override
    public void testFinished(Description description) {
        System.out.println("Implementation Finished : " + description.getMethodName());
    }

}

