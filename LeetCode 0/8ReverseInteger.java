import java.util.*;

class Reverse{

	public static void main (String[] args){

		Scanner sc = new Scanner (System.in);
		System.out.println ("Enter num : ");
		int n = sc.nextInt();

		int ans = reverse(n);
		System.out.println("Reverse : "+ans);

	}
		static int reverse(int n){
			int reverse = 0;
	
			while(n!=0){

				int rem = n % 10;

				reverse = reverse + rem;
				reverse = reverse * 10;

				n = n/10;
			}

			reverse = reverse / 10;

			if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE){

				return 0;
			}

			if (reverse < 0){

				return (-1*reverse);
			}

			return reverse;

		}
	
}
