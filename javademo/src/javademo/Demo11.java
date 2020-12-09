package javademo;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Demo11 {
public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int[]a=Arrays.stream(s.split(",")).mapToInt(i->Integer.parseInt(i.trim())).toArray();
		int n=Arrays.stream(Arrays.copyOfRange(a, 0,a.length-1)).sum();
		int n1=Arrays.stream(Arrays.copyOfRange(a, 1,a.length)).sum();
		System.out.println(n);
		System.out.println(n1);
	        int index=0;
	        int c=0;
		if(n1==0) {
			index=0;
		}
		if(n==0) {
			index=a.length-1;
		}
		for(int i=0;i<a.length-1;i++) {
			int n2=Arrays.stream(Arrays.copyOfRange(a, 0,i)).sum();
			int n3=Arrays.stream(Arrays.copyOfRange(a, i+1,a.length)).sum();
			if(n2==n3) {
				//System.out.println(i);
	            index=i;
	            c+=1;
			}
		}
	     if(c==0 && n1!=0 && n!=0){
	         index=-1;
	     }   
		
	         System.out.println(index);
	    
	
}
}
