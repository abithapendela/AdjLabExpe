package Exp1c;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm = new HashMap();
		 hm.put("abitha", new Double(788.56)); 
		 hm.put("pendela", new Double(92.52));
		 hm.put("lakshmi", new Double(5489.00));
		 hm.put("sarojini", new Double(-89.22));
		 hm.put("vinuthna", new Double(9.08));
		 Set set = hm.entrySet();
		 Iterator i = set.iterator();
		 while(i.hasNext()) {
		 Map.Entry me = (Map.Entry)i.next();
		 System.out.print(me.getKey() + ": ");
		 System.out.println(me.getValue());
		 }
		 System.out.println();
		 double balance = ((Double)hm.get("abitha")).doubleValue();
		 hm.put("abitha", new Double(balance + 1000));
		 System.out.println("abitha's new balance: " +
		 hm.get("abitha")); 
	}

}
