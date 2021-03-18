package com.teste;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTeste {

    @Test
    public void testSoma() {
        Calculadora calc = new Calculadora();
        int soma = calc.Somar("1+1+3");
        assertEquals(5, soma);
    }


//    @Test
//    public void testeSomarComMock() {
//        Calculadora calculadora = mock(Calculadora.class);
//
//        when(calculadora.somar("1+2")).thenReturn(10);
//
//        int resultado = calculadora.somar("1+2");
//
//        assertEquals(10, resultado);
//
//    }
}
