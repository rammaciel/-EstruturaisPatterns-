package exercicio_6_2;

public class BubbleSort implements Ordenacao {

	@Override
	public int[] ordenar(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			for (int j = 0; j <= i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int aux = array[j + 1];
					array[j + 1] = array[j];
					array[j] = aux;
				}
			}
		}
		
		System.out.println("BubbleSort");
		return array;
	}

}
