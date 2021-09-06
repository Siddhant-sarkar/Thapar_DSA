import java.util.*;
public class removeDup {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    HashSet<Integer> st= new HashSet<>();
    System.out.print("The elements in the array are: ");
    for(int i=0;i<n;i++){
      int k= sc.nextInt();
      st.add(k);
      System.out.print(k+" ");
    }
    System.out.println();
    System.out.println(st);
    sc.close();
  }  
}
