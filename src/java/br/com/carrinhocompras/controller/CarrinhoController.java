package br.com.carrinhocompras.controller;

import br.com.carrinhocompras.domain.Carrinhos;
import br.com.carrinhocompras.domain.Produtos;
import br.com.carrinhocompras.service.CarrinhoService;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="carrinhoMB")
@SessionScoped
public class CarrinhoController {
    
    private Carrinhos carrinho = new Carrinhos();
    private List<Carrinhos> carrinhos;
    private CarrinhoService carrinhoService = new CarrinhoService();
    private String forma;
    private Float fecha;

    
    public CarrinhoController(){
        listar();
    }
    
    public void listar(){
       carrinhos = carrinhoService.listar();
   }
    
    public String novo(){
       carrinho = new Carrinhos();
       return "new.xhtml?faces-redirect=true";
   }
    
    public String cancelar(){
       return "list.xhtml?faces-redirect=true";
   }
    
    public String salvar(){
       carrinhoService.inserir(carrinho);
       this.listar();
       return "list.xhtml?faces-redirect=true";
   }
    
    public String excluir(Carrinhos carrinho){
       carrinhoService.excluir(carrinho);
       this.listar();
       return "list.xhtml?faces-redirect=true";
   }
    
    public String boraFechar(){
        fecha = carrinhoService.borafechar();
        return "paga.xhtml?faces-redirect=true";
    }

    public Carrinhos getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinhos carrinho) {
        this.carrinho = carrinho;
    }

    public List<Carrinhos> getCarrinhos() {
        return carrinhos;
    }

    public void setCarrinhos(List<Carrinhos> carrinhos) {
        this.carrinhos = carrinhos;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public Float getFecha() {
        return fecha;
    }

    public void setFecha(Float fecha) {
        this.fecha = fecha;
    }
   
}
