package Task3;

import by.academy.junit.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)

public class CalculatorSubTest {
    int x, y, expResult;

    public CalculatorSubTest(int x, int y, int result) {
        this.x = x;
        this.y = y;
        this.expResult = result;
    }

    @Parameterized.Parameters
    public static List<Integer[]> numbers() {
        return Arrays.asList(new Integer[][]{
                {16, 2, 7}
                , {4, 9, 3}
                , {5, 8, 6}
        });
    }


    @Test
    public void subTest() {
        assertEquals(expResult, Calculator.getSubtraction(x, y), 0.1);
    }

}
