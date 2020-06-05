package exercicio_5_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class IOFacade {

	public void lerArquivoTexto(File file) throws IOException {
		FileReader fileReader = new FileReader(file);
		BufferedReader bufReader = new BufferedReader(fileReader);
		String arquivo = "";

		while (bufReader.ready()) {
			String line = bufReader.readLine();
			arquivo += line + " ";
		}

		System.out.println(arquivo);
		
		bufReader.close();
	}

	public void lerArquivoBinario(File file) throws IOException {

		FileInputStream inStream = new FileInputStream(file);

		int fileSize = (int) file.length();
		byte[] byteArray = new byte[fileSize];

		inStream.read(byteArray);
		for (int i = 0; i < fileSize; i++) {
			System.out.println(byteArray[i]);
		}
		
		inStream.close();
	}
	
	public void escreverArquivoBinario(byte[] byteArray) throws IOException {
  
		File file = new File("bytesArray.data");   
		FileOutputStream outStream = new FileOutputStream(file);
		outStream.write(byteArray);      
		outStream.close(); 
		
	}

	public void lerObjeto(File file) throws IOException, ClassNotFoundException {
		FileInputStream inFileStream = new FileInputStream(file);
		ObjectInputStream inObjectStream = new ObjectInputStream(inFileStream);

		Object obj = inObjectStream.readObject();

		System.out.println(obj.toString());
		
		inObjectStream.close();
	}
	
	public void escreverObjeto(Object obj) throws IOException {
		File outFile = new File("objects.dat");   
		FileOutputStream outFileStream = new FileOutputStream(outFile);   
		ObjectOutputStream outObjectStream = new ObjectOutputStream(outFileStream); 
		outObjectStream.writeObject(obj);   
		outObjectStream.close();
	}
}
