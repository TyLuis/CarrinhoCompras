package br.com.carrinhocompras.controller;

import br.com.carrinhocompras.domain.Produtos;
import br.com.carrinhocompras.service.ProdutoService;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="ProdutoMB")
@SessionScoped
public class ProdutosController {
    
   private Produtos produto = new Produtos();
   private List<Produtos> produtos;
   private ProdutoService produtoService = new ProdutoService();
   
   public ProdutosController(){
       listar();
   }
   
   public void listar(){
       produtos = produtoService.listar();
   }
   
   public String novo(){
       produto = new Produtos();
       return "new.xhtml?faces-redirect=true";
   }
   
   public String cancelar(){
       return "list.xhtml?faces-redirect=true";
   }
   
   public String buscaDados(Produtos produto){
       this.produto = produto;
       return "alter.xhtml?faces-redirect=true";
   }
   
   public String salvar(){
       produtoService.inserir(produto);
       this.listar();
       return "list.xhtml?faces-redirect=true";
   }
   
   public String alterar(){
       produtoService.alterar(produto);
       this.listar();
       return "list.xhtml?faces-redirect=true";
   }
   
   public String excluir(){
       produtoService.excluir(produto);
       this.listar();
       return "list.xhtml?faces-redirect=true";
   }
   
   public List<Produtos> getProdutos(){
       return produtos;
   }

    public void setProdutos(List<Produtos> produtos) {
        this.produtos = produtos;
    }

    public Produtos getProduto() {
        return produto;
    }

    public void setProduto(Produtos produto) {
        this.produto = produto;
    }  
}
