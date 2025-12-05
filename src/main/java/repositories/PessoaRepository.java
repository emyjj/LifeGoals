public class PessoaRepository {

    public void salvar(Pessoa pessoa){
        String sql = "INSERT INTO pessoa (nome, email, senha, data_nascimento) VALUES (?, ?, ?, ?)";

        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getEmail());
            stmt.setString(3, pessoa.getSenha());
            stmt.setString(4, pessoa.getDataNascimento());

            stmt.executeUpdate();

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
