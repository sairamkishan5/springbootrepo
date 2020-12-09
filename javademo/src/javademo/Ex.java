package javademo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {3,4,5,3,5};
List<Integer>li=Arrays.stream(a).boxed().distinct().collect(Collectors.toList());
for(int i=0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
		int n=Math.abs(a[i]-a[j]);
		if(!li.contains(n)) {
			li.add(n);
		}
	}
}
System.out.println(li.size());
System.out.println(li.toString());

	}

}
