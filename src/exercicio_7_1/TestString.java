package exercicio_7_1;

public class TestString {

	public static void main(String[] args) {
		
		StringConversor reverse = new ReverseString();
		StringConversor duplicate = new DuplicateString();
		StringConversor lowerCase = new LowerString();
		StringConversor upperCase = new UpperString();
		
		String palavra = "Aeoiu";
		reverse.run(palavra);
		duplicate.run(palavra);
		lowerCase.run(palavra);
		upperCase.run(palavra);

	}

}
