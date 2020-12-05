public class Produto {
   private int codigo;
   private String descricao;
   private double valor_de_compra;
   private double custo;
   private double margem;
   private int qtd_de_estoque;

    public Produto(int codigo, String descricao){
        this.codigo = codigo;
        this. descricao = descricao;
    }   

    public Produto(int codigo, String descricao, double valor_de_compra, double custo, double margem){
       this.codigo = codigo;
       this.descricao = descricao;
       this.valor_de_compra = valor_de_compra;
       this.custo = custo;
       this.margem = margem; 
    }

    public Produto(int codigo, String descricao, double valor_de_compra, double custo, double margem, int qtd_de_estoque){
       this.codigo = codigo;
       this.descricao = descricao;
       this.valor_de_compra = valor_de_compra;
       this.custo = custo;
       this.margem = margem;
       this.qtd_de_estoque = qtd_de_estoque;
    }

    public void compra (int quant){
        qtd_de_estoque = qtd_de_estoque + quant;
    }

    public void venda (int quant){
        qtd_de_estoque = qtd_de_estoque - quant;
    }

    public double calculaPrecoVenda (){
        return valor_de_compra + custo + margem *(valor_de_compra + custo);
    }

    public double getValor_de_compra() {
        return valor_de_compra;
    }

    public void setValor_de_compra(double valor_de_compra) {
        this.valor_de_compra = valor_de_compra;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
        }

    public double getMargem() {
        return margem;
    }

    public void setMargem(double margem) {
        this.margem = margem;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public int getQtd_de_estoque(){
        return this.qtd_de_estoque;
    }


}


