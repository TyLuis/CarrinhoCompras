
package br.com.carrinhocompras.service;

import br.com.carrinhocompras.domain.Carrinhos;
import br.com.carrinhocompras.domain.Produtos;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoService {
    private List<Carrinhos> carrinhos = new ArrayList<Carrinhos>();
    
    public List<Carrinhos> listar(){
        try{
            return carrinhos;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public boolean inserir(Carrinhos carrinho){
        try{
            carrinhos.add(carrinho);
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean excluir(Carrinhos carrinho){
        try{
            carrinhos.remove(carrinho);
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false; 
        }
    }
    
    public Float borafechar(){
        try{
            Float total =(float)0;
            for(int i = 0;i<carrinhos.size();i++){
                total+=(carrinhos.get(i).getProduto().getValor()*carrinhos.get(i).getQuantidade());
            }
            return total;
        }catch(Exception e){
            e.printStackTrace();
            return (float)0; 
        }
    }
}
