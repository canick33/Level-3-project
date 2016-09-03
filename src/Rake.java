
public class Rake {
	int vicious;
	boolean isPointy;
	
	public Rake(int v, boolean ip)
	{
		isPointy =ip;
		vicious = v;
		
	}

	public int getVicious() {
		return vicious;
	}

	public void setVicious(int vicious) {
		this.vicious = vicious;
	}

	public boolean isPointy() {
		return isPointy;
	}

	public void setPointy(boolean isPointy) {
		this.isPointy = isPointy;
	}
	
	

}
