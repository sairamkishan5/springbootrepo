package javademo;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.Scanner;

import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		int[] arr1= {1,4,5,6,7,5,4,3,5};
	
		String s="   Kishan   ";
		String s1=s.trim().substring(2, 5);
		StringBuilder sb=new StringBuilder(s1);
		
		System.out.println(sb.reverse());
		System.out.println(s1);
		String s3=sb.toString();
		arr1=Arrays.copyOfRange(arr1, 2, 6);
		System.out.println(arr1.length);
		for(int i:arr1) {
			System.out.println(i);
		}
//		Scanner sc=new Scanner(System.in);
//		String s=sc.nextLine();
//		//String[]s1=s.split(",");
//		int[] s1=Arrays.stream(s.split(",")).mapToInt(Integer::parseInt).distinct().toArray();
//		//char[]arr=s.toCharArray();
//		System.out.println(s1.length);
		long n=Arrays.stream(arr1).count();
		System.out.println(n);
//		Arrays.sort(s1);
//		List<int[]>li=Arrays.asList(s1);
//		li=li.stream().distinct().collect(Collectors.toList());
//		s1=li.toArray();
//		for(int i:s1) {
//			System.out.println(i);
//		}
//		//li.forEach(System.out::println);
//		//int n=Arrays.binarySearch(s1, 4);
//	System.out.println(Arrays.binarySearch(s1, 4));
	}
}
