package Pruebas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSV {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String cvsSplitBy = ",";
		String archivo = "C:\\Users\\Usuario\\Desktop\\PruebaFileJava\\ISO-Codes.csv";
		BufferedReader in = new BufferedReader(new FileReader(archivo));
		String Data = in.readLine();
		String[] fichero = Data.split(cvsSplitBy);
		for(int i = 0; i<fichero.length;i++) {
			System.out.println(fichero);
		}
	}

}
