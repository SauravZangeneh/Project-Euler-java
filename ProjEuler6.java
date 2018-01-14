import java.util.*;
import java.lang.*;

public class ProjEuler6{
	public static void method1(int j){ // j is the range of natural numbers
		int z=0;
		for(int i=1; i<=j; i++){
			for (int k=1; k<=j; k++){
				if(i==k){ // skips if i==j (square)
					continue;
				}
				else{
					z+=i*k;
				}
			}
		}
		System.out.println(z);
	}

	public static void main(String[] args){
		method1(100);
	}
		
}
	

