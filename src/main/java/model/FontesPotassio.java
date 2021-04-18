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
public enum FontesPotassio implements FontesElementos{
    CLORETO_POTASSIO(58.0, new double[] {0.0, 0.0}, new Nutrientes[] {null, null}),
    SULFATO_POTASSIO(52.0, new double[] {0.17, 0}, new Nutrientes[] {Nutrientes.ENXOFRE, null}),
    SULFATO_POTASSIO_MAGNESIO(22.0, new double[] {0.22, 0.18}, new Nutrientes[] {Nutrientes.ENXOFRE, Nutrientes.MAGNESIO});  
    
    private final double valorFonte;
    private final double[] itensValores;
    private final Nutrientes[] itensNutrientes;

    FontesPotassio(double valorFonte, double[] itensValores, Nutrientes[] itensNutrientes) {
        this.valorFonte = valorFonte;
        this.itensValores = itensValores;
        this.itensNutrientes = itensNutrientes;
    }

    @Override
    public double getValorFonte() {
        return valorFonte;
    }

    @Override
    public double[] getItensValores() {
        return itensValores;
    }

    @Override
    public Nutrientes[] getItensNutrientes() {
        return itensNutrientes;
    }

}
