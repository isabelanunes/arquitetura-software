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
    
    public double valorFonteFosforo(FontesFosforo fontesFosforo){
        switch(fonteFosforo){
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
                (this.eficienciaFosforo / 100) * (100 / this.valorFonteFosforo(this.fonteFosforo));
        if (necessidadeAdicionar > 0.01)
            return quantidadeAplicar;
        else
            return 0.0;
    }
    
    public ItemCorrecaoFornece[] correcaoFosforoFornece(){
        ItemCorrecaoFornece[] itemCorrecaoFornece = new ItemCorrecaoFornece[2];
        switch(this.fonteFosforo){
            case SUPERFOSFATO_SIMPLES:
                itemCorrecaoFornece[0] = new ItemCorrecaoFornece(this.quantidadeAplicarFosforo()*0.28, Nutrientes.CALCIO);
                itemCorrecaoFornece[1] = new ItemCorrecaoFornece(this.quantidadeAplicarFosforo()*0.1, Nutrientes.ENXOFRE);
                return itemCorrecaoFornece;
           case SUPERFOSFATO_TRIPLO:
                itemCorrecaoFornece[0] = new ItemCorrecaoFornece(this.quantidadeAplicarFosforo()*0.2, Nutrientes.CALCIO);
                return itemCorrecaoFornece;
            case MAP:
                itemCorrecaoFornece[0] = new ItemCorrecaoFornece(this.quantidadeAplicarFosforo()*0.09, Nutrientes.NITROGENIO);
                return itemCorrecaoFornece;
            case DAP:
                itemCorrecaoFornece[0] = new ItemCorrecaoFornece(this.quantidadeAplicarFosforo()*0.16, Nutrientes.NITROGENIO);
                return itemCorrecaoFornece;
            case YOORIN:
                itemCorrecaoFornece[0] = new ItemCorrecaoFornece(this.quantidadeAplicarFosforo()*0.15, Nutrientes.MAGNESIO);
                itemCorrecaoFornece[1] = new ItemCorrecaoFornece(this.quantidadeAplicarFosforo()*0.28, Nutrientes.CALCIO);
                return itemCorrecaoFornece;
            case FOSFATO_ARAD:
            case FOSFATO_GAFSA:
                itemCorrecaoFornece[0] = new ItemCorrecaoFornece(this.quantidadeAplicarFosforo()*0.52, Nutrientes.CALCIO);
                return itemCorrecaoFornece;
            case FOSFATO_DAOUI:
                itemCorrecaoFornece[0] = new ItemCorrecaoFornece(this.quantidadeAplicarFosforo()*0.45, Nutrientes.CALCIO);
                return itemCorrecaoFornece;
            case FOSF_PATOS_MINAS:
                itemCorrecaoFornece[0] = new ItemCorrecaoFornece(this.quantidadeAplicarFosforo()*0.28, Nutrientes.CALCIO);
                return itemCorrecaoFornece;
            case ESCORIA_THOMAS:
                itemCorrecaoFornece[0] = new ItemCorrecaoFornece(this.quantidadeAplicarFosforo()*0.44, Nutrientes.CALCIO);
                return itemCorrecaoFornece;
            case ACIDO_FOSFORICO:
                itemCorrecaoFornece[0] = new ItemCorrecaoFornece(0.0, null);
                return itemCorrecaoFornece;
            case MULTIF_MAGNESIANO:
                itemCorrecaoFornece[0] = new ItemCorrecaoFornece(this.quantidadeAplicarFosforo()*0.11, Nutrientes.ENXOFRE);
                itemCorrecaoFornece[1] = new ItemCorrecaoFornece(this.quantidadeAplicarFosforo()*0.18, Nutrientes.CALCIO);
                return itemCorrecaoFornece;
            default:
                return null;
        }        
    }
    
    public double custoAlqueireFosforo(){
        return (this.valorFonteFosforo * this.quantidadeAplicarFosforo()/1000);
    }
    
}
