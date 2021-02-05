package Exp1a;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("abitha");
		ar.add("lakshmi");
		ar.add("pendela");
		ar.add("abcdef");
		ar.add("guntur");
		ar.add("vinukonda");
		System.out.println("currently the array list has the following elements: "+ar);
		ar.add(0,"at index 0");
		ar.add(1,"at index 1");
		ar.remove("guntur");
		ar.remove("vinukonda");
		System.out.println("current array list is: "+ar);
		ar.remove(1);
		System.out.println("current array list is: "+ar);
		System.out.println("te elemnts in list are: ");
		for(String s :ar) {
			System.out.println(s);
		}
		System.out.println("after sorting the list is: ");
		Collections.sort(ar);
		System.out.println(ar);


	}
}
