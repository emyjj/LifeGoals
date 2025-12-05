public class Pessoa {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private String dataNascimento;

    public Pessoa(String nome, String email, String senha, String dataNascimento){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
    }

    public String getNome(){ return nome; }
    public String getEmail(){ return email; }
    public String getSenha(){ return senha; }
    public String getDataNascimento(){ return dataNascimento; }
}
