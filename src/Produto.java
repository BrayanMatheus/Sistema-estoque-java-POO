public class Produto {
    private static int  proximoId = 0;

    private int id;
    private String nome;
    private String departamento;
    private String categoria;
    private double valor;
    private int quantidade;
    
    public Produto(String nome, String departamento, String categoria, double valor, int quantidade) {
        setNome(nome);
        setDepartamento(departamento);
        setCategoria(categoria);
        setValor(valor);
        setQuantidade(quantidade);
        
        id = ++proximoId;
    }

    public int getId() {
    return id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome Inválido!");
        }
        this.nome = nome.trim();
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        if (departamento == null || departamento.trim().isEmpty()) {
            throw new IllegalArgumentException("Departamento Inválido!");
        }
        this.departamento = departamento.trim();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (categoria == null || categoria.trim().isEmpty()){
            throw new IllegalArgumentException("Categoria Inválida!");
        }
        this.categoria = categoria.trim();
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor <= 0){
            throw new IllegalArgumentException("Valor Inválido");
        }
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0 ) {
            throw new IllegalArgumentException("Quantidade Inválida!");
        }
        this.quantidade = quantidade;
    }

    public void detalharProduto(){
        System.out.println("*==========*==========*");
        System.out.printf("Id: %d\n", this.id);
        System.out.printf("Nome: %s\n", this.nome);
        System.out.printf("Departamento: %s\n", this.departamento);
        System.out.printf("Categoria: %s\n", this.categoria);
        System.out.printf("Valor: %.2f\n", this.valor);
        System.out.printf("Estoque: %d", this.quantidade);
        System.out.println("\n*==========*==========*");
    }
    
}
