
public class test572015 {
	private String s;
	int x;
	public test572015(String s){
		this.s=s;
	}
	public void variableSetter(String s){
		this.s=s;
	}
	public void print(){
		System.out.println(s);
	}
	public static void main(String args[]){
		test572015 object = new test572015("Hello");
		object.print();
		object.variableSetter("Goodbye");
		object.print();
		System.out.println();
		
	}
}
