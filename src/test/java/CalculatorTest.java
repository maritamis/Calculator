import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calc;
    @BeforeEach
    public void setUp(){
        calc = new Calculator();
    }


    @Test
    public void shouldDivideTwoInts(){
        assertEquals(1, calc.divide(5, 1));
        assertEquals(10, calc.divide(40, 4));
        assertEquals(4, calc.divide(12, 3));
    }

    @Test
    public void shouldDivideTwoNegInts(){
        assertEquals(2, calc.divide(-10, -5));
        assertEquals(5, calc.divide(-50,-10));
        assertEquals(20, calc.divide(-100, -5));
    }
    @Test
    public void shouldBeZero(){
        assertEquals(0, calc.divide(0, 1));
        assertEquals(0, calc.divide(0, 10));
        assertEquals(0, calc.divide(0,100));
    }

    @Test
    public void shouldThrowArithmeticException(){
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calc.divide(1, 0);
        });
        Assertions.assertThrows(ArithmeticException.class, () ->{
            calc.divide(4, 0);
        });
    }
}
