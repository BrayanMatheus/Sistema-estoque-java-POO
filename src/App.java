import java.util.ArrayList;
import java.util.Scanner;

// -------------- TAREFAS --------------
// TERMINAR DE CRIAR O CRUD
// FAZER VALIDAÇÕES NOS GETTERS / SETTERS
// CRIAR UMA CLASE "ESTOQUE" PARA COLOCAR OS METODOS DO CRUD 
// ADICIONAR MAIS METODOS NA CLASSE "ESTOQUE" COMO "ADD ESTQ" E "RMV ESTQ" E OUTROS COMO "PRECO TOTAL ESTQ" E "QNTD PROD ESTQ", ETC

public class App {

    public static void exibeMenu() {
        System.out.println("=================================================================================");
        System.out.println("[1] Cadastrar produto");
        System.out.println("[2] Mostrar todos os produtos");
        System.out.println("[3] Buscar produto (ID)");
        System.out.println("[4] Excluir produto");
        System.out.println("[0] SAIR");
        System.out.println("\n");
        
    }

    public static void cadastrarProduto(ArrayList<Produto> listaProdutos, Scanner scanner){
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
    }

    public static void mostrarProdutos(ArrayList<Produto> listaProdutos){
        int i = 1;
        System.out.println("-*-*-*-*- PRODUTOS NO ESTOQUE -*-*-*-*-");
        for (Produto produto : listaProdutos) {
            System.out.printf("ID(%d) %s\n", produto.getId(), produto.getNome());
        }
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
    }

    public static void buscarProdutos(ArrayList<Produto> listaProdutos, Scanner scanner){
        Boolean encontrado = false;
        
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
    }

     public static void excluirProduto(ArrayList<Produto> listaProdutos, Scanner scanner){
        
        System.out.print("Informe o id do produto para excluir: ");
        int idExcluir = scanner.nextInt();

        Boolean encontrado = false;
        for (Produto produto : listaProdutos) {
            if (produto.getId() == idExcluir) {
                listaProdutos.remove(produto);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.err.println("Produto não encotrado!");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        int opcao = 0;

        // ---------------- CÓDIGOS PARA TESTES ----------------------------------------
        // Produto produto1 = new Produto("aaaaaaaaaaaaa", "fsfdsfewf", "fsefsdfswe", 55, 9);
        // Produto produto2 = new Produto("bbbbbbbbbbbb", "aaaaaaaa", "aaaa", 77, 3);
        // Produto produto3 = new Produto("ccccccccc", "bbbbbb", "bbbbbbbbbb", 95, 3);
        // Produto produto4 = new Produto("dddddddddddd", "dsadas", "ubt", 95, 3);
        // Produto produto5 = new Produto("eeeeeeeeeeee", "ujty", "dgsrgrsh", 95, 3);
        // listaProdutos.add(produto1);
        // listaProdutos.add(produto2);
        // listaProdutos.add(produto3);
        // listaProdutos.add(produto4);
        // listaProdutos.add(produto5);

        do {
            exibeMenu();
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            System.out.println("=================================================================================");
            scanner.nextLine();


            switch (opcao) {
                case 0:
                    System.out.println("Encerrando o programa...");
                    System.exit(0);

                case 1:
                    cadastrarProduto(listaProdutos, scanner);
                    break;

                case 2:
                    mostrarProdutos(listaProdutos);
                    break;
                
                case 3:
                    buscarProdutos(listaProdutos, scanner);
                    break;

                case 4:
                    excluirProduto(listaProdutos, scanner);
                    break;

                default:
                    System.err.println("Opção não identificada");
                    break;
            }
        } while (opcao >= 0 && opcao <=3);
    }
}
