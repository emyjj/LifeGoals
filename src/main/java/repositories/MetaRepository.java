package repositories;

import controllers.models.Meta;
import database.Database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MetaRepository {

    public List<Meta> listarMetasPorPessoa(int pessoaId) {

        List<Meta> metas = new ArrayList<>();

        String sql = "SELECT * FROM meta_lifegoals WHERE pessoa_id = ?";

        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, pessoaId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Meta m = new Meta();
                m.setId(rs.getInt("id"));
                m.setTitulo(rs.getString("titulo"));
                m.setDescricao(rs.getString("descricao"));
                m.setStatus(rs.getString("status"));
                metas.add(m);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return metas;
    }
}
