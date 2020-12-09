package javademo;

import java.util.Scanner;

public class DEmo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
String []a=sc.nextLine().split(":");
//int[]a1=new int[3];
System.out.println(a[2].substring(2));
System.out.println(a[2].substring(2)=="PM");
if(a[2].substring(2).equals("PM")) {
	if(Integer.parseInt(a[0])==12) {
		a[0]="12";
		a[1]=a[1];
		a[2]=a[2].substring(0, 2);
	}else {
	a[0]=Integer.toString(Integer.parseInt(a[0])+12);
	System.out.println(a[0]);
	a[1]=a[1];	
	a[2]=a[2].substring(0, 2);}
	
}
else {
	if(Integer.parseInt(a[0])==12) {
		a[0]="00";
		a[1]=a[1];
		a[2]=a[2].substring(0, 2);
	}
	else {
		a[0]=a[0];
		a[1]=a[1];
		a[2]=a[2].substring(0, 2);
	}
}
System.out.println(a[0]+":"+a[1]+":"+a[2]);
	}

}
