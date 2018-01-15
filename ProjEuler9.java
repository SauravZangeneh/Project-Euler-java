import java.util.*;
import java.lang.*;

public class ProjEuler9{
	
	public static void method1(){
		double z=0;
		int sum=0;
		for(int m=293; m<=500; m++){ // simple algebra to reduce range (given n<=m), min (m) occurs when m=n 
			for (int n=1; n<=m; n++){
				z = Math.sqrt(n*n + m*m);
				if(Math.floor(z) == Math.ceil(z) && z+m+n==1000){
					System.out.println(((int) z)*m*n);
					continue;
				}
			}
		}
	}
	
	public static void main(String[] args){
	method1();
	}
		
}
	

