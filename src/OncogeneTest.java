import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OncogeneTest {
	
	public OncogeneTest()
	{
	

	}
	public static void main(String[] args) {
		OncogeneTest o = new OncogeneTest();
		o.testStringManipulator();
	}
	
	

	

	@Test

	public void testStringManipulator(){

	StringManipulator sm = new StringManipulator();

	assertEquals("sdrawkcab", sm.reverseWord("backwards"));

	assertEquals("CAPITAL", sm.capitalizeWord("capital"));

	assertEquals("lower case", sm.uncapitalizeWord("LoWer CAsE"));

	}
	}

