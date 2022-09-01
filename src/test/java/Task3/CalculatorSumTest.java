package Task3;
import by.academy.junit.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)

public class CalculatorSumTest {
    int x, y, expResult;

    public CalculatorSumTest(int x, int y, int result) {
        this.x = x;
        this.y = y;
        this.expResult = result;
    }

    @Parameterized.Parameters
    public static List<Integer[]> numbers() {
        return Arrays.asList(new Integer[][]{
                {14, 3, 5}
                , {4, 11, 2}
                , {6, 17, 9}
        });
    }


    @Test
    public void sumTest() {
        assertEquals(expResult, Calculator.getSum(x, y), 0.1);

    }

}

