import java.util.*;
public class binarySearch{
	// recursive code for binary search
	public static boolean binarySearchR(int[]arr,int i,int j,int n){
		if(i<=j){
			int m=(i+j)/2;
			if(arr[m]==n) return true;
			else if(arr[m]>n) return binarySearchR(arr,i,m,n);
			else return binarySearchR(arr,m+1,j,n);
		}return false;
	}
	// iterative code for binary search
	public static boolean binarySearchi(int[]arr,int n){
		int i=0,j=arr.length-1;
		while(i<=j){
			int m=(i+j)/2;
			if(n==arr[m]){
				return true;
			}else if(n>arr[m]){
				i=m+1;	
			}else{
				j=m;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.print("The Array is : ");
		for(int i=0;i<arr.length;i++) {arr[i]=i+1;System.out.print((i+1)+" ");}
		System.out.println();
		int n=sc.nextInt();
		if(binarySearchi(arr,n)){
			System.out.println("The number "+n+" is present in the array");
		}else{
			System.out.println("The number "+n+" is not present in the array");
		}
	}
}