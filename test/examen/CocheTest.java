/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package examen;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author dammdcd2
 */
public class CocheTest {
    
    public CocheTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getKmTotales method, of class Coche.
     */
    @Test
    public void testGetKmTotales() {
        System.out.println("getKmTotales");
        int expResult = 0;
        int result = Coche.getKmTotales();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of precioConIva method, of class Coche.
     */
    @Test
    public void testPrecioConIva() {
        System.out.println("precioConIva");
        boolean ivareducido = false;
        Coche instance = null;
        double expResult = 0.0;
        double result = instance.precioConIva(ivareducido);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aplicarDescuento method, of class Coche.
     */
    @Test
    public void testAplicarDescuento() {
        System.out.println("aplicarDescuento");
        Coche instance = null;
        instance.aplicarDescuento();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recorrerKm method, of class Coche.
     */
    @Test
    public void testRecorrerKm() {
        System.out.println("recorrerKm");
        int km = 0;
        Coche instance = null;
        instance.recorrerKm(km);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMarca method, of class Coche.
     */
    @Test
    public void testGetMarca() {
        System.out.println("getMarca");
        Coche instance = null;
        String expResult = "";
        String result = instance.getMarca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMarca method, of class Coche.
     */
    @Test
    public void testSetMarca() {
        System.out.println("setMarca");
        String marca = "";
        Coche instance = null;
        instance.setMarca(marca);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModelo method, of class Coche.
     */
    @Test
    public void testGetModelo() {
        System.out.println("getModelo");
        Coche instance = null;
        String expResult = "";
        String result = instance.getModelo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModelo method, of class Coche.
     */
    @Test
    public void testSetModelo() {
        System.out.println("setModelo");
        String modelo = "";
        Coche instance = null;
        instance.setModelo(modelo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecio method, of class Coche.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        Coche instance = null;
        double expResult = 0.0;
        double result = instance.getPrecio();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecio method, of class Coche.
     */
    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        double precio = 0.0;
        Coche instance = null;
        instance.setPrecio(precio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKm method, of class Coche.
     */
    @Test
    public void testGetKm() {
        System.out.println("getKm");
        Coche instance = null;
        int expResult = 0;
        int result = instance.getKm();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKm method, of class Coche.
     */
    @Test
    public void testSetKm() {
        System.out.println("setKm");
        int km = 0;
        Coche instance = null;
        instance.setKm(km);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
