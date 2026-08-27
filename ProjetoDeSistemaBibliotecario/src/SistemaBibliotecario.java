import java.util.Scanner;

public class SistemaBibliotecario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o codigo do Livro: ");
        int codigo = input.nextInt();
        input.nextLine();

        System.out.print("Digite o titulo do Livro: ");
        String titulo = input.nextLine();

        System.out.print("Digite o Autor do Livro: ");
        String autor = input.nextLine();

        Livro l1 = new Livro(codigo, titulo, autor);

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("--- MENU DE OPERAÇÕES ---");
            System.out.println("1. Emprestar Livro");
            System.out.println("2. Devolver Livro");
            System.out.println("3. Reservar Livro");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = input.nextInt();
            input.nextLine();

            if (opcao == 1) {
                System.out.print("Nome do cliente para EMPRÉSTIMO: ");
                String c1 = input.nextLine();
                l1.emprestar(c1);

            } else if (opcao == 2) {
                System.out.print("Nome do cliente para DEVOLUÇÃO: ");
                String c2 = input.nextLine();
                l1.devolucao(c2);

            } else if (opcao == 3) {
                System.out.print("Nome do cliente para RESERVA: ");
                String c3 = input.nextLine();
                l1.reservado(c3);

            } else if (opcao == 4) {
                System.out.println("Encerrando o sistema...");

            } else {

                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        System.out.println();

        l1.resumo();

        input.close();
    }
}