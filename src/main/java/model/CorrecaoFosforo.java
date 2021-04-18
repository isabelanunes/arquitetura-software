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
public class CorrecaoFosforo extends CorrecaoElemento{
    private final double teorFosforoAtingir;
    private final double eficienciaFosforo;

    public CorrecaoFosforo(double valorFonteElemento, Solo solo, FontesElementos fonte, double teorFosforoAtingir, double eficienciaFosforo) {
        super(valorFonteElemento, solo, fonte);
        this.teorFosforoAtingir = teorFosforoAtingir;
        this.eficienciaFosforo = eficienciaFosforo;
    }
    
    @Override
    public double quantidadeAplicarElemento(){
        double necessidadeAdicionar = this.teorFosforoAtingir - solo.getFosforo();
        double quantidadeAplicar = (necessidadeAdicionar * 4.58) / (this.eficienciaFosforo / 100) * (100 / fonte.getValorFonte());
        return necessidadeAdicionar > 0.01 ? quantidadeAplicar : 0.0;
    }

}
