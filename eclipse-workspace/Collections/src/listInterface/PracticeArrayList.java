package listInterface;
import java.util.ArrayList;
import java.util.Collections;
public class PracticeArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a0= new ArrayList();//hetero
		a0.add(null);
		 a0.add(6);
		 a0.add("NIDHI");
		 a0.add("S");
		 a0.add(null);
		 a0.add(null);
		 a0.add(null);   //Null value
		 a0.add("NIDHI");//dupliocate 
		 a0.add("NIDHI");//dupliocate 
		 a0.add("R");
		 System.out.println(a0);
		 //Collections.sort(a0);  //cant be sorted
		 ArrayList<String> a1 = new ArrayList<String>();//homo
		 a1.add("Nupur");
		 a1.add("Kushwaha");
		 a1.add("NIDHI");
		 a1.add("SRIVASTAVA");
		 System.out.println(a1);
		 Collections.sort(a1);
		 System.out.println(a1);
		 ArrayList<Integer> a2 = new ArrayList<Integer>();//homo
		 a2.add(3);
		 a2.add(5);
		 a2.add(90);
		 a2.add(45);
		 System.out.println(a2);
		 Collections.sort(a2);
		 System.out.println(a2);
		
	}

}
