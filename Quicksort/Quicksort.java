import java.util.Random;

public class Quicksort 
{	
	public void quicksort(int[] array, int lower, int upper)
	{
		// Using i and j will allow us to preserve the lower and upper bounds.
		int i = lower, j = upper;

		// Randomly assign the pivot.
		Random r = new Random();
		int pivot = r.nextInt(array.length);

		// Perform the sort.
		while (i <= j)
		{
			while (array[i] < pivot)
				i++;
			while (array[j] > pivot)
				j--;
			if (i <= j)
			{
				swap(array, array[i], array[j]);
				i++;
				j--;
			}
		}
			if (lower < j)
				quicksort(array, lower, j);
			if (i < upper)
				quicksort(array, i, upper);
	}

	public void swap(int[] array, int a, int b)
	{
		int temp;
		temp = array[a];
		array[a] = array[b]; 
		array[b] = temp;
	}
}

class QuicksortTest
{
	public static void main(String[] args)
	{
		Quicksort qs = new Quicksort();
		int[] a = {5, 4, 3, 2, 1, 0};
		System.out.println("Before sorting: ");
		for (int i: a)
			System.out.print(i + " ");
		qs.quicksort(a, 0, a.length-1);
		System.out.println("\nAfter sorting: ");
		for (int i: a)
			System.out.print(i + " ");
		System.out.println();
	}
}