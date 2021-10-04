import java.util.*;
public class sumRowCol {
  public static void print(int[][]arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.print(arr[i][j]+" ");	
			}
			System.out.println();
		}
	}
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int m =sc.nextInt();
    int row[]=new int[m];
    int col[]=new int[n];
    System.out.println("The orignal matrix is ");
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        int k= sc.nextInt();
        System.out.print(k+" ");
        row[i]+=k;
        col[j]+=k;
      }
      System.out.println();
    }
    System.out.print("THe sum of all the rows is : ");
    for(int i:row) System.out.print(i+" ");
    System.out.println();
    System.out.print("THe sum of all the columns is : ");
    for(int i:col) System.out.print(i+" ");
    System.out.println();

    sc.close();
  }
}
