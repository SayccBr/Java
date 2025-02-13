import java.util.Scanner;

public class SistemaBiblioteca {
    private Biblioteca biblioteca;

    // Construtor
    public SistemaBiblioteca() {
        this.biblioteca = new Biblioteca();
    }

    // Método para exibir o menu e interagir com o usuário
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("Menu:");
            System.out.println("1 - Adicionar Livro");
            System.out.println("2 - Remover Livro");
            System.out.println("3 - Registrar Usuário");
            System.out.println("4 - Emprestar Livro");
            System.out.println("5 - Devolver Livro");
            System.out.println("6 - Listar Livros");
            System.out.println("7 - Listar Usuários");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    adicionarLivro(scanner);
                    break;
                case 2:
                    removerLivro(scanner);
                    break;
                case 3:
                    registrarUsuario(scanner);
                    break;
                case 4:
                    emprestarLivro(scanner);
                    break;
                case 5:
                    devolverLivro(scanner);
                    break;
                case 6:
                    listarLivros();
                    break;
                case 7:
                    listarUsuarios();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }

    // Método para adicionar um livro
    private void adicionarLivro(Scanner scanner) {
        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();
        System.out.print("Digite o autor do livro: ");
        String autor = scanner.nextLine();
        System.out.print("Digite o ISBN do livro: ");
        String isbn = scanner.nextLine();
        Livro livro = new Livro(titulo, autor, isbn);
        biblioteca.adicionarLivro(livro);
    }

    // Método para remover um livro
    private void removerLivro(Scanner scanner) {
        System.out.print("Digite o título do livro a ser removido: ");
        String titulo = scanner.nextLine();
        Livro livroARemover = null;
        for (Livro livro : biblioteca.getLivros()) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livroARemover = livro;
                break;
            }
        }
        if (livroARemover != null) {
            biblioteca.removerLivro(livroARemover);
        } else {
            System.out.println("Livro não encontrado na biblioteca.");
        }
    }

    // Método para registrar um usuário
    private void registrarUsuario(Scanner scanner) {
        System.out.print("Digite o nome do usuário: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o ID do usuário: ");
        String id = scanner.nextLine();
        Usuario usuario = new Usuario(nome, id);
        biblioteca.registrarUsuario(usuario);
    }

    // Método para emprestar um livro
    private void emprestarLivro(Scanner scanner) {
        System.out.print("Digite o ID do usuário: ");
        String idUsuario = scanner.nextLine();
        Usuario usuario = null;
        for (Usuario u : biblioteca.getUsuarios()) {
            if (u.getId().equalsIgnoreCase(idUsuario)) {
                usuario = u;
                break;
            }
        }
        if (usuario == null) {
            System.out.println("Usuário não encontrado.");
            return;
        }
        System.out.print("Digite o título do livro a ser emprestado: ");
        String tituloLivro = scanner.nextLine();
        Livro livro = null;
        for (Livro l : biblioteca.getLivros()) {
            if (l.getTitulo().equalsIgnoreCase(tituloLivro)) {
                livro = l;
                break;
            }
        }
        if (livro == null) {
            System.out.println("Livro não encontrado na biblioteca.");
        } else {
            biblioteca.emprestarLivro(usuario, livro);
        }
    }

    // Método para devolver um livro
    private void devolverLivro(Scanner scanner) {
        System.out.print("Digite o ID do usuário: ");
        String idUsuario = scanner.nextLine();
        Usuario usuario = null;
        for (Usuario u : biblioteca.getUsuarios()) {
            if (u.getId().equalsIgnoreCase(idUsuario)) {
                usuario = u;
                break;
            }
        }
        if (usuario == null) {
            System.out.println("Usuário não encontrado.");
            return;
        }
        System.out.print("Digite o título do livro a ser devolvido: ");
        String tituloLivro = scanner.nextLine();
        Livro livro = null;
        for (Livro l : biblioteca.getLivros()) {
            if (l.getTitulo().equalsIgnoreCase(tituloLivro)) {
                livro = l;
                break;
            }
        }
        if (livro == null) {
            System.out.println("Livro não encontrado na biblioteca.");
        } else {
            biblioteca.devolverLivro(usuario, livro);
        }
    }

    // Método para listar todos os livros
    private void listarLivros() {
        biblioteca.listarLivros();
    }

    // Método para listar todos os usuários
    private void listarUsuarios() {
        biblioteca.listarUsuarios();
    }

    // Método principal para executar o sistema
    public void executar() {
        menu();
    }

    public static void main(String[] args) {
        SistemaBiblioteca sistema = new SistemaBiblioteca();
        sistema.executar();
    }
}
