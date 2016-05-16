
public class rithvik {
	public double height;
	private double weight;
	public void calculateVolume()
	{
		System.out.println(weight*453.592*height);
	}
	public rithvik(double h, double w)
	{
		height=h;
		weight=w;
	}
	public int panama(int x, int y, int z){
		int temp = belgium(x,y);
		return belgium(temp, z);
	}
	
	public int belgium(int a, int b){
		int temo = a%b;
		if(temo==0){
			return b;
		}else{
			return belgium(b, temo);
		}
	}
	
	public void print(){
		int x = panama(72,120,168);
	}
}
