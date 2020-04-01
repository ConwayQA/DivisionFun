package Tester;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import Mainer.Division;

public class MyTests {
	static Division testing = new Division();
	
	@Test
	public void divisionTest1() {
		assertEquals("The answer is: 5",testing.divide(10,2,false));
	}
	
	@Test
	public void divisionTest2() {
		assertEquals("Dont divide my 0 you mad man!",testing.divide(10,0,false));
	}
	
	@Test
	public void divisionTest3() {
		assertEquals("Please dont use null integers!",testing.divide(10,0,true));
	}
	
	@Test
	public void divisionTest4() {
		assertEquals("Bigger number first please!",testing.divide(2,10,false));
	}

}
