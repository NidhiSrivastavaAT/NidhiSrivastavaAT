package listInterface;

import java.util.Collections;
import java.util.Vector;

public class PracticeVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //Vector() v1= new Vector();
      Vector vec1 = new Vector();
      vec1.add(1);
      vec1.add("Nidhi");vec1.add("Nidhi");vec1.add("Nidhi");vec1.add("Nidhi");     //1.duplicate =true
      vec1.add(null);vec1.add(null);vec1.add(null);vec1.add(null);vec1.add(null);  //2.null = true
                                                                                   //3.hetero = true
      
      
      Vector vec2 = new Vector();
      vec2.add(278);
      vec2.add(109);
      vec2.add(12);
      vec2.add(156);
      vec2.add(198);
      System.out.println(vec2);
      Collections.sort(vec2);
      System.out.println(vec2);                                                    //4.Sort = true; dynamic=true; indexed =true
      
      
      
      
      
      
      
	}

}
