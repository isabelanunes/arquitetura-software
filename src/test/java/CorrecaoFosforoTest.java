/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import model.CorrecaoFosforo;
import model.FontesFosforo;
import model.Nutrientes;
import model.Solo;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Isabela Nunes
 */
public class CorrecaoFosforoTest {
   Solo solo = new Solo(8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 0.0);

    @Test
    public void testeQuantidadeAplicarFosforo(){
        Assert.assertEquals(123.95, new CorrecaoFosforo(1260, solo, FontesFosforo.SUPERFOSFATO_SIMPLES, 12, 70).quantidadeAplicarElemento(), 0.1);
       
        Assert.assertEquals(54.41, new CorrecaoFosforo(1260, solo, FontesFosforo.SUPERFOSFATO_TRIPLO, 12, 70).quantidadeAplicarElemento(), 0.1);
        
        Assert.assertEquals(46.48, new CorrecaoFosforo(1260, solo, FontesFosforo.MAP, 12, 70).quantidadeAplicarElemento(), 0.1);
        
        Assert.assertEquals(49.58, new CorrecaoFosforo(1260, solo, FontesFosforo.DAP, 12, 70).quantidadeAplicarElemento(), 0.1);
        
        Assert.assertEquals(123.95, new CorrecaoFosforo(1260, solo, FontesFosforo.YOORIN, 12, 70).quantidadeAplicarElemento(), 0.1);
        
        Assert.assertEquals(67.60, new CorrecaoFosforo(1260, solo, FontesFosforo.FOSFATO_ARAD, 12, 70).quantidadeAplicarElemento(), 0.1);
        
        Assert.assertEquals(76.93, new CorrecaoFosforo(1260, solo, FontesFosforo.FOSFATO_GAFSA, 12, 70).quantidadeAplicarElemento(), 0.1);
        
        Assert.assertEquals(69.72, new CorrecaoFosforo(1260, solo, FontesFosforo.FOSFATO_DAOUI, 12, 70).quantidadeAplicarElemento(), 0.1);
        
        Assert.assertEquals(92.96, new CorrecaoFosforo(1260, solo, FontesFosforo.FOSF_PATOS_MINAS, 70, 1260).quantidadeAplicarElemento(), 0.1);
        
        Assert.assertEquals(120.60, new CorrecaoFosforo(1260, solo, FontesFosforo.ESCORIA_THOMAS, 12, 70).quantidadeAplicarElemento(), 0.1);
        
        Assert.assertEquals(42.90, new CorrecaoFosforo(1260, solo, FontesFosforo.ACIDO_FOSFORICO, 12, 70).quantidadeAplicarElemento(), 0.1);
        
        Assert.assertEquals(123.95, new CorrecaoFosforo(1260, solo, FontesFosforo.MULTIF_MAGNESIANO, 12, 70).quantidadeAplicarElemento(), 0.1); 
    
        }

    @Test
    public void testeCorrecaoFosforoFornece(){
        Assert.assertArrayEquals(new Object[][] {{new double[] {34.70622222222223, 12.395079365079367}}, {new Nutrientes[] {Nutrientes.CALCIO, Nutrientes.ENXOFRE}}},
            new CorrecaoFosforo(1260, solo, FontesFosforo.SUPERFOSFATO_SIMPLES, 12, 70).correcaoElemento());
        
        Assert.assertArrayEquals(new Object[][] {{new double[] {10.883484320557493, 0.0}}, {new Nutrientes[] {Nutrientes.CALCIO, null}}},
            new CorrecaoFosforo(1260, solo, FontesFosforo.SUPERFOSFATO_TRIPLO, 12, 70).correcaoElemento());

        Assert.assertArrayEquals(new Object[][] {{new double[] {4.183339285714286, 0.0}}, {new Nutrientes[] {Nutrientes.NITROGENIO, null}}}, 
            new CorrecaoFosforo(1260, solo, FontesFosforo.MAP, 12, 70).correcaoElemento());
        
        Assert.assertArrayEquals(new Object[][] {{new double[] {7.932850793650795, 0.0}}, {new Nutrientes[] {Nutrientes.NITROGENIO, null}}}, 
            new CorrecaoFosforo(1260, solo, FontesFosforo.DAP, 12, 70).correcaoElemento());

        Assert.assertArrayEquals(new Object[] [] {{new double[] {18.59261904761905, 34.70622222222223}}, {new Nutrientes[] {Nutrientes.MAGNESIO, Nutrientes.CALCIO}}}, 
            new CorrecaoFosforo(1260, solo, FontesFosforo.YOORIN, 12, 70).correcaoElemento());
        
        
        Assert.assertArrayEquals(new Object[][] {{new double[] {35.15695238095238, 0.0}}, {new Nutrientes[] {Nutrientes.CALCIO, null}}}, 
            new CorrecaoFosforo(1260, solo, FontesFosforo.FOSFATO_ARAD, 12, 70).correcaoElemento());

        Assert.assertArrayEquals(new Object[][] {{new double[] {40.006187192118226, 0.0}}, {new Nutrientes[] {Nutrientes.CALCIO, null}}},
            new CorrecaoFosforo(1260, solo, FontesFosforo.FOSFATO_GAFSA, 12, 70).correcaoElemento());
        
        Assert.assertArrayEquals(new Object[][] {{new double[] {31.375044642857144, 0.0}}, {new Nutrientes[] {Nutrientes.CALCIO, null}}}, 
            new CorrecaoFosforo(1260, solo, FontesFosforo.FOSFATO_DAOUI, 12, 70).correcaoElemento());

        Assert.assertArrayEquals(new Object[][] {{new double[] {26.02966666666667, 0.0}}, {new Nutrientes[] {Nutrientes.CALCIO, null}}}, 
            new CorrecaoFosforo(1260, solo, FontesFosforo.FOSF_PATOS_MINAS, 12, 70).correcaoElemento());

        Assert.assertArrayEquals(new Object[][] {{new double[] {53.06433976833977, 0.0}}, {new Nutrientes[] {Nutrientes.CALCIO, null}}},
            new CorrecaoFosforo(1260, solo, FontesFosforo.ESCORIA_THOMAS, 12, 70).correcaoElemento());

        Assert.assertArrayEquals(new Object[][]{{new double[] {0.0, 0.0}}, {new Nutrientes[] {null, null}}}, 
            new CorrecaoFosforo(1260, solo, FontesFosforo.ACIDO_FOSFORICO, 12, 70).correcaoElemento());

        Assert.assertArrayEquals(new Object[][] {{new double[] {13.634587301587302, 22.31114285714286}}, {new Nutrientes[] {Nutrientes.ENXOFRE, Nutrientes.CALCIO}}}, 
            new CorrecaoFosforo(1260, solo, FontesFosforo.MULTIF_MAGNESIANO, 12, 70).correcaoElemento());
   }
    
    @Test
    public void testeCustoAlqueire(){
        Assert.assertEquals(156.17, new CorrecaoFosforo(1260, solo, FontesFosforo.SUPERFOSFATO_SIMPLES, 12, 70).calcularCustoAlqueire(),0.1);
        
        Assert.assertEquals(68.56, new CorrecaoFosforo(1260, solo, FontesFosforo.SUPERFOSFATO_TRIPLO, 70, 1260).calcularCustoAlqueire(),0.1);
        
        Assert.assertEquals(58.56, new CorrecaoFosforo(1260, solo, FontesFosforo.MAP, 70, 1260).calcularCustoAlqueire(),0.1);
        
        Assert.assertEquals(62.46, new CorrecaoFosforo(1260, solo, FontesFosforo.DAP, 70, 1260).calcularCustoAlqueire(),0.1);
        
        Assert.assertEquals(156.17, new CorrecaoFosforo(1260, solo, FontesFosforo.YOORIN, 70, 1260).calcularCustoAlqueire(),0.1);
        
        Assert.assertEquals(85.18, new CorrecaoFosforo(1260, solo, FontesFosforo.FOSFATO_ARAD, 70, 1260).calcularCustoAlqueire(),0.1);
        
        Assert.assertEquals(96.93, new CorrecaoFosforo(1260, solo, FontesFosforo.FOSFATO_GAFSA, 70, 1260).calcularCustoAlqueire(),0.1);
        
        Assert.assertEquals(87.84, new CorrecaoFosforo(1260, solo, FontesFosforo.FOSFATO_DAOUI, 70, 1260).calcularCustoAlqueire(),0.1);
        
        Assert.assertEquals(117.12, new CorrecaoFosforo(1260, solo, FontesFosforo.FOSF_PATOS_MINAS, 70, 1260).calcularCustoAlqueire(),0.1);
        
        Assert.assertEquals(151.94, new CorrecaoFosforo(1260, solo, FontesFosforo.ESCORIA_THOMAS, 70, 1260).calcularCustoAlqueire(),0.1);
        
        Assert.assertEquals(54.05, new CorrecaoFosforo(1260, solo, FontesFosforo.ACIDO_FOSFORICO, 70, 1260).calcularCustoAlqueire(),0.1);
        
        Assert.assertEquals(156.17, new CorrecaoFosforo(1260, solo, FontesFosforo.MULTIF_MAGNESIANO, 70, 1260).calcularCustoAlqueire(),0.1);

    }
    
}
