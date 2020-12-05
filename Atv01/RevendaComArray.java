import java.util.*;
public class RevendaComArray {
    private ArrayList<Produto> produtos;
    private int indice;
    
    public RevendaComArray(int quantProd){
        this.produtos = new ArrayList<Produto>(quantProd);
    }
    
    public void inserirProduto(Produto produto){
        produtos.add(produto);
    }
    
    public void comprar(int codigo, int quantProd){
        Boolean bandeira = true;
        for(Produto y : produtos){
            if(y.getCodigo() == codigo){
                bandeira = false;
                y.compra(quantProd);
            }
        }
        if(bandeira){
            System.out.println("Erro: Produto inexistente!");
        }
    }
    
    public void vender(int codigo, int quantProd){
        Boolean bandeira = true;
        for(Produto y : produtos){
            if(y.getCodigo() == codigo){
                bandeira = false;
                y.venda(quantProd);
            }
        }
        if(bandeira){
            System.out.println("Erro: Produto inexistente!");
        }
    }
    
    public void consultaPrecoVenda(int codigo, int quantProd){
        Boolean bandeira = true;
        for(Produto y : produtos){
            if(y.getCodigo() == codigo){
                bandeira = false;
                System.out.println(y.getCusto());
            }
        }
        if(bandeira){
            System.out.println("Erro: Produto inexistente!");
        }
    }
    
    public void listaPrecos(){
        for(Produto y: produtos){
            System.out.println(y.getCodigo() + " " + y.getDescricao() + " " + y.getCusto() + " " + y.getQtd_de_estoque());
        }
    }
    
    public Produto getProduto(int codigo){
        for(Produto y : produtos){
            if(y.getCodigo() == codigo){
                return y;
            }
        }
        System.out.println("Erro: Produto inexistente!");
        return null;
    }

    void consultaPrecoVenda(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
