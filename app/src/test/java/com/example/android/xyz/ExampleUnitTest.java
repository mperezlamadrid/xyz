package com.example.android.xyz;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void calcular_cantidad_correctamente() throws Exception {
        assertEquals(1000, Metodos.precioPorCantidad(2, 500), 0);
    }

    @Test
    public void calcular_cantidad_incorrecto() throws Exception {
        assertNotEquals(1000, Metodos.precioPorCantidad(2, 100), 0);
    }

    @Test
    public void calcular_precio_dos_zapatillas_nike_hombre_correcto() throws Exception {
        assertEquals(240000, Metodos.calculoTotal(2, 0, 0, 0), 0);
    }

    @Test
    public void calcular_precio_dos_zapatillas_nike_hombre_incorrecto() throws Exception {
        assertNotEquals(200000, Metodos.calculoTotal(2, 0, 0, 0), 0);
    }

    @Test
    public void calcular_precio_dos_zapatillas_adidas_hombre_correcto() throws Exception {
        assertEquals(280000, Metodos.calculoTotal(2, 0, 0, 1), 0);
    }

    @Test
    public void calcular_precio_dos_zapatillas_adidas_hombre_incorrecto() throws Exception {
        assertNotEquals(200000, Metodos.calculoTotal(2, 0, 0, 1), 0);
    }

    @Test
    public void calcular_precio_dos_zapatillas_puma_hombre_correcto() throws Exception {
        assertEquals(260000, Metodos.calculoTotal(2, 0, 0, 2), 0);
    }

    @Test
    public void calcular_precio_dos_zapatillas_puma_hombre_incorrecto() throws Exception {
        assertNotEquals(200000, Metodos.calculoTotal(2, 0, 0, 2), 0);
    }

    @Test
    public void calcular_precio_dos_clasico_nike_hombre_correcto() throws Exception {
        assertEquals(100000, Metodos.calculoTotal(2, 0, 1, 0), 0);
    }

    @Test
    public void calcular_precio_dos_clasico_nike_hombre_incorrecto() throws Exception {
        assertNotEquals(200000, Metodos.calculoTotal(2, 0, 1, 0), 0);
    }

    @Test
    public void calcular_precio_dos_clasico_adidas_hombre_correcto() throws Exception {
        assertEquals(160000, Metodos.calculoTotal(2, 0, 1, 1), 0);
    }

    @Test
    public void calcular_precio_dos_clasico_adidas_hombre_incorrecto() throws Exception {
        assertNotEquals(200000, Metodos.calculoTotal(2, 0, 1, 1), 0);
    }

    @Test
    public void calcular_precio_dos_clasico_puma_hombre_correcto() throws Exception {
        assertEquals(200000, Metodos.calculoTotal(2, 0, 1, 2), 0);
    }

    @Test
    public void calcular_precio_dos_clasico_puma_hombre_incorrecto() throws Exception {
        assertNotEquals(20000, Metodos.calculoTotal(2, 0, 1, 2), 0);
    }

    @Test
    public void calcular_precio_dos_zapatilla_nike_mujer_correcto() throws Exception {
        assertEquals(200000, Metodos.calculoTotal(2, 1, 0, 0), 0);
    }

    @Test
    public void calcular_precio_dos_zapatillas_nike_mujer_incorrecto() throws Exception {
        assertNotEquals(20000, Metodos.calculoTotal(2, 1, 0, 0), 0);
    }

    @Test
    public void calcular_precio_dos_zapatilla_adidas_mujer_correcto() throws Exception {
        assertEquals(260000, Metodos.calculoTotal(2, 1, 0, 1), 0);
    }

    @Test
    public void calcular_precio_dos_zapatillas_adidas_mujer_incorrecto() throws Exception {
        assertNotEquals(20000, Metodos.calculoTotal(2, 1, 0, 1), 0);
    }

    @Test
    public void calcular_precio_dos_zapatilla_puma_mujer_correcto() throws Exception {
        assertEquals(220000, Metodos.calculoTotal(2, 1, 0, 2), 0);
    }

    @Test
    public void calcular_precio_dos_zapatillas_puma_mujer_incorrecto() throws Exception {
        assertNotEquals(20000, Metodos.calculoTotal(2, 1, 0, 2), 0);
    }

    @Test
    public void calcular_precio_dos_clasico_nike_mujer_correcto() throws Exception {
        assertEquals(120000, Metodos.calculoTotal(2, 1, 1, 0), 0);
    }

    @Test
    public void calcular_precio_dos_clasico_nike_mujer_incorrecto() throws Exception {
        assertNotEquals(20000, Metodos.calculoTotal(2, 1, 1, 0), 0);
    }

    @Test
    public void calcular_precio_dos_clasico_adidas_mujer_correcto() throws Exception {
        assertEquals(140000, Metodos.calculoTotal(2, 1, 1, 1), 0);
    }

    @Test
    public void calcular_precio_dos_clasico_adidas_mujer_incorrecto() throws Exception {
        assertNotEquals(20000, Metodos.calculoTotal(2, 1, 1, 1), 0);
    }

    @Test
    public void calcular_precio_dos_clasico_puma_mujer_correcto() throws Exception {
        assertEquals(240000, Metodos.calculoTotal(2, 1, 1, 2), 0);
    }

    @Test
    public void calcular_precio_dos_clasico_puma_mujer_incorrecto() throws Exception {
        assertNotEquals(20000, Metodos.calculoTotal(2, 1, 1, 2), 0);
    }
}
