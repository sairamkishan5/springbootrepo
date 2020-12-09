package javademo;


import java.io.*;
import java.util.*;
class myCode
{
    public static void main (String[] args) throws java.lang.Exception
    {
        
        Scanner sc = new Scanner(System.in);
        int  n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
        //System.out.println("Hello");
        String s=sc.nextLine().toUpperCase();
	String s1=sc.nextLine();
	HashMap<Character,Integer>map=new HashMap<Character,Integer>();
	HashMap<Character,Integer>map1=new HashMap<Character,Integer>();
	for(char j:s.toUpperCase().toCharArray()) {
		if(map.containsKey(j)) {
			map.put(j, map.get(j)+1);
		}
		else {
			map.put(j, 1);
		}
	}
	for(char k:s1.toCharArray()) {
		if(map1.containsKey(k)) {
			map1.put(k, map1.get(k)+1);
		}
		else {
			map1.put(k, 1);
		}
	}
	String msg=myCode.compare_strings(s, s1, map, map1);
	System.out.println(msg);
    }}
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