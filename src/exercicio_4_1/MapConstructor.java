package exercicio_4_1;

import java.util.Map;

public class MapConstructor {
	
	private Map<Object, Object> map;
	
	public MapConstructor(Object[][] tipos) {
		
		assossiarChaveValor(tipos);
	}
	
	
	private void assossiarChaveValor(Object[][] types) {
		int count = 0;
		Object chave = null;
		Object valor = null;
		
		for(int i = 0; i < types.length; i++) {
			for(int j = 0; j < types[i].length; j++) {
				chave = types[i][j];
				
				if(count > 0) {
					valor = types[i][j];
					count = 0;
				}
			}
			
			count++;
		}
		
		this.map = (Map<Object, Object>) map.put(chave, valor);
		
	}

	
}
