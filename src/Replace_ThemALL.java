import java.util.Scanner;

public class Replace_ThemALL {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
        long  count=0;
        long  ans=0;
        if(n==0) {
        	n=5;
        	System.out.println(n);
        }else {
		while(n!=0) {
			long rem=n%10;
			if(rem==0) {
				rem=5;
			}
			ans=(long) (ans+rem*Math.pow(10, count));
			count++;
			n/=10;
		}
		System.out.println(ans);
		}
		
	}

}
