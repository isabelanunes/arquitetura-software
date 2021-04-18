/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import model.CorrecaoPotassio;
import model.FontesPotassio;
import model.Nutrientes;
import model.Solo;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Isabela Nunes
 */
public class CorrecaoPotassioTest {
    Solo solo = new Solo(8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35);
    
    @Test
    public void testeParticipacaoPotassioAtual(){
       Assert.assertEquals(1.2, new CorrecaoPotassio(2500.00, solo, FontesPotassio.CLORETO_POTASSIO, 3.0).participacaoPotassioAtual(), 0.1);
    }
    
    @Test
    public void testeParticipacaoPotassioCorrecao(){
       Assert.assertEquals(3.0, new CorrecaoPotassio(2500.00, solo, FontesPotassio.CLORETO_POTASSIO, 3.0).participacaoPotassioCorrecao(), 0.1);
    }
    
    @Test
    public void testeParticipacaoPotassioPercentualIdeal(){
       Assert.assertEquals(3.0, new CorrecaoPotassio(2500.00, solo, FontesPotassio.CLORETO_POTASSIO, 3.0).participacaoPotassioPercentualIdeal(), 0.1);
    }
    
    @Test
    public void testeQuantidadeAplicarPotassio(){
       Assert.assertEquals(450.55, new CorrecaoPotassio(2500.00, solo, FontesPotassio.CLORETO_POTASSIO, 3.0).quantidadeAplicarElemento(), 0.1);
       
       Assert.assertEquals(502.53, new CorrecaoPotassio(2500.00, solo, FontesPotassio.SULFATO_POTASSIO, 3.0).quantidadeAplicarElemento(), 0.1);
       
       Assert.assertEquals(1187.80, new CorrecaoPotassio(2500.00, solo, FontesPotassio.SULFATO_POTASSIO_MAGNESIO, 3.0).quantidadeAplicarElemento(), 0.1); 
    }

    @Test
    public void testeCorrecaoPotassioFornece(){
        Assert.assertArrayEquals(new Object[][] {{new double [] {0.0,0.0}},{new Nutrientes[] {null, null}}},  
            new CorrecaoPotassio(2500.00, solo, FontesPotassio.CLORETO_POTASSIO, 3.0).correcaoElemento());

        Assert.assertArrayEquals(new Object[][] {{new double[] {85.43049230769232, 0.0}}, {new Nutrientes[] {Nutrientes.ENXOFRE, null}}}, 
            new CorrecaoPotassio(2500.00, solo, FontesPotassio.SULFATO_POTASSIO, 3.0).correcaoElemento());
        
        Assert.assertArrayEquals(new Object[][] {{new double[] {261.3168, 213.80465454545453}}, {new Nutrientes[] {Nutrientes.ENXOFRE, Nutrientes.MAGNESIO}}}, 
            new CorrecaoPotassio(2500.00, solo, FontesPotassio.SULFATO_POTASSIO_MAGNESIO, 3.0).correcaoElemento());

    
} 
    
    @Test
    public void testeCustoAlqueire(){
       Assert.assertEquals(1126.37, new CorrecaoPotassio(2500.00, solo, FontesPotassio.CLORETO_POTASSIO, 3.0).calcularCustoAlqueire(), 0.1);
       
       Assert.assertEquals(1256.33, new CorrecaoPotassio(2500.00, solo, FontesPotassio.SULFATO_POTASSIO, 3.0).calcularCustoAlqueire(), 0.1);
       
       Assert.assertEquals(2969.51, new CorrecaoPotassio(2500.00, solo, FontesPotassio.SULFATO_POTASSIO_MAGNESIO, 3.0).calcularCustoAlqueire(), 0.1);
    }
    
}
