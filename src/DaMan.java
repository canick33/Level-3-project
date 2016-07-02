
public class DaMan {
	boolean isSmelly;
	String superPower;
	int height;
	public DaMan(String s,int h, boolean smell)
	{
		superPower = s;
		height = h;
		isSmelly = smell;
	}
	
	public String toString()
	{
		return (""  + isSmelly+height + superPower);
	}

	public boolean isSmelly() {
		return isSmelly;
	}
	public void setSmelly(boolean isSmelly) {
		this.isSmelly = isSmelly;
	}
	public String getSuperPower() {
		return superPower;
	}
	public void setSuperPower(String superPower) {
		this.superPower = superPower;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}


}
