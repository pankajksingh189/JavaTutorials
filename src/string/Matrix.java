package stringOperations;

public class Matrix {

	public static void main(String[] args) {

		int i,j;
		int mat1 [][]={ {10,11,12}, {13,14,15}, {16,17,18} };
		int mat2 [][]={ {1,2,3}, {4,5,6}, {7,8,9} };
		int max=mat1[0][0];
		int[] rowMax=new int[3];
		int[] rowSum=new int[3];
		int[] colSum=new int[3];
		int[] colMax=new int[3];
		int sum_diag=0;

		//		System.out.println("Operation ON Matrices \n1.Addition \n");
		//		int sum [][] = new int [3][3];
		//		for(i=0;i <3;i++)
		//		{
		//			for(j=0;j< 3;j++)
		//			{
		//				sum[i][j] = mat1[i][j] + mat2[i][j];
		//				System.out.print("\t" + sum[i][j]);
		//			}
		//			System.out.println("\t");
		//		}
		//
		//		System.out.println("Operation ON Matrices \n1.Finding the gratest element \n");
		//
		//		for(int a=0;a<3;a++){
		//			for(int b=0;b<3;b++){
		//				if(mat1[a][b]>max){
		//					max=mat1[a][b];
		//				}
		//			}
		//		}
		//
		//		System.out.println(max);

		System.out.println("Operation ON Matrices \n1.Row Sum \n");

		for(int x=0;x<3;x++){

			rowSum[x]=0;
			colSum[x]=0;
			rowMax[x]=mat1[0][0];
			colMax[x]=mat1[0][0];

			for(int y=0;y<3;y++){
				System.out.print(mat1[x][y]+" | ");
				rowSum[x]=rowSum[x]+mat1[x][y];
				colSum[x]=colSum[x]+mat1[y][x];

				if(rowMax[x]<=mat1[x][y]){

					rowMax[x]=mat1[x][y];

				}

				if(colMax[x]<=mat1[y][x]){

					colMax[x]=mat1[y][x];

				}

			}

			System.out.println("(sum = "+rowSum[x]+ ") (max = "+rowMax[x]+ ")");
			System.out.println();

		}

		System.out.println("Sum: ");

		for(int k=0;k<3;k++){

			System.out.print(+colSum[k]+ " | ");

		}

		System.out.print("\nMax: \n");

		for(int k=0;k<3;k++){

			System.out.print(+colMax[k]+ " | ");

		}

		//		System.out.println("Operation ON Matrices \n1.diagonal sum \n");
		//
		//		for(int m=0;m<3;m++){
		//			for(int n=0;n<3;n++){
		//				if(m==n){
		//					sum_diag+=mat1[m][n];
		//				}
		//			}
		//		}
		//
		//		System.out.println("diagonal sum: "+sum_diag);

	}

}
