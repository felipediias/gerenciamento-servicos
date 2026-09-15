import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int opcao;

        System.out.println("========================================");
        System.out.println("         CENTRAL DE ATENDIMENTO         ");
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

        System.out.println("");

        opcao = ler.nextInt();

        switch (opcao) {
            case 1:
                break;

            case 2:
                break;
        }

        ler.close();
    }
}