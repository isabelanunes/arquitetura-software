/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Isabela Nunes
 */
public class CorrecaoPotassio {
    private double participacaoPotassioDesejada;
    private Solo solo;
    private FontesPotassio fontePotassio;

    public CorrecaoPotassio(double participacaoPotassioDesejada, Solo solo, FontesPotassio fontePotassio) {
        this.participacaoPotassioDesejada = participacaoPotassioDesejada;
        this.solo = solo;
        this.fontePotassio = fontePotassio;
    }
    
    public double participacaoPotassioAtual(){
        double participacao = this.solo.getPotassio() / 
                (this.solo.getCalcio() + this.solo.getMagnesio() + this.solo.getAcidez())*100;
        return participacao;
    }
    
    public double participacaoPotassioPercentualIdeal(){
        return 3.0;
    }
    
    public double participacaoPotassioCorrecao(){
     if(this.participacaoPotassioDesejada > 0.001)
            return this.participacaoPotassioDesejada;
        else
            return 0.0;
    }
    
    public double valorFontePotassio(){
        switch(this.fontePotassio){
            case CLORETO_POTASSIO:
                return 58.0;
            case SULFATO_POTASSIO:
                return 52.0;
            case SULFATO_POTASSIO_MAGNESIO:
                return 22.0;
            default:
                return 0.0;
        }
    }
    
    public double quantidadeAplicarPotassio(){
        double necessidadeAdicionar = this.solo.getPotassio()*
                (this.participacaoPotassioDesejada/this.participacaoPotassioAtual())
                - this.solo.getPotassio();
        double flag = necessidadeAdicionar;
        if(necessidadeAdicionar<0.01)
            flag = 0.0;
        return flag*39.1*10*2*1.2*100/0.85/100*100/this.valorFontePotassio();
    }
    
    public ItemCorrecaoFornece correcaoFosforoFornece1(){
        double valorItem;
        switch (this.fontePotassio){
            case SULFATO_POTASSIO:
                valorItem = this.quantidadeAplicarPotassio()*0.17;
                return new ItemCorrecaoFornece(valorItem, Nutrientes.ENXOFRE);
            case SULFATO_POTASSIO_MAGNESIO:
                valorItem = this.quantidadeAplicarPotassio()*0.22;
                return new ItemCorrecaoFornece(valorItem, Nutrientes.ENXOFRE);
            default:
                return null;
        }        
    }
    
    public ItemCorrecaoFornece correcaoFosforoFornece2(){
        double valorItem;
        switch (this.fontePotassio){
            case SULFATO_POTASSIO_MAGNESIO:
                valorItem = this.quantidadeAplicarPotassio()*0.18;
                return new ItemCorrecaoFornece(valorItem, Nutrientes.MAGNESIO);
            default:
                return null;
        }        
    } 
    
    public double custoAlqueirePotassio(){
        return (this.valorFontePotassio() * this.quantidadeAplicarPotassio()/1000);
    }
    
}

