package Task3;
import org.junit.runner.JUnitCore;

public class CalculatorTestListener {
    public static void main(String[] args) {
        JUnitCore core = new JUnitCore();
        core.addListener(new MyListener());
        core.run(CalculatorMultiTest.class, CalculatorSubTest.class
                , CalculatorSumTest.class);
    }
}

