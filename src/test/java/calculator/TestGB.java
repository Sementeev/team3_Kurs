package calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestGB {

	TestClass testClass;
	   @Before
	    public void setUp() throws Exception {
		   testClass = new TestClass("test", 0, 0); // // € создал тестовый класс котоыйр расшир€ет мой абстреатрйы класс JFrameBuilder и задаетс€ title  
	    }

	    @Test
	    public void test() {
	        assertTrue("test".equals(testClass.getTitle())); // провер€ю то что название совпадает (абстракстый класс сработал верно) 
	    }
}

class TestClass extends GFrameBuilder{

	public TestClass(String _title, int width, int height) {
		super(_title, width, height);
		// TODO Auto-generated constructor stub
	}



}



// когда в 13 строке € создавал свйо класс абстр. и он должен был автомастом задать им€ tezt и в 18 строке € провер€ю стал ли он реально test,
// если стал, то мой класс реально сработал и € крассавчик