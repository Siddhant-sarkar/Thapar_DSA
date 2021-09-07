import java.util.*;
public class symmetric {
  public static void main(String[] args) {
   Scanner sc= new Scanner(System.in) ;
   int n=sc.nextInt();
   ArrayList<Integer> mq= new ArrayList<>();
   for(int i=0;i<(n*(n+1))/2;i++) mq.add(sc.nextInt());
   for(int i=0;i<n;i++){
     for(int j=0;j<n;j++){
       if(i<=j){
        System.out.print((mq.get(i*n-(i*(i+1)/2)+j))+" ");
        }else{
        System.out.print((mq.get(j*n-(j*(j+1)/2)+i))+" ");
       }
     }
     System.out.println();
   }
   sc.close();
  }
}
