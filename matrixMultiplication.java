public class matrixMultiplication{
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
		int m2[][]={
								{1,2,3},
								{4,5,6},
								{7,8,9}
							};
		int mlti[][]= new int[m1.length][m2[0].length];
		for(int i=0;i<m1.length;i++){
			for(int j=0;j<m2[0].length;j++){
				for(int k=0;k<m2.length;k++) mlti[i][j]+=m1[i][k]*m2[k][j];
			}
		}
		System.out.println("Matrix 1");
		print(m1);
		System.out.println("Matrix 2");
		print(m2);
		System.out.println("Matrix Multiplication : ");
		print(mlti);
	}
}