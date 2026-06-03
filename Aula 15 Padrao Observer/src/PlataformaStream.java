import java.util.ArrayList;
import java.util.List;

public class PlataformaStream {

    private List<Usuario> usuarios;
    private List<Conteudo> catalogo;

    public PlataformaStream() {
        usuarios = new ArrayList<>();
        catalogo = new ArrayList<>();
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void removerUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    public void adicionarConteudo(Conteudo conteudo) {

        catalogo.add(conteudo);

        System.out.println("\n==================================");
        System.out.println("Novo filme adicionado:");
        System.out.println(conteudo.getTitulo() +
                " - " + conteudo.getGenero());
        System.out.println("==================================");

        notificarUsuarios(conteudo);
    }

    private void notificarUsuarios(Conteudo conteudo) {

        for (Usuario usuario : usuarios) {

            if (usuario.interessadoEm(conteudo.getGenero())) {
                usuario.atualizar(conteudo);
            }
        }
    }
}