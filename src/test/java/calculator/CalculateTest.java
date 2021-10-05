package calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculateTest {

	calculate calc;
	@Before
    public void setUp() throws Exception {
		calc = new calculate("10", "6", "10000", true, true, "Рубли"); // создаем экземпляр класса calculate который высчитает итоговое значение вклада
    }

    @Test
    public void test() {
        assertTrue(calc.getFinalValue() == 10497.067f); // убеждаемся что результат верен
    }

}
