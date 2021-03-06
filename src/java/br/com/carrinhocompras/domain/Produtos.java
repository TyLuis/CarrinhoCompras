/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.carrinhocompras.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.ManyToOne;
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
    
    private List<Carrinhos> carrinhos;

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

    public List<Carrinhos> getCarrinhos() {
        return carrinhos;
    }

    public void setCarrinhos(List<Carrinhos> carrinhos) {
        this.carrinhos = carrinhos;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produtos other = (Produtos) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Produtos{" + "id=" + id + ", descricao=" + descricao + ", quantidade=" + quantidade+ ", valor=" + valor +'}';
    }
}
