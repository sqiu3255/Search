
public class SearchAlgorithms {

	
	public static void main (String[] args)
	{
		int[] test1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] test2 = {0, 4, 5, 6, 12, 15, 17, 23, 29};
		
		System.out.println(binSearch(test1, 3)); //2
		System.out.println(linSearch(test1, 3)); //2
		
		System.out.println(binSearch(test2, 23)); //7
		System.out.println(linSearch(test2, 23)); //7
		
		System.out.println(binSearch(test3, 25)); //-1
		System.out.println(linSearch(test3, 25)); //-1
		
		System.out.println(binSearch(test1, 10)); //9
		System.out.println(linSearch(test1, 1)); //0
		
		System.out.println(binSearch(test1, 1)); //0
	}
	
	
	
	public static int linearSearch(int[] elements, int query) 
	{
		for(int x = 0; x < elements.length; x++)
		{
			if(elements[x] == query)
			{
				return x;
			}
		}
		return -1;
	}
	
	if (guess < query)
	{
		Binary search on the right side
	}
	if (guess > query)
	{
		Binary search on the left side
	}
	else 
	{
		return position of guess
	}
	
	
	
	public static int binarySearch(int[] elements, int query) 
	{
		int mid = arr.length/2;
		 int L = 0;
		 int R = arr.length - 1;
		
		 While(L<>)
	}
	
	
	
	
	
	
	
	
	
	
}
