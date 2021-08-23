import java.util.*;
public class lowerTr {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    Queue<Integer> mq= new LinkedList<>();
    for(int i=0;i<(n*(n+1))/2;i++) mq.add(sc.nextInt());
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(i>=j) System.out.print(mq.remove()+" ");
        else System.out.print(0+" ");
      }
      System.out.println();
    }
    sc.close();
  }  
}
