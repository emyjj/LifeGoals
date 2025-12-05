package controllers.models;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MetaDAO {

    public static List<Meta> listar() {
        List<Meta> metas = new ArrayList<>();

        String sql = "SELECT * FROM metas";

        try (Connection c = DB.getConnection();
             PreparedStatement pst = c.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                metas.add(new Meta(
                        rs.getInt("id"),
                        rs.getString("titulo"),
                        rs.getString("descricao"),
                        rs.getString("status")
                ));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return metas;
    }
}
