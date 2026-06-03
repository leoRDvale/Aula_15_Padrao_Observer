import java.util.HashSet;
import java.util.Set;

public class Usuario implements Observer {

    private String nome;
    private Set<Genero> generosInscritos;

    public Usuario(String nome) {
        this.nome = nome;
        this.generosInscritos = new HashSet<>();
    }

    public void inscreverGenero(Genero genero) {
        generosInscritos.add(genero);
    }

    public void cancelarGenero(Genero genero) {
        generosInscritos.remove(genero);
    }

    public boolean interessadoEm(Genero genero) {
        return generosInscritos.contains(genero);
    }

    @Override
    public void atualizar(Conteudo conteudo) {
        System.out.println(
                "--> " + nome +
                        " ! Chegou conteúdo novo pra você:  -> "
                        + conteudo.getTitulo()
                        + " (" + conteudo.getGenero() + ")"
        );
    }

    public String getNome() {
        return nome;
    }
}