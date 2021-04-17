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
public class CorrecaoPotassio implements CorrecaoElemento{
    private final double participacaoPotassioDesejada;
    private final Solo solo;
    private final FontesPotassio fontePotassio;
    private final double valorFontePotassio;

    public CorrecaoPotassio(double participacaoPotassioDesejada, Solo solo, FontesPotassio fontePotassio, double valorFontePotassio) {
        this.participacaoPotassioDesejada = participacaoPotassioDesejada;
        this.solo = solo;
        this.fontePotassio = fontePotassio;
        this.valorFontePotassio = valorFontePotassio;
    }
    
    public double participacaoPotassioAtual(){
        double participacao = this.solo.getPotassio() / 
               (this.solo.getCalcio() + this.solo.getMagnesio() + this.solo.getPotassio()
                + this.solo.getAcidez())*100;
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
    
    @Override
    public double quantidadeAplicarElemento(){
        double necessidadeAdicionar = this.solo.getPotassio()*
                this.participacaoPotassioDesejada/this.participacaoPotassioAtual()
                - this.solo.getPotassio();
        double quantidadeAplicar = necessidadeAdicionar * 39.1 * 10 * 2 * 1.2 * 100 / 0.85 /100 *100 
                    / this.fontePotassio.valorFonte();
        return necessidadeAdicionar > 0.01 ? quantidadeAplicar : 0.0;
    }
    
    @Override
    public ItemCorrecaoFornece[] correcaoElemento(){
        return this.fontePotassio.correcaoFornece(this);
    }
        
    @Override
    public double calcularCustoAlqueire(){
        return (this.valorFontePotassio * this.quantidadeAplicarElemento()/1000);
    }
    
}

