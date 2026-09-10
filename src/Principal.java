import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Gente Grande 2");
        meuFilme.setAnoDeLancamento(2013);
        meuFilme.setDuracaoEmMinutos(101);
        //meuFilme.setIncluidoNoPlano();
        /*meuFilme.somaDasAvaliacoes = 10;*/
        /*meuFilme.totalDeAvaliacoes = 5;*/

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(7);
        meuFilme.avalia(9);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Ano de lançamento: " + meuFilme.getAnoDeLancamento());
        System.out.println("Nome do filme: " + meuFilme.getNome());
        System.out.println("Duração do filme em minutos: " + meuFilme.getDuracaoEmMinutos());
        System.out.println(meuFilme.pegaMedia());

        Serie caesDeCaca = new Serie();
        caesDeCaca.setNome("Cães de Caça ");
        caesDeCaca.setAnoDeLancamento(2023);
        caesDeCaca.setTemporadas(2);
        caesDeCaca.setEpisodiosPorTemporada(8);
        caesDeCaca.setMinutosPorEpisodio(40);
        caesDeCaca.exibeFichaTecnica();
    }
}
