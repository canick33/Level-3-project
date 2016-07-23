
public class Minion {
	String color;
	int eyes;
	String name;
	String master;
	public Minion(String n,int e,String c,String m)
	{
		name =n;
		eyes =e;
		color=c;
		master =m;
	}
	public String getName()
	{
		return name;
	}
	public int getEyes()
	{
		return eyes;
	}
	public String getColor()
	{
		return color;
	}
	public void setName(String n)
	{
		name =n;
	}
	public void setEyes(int e)
	{
		eyes =e;
	}
	public void setColor(String c)
	{
		color =c;
	}
	public void setMaster(String c)
	{
		master =c;
	}
	public String getMaster()
	{
		return master;
	}
	
}
