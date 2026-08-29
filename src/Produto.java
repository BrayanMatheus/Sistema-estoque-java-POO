public class Produto {
    private String nome;
    private String departamento;
    private String categoria;
    private float valor;
    private int quantidade;
    
    public Produto(String nome, String departamento, String categoria, float valof, int quantidade) {
        this.nome = nome;
        this.departamento = departamento;
        this.categoria = categoria;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void detalharProduto(){
        System.out.println("*==========*==========*");
        System.out.printf("Nome: %s", this.nome);
        System.out.println("*==========*==========*");
    }
    
}
