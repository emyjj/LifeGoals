public class Database {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/lifegoals";
        String user = "root";
        String password = "SENHA_AQUI";

        return DriverManager.getConnection(url, user, password);
    }
}
