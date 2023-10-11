package assignmentMKT;

public class AssignmentArray4 {
	
	
	
public  static void main(String [] args)
	
	{
	
	String  city[] = new String [4];
    city[0]="Paris";
    city[1]="Berlin";
    city[2]="Zurich";
    city[3]="Budapest";
    
    boolean  ifvisited[] = new boolean [4];
    ifvisited[0]=true;
    ifvisited[1]=true;
    ifvisited[2]=true;
    ifvisited[3]=false;
    
    
    String  message[] = new String [4];
    
    
    for (int i=0;i<4;i++)
    	
    {
    if (ifvisited[i] == true)
    {
    	 message[i] ="You have been to  ";
    	 System.out.println(message[i]+city[i]);
    }
    
    else 
    	
    {
    	
    	 message[i] ="Will visit soon  ";
    	 System.out.print(message[i]+city [i]);
    	
    }
    
}}

}
