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
public abstract class CorrecaoElemento {
    
    public double valorFonteElemento;
    public Solo solo;
    public FontesElementos fonte;
    
    CorrecaoElemento(double valorFonteElemento, Solo solo, FontesElementos fonte){
        this.fonte = fonte;
        this.valorFonteElemento = valorFonteElemento;
        this.solo = solo;
    }
    
    public abstract double quantidadeAplicarElemento();

    
    public final double calcularCustoAlqueire(){
        return this.valorFonteElemento * this.quantidadeAplicarElemento()/1000;
    }
    
    public final Object[][] correcaoElemento(){
        return new Object[][] {{new double [] {this.quantidadeAplicarElemento() * this.fonte.getItensValores()[0], 
                               quantidadeAplicarElemento() * this.fonte.getItensValores()[1]}},
                              {this.fonte.getItensNutrientes()}};
    }
    
}
