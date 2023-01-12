package POO;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
public class Animal {
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
private String name;
private LocalDate time;

public Animal(String nombre,LocalDate fecha) {
	this.name = nombre;
	this.time = fecha;
}
public void Print () {
	System.out.println("La fecha actual es: " + time + " y tu nombre " + name);
}
}
