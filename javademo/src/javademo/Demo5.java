package javademo;

import java.util.HashMap;

public class Demo5 {
public static void main(String[]args) {
	String s="Kisshan";
	String s1="SHN";
	HashMap<Character,Integer>map=new HashMap<Character,Integer>();
	HashMap<Character,Integer>map1=new HashMap<Character,Integer>();
	for(char i:s.toUpperCase().toCharArray()) {
		if(map.containsKey(i)) {
			map.put(i, map.get(i)+1);
		}
		else {
			map.put(i, 1);
		}
	}
	for(char i:s1.toCharArray()) {
		if(map1.containsKey(i)) {
			map1.put(i, map1.get(i)+1);
		}
		else {
			map1.put(i, 1);
		}
	}
	String msg=Demo5.compare_strings(s, s1, map, map1);
	System.out.println(msg);
	
//	System.out.println(map);
//	System.out.println(map1);
}
public static String compare_strings(String s2,String s3,HashMap<Character,Integer> m1,HashMap<Character,Integer> m2) {
	int n=0;
	
	for(char i:s3.toCharArray()) {
		n=s2.indexOf(i,n);
		if(n==-1 || m1.get(i)!=m2.get(i)) {
			return "NO";
		}
	}
	return "YES";
}
}
