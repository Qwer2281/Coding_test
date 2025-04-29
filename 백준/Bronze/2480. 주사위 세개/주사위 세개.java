import java.util.*;
class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		
		long max=a;
		if(b>max)max=b;
		if(c>max)max=c;
		
		if (a==b && a==c)// a,b,c
			System.out.println(10000+a*1000);
		
		else if (a==b || a==c)// a,b / a,c
			System.out.println(1000+a*100);
		
		else if (b==c)// b,c
			System.out.println(1000+b*100);
		
		else {
			System.out.println(max*100);
		}
	}
}