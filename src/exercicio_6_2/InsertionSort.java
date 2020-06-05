package exercicio_6_2;

public class InsertionSort implements Ordenacao {

	@Override
	public int[] ordenar(int[] array) {
		int i, j, x;
		for (j = 1; j < array.length; j++) {
			x = array[j];
			for (i = j - 1; i >= 0 && array[i] > x; i--) {
				array[i + 1] = array[i];
			}
			array[i + 1] = x;
		}
		
		System.out.println("InsertionSort");
		return array;
	}

}
