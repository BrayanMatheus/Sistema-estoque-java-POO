import java.util.Scanner;

// -------------- TAREFAS --------------
// CORRIGIR GERAÇÃO DE ID( EVITAR PULAR ID QUANDO O CADASTRO FOR INVÁLIDO)
// ADICIONAR MÉTODOS NA CLASSE "ESTOQUE"(ADICIONAR ESTOQUE, CALCULAR PREÇO TOTAL DO ESTOQUE e etc)
// MELHORAR MÉTODO "ALTERAR PRODUTO"
// PREPARAR O PROJETO PARA BANCO DE DADOS


public class App {

    public static void exibeMenu() {
        System.out.println("=================================================================================");
        System.out.println("[1] Cadastrar produto");
        System.out.println("[2] Mostrar todos os produtos");
        System.out.println("[3] Buscar produto (ID)");
        System.out.println("[4] Alterar produto");
        System.out.println("[5] Excluir produto");
        System.out.println("[0] SAIR");
        System.out.println("\n");
        
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();
        int opcao = 0;
        
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
                    estoque.cadastrarProduto(scanner);
                    break;

                case 2:
                    estoque.mostrarProdutos();
                    break;
                
                case 3:
                    estoque.buscarProduto(scanner);
                    break;

                case 4:
                    estoque.alterarProduto(scanner);
                    break;

                case 5:
                    estoque.excluirProduto(scanner);
                    break;

                default:
                    System.err.println("Opção não identificada");
                    break;
            }
        } while (opcao !=0);
    }
}
