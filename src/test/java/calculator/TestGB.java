package calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestGB {

	TestClass testClass;
	   @Before
	    public void setUp() throws Exception {
		   testClass = new TestClass("test", 0, 0); // // � ������ �������� ����� ������� ��������� ��� ����������� ����� JFrameBuilder � �������� title  
	    }

	    @Test
	    public void test() {
	        assertTrue("test".equals(testClass.getTitle())); // �������� �� ��� �������� ��������� (����������� ����� �������� �����) 
	    }
}

class TestClass extends GFrameBuilder{

	public TestClass(String _title, int width, int height) {
		super(_title, width, height);
		// TODO Auto-generated constructor stub
	}



}



// ����� � 13 ������ � �������� ���� ����� �����. � �� ������ ��� ���������� ������ ��� tezt � � 18 ������ � �������� ���� �� �� ������� test,
// ���� ����, �� ��� ����� ������� �������� � � ����������