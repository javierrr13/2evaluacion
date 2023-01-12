package POO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class huchaMain {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	/*
	 * Definir una clase llamada Hucha según las especificaciones siguientes: • La
	 * hucha solo admite monedas de uno y dos euros y billetes de 5, 10, 20 y 50
	 * euros.$ • La hucha podrá estar abierta o cerrada. Para abrir o cerrar la
	 * hucha se requiere una contraseña.$ • La contraseña se podrá cambiar en
	 * cualquier momento.$ • La hucha podrá proporcionar información acerca de la
	 * cantidad de monedas o billetes que almacena de cada clase, así como el valor
	 * total en euros. • Se podrán retirar de la hucha monedas o billetes indicando
	 * el tipo y la cantidad de los mismos que se desea retirar. Si la cantidad
	 * solicitada supera la cantidad almacenada se retirará únicamente la cantidad
	 * disponible. • Se podrá retirar de la hucha una cantidad de euros específica
	 * minimizando el número de monedas y billetes que se retirarán. • Se podrá
	 * construir una hucha vacía, una hucha con una cantidad específica de monedas y
	 * billetes de cada tipo o una hucha con una cantidad inicial de euros que se
	 * desglosará utilizando la mínima cantidad de monedas y billetes.
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
