package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Isabela Nunes
 */
public class Solo {
    private int tipoSolo;
    private Double fosforo;
    private Double potassio;
    private Double calcio;
    private Double magnesio;
    private Double enxofre;
    private Double aluminio;
    private Double acidez;

    public Solo() {
    }

    public int getTipoSolo() {
        return tipoSolo;
    }

    public void setTipoSolo(int tipoSolo) {
        this.tipoSolo = tipoSolo;
    }

    public Double getFosforo() {
        return fosforo;
    }

    public void setFosforo(Double fosforo) {
        this.fosforo = fosforo;
    }

    public Double getPotassio() {
        return potassio;
    }

    public void setPotassio(Double potassio) {
        this.potassio = potassio;
    }

    public Double getCalcio() {
        return calcio;
    }

    public void setCalcio(Double calcio) {
        this.calcio = calcio;
    }

    public Double getMagnesio() {
        return magnesio;
    }

    public void setMagnesio(Double magnesio) {
        this.magnesio = magnesio;
    }

    public Double getEnxofre() {
        return enxofre;
    }

    public void setEnxofre(Double enxofre) {
        this.enxofre = enxofre;
    }

    public Double getAluminio() {
        return aluminio;
    }

    public void setAluminio(Double aluminio) {
        this.aluminio = aluminio;
    }

    public Double getAcidez() {
        return acidez;
    }

    public void setAcidez(Double acidez) {
        this.acidez = acidez;
    }

    /* O caso de tipo de solo diferente de 1 e 2
    deve ser tratado no momento de instaciar o atributo tipo solo. */

  /*  public int valorIdealFosforo(Solo solo){
        switch(solo.tipoSolo){
            case 1:
                return 9;
            case 2:
                return 12;
            default:
                System.out.println("Tipo de solo inválido");
        }

    } */

    public int valorIdealFosforo(Solo solo){
        if(solo.tipoSolo == 1) return 9;
        else return 12;
    }

    public Double valorIdealPotassio(Solo solo){
        if(solo.tipoSolo == 1) return 0.35;
        else return 0.25;
    }

    public int valorIdealCalcio(Solo solo){
        if(solo.tipoSolo == 1) return 6;
        else return 4;
    }

    public Double valorIdealMagnesio(Solo solo){
        if(solo.tipoSolo == 1) return 1.5;
        else return 1.0;
    }

    public int valorIdealEnxofre(Solo solo){
        if(solo.tipoSolo == 1) return 9;
        else return Exception;
    }

    public int valorIdealAluminio(){
        return 0;
    }

}
