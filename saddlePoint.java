import java.util.*;
public class saddlePoint{
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int n=sc.nextInt();
    int m= sc.nextInt();

    int row[]= new int[n];
    Arrays.fill(row, Integer.MAX_VALUE);
    int col[]= new int[m];
    Arrays.fill(col, Integer.MAX_VALUE);
    Integer saddlePoint=null;
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        int k=sc.nextInt();
        if(k<=row[i] && k>=col[j]){
          saddlePoint=k;
        }
        row[i]=Math.min(row[i],k);
        col[j]=Math.min(col[j],k);
      }
    }
    sc.close();
    if(saddlePoint==null) {System.out.println("No such saddel point exists"); return;}
    System.out.println(saddlePoint);
  }
}