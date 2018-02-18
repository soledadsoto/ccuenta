import static org.junit.Assert.*;

import org.junit.Test;

public class TestCcuentaSSR {

	double totalCuenta;
	private Object miCuenta;
//Pruebas test
	@Test
	public void testCcuenta() {
		Ccuenta miCuenta= new Ccuenta("Ana", "López", 3200, 1);
		assertNotNull(miCuenta);
	}

	@Test
	public void testGetSaldo() {
		totalCuenta = miCuenta();
		System.out.println("Total actual en la cuenta: " + totalCuenta + "€");
	}

	private double miCuenta() {
		// TODO Apéndice de método generado automáticamente
		return 0;
	}

	@Test
	public void Ingresar() throws Exception {
		Ccuenta miCuenta=new Ccuenta ("Ana", "López", 3200, 1);
		miCuenta.ingresar(3500);
		
	}
	
	@Test (expected=Exception.class)
	public void testIngresar() throws Exception {
		Ccuenta miCuenta=new Ccuenta ("Ana", "López", 6700, 1);
		miCuenta.ingresar(-600);
	}

	
	public Object getMiCuenta() {
		return miCuenta;
	}

	public void setMiCuenta(Object miCuenta) {
		this.miCuenta = miCuenta;
	}

	@Test
	public void testRetirar() throws Exception {
		Ccuenta miCuenta=new Ccuenta ("Ana", "López",6700, totalCuenta);
		miCuenta.retirar(1000);
	}
	
	@Test (expected=Exception.class)
	public void testRetirarSaldoSuperior() throws Exception {
		Ccuenta miCuenta=new Ccuenta ("Ana", "López", 5700, 1);
		miCuenta.retirar(10000);
	}

}
