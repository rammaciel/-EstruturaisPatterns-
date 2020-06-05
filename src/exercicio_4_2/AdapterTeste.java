package exercicio_4_2;

public class AdapterTeste {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente(new SomadorAdapter());
		cliente.executar();
		
	}

}
