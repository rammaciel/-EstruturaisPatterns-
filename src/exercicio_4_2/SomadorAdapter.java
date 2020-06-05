package exercicio_4_2;

import java.util.ArrayList;

public class SomadorAdapter extends SomadorExistente implements SomadorEsperado {

	@Override
	public int somaVetor(int[] vetor) {
		
		ArrayList<Integer> lista = new ArrayList<>();
		
		for(int i = 0; i<vetor.length; i++) {
			lista.add(vetor[i]);
		}
		int resultado = somaLista(lista);
		return resultado;
	}

}
