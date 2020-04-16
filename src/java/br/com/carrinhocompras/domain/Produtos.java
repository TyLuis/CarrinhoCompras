/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.carrinhocompras.domain;

import java.io.Serializable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Luis
 */
public class Produtos implements Serializable{
    private Integer id;
    
    @NotNull
    private Integer quantidade;
    
    @NotNull
    private String descricao;
    
    @NotNull
    private Float valor;

    public Produtos() {
    }

    public Produtos(Integer id, Integer quantidade, String descricao, Float valor) {
        this.id = id;
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
    
    
}
