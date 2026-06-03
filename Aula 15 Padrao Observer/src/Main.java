public class Main {

    public static void main(String[] args) {

        PlataformaStream netflix = new PlataformaStream();


        Usuario ana = new Usuario("Ana Beatriz");
        ana.inscreverGenero(Genero.ACAO);
        ana.inscreverGenero(Genero.FICCAO_CIENTIFICA);

        Usuario heloisa = new Usuario("Heloisa Gomes");
        heloisa.inscreverGenero(Genero.COMEDIA);

        Usuario felipe = new Usuario("Felipe Pereira");
        felipe.inscreverGenero(Genero.TERROR);
        felipe.inscreverGenero(Genero.ACAO);

        Usuario marcio = new Usuario("Marcio");
        marcio.inscreverGenero(Genero.ANIME);
        marcio.inscreverGenero(Genero.FICCAO_CIENTIFICA);

        Usuario joao = new Usuario("Joao Victor");
        joao.inscreverGenero(Genero.COMEDIA);
        joao.inscreverGenero(Genero.TERROR);
        joao.inscreverGenero(Genero.ANIME);

        netflix.adicionarUsuario(ana);
        netflix.adicionarUsuario(heloisa);
        netflix.adicionarUsuario(felipe);
        netflix.adicionarUsuario(marcio);
        netflix.adicionarUsuario(joao);


        netflix.adicionarConteudo(
                new Conteudo("A Odisseia", Genero.ACAO));

        netflix.adicionarConteudo(
                new Conteudo("Demon Slayer - Castelo Infinito", Genero.ANIME));

        netflix.adicionarConteudo(
                new Conteudo("Backrooms", Genero.TERROR));

        netflix.adicionarConteudo(
                new Conteudo("Todo Mundo em Pânico 6", Genero.COMEDIA));

        netflix.adicionarConteudo(
                new Conteudo("Dia D", Genero.FICCAO_CIENTIFICA));
    }
}