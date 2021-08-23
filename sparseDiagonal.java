import java.util.*;
public class sparseDiagonal {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int arr[]= new int[n];
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr.length;j++){
        if(i==j){
          System.out.print(arr[i]+" ");
        }else{
          System.out.print(0+" ");
        }
      }
      System.out.println();
    }
    sc.close();
  }
  
}