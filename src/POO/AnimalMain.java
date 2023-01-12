package POO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class AnimalMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce tu nombre ");
		String nombre = in.readLine();
		LocalDate fecha = LocalDate.now();
		Animal ej = new Animal(nombre,fecha);
		ej.Print();
	}

}
