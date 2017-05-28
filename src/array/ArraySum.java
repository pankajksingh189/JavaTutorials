package array;

//find unique pair of array elements whose sum=10

public class ArraySum {

	public static void main(String[] args) {
		int[]array={1,9,6,4,10,3,14};
		int sum=10;
		for(int i=0;i<array.length;i++){
			if(array[i]<sum){
				for(int j=i+1;j<array.length;j++){
					if(array[i]+array[j]==sum){
						System.out.println(array[i]+","+array[j]);
					}
				}
			}
		}
	}

}
