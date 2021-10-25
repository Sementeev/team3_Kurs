/*package calculator;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import Calcul.Calculate;


//ďđîâĺđ˙ĺě ďđŕâčëüíî ëč ń÷čňŕĺň ęëŕńń Ęŕëüęóëĺéň
public class CalculateTests {

	Calculate calc;
	@Before
    public void setUp() throws Exception {
		calc = new Calculate("10", "6", "10000", true, true,"Rubli"); //ńîçäŕĺě ýęçĺěďë˙đ ęëŕńńŕ äë˙ đŕáîňű ń íčě
    }

    @Test
    public void test() {
    	//System.out.println(calc.getFinalValue());
        assertTrue(calc.getFinalValue() == 10472.06f); //ďđîâĺđ˙ĺě ÷ňî çíŕ÷ĺíčĺ ńîîňâĺńňâóĺň îćčäŕĺěîěó
    }

}
