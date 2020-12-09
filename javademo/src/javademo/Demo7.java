package javademo;
import java.util.*;
class Demo7
{
    public static void main (String[] args) throws java.lang.Exception
    {
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
		String s1="";
		char[] a=s.toCharArray();
		for(int j=0;j<a.length-1;j++) {
			if(a[j]!=a[j+1]) {
				s1+=a[j];
			}
		}
		System.out.println(s1+a[a.length-1]);
        }
       // System.out.println("Hello");
    }
}