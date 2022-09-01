package Task3;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class MathMethodTest2 {
    private double x, expResult;


    public MathMethodTest2(double x, double expResult) {
        this.x = x;
        this.expResult = expResult;
    }


    @Parameterized.Parameters
    public static List<Object[]> numbers() {
        return Arrays.asList(new Double[][]{
                {6.0, 1.0}
                , {15.0, 4.0}
                , {7.0, 19.0}
        });
    }

    @Test
    public void sqrtMethod() {
        assertEquals(expResult, Math.cbrt(x), 0.1);
    }
}


