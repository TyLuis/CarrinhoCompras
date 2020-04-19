/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.carrinhocompras.domain;

import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Luis
 */
public class Carrinho implements Serializable{
    
    @Id
    private Integer id;
    
    @ManyToOne
    private Produtos produto;
    
}
