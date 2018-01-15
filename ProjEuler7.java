import java.util.*;
import java.lang.*;

public class ProjEuler7{
	static int size=0;

	public static boolean contain(int[] array,int yo){
		for (int i: array){
			if (i==yo){
				return true;
			}
		}
		return false;
	}


	public static void primearray(int random){
		ArrayList<Integer> result = new ArrayList<Integer>();
		int[] arr1 = {1,13,17,29,37,41,49,53};
		int[] arr2 = {7,19,31,43};
		int[] arr3 = {11,23,47,59};

		boolean[] myarr = new boolean[random];
		size = random;
		for (int i=1; i<Math.sqrt(size); i++){
			for (int j=1; j<Math.sqrt(size); j++){
				int k = 4*i*i + j*j;
				if(k<=size && (k%60==1 || k%60==13 || k%60==17 || k%60==29 ||k%60==37 ||k%60==41 ||k%60==49 ||k%60==53)){
					myarr[k] = !myarr[k];	
				}

				k = 3*i*i + j*j; 
				if (k<=size && (k%60==7 || k%60==19 || k%60==31 || k%60==43)){
					myarr[k] = !myarr[k];
				}

				if (i>j){
					k = 3*i*i - j*j;
					if(k<=size && (k%60==11 || k%60==23 || k%60==47 || k%60==59)){
						myarr[k] = !myarr[k];
					}
				}
			}
		}
		myarr[2] = true;
		myarr[3] = true;
		myarr[5] = true;
		int j=1;

		
		for (int i=5; i<=Math.sqrt(size); i++){
				for (j=1; j*i*i<size; j++){
					myarr[j*i*i] = false;
					j+=1;
					System.out.println(j);
				}
		}
		
		
		for(int i=0; i<myarr.length; i++){
			if (myarr[i]){
				result.add(i);
			}
		}
		System.out.println(result.get(10000)); 

	}


	

	public static void main(String[] args){
		primearray(105000);

	}
		
}
	

