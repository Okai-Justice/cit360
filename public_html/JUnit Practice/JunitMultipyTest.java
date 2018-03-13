import static org.junit.Assert.*;

import org.junit.Test;


public class JunitMutiplyTest {

	@Test
	public void MultiplyTest() {
		SimpleJunit test = new SimpleJunit();

		int result = test.muliply(12, 18);

		assertEquals(216, result);

	}
}