package database;
import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

    private static final String URL = "http://wagnerweinert.com.br/phpmyadmin/tads25_emylly_jannuzzi";
    private static final String USER = "tads25_emylly_jannuzzi";
    private static final String PASSWORD = "tads25_emylly_jannuzzi";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao conectar ao banco");
        }
    }
}
