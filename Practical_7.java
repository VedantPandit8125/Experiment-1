/*Implement a generic program using any collection class to count the number of elements in a
collection that have a specific property such as even numbers, odd number, prime number and
palindromes.*/
import java.util.*;
public class Practical_7 <T>{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers:");
		int n=sc.nextInt();
	    ArrayList<Integer> a=new ArrayList<Integer>();
	    ArrayList<Integer> b=new ArrayList<Integer>();
	    ArrayList<Integer> c=new ArrayList<Integer>();
	    ArrayList<Integer> d=new ArrayList<Integer>();
	    ArrayList<Integer> e=new ArrayList<Integer>();
	    ArrayList<Integer> f=new ArrayList<Integer>();
	    for(int i=1;i<=n;i++) {
	    	if(i%2==0) {
	    		a.add(i);
	    	}
	    	else {
	    		b.add(i);
	    	}
	    }
	    System.out.println("Even numbers are:"+a);
	    System.out.println("Total Even numbers are:"+a.size());
	    System.out.println("Odd numbers are:"+b);
	    System.out.println("Total Odd numbers are:"+b.size());
	    System.out.println("Enter numbers:");
	    int k=sc.nextInt();
	    for(int i=1;i<=k;i++) {      
	    	  int reversedNum = 0, remainder;
	    	    int originalNum = k;
	    	    while (k!= 0) {
	    	      remainder = k % 10;
	    	      reversedNum = reversedNum * 10 + remainder;
	    	      k/= 10;
	    	    }
	    	    if (originalNum == reversedNum) {
	    	      c.add(i);
	    	    }
	    	    else {
	    	      d.add(i);
	    	    }
	    	  }
	    System.out.println("Palindrome numbers are:"+c);
	    System.out.println("Total Palindrome numbers are:"+c.size());
	    System.out.println("Non palindrome numbers are:"+d);
	    System.out.println("Total non palindrome numbers are:"+d.size());
	    System.out.println("Enter numbers:");
	    int m=sc.nextInt();
	    for(int i=1;i<=m;i++) {   
	    	  if(isPrime(i))
	    	  {
	    	    e.add(i); 
	    	  }
	    	  else   
	    	  {
	    	    f.add(i); 
	    	  }
	    }
	    System.out.println("Prime numbers are:"+e);
	    System.out.println("Total Prime numbers are:"+e.size());
	    System.out.println("Non prime numbers are:"+f);
	    System.out.println("Total non prime numbers are:"+f.size());
	
	}
	private static boolean isPrime(int i) {
		if (i <= 1) return false; 
        if (i == 2) return true;  
        if (i % 2 == 0) return false; 
        for (int n = 3; n * n <= i; n += 2) {
            if (i % n == 0) {
                return false; 
            }
        }

        return true; 
	}

}