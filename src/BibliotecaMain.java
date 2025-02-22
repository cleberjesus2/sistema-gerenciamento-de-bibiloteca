public class BibliotecaMain {
    public static void main(String[] args) {
        Livro livro[] = new Livro[3];
        Usuario usuario[] = new Usuario[3];
        Biblioteca biblioteca = new Biblioteca();

        livro[0] = new Livro("Turma da Mônica", "Maurício de Souza",true);
        livro[1] = new Livro("Diario de um Banana", "Jeff Kiney", true);
        livro[2] = new Livro("Harry Potter", "J.K Rowling", true);

        usuario[0] = new Usuario("CLeber", 18, 1, "clebao@gmail.com");
        usuario[1] = new Usuario("Caio", 11, 2, "Caiox@gmail.com");
        usuario[2] = new Usuario("Maria", 29, 3, "maria@gmail.com");

        // Livros Disponíveis,
        biblioteca.adicionarLivro(livro[0]);
        biblioteca.adicionarLivro(livro[1]);
        biblioteca.adicionarLivro(livro[2]);


        biblioteca.adicionarUsuario(usuario[1]);
        biblioteca.adicionarUsuario(usuario[0]);
        biblioteca.adicionarUsuario(usuario[2]);







        biblioteca.livrosDisponiveis();


        biblioteca.emprestarLivro(usuario[1], livro[0]);

        biblioteca.livrosEmprestados();
    }
}
