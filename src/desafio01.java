import java.util.Scanner;

public class desafio01 {
    public static void main(String[] args) {
        //variaveis:
        String nome = "Toni Tison";
        String tipoConta = "Corrente";
        double saldo = 1600.00;
        int opcao = 0;

        //informacoes do cliente:
        System.out.println("************************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("\n************************");

        //menu:
        String menu = """
                \n** Digite sua opcao **
                1 - Consultar Saldo
                2 - Transferir Valor
                3 - Receber Valor
                4 - Sair
                """;
        //configuracao das opcoes do menu:
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();
            if (opcao == 1){
                System.out.println("O saldo atualizado é: " + saldo);
            } else if(opcao == 2){
                System.out.println("Qual o valor de transferencia desejado?");
                double valor = leitura.nextInt();
                if(valor > saldo){
                    System.out.println("Quantidade Indisponivel!");
                } else{
                    saldo -= valor;
                    System.out.println("\nNovo saldo: " + saldo);
                }
            } else if (opcao == 3){
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("\nNovo saldo: " + saldo);
            } else if(opcao != 4){
                System.out.println("Opcao Invalida!");
            }
        }
    }
}