public class Produto {
    private String nome;
    private String departamento;
    private String categoria;
    private double valor;
    private int quantidade;
    
    public Produto(String nome, String departamento, String categoria, double valor, int quantidade) {
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
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
        System.out.printf("Nome: %s\n", this.nome);
        System.out.printf("Departamento: %s\n", this.departamento);
        System.out.printf("Categoria: %s\n", this.categoria);
        System.out.printf("Valor: %.2f\n", this.valor);
        System.out.printf("Estoque: %d", this.quantidade);
        System.out.println("\n*==========*==========*");
    }

    public int addEstoque(int quantidadeEntrada){
        quantidade += quantidadeEntrada;
        return quantidade;
    }


}
