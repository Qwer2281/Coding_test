import java.util.*;
class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();
		long m = sc.nextLong();
		long t = sc.nextLong();
		
		long c=m+t;
		m=m+t;
		if (c>=60) {
			m=(c%60);
			h=h + (c/60);
			if (h>=24) 
				h=(h-24);
		}
		System.out.println(h+" "+m);
					
		sc.close();
	}
}