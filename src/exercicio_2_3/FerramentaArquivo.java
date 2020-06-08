package exercicio_2_3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FerramentaArquivo extends Ferramenta {
	private File arquivoLog;

	public FerramentaArquivo() {
		String pacote = "D:\\USJT\\ccp3_patterns\\src\\exercicio_2_2\\publico.txt";
		arquivoLog = new File(pacote, "log.txt");

		try {
			if (!arquivoLog.exists())
				arquivoLog.createNewFile();
		} catch (IOException e) {
			System.out.println("Não foi possível criar o arquivo de log:\n" + e);
			System.exit(1);
		}
	}

	public void registrarLog(String mensagem) {
		try {
			FileWriter writer = new FileWriter(arquivoLog, true);
			writer.write(mensagem + "\n");
			writer.close();
		} catch (IOException e) {
			System.out.println("Não foi possível escrever no arquivo de log:\n" + e);
			System.exit(1);
		}
	}
}
