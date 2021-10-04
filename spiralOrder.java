import java.util.*;
public class spiralOrder {
  public static void print(int[][]arr){
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[0].length;j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
  }
  public static int[][] printSpiral(int A){
   int counter=1;
   int m=A;
   int n=A;
   int arr[][]=new int[n][m];
   int rs=0,re=arr.length-1; 
   int cs=0,ce=arr[0].length-1;

   while(counter-1<(m*n)){
    for(int i=cs;i<=ce&& counter-1<(m*n);i++){
     arr[rs][i]=counter;
      counter++;
    }
    rs++;
    for(int i=rs;i<=re&& counter-1<(m*n);i++){
      arr[i][ce]=counter;
      counter++;
    }
    ce--;
    for(int i=ce;i>=cs&& counter-1<(m*n);i--){
      arr[re][i]=counter;
      counter++;
    }
    re--;
    for(int i=re;i>=rs&& counter-1<(m*n);i--){
      arr[i][cs]=counter;
      counter++;
    }
    cs++;
   }
   return arr;
  }
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in); 
    int m= sc.nextInt();
    int n= sc.nextInt();
    int arr[][]=new int[m][n];
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        arr[i][j]= sc.nextInt();
      }
    }
    System.out.println("The new Matrix is equal to ");
    print(printSpiral(4));
    sc.close() ;
  }
  
}
