package Domain;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// lectura de archivo pronostico
		try {
			Files.readAllLines(Paths.get("C:\\Users\\Mauricio\\Documents\\Entrega_1\\pronostico.csv"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
		
		String pronostico = "C:\\Users\\Mauricio\\Documents\\Entrega_1\\pronostico.csv";
 		try {
			for (String linea : Files.readAllLines(Paths.get(pronostico)) ) {
				System.out.println(linea);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
 		// lectura de archivo resultados
 		try {
			Files.readAllLines(Paths.get("C:\\Users\\Mauricio\\Documents\\Entrega_1\\resultados.csv"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
		
		String resultado = "C:\\Users\\Mauricio\\Documents\\Entrega_1\\resultados.csv";
 		try {
			for (String linea : Files.readAllLines(Paths.get(resultado))) {
				System.out.println(linea);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
 		 
	}

}
