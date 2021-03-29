/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.DecimalFormat;

/**
 *
 * @author Isabela Nunes
 */
public class CorrecaoFosforo {
    private double teorFosforoAtingir;
    private FontesFosforo fonteFosforo;
    private double eficienciaFosforo;
    private double valorFonteFosforo;
    private Solo solo;

    public CorrecaoFosforo(double teorFosforoAtingir, FontesFosforo fonteFosforo, double eficienciaFosforo, double valorFonteFosforo, Solo solo) {
        this.teorFosforoAtingir = teorFosforoAtingir;
        this.fonteFosforo = fonteFosforo;
        this.eficienciaFosforo = eficienciaFosforo;
        this.valorFonteFosforo = valorFonteFosforo;
        this.solo = solo;
    }
    
    public double valorFonteFosforo(){
        switch(this.fonteFosforo){
            case SUPERFOSFATO_SIMPLES:
                return 18.0;
            case SUPERFOSFATO_TRIPLO:
                return 41.0;
            case MAP:
                return 48.0;
            case DAP:
                return 45.0;
            case YOORIN:
                return 18.0;
            case FOSFATO_ARAD: 
                return 33.0;
            case FOSFATO_GAFSA:
                return 29.0;
            case FOSFATO_DAOUI:
                return 32.0;
            case FOSF_PATOS_MINAS:
                return 24.0;
            case ESCORIA_THOMAS:
                return 18.5;
            case ACIDO_FOSFORICO:
                return 52.0;
            case MULTIF_MAGNESIANO:
                return 18.0;
            default:
                return 0.0;
        }
    }
    
    public double quantidadeAplicarFosforo(){
        double necessidadeAdicionar = this.teorFosforoAtingir - this.solo.getFosforo();
        double quantidadeAplicar = (necessidadeAdicionar * 2 * 2.29) /
                (this.eficienciaFosforo / 100) * (100 / this.valorFonteFosforo());
        if (necessidadeAdicionar > 0.01)
            return quantidadeAplicar;
        else
            return 0.0;
    }
    
    public ItemCorrecaoFosforoFornece correcaoFosforoFornece1(){
        double valorItem;
        switch (this.fonteFosforo){
            case YOORIN:
                valorItem = this.quantidadeAplicarFosforo()*0.15;
                return new ItemCorrecaoFosforoFornece(valorItem, Nutrientes.MAGNESIO);
            case SUPERFOSFATO_SIMPLES:
                valorItem = this.quantidadeAplicarFosforo()*0.1;
                return new ItemCorrecaoFosforoFornece(valorItem, Nutrientes.ENXOFRE);
            case MULTIF_MAGNESIANO:
                valorItem = this.quantidadeAplicarFosforo()*0.11;
                return new ItemCorrecaoFosforoFornece(valorItem, Nutrientes.ENXOFRE);     
            default:
                return null;
        }        
    } 
    
    public ItemCorrecaoFosforoFornece correcaoFosforoFornece2(){
        double valorItem;
        switch(this.fonteFosforo){
            case SUPERFOSFATO_SIMPLES:
                valorItem = this.quantidadeAplicarFosforo()*0.28;
                return new ItemCorrecaoFosforoFornece(valorItem, Nutrientes.CALCIO);
            case SUPERFOSFATO_TRIPLO:
                valorItem = this.quantidadeAplicarFosforo()*0.2;
                return new ItemCorrecaoFosforoFornece(valorItem, Nutrientes.CALCIO);
            case MAP:
                valorItem = this.quantidadeAplicarFosforo()*0.09;
                return new ItemCorrecaoFosforoFornece(valorItem, Nutrientes.NITROGENIO);
            case DAP:
                valorItem = this.quantidadeAplicarFosforo()*0.16;
                return new ItemCorrecaoFosforoFornece(valorItem, Nutrientes.NITROGENIO);
            case YOORIN:
                valorItem = this.quantidadeAplicarFosforo()*0.28;
                return new ItemCorrecaoFosforoFornece(valorItem, Nutrientes.CALCIO);
            case FOSFATO_ARAD:
                valorItem = this.quantidadeAplicarFosforo()*0.52;
                return new ItemCorrecaoFosforoFornece(valorItem, Nutrientes.CALCIO);
            case FOSFATO_GAFSA:
                valorItem = this.quantidadeAplicarFosforo()*0.52;
                return new ItemCorrecaoFosforoFornece(valorItem, Nutrientes.CALCIO);
            case FOSFATO_DAOUI:
                valorItem = this.quantidadeAplicarFosforo()*0.45;
                return new ItemCorrecaoFosforoFornece(valorItem, Nutrientes.CALCIO);
            case FOSF_PATOS_MINAS:
                valorItem = this.quantidadeAplicarFosforo()*0.28;
                return new ItemCorrecaoFosforoFornece(valorItem, Nutrientes.CALCIO);
            case ESCORIA_THOMAS:
                valorItem = this.quantidadeAplicarFosforo()*0.44;
                return new ItemCorrecaoFosforoFornece(valorItem, Nutrientes.CALCIO);
            case ACIDO_FOSFORICO:
                valorItem = 0.0;
                return new ItemCorrecaoFosforoFornece(valorItem, null);
            case MULTIF_MAGNESIANO:
                valorItem = this.quantidadeAplicarFosforo()*0.18;
                return new ItemCorrecaoFosforoFornece(valorItem, Nutrientes.CALCIO);
            default:
                return null;
        }        
    }
    
    public double custoAlqueire(){
        return (this.valorFonteFosforo * this.quantidadeAplicarFosforo()/1000);
    }
    
}
