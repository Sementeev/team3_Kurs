package calculator;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ModeratorTest {

Info information;
@Before
	public void setUp() throws Exception {
	information = new Info("Ìîäåðàòîð - Ñåìåíòååâ Àíòîí", 500, 110);
	}

@Test
public void test() {
	assertTrue(information.getTitle().equals("Ìîäåðàòîð - Ñåìåíòååâ Àíòîí"));
}

}
