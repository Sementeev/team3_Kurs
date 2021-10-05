package calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class parseTest {
	calculate calc;
	@Before
    public void setUp() throws Exception {
		calc = new calculate("10", "6", "10000", true, true, "Рубли"); // создаем экземпляр класса calculate - входные данные не иимеют значения
    }

    @Test
    public void test() {
        assertTrue(calc.ParseAllData("10", "0.023f", "010.2")); // убеждаемся что данные могут быть конвертированны в Float
    }
}
