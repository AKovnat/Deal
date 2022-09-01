package Task3;
import by.academy.junit.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)


public class CalculatorMultiTest {
    int x, y, expResult;

    public CalculatorMultiTest(int x, int y, int result) {
        this.x = x;
        this.y = y;
        this.expResult = result;
    }

    @Parameterized.Parameters
    public static List<Integer[]> numbers() {
        return Arrays.asList(new Integer[][]{
                {8, 3, 6}
                , {9, 11, 2}
                , {15, 4, 7}
        });
    }


    @Test
    public void multiTest() {
        assertEquals(expResult, Calculator.getMultiple(x, y), 0.1);
    }
}

