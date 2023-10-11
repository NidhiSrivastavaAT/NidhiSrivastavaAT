package listInterface;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class PracticeLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		LinkedList l1= new LinkedList();
		
		 l1.add(1);
	      l1.add("Nidhi");l1.add("Nidhi");l1.add("Nidhi");l1.add("Nidhi");     //1.duplicate =true
	      l1.add(null);l1.add(null);l1.add(null);l1.add(null);l1.add(null);  //2.null = true
	                                                                                   //3.hetero = true
	      LinkedList l2 = new LinkedList();
	      l2.add(278);
	      l2.add(109);
	      l2.add(12);
	      l2.add(156);
	      l2.add(198);
	      System.out.println(l2);
	      Collections.sort(l2);
	      System.out.println(l2);                                                    //4.Sort = true; dynamic=true; indexed =true
	      
	      
	      
	      
	      
	}

}
