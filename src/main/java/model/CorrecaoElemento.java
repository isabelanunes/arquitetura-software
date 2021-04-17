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
public interface CorrecaoElemento {
    public double quantidadeAplicarElemento();
    public ItemCorrecaoFornece[] correcaoElemento();
    public double calcularCustoAlqueire();
}