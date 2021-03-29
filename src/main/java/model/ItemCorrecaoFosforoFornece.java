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
public class ItemCorrecaoFosforoFornece {
    private double valor;
    private Nutrientes descricao_item;

    public ItemCorrecaoFosforoFornece(double valor, Nutrientes descricao_item) {
        this.valor = valor;
        this.descricao_item = descricao_item;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDescricao_item(Nutrientes descricao_item) {
        this.descricao_item = descricao_item;
    }
    
}
