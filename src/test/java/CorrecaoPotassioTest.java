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
       Solo solo = new Solo(8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35);
       CorrecaoPotassio correcaoPotassio = new CorrecaoPotassio(3.0, solo, FontesPotassio.CLORETO_POTASSIO, 2500.00);
       Assert.assertEquals(1.2, correcaoPotassio.participacaoPotassioAtual(), 0.1);
    }
    
    @Test
    public void testeParticipacaoPotassioCorrecao(){
       Solo solo = new Solo(8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35);
       CorrecaoPotassio correcaoPotassio = new CorrecaoPotassio(3.0, solo, FontesPotassio.CLORETO_POTASSIO, 2500.00);
       Assert.assertEquals(3.0, correcaoPotassio.participacaoPotassioCorrecao(), 0.1);
    }
    
    @Test
    public void testeParticipacaoPotassioPercentualIdeal(){
       Solo solo = new Solo(8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35);
       CorrecaoPotassio correcaoPotassio = new CorrecaoPotassio(3.0, solo, FontesPotassio.CLORETO_POTASSIO, 2500.00);
       Assert.assertEquals(3.0, correcaoPotassio.participacaoPotassioPercentualIdeal(), 0.1);
    }
    
    @Test
    public void testeQuantidadeAplicarPotassio(){
        
       Solo solo = new Solo(8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35);
       CorrecaoPotassio correcaoPotassio = new CorrecaoPotassio(3.0, solo, FontesPotassio.CLORETO_POTASSIO, 2500.00);
       Assert.assertEquals(450.55, correcaoPotassio.quantidadeAplicarElemento(), 0.1);
       
       correcaoPotassio = new CorrecaoPotassio(3.0, solo, FontesPotassio.SULFATO_POTASSIO, 2500.00);
       Assert.assertEquals(502.53, correcaoPotassio.quantidadeAplicarElemento(), 0.1);
       
       correcaoPotassio = new CorrecaoPotassio(3.0, solo, FontesPotassio.SULFATO_POTASSIO_MAGNESIO, 2500.00);
       Assert.assertEquals(1187.80, correcaoPotassio.quantidadeAplicarElemento(), 0.1); 
    }

    @Test
    public void testeCorrecaoPotassioFornece(){
        Solo solo = new Solo(8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35);
        CorrecaoPotassio correcaoPotassio = new CorrecaoPotassio(3.0, solo, FontesPotassio.SULFATO_POTASSIO, 2500.00);
        ItemCorrecaoFornece itemCorrecao1 = new ItemCorrecaoFornece(85.43, Nutrientes.ENXOFRE);
        ItemCorrecaoFornece[] retornoItemCorrecaoFornece = correcaoPotassio.correcaoElemento();

        Assert.assertEquals(itemCorrecao1.getValor(), retornoItemCorrecaoFornece[0].getValor(),0.1);
        Assert.assertEquals(itemCorrecao1.getDescricao_item(), retornoItemCorrecaoFornece[0].getDescricao_item());
   
        correcaoPotassio = new CorrecaoPotassio(3.0, solo, FontesPotassio.SULFATO_POTASSIO_MAGNESIO, 2500.00);
        itemCorrecao1 = new ItemCorrecaoFornece(261.32, Nutrientes.ENXOFRE);
        retornoItemCorrecaoFornece = correcaoPotassio.correcaoElemento();
        Assert.assertEquals(itemCorrecao1.getValor(), retornoItemCorrecaoFornece[0].getValor(),0.1);
        Assert.assertEquals(itemCorrecao1.getDescricao_item(), retornoItemCorrecaoFornece[0].getDescricao_item());
        ItemCorrecaoFornece itemCorrecao2 = new ItemCorrecaoFornece(213.80, Nutrientes.MAGNESIO);
        Assert.assertEquals(itemCorrecao2.getValor(), retornoItemCorrecaoFornece[1].getValor(),0.1);
        Assert.assertEquals(itemCorrecao2.getDescricao_item(), retornoItemCorrecaoFornece[1].getDescricao_item());
    } 
    
    @Test
    public void testeCustoAlqueire(){
       Solo solo = new Solo(8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35);
       CorrecaoPotassio correcaoPotassio = new CorrecaoPotassio(3.0, solo, FontesPotassio.CLORETO_POTASSIO, 2500.00);
       Assert.assertEquals(1126.37, correcaoPotassio.calcularCustoAlqueire(), 0.1);
       
       correcaoPotassio = new CorrecaoPotassio(3.0, solo, FontesPotassio.SULFATO_POTASSIO, 2500.00);
       Assert.assertEquals(1256.33, correcaoPotassio.calcularCustoAlqueire(), 0.1);
       
       correcaoPotassio = new CorrecaoPotassio(3.0, solo, FontesPotassio.SULFATO_POTASSIO_MAGNESIO, 2500.00);
       Assert.assertEquals(2969.51, correcaoPotassio.calcularCustoAlqueire(), 0.1);
    }
    
}
