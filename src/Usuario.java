public class Usuario extends Pessoa{
    private int id;
    private String email;

    public Usuario(String nome, int idade, int id, String email) {
        super(nome, idade);
        this.id = id;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
