import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

    private static final String URL = "jdbc:mysql:http://wagnerweinert.com.br/phpmyadmin/db_structure.php?server=1&db=tads25_emylly_jannuzzi";
    private static final String USER = "tads25_emylly_jannuzzi";
    private static final String PASS = "tads25_emylly_jannuzzi";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao conectar ao banco!");
        }
    }
}
