package array;

public class BubbleSort {

	public static void main(String[] args) {

		int[] numbers = { 5, 8, 14, 1, 5678 };
		int tempVar;
		for (int i = 0; i < numbers.length; i++)
		{
			for(int j = i+1; j < numbers.length; j++)
			{
				if(numbers[i] > numbers[j])
				{
					tempVar = numbers [j];
					numbers [j]= numbers [i];
					numbers [i] = tempVar;
				}
			}
		}
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.print(numbers[i]+",");
		}
	}

}
