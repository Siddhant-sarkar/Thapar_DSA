import java.util.*;
public class menu{
  public static void main(String[] args) {
    System.out.println("Welcome to the menue ");    
    ArrayList<Integer>arr=new ArrayList<>();
    Scanner sc= new Scanner(System.in);
    while(true){
      System.out.println("1.Create");
      System.out.println("2.Display");
      System.out.println("3.Insert");
      System.out.println("4.Delete");
      System.out.println("5.Search");
      System.out.println("6.Exit");int a= sc.nextInt();
      if(a==1){
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        arr= new ArrayList<>(n);
        System.out.println("Array created");
      }else if(a==2){
        System.out.print("Now printing Array : ");
        System.out.println(arr);
      }else if(a==3){
        System.out.println("Enter the idx ");
        int idx= sc.nextInt();
        System.out.println("Enter the data to be inserted ");
        int data=sc.nextInt();
        arr.add(idx,data);
      }else if(a==4){
        System.out.println("Enter the index to be removed");
        int idx=sc.nextInt();
        arr.remove(idx);
      }else if(a==5){
        System.out.println("Entert the data to searched");
        int data=sc.nextInt();
        System.out.println(arr.contains(data));
      }else{
        System.out.println("Now Exiting");
        break;
      }
    }
    sc.close();
  }
}