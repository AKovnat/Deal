package Task3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class MathMethodTest1 {
    private double x, expResult;


    public MathMethodTest1(double x, double expResult) {
        this.x = x;
        this.expResult = expResult;
    }


    @Parameterized.Parameters
    public static List<Object[]> numbers() {
        return Arrays.asList(new Double[][]{
                {2.0, 4.0}
                , {-8.0, 12.0}
                , {14.0, 114.0}
        });
    }

    @Test
    public void absMethod() {
        assertEquals(expResult, Math.sqrt(x), 0.1);
    }
}

