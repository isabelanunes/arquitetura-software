/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import model.CorrecaoPotassio;
import model.FontesPotassio;
import model.ItemCorrecaoFornece;
import model.Nutrientes;
import model.Solo;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Isabela Nunes
 */
public class CorrecaoPotassioTest {
    
    @Test
    public void testeParticipacaoPotassioAtual(){
       Assert.assertEquals(1.2, new CorrecaoPotassio(3.0, new Solo(8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35), FontesPotassio.CLORETO_POTASSIO, 2500.00).participacaoPotassioAtual(), 0.1);
    }
    
    @Test
    public void testeParticipacaoPotassioCorrecao(){
       Assert.assertEquals(3.0, new CorrecaoPotassio(3.0, new Solo(8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35), FontesPotassio.CLORETO_POTASSIO, 2500.00).participacaoPotassioCorrecao(), 0.1);
    }
    
    @Test
    public void testeParticipacaoPotassioPercentualIdeal(){
       Assert.assertEquals(3.0, new CorrecaoPotassio(3.0, new Solo(8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35), FontesPotassio.CLORETO_POTASSIO, 2500.00).participacaoPotassioPercentualIdeal(), 0.1);
    }
    
    @Test
    public void testeQuantidadeAplicarPotassio(){
       Solo solo = new Solo(8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35);
       
       Assert.assertEquals(450.55, new CorrecaoPotassio(3.0, new Solo(8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35), FontesPotassio.CLORETO_POTASSIO, 2500.00).quantidadeAplicarElemento(), 0.1);
       
       Assert.assertEquals(502.53, new CorrecaoPotassio(3.0, solo, FontesPotassio.SULFATO_POTASSIO, 2500.00).quantidadeAplicarElemento(), 0.1);
       
       Assert.assertEquals(1187.80, new CorrecaoPotassio(3.0, solo, FontesPotassio.SULFATO_POTASSIO_MAGNESIO, 2500.00).quantidadeAplicarElemento(), 0.1); 
    }

    @Test
    public void testeCorrecaoPotassioFornece(){
        Solo solo = new Solo(8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35);

        Assert.assertEquals(new ItemCorrecaoFornece(85.43, Nutrientes.ENXOFRE).getValor(), 
                new CorrecaoPotassio(3.0, solo, FontesPotassio.SULFATO_POTASSIO, 2500.00).correcaoElemento()[0].getValor(),0.1);
        Assert.assertEquals(new ItemCorrecaoFornece(85.43, Nutrientes.ENXOFRE).getDescricao_item(), 
                new CorrecaoPotassio(3.0, solo, FontesPotassio.SULFATO_POTASSIO, 2500.00).correcaoElemento()[0].getDescricao_item());
   
        Assert.assertEquals(new ItemCorrecaoFornece(261.32, Nutrientes.ENXOFRE).getValor(), 
                new CorrecaoPotassio(3.0, solo, FontesPotassio.SULFATO_POTASSIO_MAGNESIO, 2500.00).correcaoElemento()[0].getValor(),0.1);
        Assert.assertEquals(new ItemCorrecaoFornece(261.32, Nutrientes.ENXOFRE).getDescricao_item(), 
                new CorrecaoPotassio(3.0, solo, FontesPotassio.SULFATO_POTASSIO_MAGNESIO, 2500.00).correcaoElemento()[0].getDescricao_item());
        Assert.assertEquals(new ItemCorrecaoFornece(213.80, Nutrientes.MAGNESIO).getValor(), 
                new CorrecaoPotassio(3.0, solo, FontesPotassio.SULFATO_POTASSIO_MAGNESIO, 2500.00).correcaoElemento()[1].getValor(),0.1);
        Assert.assertEquals(new ItemCorrecaoFornece(213.80, Nutrientes.MAGNESIO).getDescricao_item(), 
                new CorrecaoPotassio(3.0, solo, FontesPotassio.SULFATO_POTASSIO_MAGNESIO, 2500.00).correcaoElemento()[1].getDescricao_item());
    } 
    
    @Test
    public void testeCustoAlqueire(){
       Solo solo = new Solo(8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35);
       Assert.assertEquals(1126.37, new CorrecaoPotassio(3.0, solo, FontesPotassio.CLORETO_POTASSIO, 2500.00).calcularCustoAlqueire(), 0.1);
       
       Assert.assertEquals(1256.33, new CorrecaoPotassio(3.0, solo, FontesPotassio.SULFATO_POTASSIO, 2500.00).calcularCustoAlqueire(), 0.1);
       
       Assert.assertEquals(2969.51, new CorrecaoPotassio(3.0, solo, FontesPotassio.SULFATO_POTASSIO_MAGNESIO, 2500.00).calcularCustoAlqueire(), 0.1);
    }
    
}
