package calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Calcul.Calculate;

public class parseTest {
	Calculate calc;
	@Before
    public void setUp() throws Exception {
		calc = new Calculate("10", "6", "10000", true, true, "Rubli"); //ńîçäŕĺě ýęçĺěďë˙đ ęëŕńńŕ äë˙ đŕáîňű ń íčě
    }

    @Test
    public void test() {
        assertTrue(calc.ParseAllData("10", "0.023f", "010.2")); // ďđîâĺđčě ďŕđń˙ňń˙ ëč äŕííűĺ (ňđó ĺńëč ďŕđń ďđîřĺë)
        assertTrue(!calc.ParseAllData("ôűâ", "0.023f", "010.2")); // ďđîâĺđčě ďŕđń˙ňń˙ ëč äŕííűĺ (íĺ ňđó, ňę ěű ďĺđĺäŕĺě áóęŕâęč)
    }

}

