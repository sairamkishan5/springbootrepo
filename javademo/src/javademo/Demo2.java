package javademo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo2 {
	public static void main(String[] args) {
		
		String s="kishan";
		System.out.println(s.contains("ih"));
		//List<Integer>li=List.of(1,3,2,5,4,76);
		Integer[]a= {1,2,4,3,6,5};
		
		List<Integer>li1=Arrays.asList(a);
		li1.forEach(System.out::println);
		
		//li=[1,2,4,3,6,5,8,7];
		Collections.sort(li1);
		li1.forEach(System.out::println);
		List<Integer>li=new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(5);
		li.add(3);
		li.forEach(System.out::println);
		//li=[1,2,4,3,6,5,8,7];
		Collections.sort(li);
		li.forEach(System.out::println);
	}
}
