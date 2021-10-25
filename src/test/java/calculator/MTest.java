package calculator;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import Calcul.Info;

//тест формы Инфо
public class MTest {

	Info information;
	@Before
	public void setUp() throws Exception {
		information = new Info("Name_asdf", 500, 110);
	}
	
	@Test
	public void test() {
		assertTrue(information.getTitle().equals("Name_asdf"));
	}

}
