import java.util.*;
import java.lang.*;

public class ProjEuler4{
	public static int store;

	public static int palindrome(int palindromenumber){  // method checks if integer is palindrome
		String palin = String.valueOf(palindromenumber);
		char[] ch = palin.toCharArray();	
		for (int j=0; j < ch.length/2; j++){
			if ( ch[j]!= ch[ch.length - j - 1] ){
 	 			return 0;
 	 		}
 		}
 		return 1;
	}


	public static void method(){  // generates all 3*3 products and checks if palindrome
		for(int i=999; i >=100; i--){
			for (int j=999; j>=100; j--){
				int z=i*j;
				if (palindrome(z)==1 && z>store){
					store=z;
				}
			}
		}

		System.out.println(store);
	}

	public static void main(String[] args){
		method();
	}
}
