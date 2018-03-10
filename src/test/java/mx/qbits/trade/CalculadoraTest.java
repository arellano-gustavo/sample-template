package mx.qbits.trade;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculadoraTest {
    Calculadora calc = new Calculadora();
    
    @Test
    public void sumaTest() {
        assertTrue(calc.suma(3, 5)==8);
        assertTrue(calc.suma(0, 5)==5);
        assertTrue(calc.suma(3, 0)==3);
        assertTrue(calc.suma(0, 0)==0);
        assertTrue(calc.suma(3, -3)==0);
        assertTrue(calc.suma(-1, -1)==-2);
        assertFalse(calc.suma(0, 0)==8);
    }
    
    @Test
    public void restaTest() {
        assertTrue(calc.resta(3, 5)==-2);
        assertTrue(calc.resta(0, 5)==-5);
        assertTrue(calc.resta(3, 0)==3);
        assertTrue(calc.resta(0, 0)==0);
        assertTrue(calc.resta(3, -3)==6);
        assertTrue(calc.resta(-1, -1)==0);
        assertFalse(calc.resta(0, -1)==8);
        assertFalse(calc.resta(1, 0)==8);
        assertFalse(calc.resta(1, 1)==8);
    }

}
