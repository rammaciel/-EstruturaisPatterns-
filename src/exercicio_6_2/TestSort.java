package exercicio_6_2;

public class TestSort {

	public static void main(String[] args) {
		//BubbleSort
		int vetBubble[] = new int[10];
		for (int i = 0; i < vetBubble.length; i++) {
			vetBubble[i] = (int) (Math.random() * 1000);
		}
		new BubbleSort().ordenar(vetBubble);
		for (int i = 0; i < vetBubble.length; i++) {
			System.out.println(vetBubble[i]);
		}
		//InsertionSort
		int vetInsertion[] = new int[10];
		for (int i = 0; i < vetInsertion.length; i++) {
			vetInsertion[i] = (int) (Math.random() * 1000);
		}
		new InsertionSort().ordenar(vetInsertion);
		for (int i = 0; i < vetInsertion.length; i++) {
			System.out.println(vetInsertion[i]);
		}
		//SelectionSort
		int vetSelection[] = new int[10];
		for (int i = 0; i < vetSelection.length; i++) {
			vetSelection[i] = (int) (Math.random() * 1000);
		}
		new SelectionSort().ordenar(vetSelection);
		for (int i = 0; i < vetSelection.length; i++) {
			System.out.println(vetSelection[i]);
		}
		//QuickSort
		int vetQuick[] = new int[10];
		for (int i = 0; i < vetQuick.length; i++) {
			vetQuick[i] = (int) (Math.random() * 1000);
		}		
		new QuickSort().ordenar(vetQuick);
		for (int i = 0; i < vetQuick.length; i++) {
			System.out.println(vetQuick[i]);
		}
		
		

	}

}
