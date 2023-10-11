package setInterface;

import java.util.*;
//import java.util.TreeSet;

public class PracticeTreeSet {

	public static void main(String[] args) {
		

		TreeSet ts= new TreeSet();
		ts.add(100);
		ts.add(1);
		ts.add(1);ts.add(1);ts.add(1);ts.add(1);ts.add(1);						 //1.duplicate =false
		//ts.add("Nidhi");ts.add("Nidhi");ts.add("Nidhi");  					//	6.heterogenous =false                        
		ts.add(100);
		//ts.add(null);															//2.null = false  
		//ts.add(null);ts.add(null);ts.add(null); 
		//Collections.sort(ts);		
	      System.out.println(ts);                    
	      TreeSet ts2 = new TreeSet();
	      ts2.add("a");
	      ts2.add("N");
	      ts2.add("j");
	      ts2.add("NIDHI");
	      ts2.add("Nidhi");    
	      //ts2.add(null);                                                         
	      System.out.println(ts2);
	   												  //3.Sort = false; 
	     System.out.println(ts2);   							                         //4.dynamic=true; 5.indexed =false 
		
		

	}

}
