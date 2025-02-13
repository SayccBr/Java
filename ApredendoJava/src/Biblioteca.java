import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Usuario> usuarios;

    // Construtor
    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    // Método para adicionar um livro à biblioteca
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado com sucesso.");
    }

    // Método para remover um livro da biblioteca
    public void removerLivro(Livro livro) {
        if (livros.remove(livro)) {
            System.out.println("Livro removido com sucesso.");
        } else {
            System.out.println("Livro não encontrado na biblioteca.");
        }
    }

    // Método para registrar um usuário na biblioteca
    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário registrado com sucesso.");
    }

    // Método para emprestar um livro a um usuário
    public void emprestarLivro(Usuario usuario, Livro livro) {
        if (livros.contains(livro) && livro.isDisponivel()) {
            usuario.emprestarLivro(livro);
        } else {
            System.out.println("Livro não disponível para empréstimo.");
        }
    }

    // Método para devolver um livro emprestado por um usuário
    public void devolverLivro(Usuario usuario, Livro livro) {
        if (usuario.getLivrosEmprestados().contains(livro)) {
            usuario.devolverLivro(livro);
        } else {
            System.out.println("Este livro não está emprestado por este usuário.");
        }
    }

    // Método para listar todos os livros da biblioteca
    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo() + " por " + livro.getAutor());
        }
    }

    // Método para listar todos os usuários da biblioteca
    public void listarUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println("Usuário: " + usuario.getNome() + ", ID: " + usuario.getId());
        }
    }
}
