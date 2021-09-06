import java.util.*;
public class bubbleSort{
	public static void bubbleIt(int arr[]){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
		System.out.println("The sorted array is : ");
		for(int val:arr) System.out.print(val+" ");
	}
	public static void main(String[] args) {
		int arr[] ={1,4,2,6,7,9,2,5,6};
		System.out.println("the array is :");
		for(int i:arr) System.out.print(i+" ");
		System.out.println();
		bubbleIt(arr);
	}
}