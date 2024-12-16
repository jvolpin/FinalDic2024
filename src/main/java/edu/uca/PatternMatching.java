package edu.uca;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class PatternMatching {
    //    Ejercicio 3
    public static boolean esEmailValido(String email) {
        String regex = "";
        return false;
    }

    @Test
    public void testEsEmailValido() {
        assertTrue(esEmailValido("example@mail.com"));
        assertFalse(esEmailValido("examplemail.com"));
        assertFalse(esEmailValido("example@mailcom"));
    }

    //    Ejercicio 4
    public static boolean esCodigoPostalValido(String postalCode) {
        String regex = "";
        return false;
    }

    @Test
    public void testEsCodigoPostalValido() {
        assertTrue(esCodigoPostalValido("12345"));
        assertFalse(esCodigoPostalValido("1234a"));
        assertFalse(esCodigoPostalValido("123"));
    }
}
