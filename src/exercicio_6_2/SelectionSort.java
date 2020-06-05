package exercicio_6_2;

public class SelectionSort implements Ordenacao {

	@Override
	public int[] ordenar(int[] array) {
		int i, j, min, x;
		for (i = 0; i < array.length - 1; i++) {
			min = i;
			for (j = i + 1; j < array.length; j++) {
				if (array[j] < array[min])
					min = j;
			}
			x = array[i];
			array[i] = array[min];
			array[min] = x;
		}
		
		System.out.println("SelectionSort");
		return array;
	}

}
