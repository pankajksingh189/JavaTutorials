package matrix;

public class ZeroElements {

	public static void main(String[] args) {
		int A [][]={ {1,2,3}, {4,0,5}, {0,7,8} };
		int B[][]=new int[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				B[i][j]=A[i][j];
			}
		}

		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(A[i][j]==0){
					for(int m=0;m<3;m++){
						B[i][m]=0;
						B[m][j]=0;
					}
				}
			}
		}


		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(B[i][j]+" ");
			}
			System.out.println();
		}

	}

}
