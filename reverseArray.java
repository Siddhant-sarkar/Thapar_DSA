import java.util.*;
public class reverseArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int[] arr= new int[n];
    for(int i=0;i<n;i++) arr[i]= sc.nextInt();
    for(int i:arr) System.out.print(i+" ");
    System.out.println();
    for(int i=0;i<n/2;i++){
     int t=arr[i];
     arr[i]=arr[arr.length-1-i];
     arr[arr.length-1-i]=t;
    }
    for(int val:arr){
      System.out.print(val+" ");
    }
  }
}
