 package collectionsession;

import java.util.ArrayList;

public class ArrayListconcept {

	public static  void main(String[] args) {
		ArrayList ar=new ArrayList();
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		System.out.println(ar.size());
		ar.add(400);//3
		ar.add(500);//4
		System.out.println(ar.size());
		
		ar.add("Ajay");//5
		ar.add("Aaditya");//6
		ar.add("12.55");//7
		ar.add('A');//8
		ar.add(600);//9
		System.out.println(ar.size());
		ar.remove(9);
		System.out.println(ar.get(4));
		//System.out.println(ar.get(9));
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		 ArrayList<Integer> ar1=new ArrayList<Integer>();
		 ar1.add(100);
		 ArrayList<String> ar2=new ArrayList<String>();
		 ar2.add("Ajay");
		 //ar2.add(100);
		  
		
		
		
	}

}
