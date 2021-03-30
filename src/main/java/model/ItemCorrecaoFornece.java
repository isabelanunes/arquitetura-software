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
public class ItemCorrecaoFornece {
    private double valor;
    private Nutrientes descricao_item;

    public ItemCorrecaoFornece(double valor, Nutrientes descricao_item) {
        this.valor = valor;
        this.descricao_item = descricao_item;
    }

    public double getValor() {
        return valor;
    }

    public Nutrientes getDescricao_item() {
        return descricao_item;
    }
    
}
