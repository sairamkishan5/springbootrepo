package javademo;

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		// TODO Auto-generated method stub
		for(int k=0;k<n;k++) {
String s=sc.nextLine();
String s1=sc.nextLine();
StringBuilder sb=new StringBuilder(s);

String s2="";
int n1=0;
int n2=0;
for(char i:s1.toCharArray()) {
	 n1=s.indexOf(i,n1);
	 n2=s.indexOf(Character.toLowerCase(i),n2);
	// System.out.print(n1);
	 if(n1==-1 && n2!=-1 ) {
			sb.replace(n2,n2+1,Character.toString(Character.toUpperCase(s.charAt(n2))));
			//continue;
		}
//	 n2=s1.indexOf(Character.toUpperCase(i),n1);
//	 if(n2!=-1) {
//			s2+=s.charAt(n2);
//		}
	
}
for(char c:sb.toString().toCharArray()) {
	if(Character.isUpperCase(c)) {
		s2+=c;
	}
}
System.out.println(s2);
System.out.println(s1);
if(s2.equals(s1)) {
	System.out.println("YES");
}
else {
System.out.println("NO");
	}
}
		}

}
