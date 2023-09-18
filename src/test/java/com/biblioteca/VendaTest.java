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
                String nomeCliente = "João";
                String formaPagamento = "Crédito";
                double valorDado = 100.00;
                Livros =  
                Venda venda = new Venda(nomeCliente, formaPagamento, valorDado);
                Assert.assertNotNull(venda.nomeCliente);
                Assert.assertNotNull(venda.formaPagamento);
                Assert.assertNotNull(venda.valorDado);
                Assert.assertEquals(venda.nomeCliente, nomeCliente);
                Assert.assertEquals(venda.formaPagamento, formaPagamento);
                Assert.assertEquals(venda.valorDado, valorDado);
                
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
