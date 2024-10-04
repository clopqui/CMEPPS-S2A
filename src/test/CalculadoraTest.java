package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Sesion2A.Calculadora;

public class CalculadoraTest {
    private int a;
    private int b;
    
    public CalculadoraTest() {
    }

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
        a = 10;
        b = 5;
    }

    @AfterEach
    public void tearDown() throws Exception {
    }
    

    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        int expResult = 15;
        int result = Calculadora.suma(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        int expResult = 5;
        int result = Calculadora.resta(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of multiplica method, of class Calculadora.
     */
    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        int expResult = 50;
        int result = Calculadora.multiplica(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of divide method, of class Calculadora.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        int expResult = 2;
        int result = Calculadora.divide(a, b);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of divide method, of class Calculadora.
     */
    @Test
    public void testDividePor0() {
        System.out.println("divide");
        b=0;
        int expResult = -1;
        int result = Calculadora.divide(a, b);
        assertEquals(expResult, result);
    }
    
}
