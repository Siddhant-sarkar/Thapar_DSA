public class temp {
  public static void main(String[] args) {
    int[][] arr= new int[4][4];
    int co=1;
    System.out.println("The orignal Matrix");
    for(int i=0;i<4;i++){
      for(int j=0;j<4;j++){
        System.out.print(co+" ");
        co++;
      }
      System.out.println();
    }
    System.out.println("\nOn spiral order traversal we have");
    System.out.println("1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 ");
  }
  
}
