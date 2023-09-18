package com.biblioteca;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class VendaTest {
        /**
         * Test do construtor com parâmetros
         */
        @Test
        public void testConstrutorComParametros() {
                
                LivroVenda livroVenda = new LivroVenda();
                
                Venda venda = new Venda("João", "Crédito", 100.00, livroVenda);
                
                Assert.assertEquals("João", venda.nomeCliente);
                Assert.assertEquals("Crédito", venda.formaPagamento);
                Assert.assertEquals(100.00, venda.valorDado, 0.001);
                
        }

        /**
         * Test do construtor sem parâmetros
         */
        @Test
        public void testConstrutorSemParametros() {
                Autor autor = new Autor();
                Assert.assertNull(venda.nomeCliente);
                Assert.assertNull(venda.formaPagamento);
                Assert.assertNull(venda.valorDado);
        }

}
