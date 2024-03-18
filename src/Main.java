public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Duna 2");

        int anoDeLancamento = 2024;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidonoPlano = true;
        double notaDoFilme = 9.1;

        double media =(9.1 + 8.1 + 8.5) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme: Duna 2
                Filme de ação em um planeta com clima desertico.
                Ano de lancamento:
                """ + anoDeLancamento;
        System.out.println(sinopse);

         int classificacao;
         classificacao = (int) (media /2);
        System.out.println(classificacao);

    }
}