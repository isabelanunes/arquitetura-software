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
import model.TexturaSolo;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Isabela Nunes
 */
public class CorrecaoFosforoTest {
    
    @Test
    public void testeQuantidadeAplicarFosforo(){
        Solo solo = new Solo(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 0.0);
        CorrecaoFosforo correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.SUPERFOSFATO_SIMPLES, 70, 1260, solo);
        Assert.assertEquals(123.95, correcaoFosforo.quantidadeAplicarFosforo(), 0.1);
        
        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.SUPERFOSFATO_TRIPLO, 70, 1260, solo);
        Assert.assertEquals(54.41, correcaoFosforo.quantidadeAplicarFosforo(), 0.1);
        
        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.MAP, 70, 1260, solo);
        Assert.assertEquals(46.48, correcaoFosforo.quantidadeAplicarFosforo(), 0.1);
        
        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.DAP, 70, 1260, solo);
        Assert.assertEquals(49.58, correcaoFosforo.quantidadeAplicarFosforo(), 0.1);
        
        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.YOORIN, 70, 1260, solo);
        Assert.assertEquals(123.95, correcaoFosforo.quantidadeAplicarFosforo(), 0.1);
        
        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.FOSFATO_ARAD, 70, 1260, solo);
        Assert.assertEquals(67.60, correcaoFosforo.quantidadeAplicarFosforo(), 0.1);
        
        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.FOSFATO_GAFSA, 70, 1260, solo);
        Assert.assertEquals(76.93, correcaoFosforo.quantidadeAplicarFosforo(), 0.1);
        
        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.FOSFATO_DAOUI, 70, 1260, solo);
        Assert.assertEquals(69.72, correcaoFosforo.quantidadeAplicarFosforo(), 0.1);
        
        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.FOSF_PATOS_MINAS, 70, 1260, solo);
        Assert.assertEquals(92.96, correcaoFosforo.quantidadeAplicarFosforo(), 0.1);
        
        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.ESCORIA_THOMAS, 70, 1260, solo);
        Assert.assertEquals(120.60, correcaoFosforo.quantidadeAplicarFosforo(), 0.1);
        
        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.ACIDO_FOSFORICO, 70, 1260, solo);
        Assert.assertEquals(42.90, correcaoFosforo.quantidadeAplicarFosforo(), 0.1);
        
        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.MULTIF_MAGNESIANO, 70, 1260, solo);
        Assert.assertEquals(123.95, correcaoFosforo.quantidadeAplicarFosforo(), 0.1);
    }

    @Test
    public void testeCorrecaoFosforoFornece(){
        Solo solo = new Solo(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 0.0);
        CorrecaoFosforo correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.SUPERFOSFATO_SIMPLES, 70, 1260, solo);
        ItemCorrecaoFornece itemCorrecao1 = new ItemCorrecaoFornece(34.70, Nutrientes.CALCIO);
        ItemCorrecaoFornece itemCorrecao2 = new ItemCorrecaoFornece(12.39, Nutrientes.ENXOFRE);
        ItemCorrecaoFornece[] retornoItemCorrecaoFornece = correcaoFosforo.correcaoFosforoFornece();
        Assert.assertEquals(itemCorrecao1.getValor(), retornoItemCorrecaoFornece[0].getValor(),0.1);
        Assert.assertEquals(itemCorrecao1.getDescricao_item(), retornoItemCorrecaoFornece[0].getDescricao_item());
        
        Assert.assertEquals(itemCorrecao2.getValor(), retornoItemCorrecaoFornece[1].getValor(),0.1);
        Assert.assertEquals(itemCorrecao2.getDescricao_item(), retornoItemCorrecaoFornece[1].getDescricao_item());
        
        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.SUPERFOSFATO_TRIPLO, 70, 1260, solo);
        itemCorrecao1 = new ItemCorrecaoFornece(10.88, Nutrientes.CALCIO);
        retornoItemCorrecaoFornece = correcaoFosforo.correcaoFosforoFornece();
        Assert.assertEquals(itemCorrecao1.getValor(), retornoItemCorrecaoFornece[0].getValor(),0.1);
        Assert.assertEquals(itemCorrecao1.getDescricao_item(), retornoItemCorrecaoFornece[0].getDescricao_item());

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.MAP, 70, 1260, solo);
        itemCorrecao1 = new ItemCorrecaoFornece(4.18, Nutrientes.NITROGENIO);
        retornoItemCorrecaoFornece = correcaoFosforo.correcaoFosforoFornece();
        Assert.assertEquals(itemCorrecao1.getValor(), retornoItemCorrecaoFornece[0].getValor(),0.1);
        Assert.assertEquals(itemCorrecao1.getDescricao_item(), retornoItemCorrecaoFornece[0].getDescricao_item());
        
        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.DAP, 70, 1260, solo);
        itemCorrecao1 = new ItemCorrecaoFornece(7.93, Nutrientes.NITROGENIO);
        retornoItemCorrecaoFornece = correcaoFosforo.correcaoFosforoFornece();
        Assert.assertEquals(itemCorrecao1.getValor(), retornoItemCorrecaoFornece[0].getValor(),0.1);
        Assert.assertEquals(itemCorrecao1.getDescricao_item(), retornoItemCorrecaoFornece[0].getDescricao_item());

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.YOORIN, 70, 1260, solo);
        itemCorrecao1 = new ItemCorrecaoFornece(34.70, Nutrientes.CALCIO);
        retornoItemCorrecaoFornece = correcaoFosforo.correcaoFosforoFornece();
        Assert.assertEquals(itemCorrecao1.getValor(), retornoItemCorrecaoFornece[0].getValor(),0.1);
        Assert.assertEquals(itemCorrecao1.getDescricao_item(), retornoItemCorrecaoFornece[0].getDescricao_item());
        itemCorrecao2 = new ItemCorrecaoFornece(18.59, Nutrientes.MAGNESIO);
        Assert.assertEquals(itemCorrecao2.getValor(), retornoItemCorrecaoFornece[1].getValor(),0.1);
        Assert.assertEquals(itemCorrecao2.getDescricao_item(), retornoItemCorrecaoFornece[1].getDescricao_item());
        
        
        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.FOSFATO_ARAD, 70, 1260, solo);
        itemCorrecao1 = new ItemCorrecaoFornece(35.15, Nutrientes.CALCIO);
        retornoItemCorrecaoFornece = correcaoFosforo.correcaoFosforoFornece();
        Assert.assertEquals(itemCorrecao1.getValor(), retornoItemCorrecaoFornece[0].getValor(),0.1);
        Assert.assertEquals(itemCorrecao1.getDescricao_item(), retornoItemCorrecaoFornece[0].getDescricao_item());
        
        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.FOSFATO_GAFSA, 70, 1260, solo);
        itemCorrecao1 = new ItemCorrecaoFornece(40.00, Nutrientes.CALCIO);
        retornoItemCorrecaoFornece = correcaoFosforo.correcaoFosforoFornece();
        Assert.assertEquals(itemCorrecao1.getValor(), retornoItemCorrecaoFornece[0].getValor(),0.1);
        Assert.assertEquals(itemCorrecao1.getDescricao_item(), retornoItemCorrecaoFornece[0].getDescricao_item());

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.FOSFATO_DAOUI, 70, 1260, solo);
        itemCorrecao1 = new ItemCorrecaoFornece(31.37, Nutrientes.CALCIO);
        retornoItemCorrecaoFornece = correcaoFosforo.correcaoFosforoFornece();
        Assert.assertEquals(itemCorrecao1.getValor(), retornoItemCorrecaoFornece[0].getValor(),0.1);
        Assert.assertEquals(itemCorrecao1.getDescricao_item(), retornoItemCorrecaoFornece[0].getDescricao_item());
        
        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.FOSF_PATOS_MINAS, 70, 1260, solo);
        itemCorrecao1 = new ItemCorrecaoFornece(26.02, Nutrientes.CALCIO);
        retornoItemCorrecaoFornece = correcaoFosforo.correcaoFosforoFornece();
        Assert.assertEquals(itemCorrecao1.getValor(), retornoItemCorrecaoFornece[0].getValor(),0.1);
        Assert.assertEquals(itemCorrecao1.getDescricao_item(), retornoItemCorrecaoFornece[0].getDescricao_item());
        
        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.ESCORIA_THOMAS, 70, 1260, solo);
        itemCorrecao1 = new ItemCorrecaoFornece(53.06, Nutrientes.CALCIO);
        retornoItemCorrecaoFornece = correcaoFosforo.correcaoFosforoFornece();
        Assert.assertEquals(itemCorrecao1.getValor(), retornoItemCorrecaoFornece[0].getValor(),0.1);
        Assert.assertEquals(itemCorrecao1.getDescricao_item(), retornoItemCorrecaoFornece[0].getDescricao_item());
        
        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.ACIDO_FOSFORICO, 70, 1260, solo);
        itemCorrecao1 = new ItemCorrecaoFornece(0.0, null);
        retornoItemCorrecaoFornece = correcaoFosforo.correcaoFosforoFornece();
        Assert.assertEquals(itemCorrecao1.getValor(), retornoItemCorrecaoFornece[0].getValor(),0.1);
        Assert.assertEquals(itemCorrecao1.getDescricao_item(), retornoItemCorrecaoFornece[0].getDescricao_item());

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.MULTIF_MAGNESIANO, 70, 1260, solo);
        itemCorrecao1 = new ItemCorrecaoFornece(22.31, Nutrientes.CALCIO);
        retornoItemCorrecaoFornece = correcaoFosforo.correcaoFosforoFornece();
        Assert.assertEquals(itemCorrecao1.getValor(), retornoItemCorrecaoFornece[0].getValor(),0.1);
        Assert.assertEquals(itemCorrecao1.getDescricao_item(), retornoItemCorrecaoFornece[0].getDescricao_item());
        itemCorrecao2 = new ItemCorrecaoFornece(13.63, Nutrientes.ENXOFRE);
        Assert.assertEquals(itemCorrecao2.getValor(), retornoItemCorrecaoFornece[1].getValor(),0.1);
        Assert.assertEquals(itemCorrecao2.getDescricao_item(), retornoItemCorrecaoFornece[1].getDescricao_item());
}
    
    @Test
    public void testeCustoAlqueire(){
        Solo solo = new Solo(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 0.0);
        CorrecaoFosforo correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.SUPERFOSFATO_SIMPLES, 70, 1260, solo);
        Assert.assertEquals(156.17, correcaoFosforo.custoAlqueireFosforo(),0.1);
        
        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.SUPERFOSFATO_TRIPLO, 70, 1260, solo);
        Assert.assertEquals(68.56, correcaoFosforo.custoAlqueireFosforo(),0.1);
        
        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.MAP, 70, 1260, solo);
        Assert.assertEquals(58.56, correcaoFosforo.custoAlqueireFosforo(),0.1);
        
        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.DAP, 70, 1260, solo);
        Assert.assertEquals(62.46, correcaoFosforo.custoAlqueireFosforo(),0.1);
        
        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.YOORIN, 70, 1260, solo);
        Assert.assertEquals(156.17, correcaoFosforo.custoAlqueireFosforo(),0.1);
        
        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.FOSFATO_ARAD, 70, 1260, solo);
        Assert.assertEquals(85.18, correcaoFosforo.custoAlqueireFosforo(),0.1);
        
        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.FOSFATO_GAFSA, 70, 1260, solo);
        Assert.assertEquals(96.93, correcaoFosforo.custoAlqueireFosforo(),0.1);
        
        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.FOSFATO_DAOUI, 70, 1260, solo);
        Assert.assertEquals(87.84, correcaoFosforo.custoAlqueireFosforo(),0.1);
        
        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.FOSF_PATOS_MINAS, 70, 1260, solo);
        Assert.assertEquals(117.12, correcaoFosforo.custoAlqueireFosforo(),0.1);
        
        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.ESCORIA_THOMAS, 70, 1260, solo);
        Assert.assertEquals(151.94, correcaoFosforo.custoAlqueireFosforo(),0.1);
        
        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.ACIDO_FOSFORICO, 70, 1260, solo);
        Assert.assertEquals(54.05, correcaoFosforo.custoAlqueireFosforo(),0.1);
        
        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.MULTIF_MAGNESIANO, 70, 1260, solo);
        Assert.assertEquals(156.17, correcaoFosforo.custoAlqueireFosforo(),0.1);

    }
    
}
