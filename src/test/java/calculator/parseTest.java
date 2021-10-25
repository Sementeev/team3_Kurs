package calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Calcul.Calculate;

public class parseTest {
	Calculate calc;
	@Before
    public void setUp() throws Exception {
		calc = new Calculate("10", "6", "10000", true, true, "Rubli"); //������� ��������� ������ ��� ������ � ���
    }

    @Test
    public void test() {
        assertTrue(calc.ParseAllData("10", "0.023f", "010.2")); // �������� �������� �� ������ (��� ���� ���� ������)
        assertTrue(!calc.ParseAllData("���", "0.023f", "010.2")); // �������� �������� �� ������ (�� ���, �� �� �������� �������)
    }

}