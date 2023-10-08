import java.util.*;

class TwoSum{

	public static void main (String[] args){

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter array size : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println ("Enter target : ");
		int target = sc.nextInt();
		System.out.println("Enter array elements : ");
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();

		int[] ans = twoSum(arr, n, target);
		for(int i=0; i<ans.length; i++){

			System.out.print(ans[i]+" ");
			System.out.println();
		}
	}

	static int[] twoSum(int[] arr, int n, int target){

		for(int i=0; i<n; i++){
		
			for(int j=1; j<n; j++){

				if(arr[i]+arr[j] == target){

					return new int[]{i, j};
				}
			
			}
		}

		return new int[]{};
	}
}
