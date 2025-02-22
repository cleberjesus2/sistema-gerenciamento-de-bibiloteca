import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Livro> livrosEmprestados;
    private ArrayList<Usuario> usuariosEmprestados;

    public Biblioteca() {
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
        livrosEmprestados = new ArrayList<>();
        usuariosEmprestados = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("O LIVRO " + livro.getTitulo() + " FOI ADICIONADO A BIBLIOTECA");
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println(usuario.getNome() + " FOI ADICIONADO E AGORA É UM USUÁRIO");
    }

    public void emprestarLivro(Usuario usuario, Livro livro) {
        if (usuarios.contains(usuario) && livros.contains(livro) && livro.isDisponivel()) {
            livrosEmprestados.add(livro);
            usuariosEmprestados.add(usuario);
            livro.emprestar();
            System.out.println(livro.getTitulo() + " FOI EMPRESTADO PARA " + usuario.getNome());
        } else if (!livro.isDisponivel()) {
            System.out.println("LIVRO INDISPONÍVEL POIS FOI EMPRESTADO PARA OUTRO USUÁRIO");
        } else {
            System.out.println("LIVRO NÃO ENCONTRADO");
        }
    }

    public void devolverLivro(Livro livro, Usuario usuario) {
        if (livrosEmprestados.contains(livro) && usuariosEmprestados.contains(usuario)) {
            System.out.println("O LIVRO " + livro.getTitulo() + " EMPRESTADO PARA " + usuario.getNome() + " FOI DEVOLVIDO E ESTÁ DISPONÍVEL");
            livrosEmprestados.remove(livro);
            usuariosEmprestados.remove(usuario);
            livro.devolver();
        } else {
            System.out.println("EMPRÉSTIMO NÃO ENCONTRADO");
        }
    }

    public void livrosEmprestados() {
        System.out.println("----------------------------------------- \n LIVROS EMPRESTADOS: ");
        for (int i = 0; i < livrosEmprestados.size(); i++) {
            System.out.println("NOME DO LIVRO: " + livrosEmprestados.get(i).getTitulo() + " - EMPRESTADO PARA: " + usuariosEmprestados.get(i).getNome());
        }
        System.out.println("-----------------------------------");
    }

    public void livrosDisponiveis() {
        System.out.println("------------------------------------- \n LIVROS DISPONÍVEIS: ");
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                System.out.println("NOME DO LIVRO: " + livro.getTitulo());
            }
        }
        System.out.println("-----------------------------------");
    }

    public void listarUsuarios() {
        System.out.println("-------------------------- \n USUÁRIOS REGISTRADOS: ");
        for (Usuario usuario : usuarios) {
            System.out.println("ID: " + usuario.getId() + " NOME: " + usuario.getNome() + " EMAIL: " + usuario.getEmail());
        }
    }
}