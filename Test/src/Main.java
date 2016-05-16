import java.util.ArrayList;


public class Main {
	Main(){
		Dog fido = new Underdog();
		fido.act();
	}
	public static void main(String args[])
	{
		ArrayList list1 = new ArrayList();
		list1.add("Tom");
		list1.add("Sue");
		list1.add("Bob");
		list1.add("Ann");
		ArrayList list2 = list1;
		list1.set(1,"Joe");
		list2.set(2, "Meg");
		System.out.println(list1);
		System.out.println(list2);
		
		String s1 = "CAR";
		String s2 = "car";
		int x = s1.compareTo(s2);
		System.out.println(x);
		
		Main main = new Main();
	}

}
