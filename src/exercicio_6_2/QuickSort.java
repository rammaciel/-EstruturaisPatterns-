package exercicio_6_2;

public class QuickSort implements Ordenacao {

	@Override
	public int[] ordenar(int[] array) {
		array = quicksort(array, 0, array.length - 1);
		System.out.println("QuickSort");
		return array;
	}

	private int[] quicksort(int[] array, int p, int r) {
		int j;
		if (p < r) {
			j = separa(array, p, r);
			quicksort(array, p, j - 1);
			quicksort(array, j + 1, r);
		}

		return array;
	}

	private int separa(int v[], int p, int r) {
		int c = v[p + ((int) (Math.random() * (1 + r - p) * 1000) % (1 + r - p))];
		int i = p + 1, j = r, t;
		while (true) {
			while (i <= r && v[i] <= c)
				++i;
			while (c < v[j])
				--j;
			if (i >= j)
				break;
			t = v[i];
			v[i] = v[j];
			v[j] = t;
			++i;
			--j;
		}
		v[p] = v[j];
		v[j] = c;
		return j;
	}

}
