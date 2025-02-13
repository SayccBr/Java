import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String id;
    private List<Livro> livrosEmprestados;

    // Construtor
    public Usuario(String nome, String id) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    // Método para emprestar um livro
    public void emprestarLivro(Livro livro) {
        if (livro.isDisponivel()) {
            livrosEmprestados.add(livro);
            livro.emprestar();
            System.out.println("Livro emprestado com sucesso.");
        } else {
            System.out.println("Livro não está disponível.");
        }
    }

    // Método para devolver um livro
    public void devolverLivro(Livro livro) {
        if (livrosEmprestados.remove(livro)) {
            livro.devolver();
            System.out.println("Livro devolvido com sucesso.");
        } else {
            System.out.println("Este livro não está emprestado por este usuário.");
        }
    }
}
