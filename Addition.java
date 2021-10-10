import java.util.*;
public class Addition {
  static Scanner sc = new Scanner(System.in)  ;
  public static void print(int[][]arr){
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[0].length;j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    int n= sc.nextInt();
    int[][] arr= new int[n][n];
    System.out.println("Enter the number for matrix one");
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        arr[i][j]=sc.nextInt();
      }
    }
    print(arr);
    int[][] arr2= new int[n][n];
    System.out.println("Enter the number for matrix one");
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        arr2[i][j]=sc.nextInt();
      }
    }
    print(arr2);
    System.out.println("The elements of the added array are:");
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        System.out.print((arr[i][j]+arr2[i][j])+" ");
      }
      System.out.println();
    }
  }
}
