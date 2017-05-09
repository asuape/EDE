import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {

	Calculadora c;

	@Before
	public void instanciaCalc() {
		
		c = new Calculadora();
		System.out.println("Before");
		
	}
	
	@BeforeClass
	public static void setUpBeforeClass() {
		
		System.out.println("BeforeClass");
		
	}
	
	@After
	public void after() {
		
		System.out.println("After");
		
	}
	
	@AfterClass
	public static void afterClass() {
		
		System.out.println("AfterClass");
		
	}
	
	@Test
	public void sumarTest(){
		
		double valorEsperado= 4.0;
		double valorReal=c.suma(2, 2);
		
		assertEquals(valorEsperado, valorReal, 0.001);
		System.out.println("SumarTest");
		
	}
	
	@Test
	public void restarTest(){
		
		double valorEsperado= 0.0;
		double valorReal=c.resta(2, 2);
		
		assertEquals(valorEsperado, valorReal, 0.001);
		System.out.println("RestarTest");
		
	}
	
	@Test
	public void multiplicarTest(){
		
		double valorEsperado= 9.0;
		double valorReal=c.multiplicacion(3, 3);
		
		assertEquals(valorEsperado, valorReal, 0.001);
		System.out.println("MultiplicarTest");
		
	}
	
	@Test
	public void dividirTest(){
		

		double valorEsperado= 1.0;
		double valorReal=c.division(2, 2);
		
		assertEquals(valorEsperado, valorReal, 0.001);
		System.out.println("DividirTest");
		
	}
	

}
