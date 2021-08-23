import java.util.*;
public class TriDiagonal{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    Queue<Integer> qu= new LinkedList<>();
    for(int i=0;i<3*n-2;i++){
      qu.add(sc.nextInt());
    }
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(i==j || i-j==1|| i-j==-1){
          System.out.print(qu.poll()+" ");
        }else System.out.print(0+" ");
      }
      System.out.println();
    }
    sc.close();
  }
}