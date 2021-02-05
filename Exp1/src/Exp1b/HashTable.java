package Exp1b;

import java.util.Hashtable;
import java.util.Map; 
public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> hm=new Hashtable<Integer,String>();
		hm.put(1282,"Abitha");
		hm.put(1285,"harshini");
		hm.put(1288,"sruthi");
		hm.put(1289,"yojitha");
		hm.put(1281, "lalitha");
		for(Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		} 

	}

}
