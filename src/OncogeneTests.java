import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class OncogeneTests {
	
	public OncogeneTests()
	{
	

	}
	public static void main(String[] args) {
		OncogeneTests o = new OncogeneTests();
		o.testStringManipulator();
	}
	
	

	

	@Test

	public void testStringManipulator(){

	StringManipulator sm = new StringManipulator();

	assertEquals("sdrawkcab", sm.reverseWord("backwards"));

	assertEquals("CAPITAL", sm.capitalizeWord("capital"));

	assertEquals("lower case", sm.uncapitalizeWord("LoWer CAsE"));

	}
	@Test

	public void testShapeCalculator(){

	ShapeCalculator sc = new ShapeCalculator();

	assertEquals(16, sc.calculateSquarePerimeter(4));

	assertEquals(12, sc.calculateRectanglePerimeter(2,4));

	assertEquals(Math.PI, sc.calculateCircleArea(1),.001);

	assertEquals(2*Math.PI, sc.calculateCirclePerimeter(1),.001);
	}
}



