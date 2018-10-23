package cucumberTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit {
	
	@Test
	
	public void testsetup () {
		String str = "I am Done with Junit set up";
		assertEquals ("I am Done with Junit set up",str);
	}
	

}
