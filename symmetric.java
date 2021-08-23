import java.util.*;
public class symmetric {
  public static void main(String[] args) {
   Scanner sc= new Scanner(System.in) ;
   int n=sc.nextInt();
   Queue<Integer> mq = new LinkedList<>();
    // There is a method which will use the upper diagonal implementations
    // here we all we will construct the upperdiagonal matrix 
    // and for i<=j we will refrence arr[j][i] asat
   for(int i=0;i<(n*(n+1))/2;i++) mq.add(sc.nextInt());
   for(int i=0;i<n;i++){
     for(int j=0;j<n;j++){
     }
   }
   sc.close();
  }
}
