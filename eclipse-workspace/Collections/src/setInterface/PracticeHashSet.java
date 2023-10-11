package setInterface;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class PracticeHashSet {

	public static void main(String[] args) {
		
		

		HashSet hs1= new HashSet();
		
		hs1.add(100);
		hs1.add(1);
		hs1.add(1);hs1.add(1);hs1.add(1);hs1.add(1);hs1.add(1);						 //1.duplicate =false
		hs1.add("Nidhi");hs1.add("Nidhi");hs1.add("Nidhi");  					//	6.heterogenous =true                        
		hs1.add(100);
		hs1.add(null);															//2.null(once) = true  
		hs1.add(null);hs1.add(null);hs1.add(null); 
		// Collections.sort(hs1);	
	      System.out.println(hs1);                        
	      
	      HashSet hs2 = new HashSet();
	      hs2.add("a");
	      hs2.add("N");
	      hs2.add("j");
	      hs2.add("NIDHI");
	      hs2.add("Nidhi");    
	      //ts2.add(null);                                                         
	      System.out.println(hs2);
	 //  													  //3.Sort = false; 
	      System.out.println(hs2);   							                         //4.dynamic=true; 5.indexed =false 
		
		


	}

}
