package queueInterface;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PracticePriorityQueue {

	public static void main(String[] args) {
		

		PriorityQueue pq= new PriorityQueue();
		
		 pq.add(100);
		 pq.add(1);
		 //pq.add("Nidhi");
		 //pq.add("Nidhi");pq.add("Nidhi");pq.add("Nidhi");                           //1.duplicate =true
	      pq.add(100);
	      //pq.add(null);pq.add(null);pq.add(null);pq.add(null);                       
	      System.out.println(pq)   ;  
	     // Collections.sort(pq);		
	      
	      //3.hetero = true
	      PriorityQueue pq2 = new PriorityQueue();
	      pq2.add("a");
	      pq2.add("N");
	      pq2.add("j");
	      pq2.add("NIDHI");
	      pq2.add("Nidhi");      pq2.add("Nidhi");    pq2.add("Nidhi");    pq2.add("Nidhi");  
	     // pq2.add(null);                                                         //2.null = false
	      System.out.println(pq2);
	    												  //3.Sort = false; 
	      System.out.println(pq2);                                                // 4.dynamic=true; 5.indexed =false 6.heterogenous =false
	      
	      

	}

}
