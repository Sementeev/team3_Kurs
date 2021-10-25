package calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Calcul.JFrameForm;

public class JFrameFormTest {

	TestClass testClass;
	   @Before
	    public void setUp() throws Exception {
		   testClass = new TestClass("test", 0, 0); // // я создал тестовый класс котоыйр расширяет мой абстреатрйы класс JFrameBuilder и задается title  
	    }

	    @Test
	    public void test() {
	        assertTrue("test".equals(testClass.getTitle())); // проверяю то что название совпадает (абстракстый класс сработал верно) 
	    }
}

class TestClass extends JFrameForm{

	public TestClass(String _title, int width, int height) {
		super(_title, width, height);
		// TODO Auto-generated constructor stub
	}



}
