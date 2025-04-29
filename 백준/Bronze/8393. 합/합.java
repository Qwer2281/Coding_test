import java.util.*;
class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long i,a=0;
		
		for(i=1;i<=n;i++) {
			a=a+i;
		}
		System.out.println(a);
	}
}