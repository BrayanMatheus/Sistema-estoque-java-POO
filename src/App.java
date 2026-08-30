import java.util.Scanner;
import java.util.ArrayList;

public class App {

    public static void exibeMenu() {
        System.out.println("=================================================================================");
        System.out.println("[1] Cadastrar produto");
        System.out.println("[2] Mostrar todos os produtos");
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
            System.out.printf("[%d] %s\n", i, produto.getNome());
            i += 1;
        }
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        int opcao = 0;

        do {
            exibeMenu();
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            System.out.println("=================================================================================");

            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarProduto(listaProdutos, scanner);
                    break;

                case 2:
                    mostrarProdutos(listaProdutos);
                    break;
            
                default:
                    System.err.println("Opção não identificada");
                    break;
            }
        } while (opcao >= 1 && opcao <=2);
    }
}
