package opensource;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class jmeterTest {
	private jmeter jmeter = new jmeter();
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetName() {
		jmeter.setName("ABC");
		assertEquals("ABC",jmeter.getName());
	}

	@Test
	public void testGetFriend() {
		jmeter.setFriend("ABC");
		assertEquals("ABC",jmeter.getFriend());
	}

}
