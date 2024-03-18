import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua avaliacao para o filme: " );
                    nota = leitura.nextDouble();
                    mediaAvaliacao += nota;
                    // += nota; e = mediaAvaliacao + nota; sao a mesma coisa.

        }

        System.out.println("Media de avaliacoes" + mediaAvaliacao/3);

    }
}
