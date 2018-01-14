import java.util.*;
import java.lang.*;

public class ProjEuler5{
	long sum=1;
	ArrayList<Integer> test = new ArrayList<Integer>();
	ArrayList<Integer> yo = new ArrayList<Integer>();
	Map<Integer, Integer> mapA = new HashMap<Integer, Integer>();
	Map<Integer,Integer> mapB = new HashMap<Integer,Integer>();

	//Constructor (input list of integers)
	ProjEuler5(int ... args){
		ArrayList<Integer> test = new ArrayList<Integer>(args.length);
		for (int x: args){
			test.add(x);
		}
		this.test = test;

	}

	//method1 (uses lower two methods to find the LCM of the list of integers and saves it as a HashMap)
	public void method1(){
		for(int i=0; i<test.size() ; i++){
			yo.clear();
			primearray(test.get(i));
			factoriser(test.get(i));
			for (int j=0; j<yo.size(); j++){
				if (mapA.get(yo.get(j)) != null){
					if (mapB.get(yo.get(j)) != null && mapB.get(yo.get(j)) < mapA.get(yo.get(j))){
						mapB.replace(yo.get(j),mapA.get(yo.get(j)));
					}

					else if (mapB.get(yo.get(j)) == null){
						mapB.put(yo.get(j),mapA.get(yo.get(j)));
					}
				}
			}
			mapA.clear();
		}
	}

	//generates an array of prime numbers

	public void primearray(int random){
		yo.add(2);
		int z=0;
		for (int i=2; i<=random; i++){
			for (int j=0; j<yo.size(); j++){
				if (i%yo.get(j)==0){
					z=1;
				}
			}
			if (z==0){
				yo.add(i);
			}
			z=0;
		}
	}
	// factorises the number and stores it in a HashMap
	public void factoriser(int random){
		for(int i=0; i<yo.size(); i++){
			if(random%yo.get(i)==0){
				random=random/yo.get(i);
				if (mapA.get(yo.get(i)) == null){
						mapA.put(yo.get(i),1);
					}
					else{
					mapA.put(yo.get(i),mapA.get(yo.get(i))+1);
					}
				i-=1;
			}
		}
	}
	// parses through the hashMap to calculate LCM from given prime factors (Keys) and their indices (values)
	public void boy(){
		for(int i=0; i<yo.size(); i++ ){
			if (mapB.get(yo.get(i)) != null){
			sum *= Math.pow(yo.get(i),mapB.get(yo.get(i)));
			System.out.println(yo.get(i));
			System.out.println(mapB.get(yo.get(i)));

			System.out.println(sum);
			}
		}
		System.out.println(sum);

	}

	public static void main(String[] args){
		ProjEuler5 object = new ProjEuler5(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20); // List of numbers to find LCM
		object.method1(); // creates HashMap of LCM
		System.out.println(object.mapB); 
		object.boy(); // parses through HashMap to output LCM	
	}
}
	

