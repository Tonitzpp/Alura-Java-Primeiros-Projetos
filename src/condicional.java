public class condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2024;
        boolean incluidonoPlano = true;
        double notaDoFilme = 9.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lancamento que os clientes estao curtindo!");
        } else {
            System.out.println("Filme retro que vale a pena assistir!");
        }

        if (incluidonoPlano == true || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar o plano");
        }
    }
}


