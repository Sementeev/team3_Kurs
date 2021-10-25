package calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Calcul.Calculate;

public class parseTest {
	Calculate calc;
	@Before
    public void setUp() throws Exception {
		calc = new Calculate("10", "6", "10000", true, true, "Rubli"); //создаем экземпл€р класса дл€ работы с ним
    }

    @Test
    public void test() {
        assertTrue(calc.ParseAllData("10", "0.023f", "010.2")); // проверим парс€тс€ ли данные (тру если парс прошел)
        assertTrue(!calc.ParseAllData("фыв", "0.023f", "010.2")); // проверим парс€тс€ ли данные (не тру, тк мы передаем букавки)
    }

}