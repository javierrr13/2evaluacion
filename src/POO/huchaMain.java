package POO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class huchaMain {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	/*
	 * Definir una clase llamada Hucha seg�n las especificaciones siguientes: � La
	 * hucha solo admite monedas de uno y dos euros y billetes de 5, 10, 20 y 50
	 * euros.$ � La hucha podr� estar abierta o cerrada. Para abrir o cerrar la
	 * hucha se requiere una contrase�a.$ � La contrase�a se podr� cambiar en
	 * cualquier momento.$ � La hucha podr� proporcionar informaci�n acerca de la
	 * cantidad de monedas o billetes que almacena de cada clase, as� como el valor
	 * total en euros. � Se podr�n retirar de la hucha monedas o billetes indicando
	 * el tipo y la cantidad de los mismos que se desea retirar. Si la cantidad
	 * solicitada supera la cantidad almacenada se retirar� �nicamente la cantidad
	 * disponible. � Se podr� retirar de la hucha una cantidad de euros espec�fica
	 * minimizando el n�mero de monedas y billetes que se retirar�n. � Se podr�
	 * construir una hucha vac�a, una hucha con una cantidad espec�fica de monedas y
	 * billetes de cada tipo o una hucha con una cantidad inicial de euros que se
	 * desglosar� utilizando la m�nima cantidad de monedas y billetes.
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		String fin = "";
		String nwpwd = "";
		int saldo = 500;
		String pin = "HolaPOO";
		Boolean open = false;
		
		do {
		System.out.println("Introduzca pin");
		String password = in.readLine();
			
		System.out.println("Introduzca dinero a retirar");

		int money = Integer.parseInt(in.readLine());
		hucha use = new hucha(money, password, pin, saldo, open, nwpwd);
		use.Comprobar();
		use.Retirar();

		System.out.println("Si desea cambiar la pwd teclee 1");
		int n = Integer.parseInt(in.readLine());
		if (n == 1) {
			System.out.println("Introduzca nueva pwd: ");
			nwpwd = in.readLine();
			use.CambiarPWD();
		}
		System.out.println("Desea continuar la operacion? Y/N");
		fin = in.readLine();
		
		}while(fin.equals("Y"));
	}

}
