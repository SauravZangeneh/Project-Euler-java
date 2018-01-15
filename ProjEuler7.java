import java.util.*;
import java.lang.*;

public class ProjEuler7{
	static long finale=0;

	public static void method(String number){  // Converts string to character array
		ArrayList<Character []> arrays = new ArrayList<Character []>(); 
		char[] ch = number.toCharArray();
		int k=0;
		int m=0;
		for(int i=0; i<ch.length; i++){
			if (ch[i]== '0'){
				if (k==0){
					Character[] list1= new Character[i-11];
					for(int j=0; j<i-12; j++){
						list1[j] = Character.valueOf(ch[j]);
					}
					arrays.add(list1);
					k=i;
				}

				else {
					if (i-k-12<=0){ // gets rid of all sequences with product 0
						k=i;
						continue;

					}

					else{
					Character[] list2 = new Character[i-k-1];
 					for (int j=k+1; j<i; j++){
						list2[j-k-1] = Character.valueOf(ch[j]);

					}
					arrays.add(list2);
					m+=1;
					k=i;
					}
				}

				continue;
			}
		}
		for(int i=0; i<arrays.size() ; i++){
			if(arrays.get(i).length>=13){
				maxprod(arrays.get(i));
			}
		}

	}

	public static void maxprod(Character[] yo){  // yields max product of array by iterating through it
		long z=0;
		for (int j=0; j<yo.length-12; j++){
			z = Character.getNumericValue(yo[j]);
			if(j+12<yo.length){
				for (int m=j+1; m<=j+12; m++){
					z*=Character.getNumericValue(yo[m]);
				}
				if (z>finale){
					finale=z;
				}
			}
		}
	}
	
	public static void main(String[] args){
		method("7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450");
		System.out.println(finale);
	}
		
}
	

