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
public enum FontesFosforo implements FontesElementos{
    SUPERFOSFATO_SIMPLES(18.0, new double[] {0.28, 0.1}, new Nutrientes[] {Nutrientes.CALCIO, Nutrientes.ENXOFRE}),
    SUPERFOSFATO_TRIPLO(41.0, new double[] {0.2, 0.0}, new Nutrientes[] {Nutrientes.CALCIO, null}),
    MAP(48.0, new double[] {0.09, 0.0}, new Nutrientes[] {Nutrientes.NITROGENIO, null}),
    DAP(45.0, new double[] {0.16, 0.0}, new Nutrientes[] {Nutrientes.NITROGENIO, null}),
    YOORIN(18.0, new double[] {0.15, 0.28}, new Nutrientes[] {Nutrientes.MAGNESIO, Nutrientes.CALCIO}),
    FOSFATO_ARAD(33.0, new double[] {0.52, 0.0}, new Nutrientes[] {Nutrientes.CALCIO, null}),
    FOSFATO_GAFSA(29.0, new double[] {0.52, 0.0}, new Nutrientes[] {Nutrientes.CALCIO, null}),
    FOSFATO_DAOUI(32.0, new double[] {0.45, 0.0}, new Nutrientes[] {Nutrientes.CALCIO, null}),
    FOSF_PATOS_MINAS(24.0, new double[] {0.28, 0.0}, new Nutrientes[] {Nutrientes.CALCIO, null}),
    ESCORIA_THOMAS(18.5, new double[] {0.44, 0.0}, new Nutrientes[] {Nutrientes.CALCIO, null}),
    ACIDO_FOSFORICO(52.0, new double[] {0.0, 0.0}, new Nutrientes[] {null, null}),
    MULTIF_MAGNESIANO(18.0, new double[] {0.11, 0.18}, new Nutrientes[] {Nutrientes.ENXOFRE, Nutrientes.CALCIO});

    private final double valorFonte;
    private final double itensValores[];
    private final Nutrientes itensNutrientes[];

    FontesFosforo(double valorFonte, double[] itensValores, Nutrientes[] itensNutrientes) {
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
