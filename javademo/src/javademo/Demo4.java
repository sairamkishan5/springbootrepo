package javademo;

import java.util.HashMap;
import java.util.Scanner;

public class Demo4 {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int n=Integer.parseInt(sc.nextLine());
	for(int i=0;i<2*n;i++) {
		String[] a=sc.nextLine().split(" ");
		int n1=Integer.parseInt(a[1]);
		char[]a1=sc.nextLine().toCharArray();
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		String s1="";
		for(char j:a1) {
			if(map.containsKey(j)) {
				map.put(j, map.get(j)+1);
				if(map.get(j)<n1+1) {
					s1+=i;
				}
			}
			else {
				map.put(j, 1);
				s1+=i;
			}
		}
		System.out.println(s1);
	}
	
	
	
	
	
	
	String s=sc.nextLine();
	char[]a=s.toCharArray();
	String s1="";
//	HashMap<Character,Integer> map=new HashMap<Character,Integer>();
//	for(char i:a) {
//		if(map.containsKey(i)) {
//			map.put(i, map.get(i)+1);
//			if(map.get(i)<3) {
//				s1+=i;
//			}
//		}
//		else {
//			map.put(i, 1);
//			s1+=i;
//		}
//	}
//	System.out.println(s1);
	
}
}
