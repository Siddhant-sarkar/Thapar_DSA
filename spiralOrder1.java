public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] spiralOrder(final int[][] A) {
        int rs=0,re=A.length-1; 
   int cs=0,ce=A[0].length-1;
   int arr[] = new int[A.length*A[0].length];
   int c=0;
   while(rs<=re && cs<=ce){
    for(int i=cs;i<=ce;i++){
      arr[c]=A[rs][i];
      c++;
    }
    rs++;
    for(int i=rs;i<=re;i++){
      arr[c]=A[i][ce];
      c++;
    }
    ce--;
    for(int i=ce;i>=cs;i--){
      arr[c]=A[re][i];
      c++;
    }
    re--;
    for(int i=re;i>=rs;i--){
      arr[c]=A[i][cs];
      c++;
    }
    cs++;
   }
   return arr;
    }
        
}
