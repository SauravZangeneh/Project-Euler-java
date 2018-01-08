import java.util.*;

public class ProjEuler1{ 
	int j; //initializes space in memory to store an integer
	public int addingvalues(){  
		for (int i=1; i<1000; i++)  // incrementally adds all integers divisible by 3 or 5
			if (i%5==0 || i%3==0)
					j+=i;
		return j;
		}
	
	public static void main(String[] args){
		ProjEuler1 obj = new ProjEuler1(); // creates instance with field j
		System.out.println(obj.addingvalues()); // prints out your result
	}
}