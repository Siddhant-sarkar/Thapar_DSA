import java.util.*;
public class transpose{

	public static void print(int[][]arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.print(arr[i][j]+" ");	
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int m1[][]={
								{1,2,3},
								{4,5,6},
								{7,8,9}
							};
		
		for(int i=0;i<m1.length;i++)	{
			for(int j=0;j<m1[0].length;j++){
				if(i<=j){
					int k= m1[i][j];
					m1[i][j]=m1[j][i];
					m1[j][i]=k;
				}
			}
		}
		print(m1);
	}
}