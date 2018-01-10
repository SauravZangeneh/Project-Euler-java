import java.util.*;
import java.lang.*;

public class ProjEuler3{

	static int store;
	public static ArrayList<Integer> prime = new ArrayList<>(); // all primes upto the square root are stored here
	
	public int primetest(int primenumber){  // method tests if number is prime
		for (int j=2; j < prime.size()+2; j++){
			if ((primenumber % prime.get(j-2)) == 0){
 	 			return 0;
 	 		}
 		}
 		prime.add(prime.size(), primenumber);
 		return 1;

	}

	public void mymeth(long number){  // calls primetest method and tests divisibility
		long z=number;
		for(int k=2; k<=(int) Math.sqrt(z);k++){
			if (primetest(k) == 1 && number%k == 0){
				store=k;
				z=number/k;
			}
    	}
 		System.out.println(store); 
 	}

	public static void main(String[] args){
		ProjEuler3 obj = new ProjEuler3();
		obj.prime.add(0,2);
		obj.mymeth(600851475143l);
	}
}
