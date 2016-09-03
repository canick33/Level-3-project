
public class ShapeCalculator {
	
	public int calculateSquarePerimeter(int x)
	{
		return x*4;
	}
	public int calculateRectanglePerimeter(int x,int y)
	{
		return x*2+y*2;
	}
	public double calculateCircleArea(int x)
	{
		return (Double) ((Math.PI)*(x*x));
	}
	public double calculateCirclePerimeter(int x)
	{
		return (Double) ((x*2)*(Math.PI));
	}

}
