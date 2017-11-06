
public class QuickSorter {

	public static void quickSort(int[] arr, int lo, int hi) {
		int pivotIndex = 0;
		if (lo < hi) {   // not in base case
			pivotIndex = partition(arr, lo, hi);
			quickSort(arr, lo, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, hi);
		}
	}
	
	public static int partition(int[] arr, int lo, int hi) {
		int pivotIndex = lo;
		if (lo == hi) {
			return pivotIndex;
		} else {
			int pivot = arr[lo];
			int i = lo - 1;
			int j = hi + 1;
			boolean done = false;
			while (!done) {
				while (arr[i + 1] < pivot) {
					i++;
					if (i == hi) {
						break;
					}
				}
				while (arr[j - 1] > pivot) {
					j--;
					if (j == 0) {
						break;
					}
				}
				if (j <= i) {
					done = true;
				} else {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return pivotIndex;
	}
	
}
