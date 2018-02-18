import java.util.*;
import java.lang.*;

public class ProjEuler11{
	static int sum=0;
	public static void convertoArrays(){
		//Converts input to array 
		Scanner scan = new Scanner(System.in).useDelimiter("\n");
		ArrayList<String []> yo = new ArrayList<String []>();
		int i=0;
		while (i<=19){
			String scano = scan.next();
			String[] parts = scano.split(" ");
			yo.add(parts);
			i+=1;
		}
	
		//function starts here
		int maxprod=0;
		int product=0;
		int product2=0;
		int product3=0;
		int product4=0;
		for(int k=-19;k<=19;k++){
			for (int j=0; j<=19; j++){

				// diagonals in one direction
				if (j+k-3>=0 && j-3>=0 && j<=19 && j+k<=19){
					//converts string characters of the array into integers and finds the product
					product=Integer.parseInt(yo.get(j+k-3)[j-3])*Integer.parseInt(yo.get(j+k-2)[j-2])*Integer.parseInt(yo.get(j+k-1)[j-1])*Integer.parseInt(yo.get(j+k)[j]);
						if (product>maxprod){
							maxprod=product;
						}
				}

				//diagonals in the opposite direction (just need to worry about bounds and direction)
				if(j-3>=0 && j+k+3<=19 && j+k>=0){  
					product2=Integer.parseInt(yo.get(j-3)[j+k+3])*Integer.parseInt(yo.get(j-2)[j+k+2])*Integer.parseInt(yo.get(j-1)[j+k+1])*Integer.parseInt(yo.get(j)[j+k]);
					if (product2>maxprod){
							maxprod=product2;
					}
				}
				//horizontal 
				if(j+3<=19 && k>=0){
					product3=Integer.parseInt(yo.get(k)[j])*Integer.parseInt(yo.get(k)[j+1])*Integer.parseInt(yo.get(k)[j+2])*Integer.parseInt(yo.get(k)[j+3]);
					if (product3>maxprod){
							maxprod=product3;
					}
				}

				//vertical
				if(j+3<=19 && k>=0){
					product4=Integer.parseInt(yo.get(j)[k])*Integer.parseInt(yo.get(j+1)[k])*Integer.parseInt(yo.get(j+2)[k])*Integer.parseInt(yo.get(j+3)[k]);
					if (product4>maxprod){
							maxprod=product4;
					}
				}

				continue;


			}
		}
	System.out.println(maxprod); //answer
	}
	

	public static void main(String[] args){
	
		convertoArrays();


	}
		
}