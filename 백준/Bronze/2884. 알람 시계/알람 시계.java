import java.util.*;
class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();
		long m = sc.nextLong();
		
		if (m<45&&h==0) {
			h = 24-1;
		    m = m + 60 - 45;
		    System.out.println(h+" "+m);
			
		}
	
		else if (m>=45){
			m = m - 45;
		   	System.out.println(h+" "+m);
		}
		else {
			h = h -1;
			m = m + 60 - 45;
			System.out.println(h+" "+m);
		}

		sc.close();
	}
}