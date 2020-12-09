package javademo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Dictionarydemo {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int n=Integer.parseInt(sc.nextLine());
	for(int i=0;i<n;i++) {
		//Pattern p=Pattern.compile("");
		String s=sc.nextLine();
		String s1=sc.nextLine();
		int index=0;
		for(char c:s1.toCharArray()) {
			index=s.indexOf(c, index);
			if(index==-1) {
				System.out.println("NO");
			}
		}
		System.out.println("YES");
	}
	
}
}
