import java.util.*;

class Find{

	public static void main (String[] args){

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter array size : ");
		int n = sc.nextInt();

		System.out.println("Enter target : ");
		int target = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter array elements : ");
		for (int i=0; i<n; i++)
			arr[i] = sc.nextInt();

		int ans = find(arr, n, target);
		System.out.println("Element found at : "+ans);
	}

	static int find(int[] arr, int n, int target){

		int start = 0;
		int end = arr.length-1;

		while(start<=end){

			int mid = start + (end-start)/2;

			if(arr[mid] == target)
				return mid;

			if (arr[mid] < target)
				start = mid+1;

			else
				end = mid-1;
		}
		return start;	
	}
}

