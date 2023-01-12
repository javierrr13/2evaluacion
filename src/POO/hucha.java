package POO;

public class hucha {
	private int dinero, saldo;
	private String pwd, pin,nwpwd;
	private Boolean open;

	public hucha(int money, String password, String pin, int saldo,Boolean open,String nwpwd) {
		this.pwd = password;
		this.dinero = money;
		this.pin = pin;
		this.saldo = saldo;
		this.open=open;
		this.nwpwd=nwpwd;
		
	}

	public void Comprobar() {
		if (pin.equals(pwd)) {
			System.out.println("Pin correcto, hucha abierta.");
			open = true;
		} else {
			System.out.println("Pin incorrecto");
		}
	}

	public void Retirar() {
		if (dinero > saldo || dinero % 10 != 0) {
			System.out.println("Operation denied");
		} else {
			System.out.println("Operation confirmed");
		}
	}
	public void CambiarPWD() {
		pwd=nwpwd;
	}
	
}
