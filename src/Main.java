import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int opcao = -1;
        int codigo;
        String solicitante;
        String descricao;
        String categoria;
        int prioridade;
        String status;
        CircularArrayQueue<Solicitacao> queue = new CircularArrayQueue<Solicitacao>();

        while (opcao != 0) {
            System.out.println("========================================");
            System.out.println("        CENTRAL DE ATENDIMENTO        ");
            System.out.println("========================================");
            System.out.println("1 - Cadastrar nova solicitação");
            System.out.println("2 - Consultar próxima solicitação");
            System.out.println("3 - Atender próxima solicitação");
            System.out.println("4 - Exibir fila de solicitações");
            System.out.println("5 - Exibir quantidade de solicitações");
            System.out.println("6 - Consultar última operação realizada");
            System.out.println("7 - Exibir histórico de operações");
            System.out.println("8 - Desfazer última operação");
            System.out.println("0 - Encerrar");

            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    status = "AGUARDANDO";
                    System.out.println("Código da solicitação: ");
                    codigo = ler.nextInt();
                    ler.nextLine();
                    System.out.println("Nome do solicitante: ");
                    solicitante = ler.nextLine();
                    System.out.println("Descrição do problema: ");
                    descricao = ler.nextLine();
                    System.out.println("Categoria: ");
                    categoria = ler.nextLine();
                    System.out.println("Prioridade: ");
                    prioridade = ler.nextInt();
                    Solicitacao solicitacao = new Solicitacao(codigo, solicitante, descricao, categoria, prioridade, status);
                    queue.enqueue(solicitacao);
                    System.out.println("Solicitação cadastrada");
                    break;

                case 5:
                    System.out.println("Quantidade: " + queue.size() + "\n");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

        ler.close();
    }
}