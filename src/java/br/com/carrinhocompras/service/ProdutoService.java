
package br.com.carrinhocompras.service;

import br.com.carrinhocompras.domain.Produtos;
import br.com.carrinhocompras.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Luis
 */
public class ProdutoService {
    
    private List<Produtos> produtos = new ArrayList<Produtos>();
    
    public List<Produtos> listar(){
        try{
            return produtos;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public boolean inserir(Produtos produto){
        try{
            produtos.add(produto);
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean alterar(Produtos produto){
        try{
            for(int i=0;i<produtos.size();i++){
                if(produtos.get(i).getId().equals(produto)){
                    produtos.set(i, produto);
                }
            }
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false; 
        }
    }
    
    public boolean excluir(Produtos produto){
        try{
            produtos.remove(produto);
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false; 
        }
    }
    
}
