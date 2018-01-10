import java.util.*;
import java.math.BigInteger; 


public class ProjEuler2{
 public static void mymeth(){
	BigInteger var1 = new BigInteger("1"); // initializing fibonacci
	BigInteger var2 = new BigInteger("1");
	BigInteger var3 = new BigInteger("0");
	BigInteger two = new BigInteger("2");
	BigInteger maxsize = new BigInteger("4000000");
	BigInteger store = new BigInteger("0");

	for(int j=1; j<100;j++){
	 var3 = var2.add(var1); // creating fibonacci series incrementally
	 var1 = var2;
	 var2 = var3;
	 BigInteger modo = var3.mod(two);
	 if (var3.compareTo(maxsize) == 0 || var3.compareTo(maxsize) == 1) // tells you when the series reaches max (4million)
		break;
	 if (modo.intValue()==0){ // Checks if even and adds
		store=store.add(var3);
	 }
    }
 System.out.println(store); // Output
 }
 public static void main(String[] args){
  mymeth();
 }
}
