/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import model.CorrecaoFosforo;
import model.FontesFosforo;
import model.ItemCorrecaoFornece;
import model.Nutrientes;
import model.Solo;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Isabela Nunes
 */
public class CorrecaoFosforoTest {
    
    @Test
    public void testeQuantidadeAplicarFosforo(){
        Solo solo = new Solo(8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 0.0);
        Assert.assertEquals(123.95, new CorrecaoFosforo(12, FontesFosforo.SUPERFOSFATO_SIMPLES, 70, 1260, solo).quantidadeAplicarElemento(), 0.1);
        
        Assert.assertEquals(54.41, new CorrecaoFosforo(12, FontesFosforo.SUPERFOSFATO_TRIPLO, 70, 1260, solo).quantidadeAplicarElemento(), 0.1);
        
        Assert.assertEquals(46.48, new CorrecaoFosforo(12, FontesFosforo.MAP, 70, 1260, solo).quantidadeAplicarElemento(), 0.1);
        
        Assert.assertEquals(49.58, new CorrecaoFosforo(12, FontesFosforo.DAP, 70, 1260, solo).quantidadeAplicarElemento(), 0.1);
        
        Assert.assertEquals(123.95, new CorrecaoFosforo(12, FontesFosforo.YOORIN, 70, 1260, solo).quantidadeAplicarElemento(), 0.1);
        
        Assert.assertEquals(67.60, new CorrecaoFosforo(12, FontesFosforo.FOSFATO_ARAD, 70, 1260, solo).quantidadeAplicarElemento(), 0.1);
        
        Assert.assertEquals(76.93, new CorrecaoFosforo(12, FontesFosforo.FOSFATO_GAFSA, 70, 1260, solo).quantidadeAplicarElemento(), 0.1);
        
        Assert.assertEquals(69.72, new CorrecaoFosforo(12, FontesFosforo.FOSFATO_DAOUI, 70, 1260, solo).quantidadeAplicarElemento(), 0.1);
        
        Assert.assertEquals(92.96, new CorrecaoFosforo(12, FontesFosforo.FOSF_PATOS_MINAS, 70, 1260, solo).quantidadeAplicarElemento(), 0.1);
        
        Assert.assertEquals(120.60, new CorrecaoFosforo(12, FontesFosforo.ESCORIA_THOMAS, 70, 1260, solo).quantidadeAplicarElemento(), 0.1);
        
        Assert.assertEquals(42.90, new CorrecaoFosforo(12, FontesFosforo.ACIDO_FOSFORICO, 70, 1260, solo).quantidadeAplicarElemento(), 0.1);
        
        Assert.assertEquals(123.95, new CorrecaoFosforo(12, FontesFosforo.MULTIF_MAGNESIANO, 70, 1260, solo).quantidadeAplicarElemento(), 0.1);
    }

    @Test
    public void testeCorrecaoFosforoFornece(){
        Solo solo = new Solo(8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 0.0);        
        Assert.assertEquals(new ItemCorrecaoFornece(34.70, Nutrientes.CALCIO).getValor(),
                new CorrecaoFosforo(12, FontesFosforo.SUPERFOSFATO_SIMPLES, 70, 1260, solo).correcaoElemento()[0].getValor(),0.1);
        Assert.assertEquals(new ItemCorrecaoFornece(34.70, Nutrientes.CALCIO).getDescricao_item(), 
                new CorrecaoFosforo(12, FontesFosforo.SUPERFOSFATO_SIMPLES, 70, 1260, solo).correcaoElemento()[0].getDescricao_item());
        
        Assert.assertEquals(new ItemCorrecaoFornece(12.39, Nutrientes.ENXOFRE).getValor(), 
                new CorrecaoFosforo(12, FontesFosforo.SUPERFOSFATO_SIMPLES, 70, 1260, solo).correcaoElemento()[1].getValor(),0.1);
        Assert.assertEquals(new ItemCorrecaoFornece(12.39, Nutrientes.ENXOFRE).getDescricao_item(), 
                new CorrecaoFosforo(12, FontesFosforo.SUPERFOSFATO_SIMPLES, 70, 1260, solo).correcaoElemento()[1].getDescricao_item());
        
        Assert.assertEquals(new ItemCorrecaoFornece(10.88, Nutrientes.CALCIO).getValor(),
                new CorrecaoFosforo(12, FontesFosforo.SUPERFOSFATO_TRIPLO, 70, 1260, solo).correcaoElemento()[0].getValor(),0.1);
        Assert.assertEquals(new ItemCorrecaoFornece(10.88, Nutrientes.CALCIO).getDescricao_item(), 
                new CorrecaoFosforo(12, FontesFosforo.SUPERFOSFATO_TRIPLO, 70, 1260, solo).correcaoElemento()[0].getDescricao_item());

        Assert.assertEquals(new ItemCorrecaoFornece(4.18, Nutrientes.NITROGENIO).getValor(), 
                new CorrecaoFosforo(12, FontesFosforo.MAP, 70, 1260, solo).correcaoElemento()[0].getValor(),0.1);
        Assert.assertEquals(new ItemCorrecaoFornece(4.18, Nutrientes.NITROGENIO).getDescricao_item(), 
                new CorrecaoFosforo(12, FontesFosforo.MAP, 70, 1260, solo).correcaoElemento()[0].getDescricao_item());
        
        Assert.assertEquals(new ItemCorrecaoFornece(7.93, Nutrientes.NITROGENIO).getValor(), 
                new CorrecaoFosforo(12, FontesFosforo.DAP, 70, 1260, solo).correcaoElemento()[0].getValor(),0.1);
        Assert.assertEquals(new ItemCorrecaoFornece(7.93, Nutrientes.NITROGENIO).getDescricao_item(), 
                new CorrecaoFosforo(12, FontesFosforo.DAP, 70, 1260, solo).correcaoElemento()[0].getDescricao_item());

        Assert.assertEquals(new ItemCorrecaoFornece(18.59, Nutrientes.MAGNESIO).getValor(), 
                new CorrecaoFosforo(12, FontesFosforo.YOORIN, 70, 1260, solo).correcaoElemento()[0].getValor(),0.1);
        Assert.assertEquals(new ItemCorrecaoFornece(18.59, Nutrientes.MAGNESIO).getDescricao_item(), 
                new CorrecaoFosforo(12, FontesFosforo.YOORIN, 70, 1260, solo).correcaoElemento()[0].getDescricao_item());
        Assert.assertEquals(new ItemCorrecaoFornece(34.7, Nutrientes.CALCIO).getValor(),
                new CorrecaoFosforo(12, FontesFosforo.YOORIN, 70, 1260, solo).correcaoElemento()[1].getValor(),0.1);
        Assert.assertEquals(new ItemCorrecaoFornece(34.7, Nutrientes.CALCIO).getDescricao_item(), 
                new CorrecaoFosforo(12, FontesFosforo.YOORIN, 70, 1260, solo).correcaoElemento()[1].getDescricao_item());
       
        Assert.assertEquals(new ItemCorrecaoFornece(35.15, Nutrientes.CALCIO).getValor(), 
                new CorrecaoFosforo(12, FontesFosforo.FOSFATO_ARAD, 70, 1260, solo).correcaoElemento()[0].getValor(),0.1);
        Assert.assertEquals(new ItemCorrecaoFornece(35.15, Nutrientes.CALCIO).getDescricao_item(), 
                new CorrecaoFosforo(12, FontesFosforo.FOSFATO_ARAD, 70, 1260, solo).correcaoElemento()[0].getDescricao_item());
        
        Assert.assertEquals(new ItemCorrecaoFornece(40.00, Nutrientes.CALCIO).getValor(), 
                new CorrecaoFosforo(12, FontesFosforo.FOSFATO_GAFSA, 70, 1260, solo).correcaoElemento()[0].getValor(),0.1);
        Assert.assertEquals(new ItemCorrecaoFornece(40.00, Nutrientes.CALCIO).getDescricao_item(), 
                new CorrecaoFosforo(12, FontesFosforo.FOSFATO_GAFSA, 70, 1260, solo).correcaoElemento()[0].getDescricao_item());

        Assert.assertEquals(new ItemCorrecaoFornece(31.37, Nutrientes.CALCIO).getValor(), new CorrecaoFosforo(12, FontesFosforo.FOSFATO_DAOUI, 70, 1260, solo).correcaoElemento()[0].getValor(),0.1);
        Assert.assertEquals(new ItemCorrecaoFornece(31.37, Nutrientes.CALCIO).getDescricao_item(), new CorrecaoFosforo(12, FontesFosforo.FOSFATO_DAOUI, 70, 1260, solo).correcaoElemento()[0].getDescricao_item());
        
        Assert.assertEquals(new ItemCorrecaoFornece(26.02, Nutrientes.CALCIO).getValor(), new CorrecaoFosforo(12, FontesFosforo.FOSF_PATOS_MINAS, 70, 1260, solo).correcaoElemento()[0].getValor(),0.1);
        Assert.assertEquals(new ItemCorrecaoFornece(26.02, Nutrientes.CALCIO).getDescricao_item(), new CorrecaoFosforo(12, FontesFosforo.FOSF_PATOS_MINAS, 70, 1260, solo).correcaoElemento()[0].getDescricao_item());
        
        Assert.assertEquals(new ItemCorrecaoFornece(53.06, Nutrientes.CALCIO).getValor(),
                new CorrecaoFosforo(12, FontesFosforo.ESCORIA_THOMAS, 70, 1260, solo).correcaoElemento()[0].getValor(),0.1);
        Assert.assertEquals(new ItemCorrecaoFornece(53.06, Nutrientes.CALCIO).getDescricao_item(),
                new CorrecaoFosforo(12, FontesFosforo.ESCORIA_THOMAS, 70, 1260, solo).correcaoElemento()[0].getDescricao_item());
        
        Assert.assertEquals(new ItemCorrecaoFornece(0.0, null).getValor(), new CorrecaoFosforo(12, FontesFosforo.ACIDO_FOSFORICO, 70, 1260, solo).correcaoElemento()[0].getValor(),0.1);
        Assert.assertEquals(new ItemCorrecaoFornece(0.0, null).getDescricao_item(), new CorrecaoFosforo(12, FontesFosforo.ACIDO_FOSFORICO, 70, 1260, solo).correcaoElemento()[0].getDescricao_item());

        Assert.assertEquals(new ItemCorrecaoFornece(13.63, Nutrientes.ENXOFRE).getValor(), 
                new CorrecaoFosforo(12, FontesFosforo.MULTIF_MAGNESIANO, 70, 1260, solo).correcaoElemento()[0].getValor(),0.1);
        Assert.assertEquals(new ItemCorrecaoFornece(13.63, Nutrientes.ENXOFRE).getDescricao_item(), 
                new CorrecaoFosforo(12, FontesFosforo.MULTIF_MAGNESIANO, 70, 1260, solo).correcaoElemento()[0].getDescricao_item());
        Assert.assertEquals(new ItemCorrecaoFornece(22.31, Nutrientes.CALCIO).getValor(), 
                new CorrecaoFosforo(12, FontesFosforo.MULTIF_MAGNESIANO, 70, 1260, solo).correcaoElemento()[1].getValor(),0.1);
        Assert.assertEquals(new ItemCorrecaoFornece(22.31, Nutrientes.CALCIO).getDescricao_item(), 
                new CorrecaoFosforo(12, FontesFosforo.MULTIF_MAGNESIANO, 70, 1260, solo).correcaoElemento()[1].getDescricao_item());
}
    
    @Test
    public void testeCustoAlqueire(){
        Solo solo = new Solo(8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 0.0);
        Assert.assertEquals(156.17, new CorrecaoFosforo(12, FontesFosforo.SUPERFOSFATO_SIMPLES, 70, 1260, solo).calcularCustoAlqueire(),0.1);
        
        Assert.assertEquals(68.56, new CorrecaoFosforo(12, FontesFosforo.SUPERFOSFATO_TRIPLO, 70, 1260, solo).calcularCustoAlqueire(),0.1);
        
        Assert.assertEquals(58.56, new CorrecaoFosforo(12, FontesFosforo.MAP, 70, 1260, solo).calcularCustoAlqueire(),0.1);
        
        Assert.assertEquals(62.46, new CorrecaoFosforo(12, FontesFosforo.DAP, 70, 1260, solo).calcularCustoAlqueire(),0.1);
        
        Assert.assertEquals(156.17, new CorrecaoFosforo(12, FontesFosforo.YOORIN, 70, 1260, solo).calcularCustoAlqueire(),0.1);
        
        Assert.assertEquals(85.18, new CorrecaoFosforo(12, FontesFosforo.FOSFATO_ARAD, 70, 1260, solo).calcularCustoAlqueire(),0.1);
        
        Assert.assertEquals(96.93, new CorrecaoFosforo(12, FontesFosforo.FOSFATO_GAFSA, 70, 1260, solo).calcularCustoAlqueire(),0.1);
        
        Assert.assertEquals(87.84, new CorrecaoFosforo(12, FontesFosforo.FOSFATO_DAOUI, 70, 1260, solo).calcularCustoAlqueire(),0.1);
        
        Assert.assertEquals(117.12, new CorrecaoFosforo(12, FontesFosforo.FOSF_PATOS_MINAS, 70, 1260, solo).calcularCustoAlqueire(),0.1);
        
        Assert.assertEquals(151.94, new CorrecaoFosforo(12, FontesFosforo.ESCORIA_THOMAS, 70, 1260, solo).calcularCustoAlqueire(),0.1);
        
        Assert.assertEquals(54.05, new CorrecaoFosforo(12, FontesFosforo.ACIDO_FOSFORICO, 70, 1260, solo).calcularCustoAlqueire(),0.1);
        
        Assert.assertEquals(156.17, new CorrecaoFosforo(12, FontesFosforo.MULTIF_MAGNESIANO, 70, 1260, solo).calcularCustoAlqueire(),0.1);

    }
    
}
