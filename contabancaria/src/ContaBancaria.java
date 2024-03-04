import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        String nome = "Sebastian Wilder";
        String tipoConta = "Corrente";
        double saldo = 1240.00;
        int opcao = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("***********************\n");
        System.out.println("Dados iniciais do cliente:\n");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
        System.out.println("\n***********************");

        String menu = """
                
                
                Operações
                
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                                
                Digite a opção desejada:
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("O saldo atual é R$ %.2f", saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor a receber:");
                    double valorReceber = scanner.nextDouble();
                    saldo += valorReceber;
                    System.out.printf("Saldo atualizado R$ %.2f%n", saldo);
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja transferir:");
                    double valorTransferir =  scanner.nextDouble();
                    if (valorTransferir > saldo) {
                        System.out.println("Não há saldo suficiente para fazer essa transferência.");
                    } else {
                        saldo -= valorTransferir;
                        System.out.printf("Saldo atualizado R$ %.2f%n", saldo);
                    }
                    break;
                case 4:
                    System.out.println("Operação encerrada.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
