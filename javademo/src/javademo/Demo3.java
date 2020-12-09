package javademo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++) {
			String[]arr=sc.nextLine().split(" ");
			String s1=arr[1];
			String s3="";
			String s2=s1.substring(Integer.parseInt(arr[0])-1);
			char c= (char) s2.chars().min().getAsInt();
			List<Character>li=s2.chars().mapToObj(j->(char)j).collect(Collectors.toList());
			while(li.get(0)!=c) {
				//char c1=li.remove(0);
				li.add(li.remove(0));}
			for(char k:li) {
				s3+=k;
			}
			System.out.println(s1.substring(0,Integer.parseInt(arr[0])-1)+s3);
			//li.forEach(System.out::print);
			
		}
		String s="kishan";
		char c= (char) s.chars().max().getAsInt();
		List<Character>li=s.chars().mapToObj(j->(char)j).collect(Collectors.toList());
		//List<Character>li1=li;
		while(li.get(0)!=c) {
		//char c1=li.remove(0);
		li.add(li.remove(0));}
			
		li.forEach(System.out::print);
		//li1.forEach(System.out::print);
		//li1.remove(0);
		
		//System.out.println(a[0]);
	//StringBuilder sb=new StringBuilder(s);
	
	}

}
