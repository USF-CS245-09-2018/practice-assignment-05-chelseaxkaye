public class QuickSort implements SortingAlgorithm {

	public void sort(int[] a) {
		quicksort(a, 0, a.length - 1);
	}

	public int partition(int[] a, int l, int r) {

		int pivot = l;
		l = l + 1;

		while (l <= r) {
			while (l <= r && a[l] <= a[pivot])
				++l;
			while(l <= r && a[r] >= a[pivot])
				--r;
			if (l < r)
				swap(l, r, a);
		}
		
		swap(pivot, r, a);
		return r;
	}

	public void quicksort(int[] a, int left, int right) {
		if (left < right) {
			int p = partition(a, left, right);
			quicksort(a, left, p - 1);
			quicksort(a, p + 1, right);
		}
	}

	public void swap(int pos, int curr, int[] a) {
		int temp = a[pos];
		a[pos] = a[curr];
		a[curr] = temp;
	}

}