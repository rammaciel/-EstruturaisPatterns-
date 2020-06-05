package exercicio_7_1;

public class ReverseString extends StringConversor{

	@Override
	public void converter(String s) {
	
		StringBuilder sb = new StringBuilder(s);  
	    sb.reverse();  
		
		System.out.println("Reverse: "+sb);
		
	}

}
