import java.util.*;
import java.lang.*;
import java.math.BigInteger;
import java.io.*;
class GFG
 {	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    BigInteger[] arr = new BigInteger[20];
	    arr[0] = new BigInteger("2");
	    arr[1] = new BigInteger("2");
	    arr[2] = new BigInteger("4");
	    arr[3] = new BigInteger("8");
	    arr[4] = new BigInteger("16");
	    arr[5] = new BigInteger("512");
	    for(int i = 6; i < 20; i++ ){
	        if(i % 2 == 0){
	            arr[i] = arr[i-2].multiply(arr[i-2]);
	        }else{
	            arr[i] = arr[i-2].pow(3);
	        }
	    }
	    int q = sc.nextInt();
	    while(q-- > 0){
	        int n = sc.nextInt();
	        System.out.println(arr[n-1]);
        }
	 }
}
