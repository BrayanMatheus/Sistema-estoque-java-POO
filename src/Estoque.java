import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Estoque {

    private ArrayList<Produto> listaProdutos = new ArrayList<>();

    public void cadastrarProduto(Scanner scanner){
        try {
            System.out.print("Digite o nome do produto: ");
            String nome = scanner.nextLine();
            
            System.out.print("Digite o departamento do produto: ");
            String departamento = scanner.nextLine();
            
            System.out.print("Digite a categoria do produto: ");
            String categoria = scanner.nextLine();
            
            System.out.print("Digite o valor do produto: ");
            double valor = scanner.nextDouble();
            
            System.out.print("Digite a quantidade do produto: ");
            int quantidade = scanner.nextInt();

            Produto produto = new Produto(nome, departamento, categoria, valor, quantidade);

            listaProdutos.add(produto);

        } catch (IllegalArgumentException | InputMismatchException e) {
            scanner.nextLine();
            System.err.println("\nValores inválidos.");
        }
        
    }
    
    public void mostrarProdutos(){
        System.out.println("-*-*-*-*- PRODUTOS NO ESTOQUE -*-*-*-*-");
        for (Produto produto : listaProdutos) {
            System.out.printf("ID(%d) %s\n", produto.getId(), produto.getNome());
        }
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
    }

    public void buscarProduto(Scanner scanner){
        boolean encontrado = false;
        try {
            System.out.print("Digite o ID do produto desejado: ");
            int idBuscado = scanner.nextInt();
    
            for (Produto produto : listaProdutos) {
                if (produto.getId() == idBuscado) {
                    produto.detalharProduto();
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.err.println("Produto não encotrado!");
            }
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("Tipo de entrada errada!");
        }
    }

    public void alterarProduto(Scanner scanner){
        int alteracao = 0;
        boolean encontrado = false;
        
        System.out.print("Digite o ID do produto para alterar: ");
        int idBuscado = scanner.nextInt();

        for (Produto produto : listaProdutos) {
            if (produto.getId() == idBuscado) {
                encontrado = true;
                produto.detalharProduto();
                
                do {
                    System.out.println("\n");
                    System.out.println("[1] NOME");
                    System.out.println("[2] DEPARTAMENTO");
                    System.out.println("[3] CATEGORIA");
                    System.out.println("[4] VALOR");
                    System.out.println("[5] QUANTIDADE");
                    System.out.println("[6] TUDO");
                    System.out.print("oque deseja alterar: ");
                    alteracao = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("\n");

                    switch (alteracao) {
                        case 1:{
                            // alteração NOME
                            System.out.println("Digite o novo NOME do produto: ");
                            String novoNome = scanner.nextLine();
                            produto.setNome(novoNome);
                            System.out.println("NOME Alterado com Sucesso!");
                            System.out.println("\n");
                            break;
                        }
                        case 2:{
                            // alteração DEPARTAMENTO
                            System.out.println("Digite o novo DEPARTAMENTO do produto: ");
                            String novoDepartamento = scanner.nextLine();
                            produto.setDepartamento(novoDepartamento);
                            System.out.println("DEPARTAMENTO Alterado com Sucesso!");
                            System.out.println("\n");
                            break;
                        }
                        case 3:{
                            // alteração CATEGORIA
                            System.out.println("Digite a nova CATEGORIA do produto: ");
                            String novaCategoria = scanner.nextLine();
                            produto.setCategoria(novaCategoria);
                            System.out.println("CATEGORIA Alterada com Sucesso!");
                            System.out.println("\n");
                            break;
                        }
                        case 4:{
                            // alteração VALOR
                            System.out.println("Digite o novo VALOR do produto: ");
                            double novoValor = scanner.nextDouble();
                            produto.setValor(novoValor);
                            System.out.println("VALOR Alterado com Sucesso!");
                            System.out.println("\n");
                            break;
                        }
                        case 5:{
                            // alteração QUANTIDADE
                            System.out.println("Digite a nova QUANTIDADE do produto: ");
                            int novaQuantidade = scanner.nextInt();
                            produto.setQuantidade(novaQuantidade);
                            System.out.println("QUANTIDADE Alterada com Sucesso!");
                            System.out.println("\n");
                            break;
                        }
                        case 6:{
                            // alteração TODOS OS ATRIBUTOS
                            System.out.print("Digite o novo NOME do produto: ");
                            String novoNome = scanner.nextLine();
                            produto.setNome(novoNome);

                            System.out.print("Digite o novo DEPARTAMENTO do produto: ");
                            String novoDepartamento = scanner.nextLine();
                            produto.setDepartamento(novoDepartamento);

                            System.out.print("Digite a nova CATEGORIA do produto: ");
                            String novaCategoria = scanner.nextLine();
                            produto.setCategoria(novaCategoria);

                            System.out.print("Digite o novo VALOR do produto: ");
                            double novoValor = scanner.nextDouble();
                            produto.setValor(novoValor);

                            System.out.print("Digite a nova QUANTIDADE do produto: ");
                            int novaQuantidade = scanner.nextInt();
                            produto.setQuantidade(novaQuantidade);

                            System.out.println("PRODUTO Alterado com Sucesso!");  
                            System.out.println("\n");
                            alteracao = 0;
                            break;
                        }
                        default:
                            System.err.println("Opção não...");
                            break;
                    }
                } while (alteracao != 0);
                break;
            }
        }
        if (!encontrado) {
            System.err.println("Produto não encotrado!");
        }
    }

    public void excluirProduto(Scanner scanner){
        try {
            System.out.print("Informe o ID do produto para excluir: ");
            int idExcluir = scanner.nextInt();
            
            boolean encontrado = false;
            for (Produto produto : listaProdutos) {
                if (produto.getId() == idExcluir) {
                    listaProdutos.remove(produto);
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.err.println("Produto não encotrado!");
            }
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("Tipo de entrada errada!");
        }
    }
}
