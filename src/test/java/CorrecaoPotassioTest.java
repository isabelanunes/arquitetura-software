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
import model.TexturaSolo;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Isabela Nunes
 */
public class CorrecaoPotassioTest {
    
    @Test
    public void testeParticipacaoPotassioAtual(){
       Solo solo = new Solo(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35);
       CorrecaoPotassio correcaoPotassio = new CorrecaoPotassio(3.0, solo, FontesPotassio.CLORETO_POTASSIO, 2500.00);
       Assert.assertEquals(1.2, correcaoPotassio.participacaoPotassioAtual(), 0.1);
    }
    
    @Test
    public void testeParticipacaoPotassioCorrecao(){
       Solo solo = new Solo(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35);
       CorrecaoPotassio correcaoPotassio = new CorrecaoPotassio(3.0, solo, FontesPotassio.CLORETO_POTASSIO, 2500.00);
       Assert.assertEquals(3.0, correcaoPotassio.participacaoPotassioCorrecao(), 0.1);
    }
    
    @Test
    public void testeParticipacaoPotassioPercentualIdeal(){
       Solo solo = new Solo(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35);
       CorrecaoPotassio correcaoPotassio = new CorrecaoPotassio(3.0, solo, FontesPotassio.CLORETO_POTASSIO, 2500.00);
       Assert.assertEquals(3.0, correcaoPotassio.participacaoPotassioPercentualIdeal(), 0.1);
    }
    
    @Test
    public void testeQuantidadeAplicarPotassio(){
        
       Solo solo = new Solo(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35);
       CorrecaoPotassio correcaoPotassio = new CorrecaoPotassio(3.0, solo, FontesPotassio.CLORETO_POTASSIO, 2500.00);
       Assert.assertEquals(450.55, correcaoPotassio.quantidadeAplicarPotassio(), 0.1);
       
       correcaoPotassio = new CorrecaoPotassio(3.0, solo, FontesPotassio.SULFATO_POTASSIO, 2500.00);
       Assert.assertEquals(502.53, correcaoPotassio.quantidadeAplicarPotassio(), 0.1);
       
       correcaoPotassio = new CorrecaoPotassio(3.0, solo, FontesPotassio.SULFATO_POTASSIO_MAGNESIO, 2500.00);
       Assert.assertEquals(1187.80, correcaoPotassio.quantidadeAplicarPotassio(), 0.1); 
    }

    @Test
    public void testeCorrecaoPotassioFornece1(){
        Solo solo = new Solo(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35);
        CorrecaoPotassio correcaoPotassio = new CorrecaoPotassio(3.0, solo, FontesPotassio.SULFATO_POTASSIO, 2500.00);
        ItemCorrecaoFornece itemCorrecao = new ItemCorrecaoFornece(85.43, Nutrientes.ENXOFRE);
        Assert.assertEquals(itemCorrecao.getValor(), correcaoPotassio.correcaoPotassioFornece1().getValor(),0.1);
        Assert.assertEquals(itemCorrecao.getDescricao_item(), correcaoPotassio.correcaoPotassioFornece1().getDescricao_item());

        correcaoPotassio = new CorrecaoPotassio(3.0, solo, FontesPotassio.SULFATO_POTASSIO_MAGNESIO, 2500.00);
        itemCorrecao = new ItemCorrecaoFornece(261.32, Nutrientes.ENXOFRE);
        Assert.assertEquals(itemCorrecao.getValor(), correcaoPotassio.correcaoPotassioFornece1().getValor(),0.1);
        Assert.assertEquals(itemCorrecao.getDescricao_item(), correcaoPotassio.correcaoPotassioFornece1().getDescricao_item());
    } 
    
    @Test
    public void testeCorrecaoPotassioFornece2(){
        Solo solo = new Solo(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35);
        CorrecaoPotassio correcaoPotassio = new CorrecaoPotassio(3.0, solo, FontesPotassio.SULFATO_POTASSIO_MAGNESIO, 2500.00);
        ItemCorrecaoFornece itemCorrecao = new ItemCorrecaoFornece(213.80, Nutrientes.MAGNESIO);
        Assert.assertEquals(itemCorrecao.getValor(), correcaoPotassio.correcaoPotassioFornece2().getValor(),0.1);
        Assert.assertEquals(itemCorrecao.getDescricao_item(), correcaoPotassio.correcaoPotassioFornece2().getDescricao_item());
    } 
    
    @Test
    public void testeCustoAlqueire(){
       Solo solo = new Solo(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35);
       CorrecaoPotassio correcaoPotassio = new CorrecaoPotassio(3.0, solo, FontesPotassio.CLORETO_POTASSIO, 2500.00);
       Assert.assertEquals(1126.37, correcaoPotassio.custoAlqueirePotassio(), 0.1);
       
       correcaoPotassio = new CorrecaoPotassio(3.0, solo, FontesPotassio.SULFATO_POTASSIO, 2500.00);
       Assert.assertEquals(1256.33, correcaoPotassio.custoAlqueirePotassio(), 0.1);
       
       correcaoPotassio = new CorrecaoPotassio(3.0, solo, FontesPotassio.SULFATO_POTASSIO_MAGNESIO, 2500.00);
       Assert.assertEquals(2969.51, correcaoPotassio.custoAlqueirePotassio(), 0.1);
    }
    
}
