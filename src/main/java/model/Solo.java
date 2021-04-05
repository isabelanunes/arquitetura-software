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
    private double fosforo;
    private double potassio;
    private double calcio;
    private double magnesio;
    private double enxofre;
    private double aluminio;
    private double acidez;

    public Solo() {
    }

    public Solo(double fosforo, double potassio, double calcio, double magnesio, double enxofre, double aluminio, double acidez) {
        this.fosforo = fosforo;
        this.potassio = potassio;
        this.calcio = calcio;
        this.magnesio = magnesio;
        this.enxofre = enxofre;
        this.aluminio = aluminio;
        this.acidez = acidez;
    }
    
    public double getFosforo(){
        return this.fosforo;
    }
    
    public double getPotassio(){
        return this.potassio;
    }
    
    public double getCalcio(){
        return this.calcio;
    }
    
    public double getMagnesio(){
        return this.magnesio;
    }
    
    public double getEnxofre(){
        return this.enxofre;
    }
    
    public double getAluminio(){
        return this.aluminio;
    }
    
    public double getAcidez(){
        return this.acidez;
    }

    public double getSCmol() {
        return (this.potassio + this.calcio + this.magnesio);
    }

    public double getCTCCmol() {
        return (this.potassio + this.calcio + this.magnesio + this.acidez);
    }

    public double getVPercentual () {
        
        if (this.getSCmol() > 0 && this.getCTCCmol() > 0) {
            return this.getSCmol() / this.getCTCCmol() * 100;
        } else {
            return 0.0;
        }
    }

    public double getMOPercentual(double mo) {
        if (mo > 0) {
            return mo / 10;

        } else {
            return 0.0;
        }
    }

    public double getCarbono(double moPercentual) {
        
        if (moPercentual > 0) {
            return moPercentual / 1.72 * 10;
            
        } else {
            return 0.0;
        }
    }


}
