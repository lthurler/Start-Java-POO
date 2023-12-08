package startexerciciopoo04;


public class Invoice {
    
    private int codigo;
    private String descricao;
    private int quantidade;
    private float preco;


    public Invoice(int codigo, String descricao, int quantidade, float preco) {

        this.setCodigo(codigo);
        this.setDescricao(descricao);
        this.setQuantidade(quantidade);
        this.setPreco(preco);              
    }

    public int getCodigo() {

        return codigo;
    }

    public void setCodigo(int codigo) {

        this.codigo = codigo;
    }

    public String getDescricao() {

        return descricao;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }

    public int getQuantidade() {

        return quantidade;
    }

    public void setQuantidade(int quantidade) {

        if(quantidade < 0) {

            this.quantidade = 0;

        } else {

            this.quantidade = quantidade;
        }
    }

    public float getPreco() {

        return preco;
    }

    public void setPreco(float preco) {

        if(preco < 0) {

            this.preco = 0;

        } else {

            this.preco = preco;
        }  
    }

    public double getInvoiceAmount() {
        
        return preco * quantidade; 
    }

}
