import io.javalin.Javalin;

public class App {
    public static void main(String[] args) {

        Javalin app = Javalin.create(config -> {
            config.staticFiles.add("src/main/resources/public"); 
        }).start(7000);

        app.get("/", ctx -> ctx.result("Servidor rodando!"));
    }
}
