package es.upm.grise.profundizacion2019.ex1;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class ClaseExamenTest {

	@Test
	public void test() {
		ClaseExamen cExamen = new ClaseExamen();
		float result1 = cExamen.metodoAProbar(2, 1);
		TestCase.assertEquals(0f, result1);
		
		float result2 = cExamen.metodoAProbar(1, 2);
		TestCase.assertEquals(0f, result2);
		
		float result3 = cExamen.metodoAProbar(0, 0);
		TestCase.assertEquals(0f, result3);
	}

}
